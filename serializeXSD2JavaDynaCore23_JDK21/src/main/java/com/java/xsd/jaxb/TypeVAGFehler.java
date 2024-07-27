//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.09.13 at 01:28:34 PM CEST 
//


package com.java.xsd.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Type.VAG.Fehler complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.VAG.Fehler">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="anfrage.ID" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/>
 *         &lt;element name="fehler" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="fehlercode" type="{http://www.xjustiz.de}Code.VAG.Fehler"/>
 *                   &lt;element name="zusatzinformationen" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
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
@XmlType(name = "Type.VAG.Fehler", propOrder = {
    "anfrageID",
    "fehler"
})
public class TypeVAGFehler {

    @XmlElement(name = "anfrage.ID", required = true)
    protected String anfrageID;
    @XmlElement(required = true)
    protected List<TypeVAGFehler.Fehler> fehler;

    /**
     * Gets the value of the anfrageID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnfrageID() {
        return anfrageID;
    }

    /**
     * Sets the value of the anfrageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnfrageID(String value) {
        this.anfrageID = value;
    }

    /**
     * Gets the value of the fehler property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fehler property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFehler().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeVAGFehler.Fehler }
     * 
     * 
     */
    public List<TypeVAGFehler.Fehler> getFehler() {
        if (fehler == null) {
            fehler = new ArrayList<TypeVAGFehler.Fehler>();
        }
        return this.fehler;
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
     *         &lt;element name="fehlercode" type="{http://www.xjustiz.de}Code.VAG.Fehler"/>
     *         &lt;element name="zusatzinformationen" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
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
        "fehlercode",
        "zusatzinformationen"
    })
    public static class Fehler {

        @XmlElement(required = true)
        protected CodeVAGFehler fehlercode;
        protected String zusatzinformationen;

        /**
         * Gets the value of the fehlercode property.
         * 
         * @return
         *     possible object is
         *     {@link CodeVAGFehler }
         *     
         */
        public CodeVAGFehler getFehlercode() {
            return fehlercode;
        }

        /**
         * Sets the value of the fehlercode property.
         * 
         * @param value
         *     allowed object is
         *     {@link CodeVAGFehler }
         *     
         */
        public void setFehlercode(CodeVAGFehler value) {
            this.fehlercode = value;
        }

        /**
         * Gets the value of the zusatzinformationen property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZusatzinformationen() {
            return zusatzinformationen;
        }

        /**
         * Sets the value of the zusatzinformationen property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZusatzinformationen(String value) {
            this.zusatzinformationen = value;
        }

    }

}