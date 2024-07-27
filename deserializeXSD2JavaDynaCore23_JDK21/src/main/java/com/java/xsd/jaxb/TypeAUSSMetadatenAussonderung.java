//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.09.13 at 01:28:34 PM CEST 
//


package com.java.xsd.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * MetadatenAussonderung fasst die Informationen zu einem abschlie�end bearbeiteten Schriftgutobjekt (Vorgang oder Akte) zusammen, die f�r seine Aufbewahrung und Aussonderung relevant sind.
 * 
 * <p>Java class for Type.AUSS.MetadatenAussonderung complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.AUSS.MetadatenAussonderung">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aufbewahrungsdauer" type="{http://www.xjustiz.de}Type.AUSS.Aufbewahrungsdauer" minOccurs="0"/>
 *         &lt;element name="aussonderungsart" type="{http://www.xjustiz.de}Code.AUSS.Aussonderungsart.Typ3" minOccurs="0"/>
 *         &lt;element name="kennung" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
 *         &lt;element name="bewertungsvorschlag" type="{http://www.xjustiz.de}Code.AUSS.Bewertungsvorschlag.Typ3" minOccurs="0"/>
 *         &lt;element name="aufbewahrungsende" type="{http://www.w3.org/2001/XMLSchema}gYear" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type.AUSS.MetadatenAussonderung", propOrder = {
    "aufbewahrungsdauer",
    "aussonderungsart",
    "kennung",
    "bewertungsvorschlag",
    "aufbewahrungsende"
})
public class TypeAUSSMetadatenAussonderung {

    protected TypeAUSSAufbewahrungsdauer aufbewahrungsdauer;
    protected CodeAUSSAussonderungsartTyp3 aussonderungsart;
    protected String kennung;
    protected CodeAUSSBewertungsvorschlagTyp3 bewertungsvorschlag;
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar aufbewahrungsende;

    /**
     * Gets the value of the aufbewahrungsdauer property.
     * 
     * @return
     *     possible object is
     *     {@link TypeAUSSAufbewahrungsdauer }
     *     
     */
    public TypeAUSSAufbewahrungsdauer getAufbewahrungsdauer() {
        return aufbewahrungsdauer;
    }

    /**
     * Sets the value of the aufbewahrungsdauer property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeAUSSAufbewahrungsdauer }
     *     
     */
    public void setAufbewahrungsdauer(TypeAUSSAufbewahrungsdauer value) {
        this.aufbewahrungsdauer = value;
    }

    /**
     * Gets the value of the aussonderungsart property.
     * 
     * @return
     *     possible object is
     *     {@link CodeAUSSAussonderungsartTyp3 }
     *     
     */
    public CodeAUSSAussonderungsartTyp3 getAussonderungsart() {
        return aussonderungsart;
    }

    /**
     * Sets the value of the aussonderungsart property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeAUSSAussonderungsartTyp3 }
     *     
     */
    public void setAussonderungsart(CodeAUSSAussonderungsartTyp3 value) {
        this.aussonderungsart = value;
    }

    /**
     * Gets the value of the kennung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKennung() {
        return kennung;
    }

    /**
     * Sets the value of the kennung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKennung(String value) {
        this.kennung = value;
    }

    /**
     * Gets the value of the bewertungsvorschlag property.
     * 
     * @return
     *     possible object is
     *     {@link CodeAUSSBewertungsvorschlagTyp3 }
     *     
     */
    public CodeAUSSBewertungsvorschlagTyp3 getBewertungsvorschlag() {
        return bewertungsvorschlag;
    }

    /**
     * Sets the value of the bewertungsvorschlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeAUSSBewertungsvorschlagTyp3 }
     *     
     */
    public void setBewertungsvorschlag(CodeAUSSBewertungsvorschlagTyp3 value) {
        this.bewertungsvorschlag = value;
    }

    /**
     * Gets the value of the aufbewahrungsende property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAufbewahrungsende() {
        return aufbewahrungsende;
    }

    /**
     * Sets the value of the aufbewahrungsende property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAufbewahrungsende(XMLGregorianCalendar value) {
        this.aufbewahrungsende = value;
    }

}
