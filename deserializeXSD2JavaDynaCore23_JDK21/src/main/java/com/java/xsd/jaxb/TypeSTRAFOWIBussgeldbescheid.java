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
 * <p>Java class for Type.STRAF.OWI.Bussgeldbescheid complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.STRAF.OWI.Bussgeldbescheid">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="erlassdatum" type="{http://www.xjustiz.de}Type.GDS.Datumsangabe" minOccurs="0"/>
 *         &lt;element name="rechtskraft" type="{http://www.xjustiz.de}Type.STRAF.Rechtskraft" minOccurs="0"/>
 *         &lt;element name="bussgeldverjaehrung" type="{http://www.xjustiz.de}Type.GDS.Datumsangabe" minOccurs="0"/>
 *         &lt;element name="geldbusse" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="teilzahlungGeldbusseGesamt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="teilzahlungEinzeln" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="auslagen" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="teilzahlungAuslagen" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="kasse" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ref.beteiligtennummer" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/>
 *                   &lt;element name="kassenzeichen" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="tat" type="{http://www.xjustiz.de}Type.STRAF.OWI.Tat" minOccurs="0"/>
 *         &lt;element name="vollzugsbehoerde" type="{http://www.xjustiz.de}Type.STRAF.OWI.Vollzugsbehoerde" minOccurs="0"/>
 *         &lt;element name="bussgeldkatalog" type="{http://www.xjustiz.de}Type.STRAF.OWI.Bussgeldkatalog" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type.STRAF.OWI.Bussgeldbescheid", propOrder = {
    "erlassdatum",
    "rechtskraft",
    "bussgeldverjaehrung",
    "geldbusse",
    "teilzahlungGeldbusseGesamt",
    "teilzahlungEinzeln",
    "auslagen",
    "teilzahlungAuslagen",
    "kasse",
    "tat",
    "vollzugsbehoerde",
    "bussgeldkatalog"
})
public class TypeSTRAFOWIBussgeldbescheid {

    protected String erlassdatum;
    protected TypeSTRAFRechtskraft rechtskraft;
    protected String bussgeldverjaehrung;
    protected Double geldbusse;
    protected Double teilzahlungGeldbusseGesamt;
    @XmlElement(type = Double.class)
    protected List<Double> teilzahlungEinzeln;
    protected Double auslagen;
    @XmlElement(type = Double.class)
    protected List<Double> teilzahlungAuslagen;
    protected TypeSTRAFOWIBussgeldbescheid.Kasse kasse;
    protected TypeSTRAFOWITat tat;
    protected TypeSTRAFOWIVollzugsbehoerde vollzugsbehoerde;
    protected TypeSTRAFOWIBussgeldkatalog bussgeldkatalog;

    /**
     * Gets the value of the erlassdatum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErlassdatum() {
        return erlassdatum;
    }

    /**
     * Sets the value of the erlassdatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErlassdatum(String value) {
        this.erlassdatum = value;
    }

    /**
     * Gets the value of the rechtskraft property.
     * 
     * @return
     *     possible object is
     *     {@link TypeSTRAFRechtskraft }
     *     
     */
    public TypeSTRAFRechtskraft getRechtskraft() {
        return rechtskraft;
    }

    /**
     * Sets the value of the rechtskraft property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeSTRAFRechtskraft }
     *     
     */
    public void setRechtskraft(TypeSTRAFRechtskraft value) {
        this.rechtskraft = value;
    }

    /**
     * Gets the value of the bussgeldverjaehrung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBussgeldverjaehrung() {
        return bussgeldverjaehrung;
    }

    /**
     * Sets the value of the bussgeldverjaehrung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBussgeldverjaehrung(String value) {
        this.bussgeldverjaehrung = value;
    }

    /**
     * Gets the value of the geldbusse property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGeldbusse() {
        return geldbusse;
    }

    /**
     * Sets the value of the geldbusse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGeldbusse(Double value) {
        this.geldbusse = value;
    }

    /**
     * Gets the value of the teilzahlungGeldbusseGesamt property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTeilzahlungGeldbusseGesamt() {
        return teilzahlungGeldbusseGesamt;
    }

    /**
     * Sets the value of the teilzahlungGeldbusseGesamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTeilzahlungGeldbusseGesamt(Double value) {
        this.teilzahlungGeldbusseGesamt = value;
    }

    /**
     * Gets the value of the teilzahlungEinzeln property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the teilzahlungEinzeln property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTeilzahlungEinzeln().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getTeilzahlungEinzeln() {
        if (teilzahlungEinzeln == null) {
            teilzahlungEinzeln = new ArrayList<Double>();
        }
        return this.teilzahlungEinzeln;
    }

    /**
     * Gets the value of the auslagen property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAuslagen() {
        return auslagen;
    }

    /**
     * Sets the value of the auslagen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAuslagen(Double value) {
        this.auslagen = value;
    }

    /**
     * Gets the value of the teilzahlungAuslagen property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the teilzahlungAuslagen property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTeilzahlungAuslagen().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getTeilzahlungAuslagen() {
        if (teilzahlungAuslagen == null) {
            teilzahlungAuslagen = new ArrayList<Double>();
        }
        return this.teilzahlungAuslagen;
    }

    /**
     * Gets the value of the kasse property.
     * 
     * @return
     *     possible object is
     *     {@link TypeSTRAFOWIBussgeldbescheid.Kasse }
     *     
     */
    public TypeSTRAFOWIBussgeldbescheid.Kasse getKasse() {
        return kasse;
    }

    /**
     * Sets the value of the kasse property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeSTRAFOWIBussgeldbescheid.Kasse }
     *     
     */
    public void setKasse(TypeSTRAFOWIBussgeldbescheid.Kasse value) {
        this.kasse = value;
    }

    /**
     * Gets the value of the tat property.
     * 
     * @return
     *     possible object is
     *     {@link TypeSTRAFOWITat }
     *     
     */
    public TypeSTRAFOWITat getTat() {
        return tat;
    }

    /**
     * Sets the value of the tat property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeSTRAFOWITat }
     *     
     */
    public void setTat(TypeSTRAFOWITat value) {
        this.tat = value;
    }

    /**
     * Gets the value of the vollzugsbehoerde property.
     * 
     * @return
     *     possible object is
     *     {@link TypeSTRAFOWIVollzugsbehoerde }
     *     
     */
    public TypeSTRAFOWIVollzugsbehoerde getVollzugsbehoerde() {
        return vollzugsbehoerde;
    }

    /**
     * Sets the value of the vollzugsbehoerde property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeSTRAFOWIVollzugsbehoerde }
     *     
     */
    public void setVollzugsbehoerde(TypeSTRAFOWIVollzugsbehoerde value) {
        this.vollzugsbehoerde = value;
    }

    /**
     * Gets the value of the bussgeldkatalog property.
     * 
     * @return
     *     possible object is
     *     {@link TypeSTRAFOWIBussgeldkatalog }
     *     
     */
    public TypeSTRAFOWIBussgeldkatalog getBussgeldkatalog() {
        return bussgeldkatalog;
    }

    /**
     * Sets the value of the bussgeldkatalog property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeSTRAFOWIBussgeldkatalog }
     *     
     */
    public void setBussgeldkatalog(TypeSTRAFOWIBussgeldkatalog value) {
        this.bussgeldkatalog = value;
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
     *         &lt;element name="ref.beteiligtennummer" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/>
     *         &lt;element name="kassenzeichen" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
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
        "refBeteiligtennummer",
        "kassenzeichen"
    })
    public static class Kasse {

        @XmlElement(name = "ref.beteiligtennummer", required = true)
        protected String refBeteiligtennummer;
        protected String kassenzeichen;

        /**
         * Gets the value of the refBeteiligtennummer property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRefBeteiligtennummer() {
            return refBeteiligtennummer;
        }

        /**
         * Sets the value of the refBeteiligtennummer property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRefBeteiligtennummer(String value) {
            this.refBeteiligtennummer = value;
        }

        /**
         * Gets the value of the kassenzeichen property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKassenzeichen() {
            return kassenzeichen;
        }

        /**
         * Sets the value of the kassenzeichen property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKassenzeichen(String value) {
            this.kassenzeichen = value;
        }

    }

}
