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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Beschreibt eine bei der Aufteilung eines Grundst�cks, Erbbau- oder Nutzungsrechts entstandene Einheit, d. h. ein Wohnungs- bzw. Teileigentum, ein Wohnungs- bzw. Teilerbbaurecht oder ein Wohnungs- bzw. Teilgeb�udeeigentum.
 * 
 * <p>Java class for Type.DABAG.WEG.Einheit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.DABAG.WEG.Einheit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="anteil" type="{http://www.xjustiz.de}Type.DABAG.Anteil" minOccurs="0"/>
 *         &lt;element name="aufgeteilteBuchungstelle" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="auswahl_buchungsstelle">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice>
 *                             &lt;element name="grundstueck" type="{http://www.xjustiz.de}Type.DABAG.Grundstueck"/>
 *                             &lt;element name="erbbaurecht" type="{http://www.xjustiz.de}Type.DABAG.Erbbaurecht"/>
 *                             &lt;element name="nutzungsrecht" type="{http://www.xjustiz.de}Type.DABAG.Nutzungsrecht"/>
 *                           &lt;/choice>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="veraeusserungsbeschraenkung" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
 *         &lt;element name="veraeusserungsbeschraenkungAusnahme" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
 *         &lt;element name="sondereigentum" type="{http://www.xjustiz.de}Type.DABAG.Sondereigentum" maxOccurs="unbounded"/>
 *         &lt;element name="sondernutzungsrecht" type="{http://www.xjustiz.de}Type.DABAG.Ref.Sondernutzungsrecht" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="sondernutzungsrechtPauschal" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
 *         &lt;element name="eigentuemer" type="{http://www.xjustiz.de}Type.DABAG.Ref.Eigentuemer" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="erwerbsgrundart" type="{http://www.xjustiz.de}Code.DABAG.Aufteilungsgrund.WEG"/>
 *         &lt;element name="stockwerkseigentum" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="erstmaligeEintragung" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type.DABAG.WEG.Einheit", propOrder = {
    "anteil",
    "aufgeteilteBuchungstelle",
    "veraeusserungsbeschraenkung",
    "veraeusserungsbeschraenkungAusnahme",
    "sondereigentum",
    "sondernutzungsrecht",
    "sondernutzungsrechtPauschal",
    "eigentuemer",
    "erwerbsgrundart",
    "stockwerkseigentum",
    "erstmaligeEintragung"
})
public class TypeDABAGWEGEinheit {

    protected TypeDABAGAnteil anteil;
    protected TypeDABAGWEGEinheit.AufgeteilteBuchungstelle aufgeteilteBuchungstelle;
    protected String veraeusserungsbeschraenkung;
    protected String veraeusserungsbeschraenkungAusnahme;
    @XmlElement(required = true)
    protected List<TypeDABAGSondereigentum> sondereigentum;
    protected List<TypeDABAGRefSondernutzungsrecht> sondernutzungsrecht;
    protected String sondernutzungsrechtPauschal;
    protected List<TypeDABAGRefEigentuemer> eigentuemer;
    @XmlElement(required = true)
    protected CodeDABAGAufteilungsgrundWEG erwerbsgrundart;
    @XmlElement(defaultValue = "false")
    protected boolean stockwerkseigentum;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar erstmaligeEintragung;

    /**
     * Gets the value of the anteil property.
     * 
     * @return
     *     possible object is
     *     {@link TypeDABAGAnteil }
     *     
     */
    public TypeDABAGAnteil getAnteil() {
        return anteil;
    }

    /**
     * Sets the value of the anteil property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDABAGAnteil }
     *     
     */
    public void setAnteil(TypeDABAGAnteil value) {
        this.anteil = value;
    }

    /**
     * Gets the value of the aufgeteilteBuchungstelle property.
     * 
     * @return
     *     possible object is
     *     {@link TypeDABAGWEGEinheit.AufgeteilteBuchungstelle }
     *     
     */
    public TypeDABAGWEGEinheit.AufgeteilteBuchungstelle getAufgeteilteBuchungstelle() {
        return aufgeteilteBuchungstelle;
    }

    /**
     * Sets the value of the aufgeteilteBuchungstelle property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDABAGWEGEinheit.AufgeteilteBuchungstelle }
     *     
     */
    public void setAufgeteilteBuchungstelle(TypeDABAGWEGEinheit.AufgeteilteBuchungstelle value) {
        this.aufgeteilteBuchungstelle = value;
    }

    /**
     * Gets the value of the veraeusserungsbeschraenkung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVeraeusserungsbeschraenkung() {
        return veraeusserungsbeschraenkung;
    }

    /**
     * Sets the value of the veraeusserungsbeschraenkung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVeraeusserungsbeschraenkung(String value) {
        this.veraeusserungsbeschraenkung = value;
    }

    /**
     * Gets the value of the veraeusserungsbeschraenkungAusnahme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVeraeusserungsbeschraenkungAusnahme() {
        return veraeusserungsbeschraenkungAusnahme;
    }

    /**
     * Sets the value of the veraeusserungsbeschraenkungAusnahme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVeraeusserungsbeschraenkungAusnahme(String value) {
        this.veraeusserungsbeschraenkungAusnahme = value;
    }

    /**
     * Gets the value of the sondereigentum property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sondereigentum property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSondereigentum().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeDABAGSondereigentum }
     * 
     * 
     */
    public List<TypeDABAGSondereigentum> getSondereigentum() {
        if (sondereigentum == null) {
            sondereigentum = new ArrayList<TypeDABAGSondereigentum>();
        }
        return this.sondereigentum;
    }

    /**
     * Gets the value of the sondernutzungsrecht property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sondernutzungsrecht property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSondernutzungsrecht().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeDABAGRefSondernutzungsrecht }
     * 
     * 
     */
    public List<TypeDABAGRefSondernutzungsrecht> getSondernutzungsrecht() {
        if (sondernutzungsrecht == null) {
            sondernutzungsrecht = new ArrayList<TypeDABAGRefSondernutzungsrecht>();
        }
        return this.sondernutzungsrecht;
    }

    /**
     * Gets the value of the sondernutzungsrechtPauschal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSondernutzungsrechtPauschal() {
        return sondernutzungsrechtPauschal;
    }

    /**
     * Sets the value of the sondernutzungsrechtPauschal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSondernutzungsrechtPauschal(String value) {
        this.sondernutzungsrechtPauschal = value;
    }

    /**
     * Gets the value of the eigentuemer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eigentuemer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEigentuemer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeDABAGRefEigentuemer }
     * 
     * 
     */
    public List<TypeDABAGRefEigentuemer> getEigentuemer() {
        if (eigentuemer == null) {
            eigentuemer = new ArrayList<TypeDABAGRefEigentuemer>();
        }
        return this.eigentuemer;
    }

    /**
     * Gets the value of the erwerbsgrundart property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDABAGAufteilungsgrundWEG }
     *     
     */
    public CodeDABAGAufteilungsgrundWEG getErwerbsgrundart() {
        return erwerbsgrundart;
    }

    /**
     * Sets the value of the erwerbsgrundart property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDABAGAufteilungsgrundWEG }
     *     
     */
    public void setErwerbsgrundart(CodeDABAGAufteilungsgrundWEG value) {
        this.erwerbsgrundart = value;
    }

    /**
     * Gets the value of the stockwerkseigentum property.
     * 
     */
    public boolean isStockwerkseigentum() {
        return stockwerkseigentum;
    }

    /**
     * Sets the value of the stockwerkseigentum property.
     * 
     */
    public void setStockwerkseigentum(boolean value) {
        this.stockwerkseigentum = value;
    }

    /**
     * Gets the value of the erstmaligeEintragung property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getErstmaligeEintragung() {
        return erstmaligeEintragung;
    }

    /**
     * Sets the value of the erstmaligeEintragung property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setErstmaligeEintragung(XMLGregorianCalendar value) {
        this.erstmaligeEintragung = value;
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
     *         &lt;element name="auswahl_buchungsstelle">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;choice>
     *                   &lt;element name="grundstueck" type="{http://www.xjustiz.de}Type.DABAG.Grundstueck"/>
     *                   &lt;element name="erbbaurecht" type="{http://www.xjustiz.de}Type.DABAG.Erbbaurecht"/>
     *                   &lt;element name="nutzungsrecht" type="{http://www.xjustiz.de}Type.DABAG.Nutzungsrecht"/>
     *                 &lt;/choice>
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
        "auswahlBuchungsstelle"
    })
    public static class AufgeteilteBuchungstelle {

        @XmlElement(name = "auswahl_buchungsstelle", required = true)
        protected TypeDABAGWEGEinheit.AufgeteilteBuchungstelle.AuswahlBuchungsstelle auswahlBuchungsstelle;

        /**
         * Gets the value of the auswahlBuchungsstelle property.
         * 
         * @return
         *     possible object is
         *     {@link TypeDABAGWEGEinheit.AufgeteilteBuchungstelle.AuswahlBuchungsstelle }
         *     
         */
        public TypeDABAGWEGEinheit.AufgeteilteBuchungstelle.AuswahlBuchungsstelle getAuswahlBuchungsstelle() {
            return auswahlBuchungsstelle;
        }

        /**
         * Sets the value of the auswahlBuchungsstelle property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeDABAGWEGEinheit.AufgeteilteBuchungstelle.AuswahlBuchungsstelle }
         *     
         */
        public void setAuswahlBuchungsstelle(TypeDABAGWEGEinheit.AufgeteilteBuchungstelle.AuswahlBuchungsstelle value) {
            this.auswahlBuchungsstelle = value;
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
         *       &lt;choice>
         *         &lt;element name="grundstueck" type="{http://www.xjustiz.de}Type.DABAG.Grundstueck"/>
         *         &lt;element name="erbbaurecht" type="{http://www.xjustiz.de}Type.DABAG.Erbbaurecht"/>
         *         &lt;element name="nutzungsrecht" type="{http://www.xjustiz.de}Type.DABAG.Nutzungsrecht"/>
         *       &lt;/choice>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "grundstueck",
            "erbbaurecht",
            "nutzungsrecht"
        })
        public static class AuswahlBuchungsstelle {

            protected TypeDABAGGrundstueck grundstueck;
            protected TypeDABAGErbbaurecht erbbaurecht;
            protected TypeDABAGNutzungsrecht nutzungsrecht;

            /**
             * Gets the value of the grundstueck property.
             * 
             * @return
             *     possible object is
             *     {@link TypeDABAGGrundstueck }
             *     
             */
            public TypeDABAGGrundstueck getGrundstueck() {
                return grundstueck;
            }

            /**
             * Sets the value of the grundstueck property.
             * 
             * @param value
             *     allowed object is
             *     {@link TypeDABAGGrundstueck }
             *     
             */
            public void setGrundstueck(TypeDABAGGrundstueck value) {
                this.grundstueck = value;
            }

            /**
             * Gets the value of the erbbaurecht property.
             * 
             * @return
             *     possible object is
             *     {@link TypeDABAGErbbaurecht }
             *     
             */
            public TypeDABAGErbbaurecht getErbbaurecht() {
                return erbbaurecht;
            }

            /**
             * Sets the value of the erbbaurecht property.
             * 
             * @param value
             *     allowed object is
             *     {@link TypeDABAGErbbaurecht }
             *     
             */
            public void setErbbaurecht(TypeDABAGErbbaurecht value) {
                this.erbbaurecht = value;
            }

            /**
             * Gets the value of the nutzungsrecht property.
             * 
             * @return
             *     possible object is
             *     {@link TypeDABAGNutzungsrecht }
             *     
             */
            public TypeDABAGNutzungsrecht getNutzungsrecht() {
                return nutzungsrecht;
            }

            /**
             * Sets the value of the nutzungsrecht property.
             * 
             * @param value
             *     allowed object is
             *     {@link TypeDABAGNutzungsrecht }
             *     
             */
            public void setNutzungsrecht(TypeDABAGNutzungsrecht value) {
                this.nutzungsrecht = value;
            }

        }

    }

}
