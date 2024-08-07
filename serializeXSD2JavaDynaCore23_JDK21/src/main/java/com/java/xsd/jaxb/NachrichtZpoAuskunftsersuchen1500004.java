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
 *                   &lt;element name="voraussetzungenDesAuskunftsersuchens">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="gueltigerVollstreckungstitel" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                             &lt;element name="anfrage.meldebehoerde" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                             &lt;element name="vermoegensauskunft" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                             &lt;element name="keineVollstaendigeBefriedigung" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="anfrage.parameter" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="anfrage.typ" type="{http://www.xjustiz.de}Code.ZPO.Anfragetyp"/>
 *                             &lt;element name="zeitraumVon" type="{http://www.xjustiz.de}Type.GDS.Datumsangabe" minOccurs="0"/>
 *                             &lt;element name="zulassungsabschnittID" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
@XmlRootElement(name = "nachricht.zpo.auskunftsersuchen.1500004")
public class NachrichtZpoAuskunftsersuchen1500004 {

    @XmlElement(required = true)
    protected TypeGDSNachrichtenkopf nachrichtenkopf;
    @XmlElement(required = true)
    protected TypeGDSGrunddaten grunddaten;
    @XmlElement(required = true)
    protected NachrichtZpoAuskunftsersuchen1500004 .Fachdaten fachdaten;

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
     *     {@link NachrichtZpoAuskunftsersuchen1500004 .Fachdaten }
     *     
     */
    public NachrichtZpoAuskunftsersuchen1500004 .Fachdaten getFachdaten() {
        return fachdaten;
    }

    /**
     * Sets the value of the fachdaten property.
     * 
     * @param value
     *     allowed object is
     *     {@link NachrichtZpoAuskunftsersuchen1500004 .Fachdaten }
     *     
     */
    public void setFachdaten(NachrichtZpoAuskunftsersuchen1500004 .Fachdaten value) {
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
     *         &lt;element name="voraussetzungenDesAuskunftsersuchens">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="gueltigerVollstreckungstitel" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                   &lt;element name="anfrage.meldebehoerde" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                   &lt;element name="vermoegensauskunft" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                   &lt;element name="keineVollstaendigeBefriedigung" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="anfrage.parameter" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="anfrage.typ" type="{http://www.xjustiz.de}Code.ZPO.Anfragetyp"/>
     *                   &lt;element name="zeitraumVon" type="{http://www.xjustiz.de}Type.GDS.Datumsangabe" minOccurs="0"/>
     *                   &lt;element name="zulassungsabschnittID" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
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
        "nachrichtID",
        "antwortID",
        "voraussetzungenDesAuskunftsersuchens",
        "anfrageParameter"
    })
    public static class Fachdaten {

        protected String nachrichtID;
        protected String antwortID;
        @XmlElement(required = true)
        protected NachrichtZpoAuskunftsersuchen1500004 .Fachdaten.VoraussetzungenDesAuskunftsersuchens voraussetzungenDesAuskunftsersuchens;
        @XmlElement(name = "anfrage.parameter")
        protected NachrichtZpoAuskunftsersuchen1500004 .Fachdaten.AnfrageParameter anfrageParameter;

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
         * Gets the value of the voraussetzungenDesAuskunftsersuchens property.
         * 
         * @return
         *     possible object is
         *     {@link NachrichtZpoAuskunftsersuchen1500004 .Fachdaten.VoraussetzungenDesAuskunftsersuchens }
         *     
         */
        public NachrichtZpoAuskunftsersuchen1500004 .Fachdaten.VoraussetzungenDesAuskunftsersuchens getVoraussetzungenDesAuskunftsersuchens() {
            return voraussetzungenDesAuskunftsersuchens;
        }

        /**
         * Sets the value of the voraussetzungenDesAuskunftsersuchens property.
         * 
         * @param value
         *     allowed object is
         *     {@link NachrichtZpoAuskunftsersuchen1500004 .Fachdaten.VoraussetzungenDesAuskunftsersuchens }
         *     
         */
        public void setVoraussetzungenDesAuskunftsersuchens(NachrichtZpoAuskunftsersuchen1500004 .Fachdaten.VoraussetzungenDesAuskunftsersuchens value) {
            this.voraussetzungenDesAuskunftsersuchens = value;
        }

        /**
         * Gets the value of the anfrageParameter property.
         * 
         * @return
         *     possible object is
         *     {@link NachrichtZpoAuskunftsersuchen1500004 .Fachdaten.AnfrageParameter }
         *     
         */
        public NachrichtZpoAuskunftsersuchen1500004 .Fachdaten.AnfrageParameter getAnfrageParameter() {
            return anfrageParameter;
        }

        /**
         * Sets the value of the anfrageParameter property.
         * 
         * @param value
         *     allowed object is
         *     {@link NachrichtZpoAuskunftsersuchen1500004 .Fachdaten.AnfrageParameter }
         *     
         */
        public void setAnfrageParameter(NachrichtZpoAuskunftsersuchen1500004 .Fachdaten.AnfrageParameter value) {
            this.anfrageParameter = value;
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
         *         &lt;element name="anfrage.typ" type="{http://www.xjustiz.de}Code.ZPO.Anfragetyp"/>
         *         &lt;element name="zeitraumVon" type="{http://www.xjustiz.de}Type.GDS.Datumsangabe" minOccurs="0"/>
         *         &lt;element name="zulassungsabschnittID" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
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
            "anfrageTyp",
            "zeitraumVon",
            "zulassungsabschnittID"
        })
        public static class AnfrageParameter {

            @XmlElement(name = "anfrage.typ", required = true)
            protected CodeZPOAnfragetyp anfrageTyp;
            protected String zeitraumVon;
            protected String zulassungsabschnittID;

            /**
             * Gets the value of the anfrageTyp property.
             * 
             * @return
             *     possible object is
             *     {@link CodeZPOAnfragetyp }
             *     
             */
            public CodeZPOAnfragetyp getAnfrageTyp() {
                return anfrageTyp;
            }

            /**
             * Sets the value of the anfrageTyp property.
             * 
             * @param value
             *     allowed object is
             *     {@link CodeZPOAnfragetyp }
             *     
             */
            public void setAnfrageTyp(CodeZPOAnfragetyp value) {
                this.anfrageTyp = value;
            }

            /**
             * Gets the value of the zeitraumVon property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getZeitraumVon() {
                return zeitraumVon;
            }

            /**
             * Sets the value of the zeitraumVon property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setZeitraumVon(String value) {
                this.zeitraumVon = value;
            }

            /**
             * Gets the value of the zulassungsabschnittID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getZulassungsabschnittID() {
                return zulassungsabschnittID;
            }

            /**
             * Sets the value of the zulassungsabschnittID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setZulassungsabschnittID(String value) {
                this.zulassungsabschnittID = value;
            }

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
         *         &lt;element name="gueltigerVollstreckungstitel" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *         &lt;element name="anfrage.meldebehoerde" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *         &lt;element name="vermoegensauskunft" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *         &lt;element name="keineVollstaendigeBefriedigung" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
            "gueltigerVollstreckungstitel",
            "anfrageMeldebehoerde",
            "vermoegensauskunft",
            "keineVollstaendigeBefriedigung"
        })
        public static class VoraussetzungenDesAuskunftsersuchens {

            @XmlElement(defaultValue = "false")
            protected boolean gueltigerVollstreckungstitel;
            @XmlElement(name = "anfrage.meldebehoerde", defaultValue = "false")
            protected Boolean anfrageMeldebehoerde;
            @XmlElement(defaultValue = "false")
            protected Boolean vermoegensauskunft;
            @XmlElement(defaultValue = "false")
            protected Boolean keineVollstaendigeBefriedigung;

            /**
             * Gets the value of the gueltigerVollstreckungstitel property.
             * 
             */
            public boolean isGueltigerVollstreckungstitel() {
                return gueltigerVollstreckungstitel;
            }

            /**
             * Sets the value of the gueltigerVollstreckungstitel property.
             * 
             */
            public void setGueltigerVollstreckungstitel(boolean value) {
                this.gueltigerVollstreckungstitel = value;
            }

            /**
             * Gets the value of the anfrageMeldebehoerde property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isAnfrageMeldebehoerde() {
                return anfrageMeldebehoerde;
            }

            /**
             * Sets the value of the anfrageMeldebehoerde property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setAnfrageMeldebehoerde(Boolean value) {
                this.anfrageMeldebehoerde = value;
            }

            /**
             * Gets the value of the vermoegensauskunft property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isVermoegensauskunft() {
                return vermoegensauskunft;
            }

            /**
             * Sets the value of the vermoegensauskunft property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setVermoegensauskunft(Boolean value) {
                this.vermoegensauskunft = value;
            }

            /**
             * Gets the value of the keineVollstaendigeBefriedigung property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isKeineVollstaendigeBefriedigung() {
                return keineVollstaendigeBefriedigung;
            }

            /**
             * Sets the value of the keineVollstaendigeBefriedigung property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setKeineVollstaendigeBefriedigung(Boolean value) {
                this.keineVollstaendigeBefriedigung = value;
            }

        }

    }

}
