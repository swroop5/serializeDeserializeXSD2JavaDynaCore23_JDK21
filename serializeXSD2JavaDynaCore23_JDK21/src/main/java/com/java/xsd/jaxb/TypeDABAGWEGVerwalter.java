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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Type.DABAG.WEG.Verwalter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.DABAG.WEG.Verwalter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="zeitraumZuordnung" type="{http://www.xjustiz.de}Type.GDS.Xdomea.ZeitraumType" minOccurs="0"/>
 *         &lt;element name="aktenzeichen.verwalter" type="{http://www.xjustiz.de}Type.GDS.Aktenzeichen" minOccurs="0"/>
 *         &lt;element name="fundstelleNachweis" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
 *         &lt;element name="aktenzeichen.bestellbeschluss" type="{http://www.xjustiz.de}Type.GDS.Aktenzeichen" minOccurs="0"/>
 *         &lt;element name="aktenzeichen.dokument" type="{http://www.xjustiz.de}Type.GDS.Aktenzeichen" minOccurs="0"/>
 *         &lt;element name="bemerkung" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
 *         &lt;element name="dokument" type="{http://www.xjustiz.de}Type.GDS.Ref.SGO" minOccurs="0"/>
 *         &lt;element name="person" type="{http://www.xjustiz.de}Type.GDS.Ref.Rollennummer" minOccurs="0"/>
 *         &lt;element name="wegSerie" type="{http://www.xjustiz.de}Type.DABAG.Ref.WEG.Serie"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type.DABAG.WEG.Verwalter", propOrder = {
    "zeitraumZuordnung",
    "aktenzeichenVerwalter",
    "fundstelleNachweis",
    "aktenzeichenBestellbeschluss",
    "aktenzeichenDokument",
    "bemerkung",
    "dokument",
    "person",
    "wegSerie"
})
public class TypeDABAGWEGVerwalter {

    protected TypeGDSXdomeaZeitraumType zeitraumZuordnung;
    @XmlElement(name = "aktenzeichen.verwalter")
    protected TypeGDSAktenzeichen aktenzeichenVerwalter;
    protected String fundstelleNachweis;
    @XmlElement(name = "aktenzeichen.bestellbeschluss")
    protected TypeGDSAktenzeichen aktenzeichenBestellbeschluss;
    @XmlElement(name = "aktenzeichen.dokument")
    protected TypeGDSAktenzeichen aktenzeichenDokument;
    protected String bemerkung;
    protected TypeGDSRefSGO dokument;
    protected TypeGDSRefRollennummer person;
    @XmlElement(required = true)
    protected TypeDABAGRefWEGSerie wegSerie;

    /**
     * Gets the value of the zeitraumZuordnung property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSXdomeaZeitraumType }
     *     
     */
    public TypeGDSXdomeaZeitraumType getZeitraumZuordnung() {
        return zeitraumZuordnung;
    }

    /**
     * Sets the value of the zeitraumZuordnung property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSXdomeaZeitraumType }
     *     
     */
    public void setZeitraumZuordnung(TypeGDSXdomeaZeitraumType value) {
        this.zeitraumZuordnung = value;
    }

    /**
     * Gets the value of the aktenzeichenVerwalter property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSAktenzeichen }
     *     
     */
    public TypeGDSAktenzeichen getAktenzeichenVerwalter() {
        return aktenzeichenVerwalter;
    }

    /**
     * Sets the value of the aktenzeichenVerwalter property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSAktenzeichen }
     *     
     */
    public void setAktenzeichenVerwalter(TypeGDSAktenzeichen value) {
        this.aktenzeichenVerwalter = value;
    }

    /**
     * Gets the value of the fundstelleNachweis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundstelleNachweis() {
        return fundstelleNachweis;
    }

    /**
     * Sets the value of the fundstelleNachweis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundstelleNachweis(String value) {
        this.fundstelleNachweis = value;
    }

    /**
     * Gets the value of the aktenzeichenBestellbeschluss property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSAktenzeichen }
     *     
     */
    public TypeGDSAktenzeichen getAktenzeichenBestellbeschluss() {
        return aktenzeichenBestellbeschluss;
    }

    /**
     * Sets the value of the aktenzeichenBestellbeschluss property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSAktenzeichen }
     *     
     */
    public void setAktenzeichenBestellbeschluss(TypeGDSAktenzeichen value) {
        this.aktenzeichenBestellbeschluss = value;
    }

    /**
     * Gets the value of the aktenzeichenDokument property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSAktenzeichen }
     *     
     */
    public TypeGDSAktenzeichen getAktenzeichenDokument() {
        return aktenzeichenDokument;
    }

    /**
     * Sets the value of the aktenzeichenDokument property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSAktenzeichen }
     *     
     */
    public void setAktenzeichenDokument(TypeGDSAktenzeichen value) {
        this.aktenzeichenDokument = value;
    }

    /**
     * Gets the value of the bemerkung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBemerkung() {
        return bemerkung;
    }

    /**
     * Sets the value of the bemerkung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBemerkung(String value) {
        this.bemerkung = value;
    }

    /**
     * Gets the value of the dokument property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSRefSGO }
     *     
     */
    public TypeGDSRefSGO getDokument() {
        return dokument;
    }

    /**
     * Sets the value of the dokument property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSRefSGO }
     *     
     */
    public void setDokument(TypeGDSRefSGO value) {
        this.dokument = value;
    }

    /**
     * Gets the value of the person property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSRefRollennummer }
     *     
     */
    public TypeGDSRefRollennummer getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSRefRollennummer }
     *     
     */
    public void setPerson(TypeGDSRefRollennummer value) {
        this.person = value;
    }

    /**
     * Gets the value of the wegSerie property.
     * 
     * @return
     *     possible object is
     *     {@link TypeDABAGRefWEGSerie }
     *     
     */
    public TypeDABAGRefWEGSerie getWegSerie() {
        return wegSerie;
    }

    /**
     * Sets the value of the wegSerie property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDABAGRefWEGSerie }
     *     
     */
    public void setWegSerie(TypeDABAGRefWEGSerie value) {
        this.wegSerie = value;
    }

}
