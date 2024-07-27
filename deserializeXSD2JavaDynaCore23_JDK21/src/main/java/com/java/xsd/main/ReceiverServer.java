package com.java.xsd.main;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.bootstrap.HttpServer;
import org.apache.http.impl.bootstrap.ServerBootstrap;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.HttpRequestHandler;
import org.apache.http.util.EntityUtils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.java.xsd.jaxb.NachrichtStrafStrafverfahren0500013;

public class ReceiverServer {

	static int i=0;
	
    public static void main(String[] args) throws Exception {
        // Create an ObjectMapper instance
        ObjectMapper objectMapper = new ObjectMapper();

        // Create an HTTP server using Apache HttpCore with port 7777
        HttpServer server = ServerBootstrap.bootstrap()
                .setListenerPort(7777) // Change the port to 7777
                .registerHandler("/data", new RequestHandler(objectMapper))
                .create();

        server.start();
        System.out.println("Receiver server started on port 7777.");

     // Block until the server is shut down gracefully
        server.awaitTermination(3000, TimeUnit.MILLISECONDS);
    }

    static class RequestHandler implements HttpRequestHandler {
        private final ObjectMapper objectMapper;

        RequestHandler(ObjectMapper objectMapper) {
            this.objectMapper = objectMapper;
        }

        @Override
        public void handle(HttpRequest request, HttpResponse response, HttpContext context) throws HttpException, IOException {
            if (request instanceof HttpEntityEnclosingRequest) {
                HttpEntity entity = ((HttpEntityEnclosingRequest) request).getEntity();
                String receivedJson = EntityUtils.toString(entity);

                JsonObject jsonObject = JsonParser.parseString(receivedJson).getAsJsonObject();

                String rawJson = jsonObject.get("json1").toString();
                rawJson = rawJson.replace("\\", "");
                
                // Extract the individual JSON strings
                String json1 = rawJson.substring(1, rawJson.length()-1);
                String rootElement = jsonObject.get("json2").toString().replace("\"", "");
                
                //System.out.println("Data received from sender machine: " + receivedJson);

                // Dynamically create an instance of the appropriate JAXB class
                Class<?> jaxbClass = null;
				try {
					jaxbClass = Class.forName(rootElement);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} // Replace with your package name
                
                Object nachricht = objectMapper.readValue(json1, jaxbClass);
                if(nachricht != null)
                	System.out.println("Deserialized Nachricht " + i + ": " + ((NachrichtStrafStrafverfahren0500013) nachricht).getNachrichtenkopf().getEigeneNachrichtenID());
                i++;
            }

            response.setStatusCode(HttpStatus.SC_OK);
            response.setEntity(new StringEntity("Data received and processed", ContentType.TEXT_PLAIN));
        }
    }
}
