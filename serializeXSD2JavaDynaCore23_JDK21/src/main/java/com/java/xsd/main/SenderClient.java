package com.java.xsd.main;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import com.fasterxml.jackson.databind.ObjectMapper;

public class SenderClient {

    public static void main(String[] args) {
    	int i = 1;
        try {
            // Create an ObjectMapper instance
            ObjectMapper objectMapper = new ObjectMapper();

            // Create an HTTP client using Apache HttpClient
            HttpClient httpClient = HttpClients.createDefault();

            // Define the URL of the receiver server
            String receiverUrl = "http://127.0.0.1:7777/data"; // Replace with the receiver's IP and port

            JAXBContext context1 = JAXBContext.newInstance("com.java.xsd.jaxb"); // Replace with your package name
            JAXBContext context2 = JAXBContext.newInstance("com.java.xsd.jaxb"); // Replace with your package name
            JAXBContext context3 = JAXBContext.newInstance("com.java.xsd.jaxb"); // Replace with your package name
            JAXBContext context = null;

            // Serialize a Java object to JSON
            while (i<1001) {
   	         // Serialize a Java object to JSON
   	            String filename = "nachrichten/nachricht_" + i + ".xml";
   	        	
   	            String xJustizVersion = ReadXML.getXjustizVersion(filename);
   	            switch(xJustizVersion)
   	            {
   	            case "3.2.1": context = context1;
   	            				break;
   	            case "3.3.1": context = context2;
   	            				break;
   	            case "3.4.1": context = context3;
   	            				break;
   	            default:
   	            	System.out.println("Error processing XML file!");
   	            	break;
   	            }
   	            Object nachricht = jaxbXmlFileToObject(filename, context);
   	            
   	            String json1 = objectMapper.writeValueAsString(nachricht);
   	            
   	            //ObjectNode jsonNode = objectMapper.createObjectNode();
   	            //jsonNode.put("ClassName", nachricht.getClass().getName());

   	            // Convert the JSON object to a JSON string
   	            //String json2 = objectMapper.writeValueAsString(jsonNode);
   	            // Create an HTTP POST request
	            HttpPost httpPost = new HttpPost(receiverUrl);
	            
	            String combinedJson = objectMapper.writeValueAsString(new JsonContainer(json1, nachricht.getClass().getName()));
	
	            StringEntity requestEntity = new StringEntity(combinedJson);
	            httpPost.setEntity(requestEntity);
	            httpPost.setHeader("Content-Type", "application/json");

	            // Set the JSON data as the request entity
	            //HttpEntity entity = new StringEntity(json);
	            //httpPost.setEntity(entity);
	
	            // Send the POST request to the receiver server
	            HttpResponse httpResponse = httpClient.execute(httpPost);
	
	            // Read the response, if needed
	            String responseContent = EntityUtils.toString(httpResponse.getEntity());
	            //System.out.println("Server Response: " + responseContent);
	            i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Finished processing all XML files!");
        
    }

    private static Object jaxbXmlFileToObject(String fileName, JAXBContext context) throws ClassNotFoundException {
        
        File xmlFile = new File(fileName);
         
        JAXBContext jaxbContext;
        try
        {
        	//String rootElementName = determineRootElement(xmlFile, context);
            // Dynamically create an instance of the appropriate JAXB class
            //Class<?> jaxbClass = Class.forName(rootElementName); // Replace with your package name
          //jaxbContext = JAXBContext.newInstance(jaxbClass);
        	
          Unmarshaller jaxbUnmarshaller = context.createUnmarshaller();
          Object nachricht = (Object) jaxbUnmarshaller.unmarshal(xmlFile);
          return nachricht;
        }
        catch (JAXBException e) 
        {
          e.printStackTrace();
        }
    	return null;
      }
    
//    private static String determineRootElement(File xmlFile, JAXBContext context) throws JAXBException {
//        Unmarshaller unmarshaller = context.createUnmarshaller();
//        Object element = (Object) unmarshaller.unmarshal(xmlFile);
//        return element.getClass().getName();
//    }
    
    static class JsonContainer {
        private String json1;
        private String json2;

        public JsonContainer(String json1, String json2) {
            this.json1 = json1;
            this.json2 = json2;
        }

        public String getJson1() {
            return json1;
        }

        public String getJson2() {
            return json2;
        }
    }
    
    public static class ReadXML {
        public static String getXjustizVersion(String filename) {
        	String xJustizVersion = null;
            try {
                File xmlFile = new File(filename);
                DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
                Document doc = dBuilder.parse(xmlFile);

                // Normalize the document
                doc.getDocumentElement().normalize();

                // Find all elements with the tag name "tns:nachrichtenkopf"
                NodeList nodeList = doc.getElementsByTagName("tns:nachrichtenkopf");

                // Assuming there is only one such element, you can access it
                Element nachrichtenkopfElement = (Element) nodeList.item(0);

                // Read the "XJustizVersion" attribute
                xJustizVersion = nachrichtenkopfElement.getAttribute("xjustizVersion");
            } catch (Exception e) {
                e.printStackTrace();
            }
            return xJustizVersion;
        }
    }

}
