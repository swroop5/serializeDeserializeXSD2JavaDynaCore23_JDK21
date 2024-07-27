//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.09.13 at 01:28:34 PM CEST 
//


package com.java.xsd.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nachrichtenkopf" type="{http://www.xjustiz.de}Type.GDS.Nachrichtenkopf"/>
 *         &lt;element name="grunddaten" type="{http://www.xjustiz.de}Type.GDS.Grunddaten"/>
 *         &lt;element name="fachdaten">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="nachrichtID" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
 *                   &lt;element name="antwortID" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
 *                   &lt;element name="prueffall.ID" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
 *                   &lt;element name="prueffall.erklaerung" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "nachrichtenkopf",
    "grunddaten",
    "fachdaten"
})
@XmlRootElement(name = "nachricht.zpo.prueffallmeldung.1500006")
public class NachrichtZpoPrueffallmeldung1500006 {

    @XmlElement(required = true)
    protected TypeGDSNachrichtenkopf nachrichtenkopf;
    @XmlElement(required = true)
    protected TypeGDSGrunddaten grunddaten;
    @XmlElement(required = true)
    protected NachrichtZpoPrueffallmeldung1500006 .Fachdaten fachdaten;

    /**
     * Gets the value of the nachrichtenkopf property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSNachrichtenkopf }
     *     
     */
    public TypeGDSNachrichtenkopf getNachrichtenkopf() {
        return nachrichtenkopf;
    }

    /**
     * Sets the value of the nachrichtenkopf property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSNachrichtenkopf }
     *     
     */
    public void setNachrichtenkopf(TypeGDSNachrichtenkopf value) {
        this.nachrichtenkopf = value;
    }

    /**
     * Gets the value of the grunddaten property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSGrunddaten }
     *     
     */
    public TypeGDSGrunddaten getGrunddaten() {
        return grunddaten;
    }

    /**
     * Sets the value of the grunddaten property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSGrunddaten }
     *     
     */
    public void setGrunddaten(TypeGDSGrunddaten value) {
        this.grunddaten = value;
    }

    /**
     * Gets the value of the fachdaten property.
     * 
     * @return
     *     possible object is
     *     {@link NachrichtZpoPrueffallmeldung1500006 .Fachdaten }
     *     
     */
    public NachrichtZpoPrueffallmeldung1500006 .Fachdaten getFachdaten() {
        return fachdaten;
    }

    /**
     * Sets the value of the fachdaten property.
     * 
     * @param value
     *     allowed object is
     *     {@link NachrichtZpoPrueffallmeldung1500006 .Fachdaten }
     *     
     */
    public void setFachdaten(NachrichtZpoPrueffallmeldung1500006 .Fachdaten value) {
        this.fachdaten = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="nachrichtID" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
     *         &lt;element name="antwortID" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
     *         &lt;element name="prueffall.ID" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
     *         &lt;element name="prueffall.erklaerung" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "nachrichtID",
        "antwortID",
        "prueffallID",
        "prueffallErklaerung"
    })
    public static class Fachdaten {

        protected String nachrichtID;
        protected String antwortID;
        @XmlElement(name = "prueffall.ID")
        protected String prueffallID;
        @XmlElement(name = "prueffall.erklaerung", defaultValue = "Zwischennachricht (kostenfrei): Wir k\u00f6nnen Ihre Anfrage noch nicht abschlie\u00dfend bearbeiten. Ihr Auskunftersuchen hat zu einem Mehrfachtreffer gef\u00fchrt. Das bedeutet, Name und Identifizierungsdaten der betroffenen Person sind mehrfach gefunden worden. Wir versuchen in einem manuellen Verfahren eine eindeutige Zuordnung vorzunehmen. Das wird einige Zeit in Anspruch nehmen. Haben Sie bitte Geduld! Senden Sie uns das Auskunftersuchen bitte nicht erneut zu! Auch telefonische R\u00fcckfragen zu diesen F\u00e4llen k\u00f6nnen nicht beantwortet werden!  Sie erhalten nach Kl\u00e4rung in jedem Fall eine abschlie\u00dfende elektronische Nachricht. Diese Zwischennachricht ist kostenfrei.")
        protected String prueffallErklaerung;

        /**
         * Gets the value of the nachrichtID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNachrichtID() {
            return nachrichtID;
        }

        /**
         * Sets the value of the nachrichtID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNachrichtID(String value) {
            this.nachrichtID = value;
        }

        /**
         * Gets the value of the antwortID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAntwortID() {
            return antwortID;
        }

        /**
         * Sets the value of the antwortID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAntwortID(String value) {
            this.antwortID = value;
        }

        /**
         * Gets the value of the prueffallID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPrueffallID() {
            return prueffallID;
        }

        /**
         * Sets the value of the prueffallID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrueffallID(String value) {
            this.prueffallID = value;
        }

        /**
         * Gets the value of the prueffallErklaerung property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPrueffallErklaerung() {
            return prueffallErklaerung;
        }

        /**
         * Sets the value of the prueffallErklaerung property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrueffallErklaerung(String value) {
            this.prueffallErklaerung = value;
        }

    }

}