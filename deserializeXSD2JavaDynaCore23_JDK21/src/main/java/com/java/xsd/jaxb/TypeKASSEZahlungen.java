//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.09.13 at 01:28:34 PM CEST 
//


package com.java.xsd.jaxb;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Der Datentyp enth�lt alle erforderlichen Fachdaten zu Zahlungen.
 * 
 * <p>Java class for Type.KASSE.Zahlungen complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.KASSE.Zahlungen">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="zahlung" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="zahlungsbetrag" type="{http://www.xjustiz.de}Type.GDS.Geldbetrag"/>
 *                   &lt;element name="sachkonto" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
 *                   &lt;element name="zahlungsart" type="{http://www.xjustiz.de}Code.KASSE.Zahlwege" maxOccurs="unbounded"/>
 *                   &lt;element name="zahlungsdatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="buchungsdatum" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="buchungsinformationen" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
 *                   &lt;element name="kassenzeichen" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
 *                   &lt;element name="rechnungsnummer" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="auswahl_zahlender" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice>
 *                             &lt;element name="zahlender" type="{http://www.xjustiz.de}Type.GDS.Ref.Beteiligtennummer"/>
 *                             &lt;element name="einzahlender">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="zahlender" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeD"/>
 *                                       &lt;element name="bankverbindung" type="{http://www.xjustiz.de}Type.GDS.Bankverbindung" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/choice>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="zahlungen.hinweise" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="bestaetigung.zahlung" type="{http://www.xjustiz.de}Type.KASSE.Buchungspruefung" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="gesamtbetrag" type="{http://www.xjustiz.de}Type.GDS.Geldbetrag" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type.KASSE.Zahlungen", propOrder = {
    "zahlung",
    "gesamtbetrag"
})
public class TypeKASSEZahlungen {

    protected List<TypeKASSEZahlungen.Zahlung> zahlung;
    protected TypeGDSGeldbetrag gesamtbetrag;

    /**
     * Gets the value of the zahlung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zahlung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZahlung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeKASSEZahlungen.Zahlung }
     * 
     * 
     */
    public List<TypeKASSEZahlungen.Zahlung> getZahlung() {
        if (zahlung == null) {
            zahlung = new ArrayList<TypeKASSEZahlungen.Zahlung>();
        }
        return this.zahlung;
    }

    /**
     * Gets the value of the gesamtbetrag property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSGeldbetrag }
     *     
     */
    public TypeGDSGeldbetrag getGesamtbetrag() {
        return gesamtbetrag;
    }

    /**
     * Sets the value of the gesamtbetrag property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSGeldbetrag }
     *     
     */
    public void setGesamtbetrag(TypeGDSGeldbetrag value) {
        this.gesamtbetrag = value;
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
     *         &lt;element name="zahlungsbetrag" type="{http://www.xjustiz.de}Type.GDS.Geldbetrag"/>
     *         &lt;element name="sachkonto" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
     *         &lt;element name="zahlungsart" type="{http://www.xjustiz.de}Code.KASSE.Zahlwege" maxOccurs="unbounded"/>
     *         &lt;element name="zahlungsdatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="buchungsdatum" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="buchungsinformationen" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
     *         &lt;element name="kassenzeichen" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
     *         &lt;element name="rechnungsnummer" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="auswahl_zahlender" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;choice>
     *                   &lt;element name="zahlender" type="{http://www.xjustiz.de}Type.GDS.Ref.Beteiligtennummer"/>
     *                   &lt;element name="einzahlender">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="zahlender" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeD"/>
     *                             &lt;element name="bankverbindung" type="{http://www.xjustiz.de}Type.GDS.Bankverbindung" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/choice>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="zahlungen.hinweise" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="bestaetigung.zahlung" type="{http://www.xjustiz.de}Type.KASSE.Buchungspruefung" minOccurs="0"/>
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
        "zahlungsbetrag",
        "sachkonto",
        "zahlungsart",
        "zahlungsdatum",
        "buchungsdatum",
        "buchungsinformationen",
        "kassenzeichen",
        "rechnungsnummer",
        "auswahlZahlender",
        "zahlungenHinweise",
        "bestaetigungZahlung"
    })
    public static class Zahlung {

        @XmlElement(required = true)
        protected TypeGDSGeldbetrag zahlungsbetrag;
        protected String sachkonto;
        @XmlElement(required = true)
        protected List<CodeKASSEZahlwege> zahlungsart;
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar zahlungsdatum;
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar buchungsdatum;
        protected String buchungsinformationen;
        protected String kassenzeichen;
        protected BigInteger rechnungsnummer;
        @XmlElement(name = "auswahl_zahlender")
        protected TypeKASSEZahlungen.Zahlung.AuswahlZahlender auswahlZahlender;
        @XmlElement(name = "zahlungen.hinweise")
        protected List<String> zahlungenHinweise;
        @XmlElement(name = "bestaetigung.zahlung")
        protected TypeKASSEBuchungspruefung bestaetigungZahlung;

        /**
         * Gets the value of the zahlungsbetrag property.
         * 
         * @return
         *     possible object is
         *     {@link TypeGDSGeldbetrag }
         *     
         */
        public TypeGDSGeldbetrag getZahlungsbetrag() {
            return zahlungsbetrag;
        }

        /**
         * Sets the value of the zahlungsbetrag property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeGDSGeldbetrag }
         *     
         */
        public void setZahlungsbetrag(TypeGDSGeldbetrag value) {
            this.zahlungsbetrag = value;
        }

        /**
         * Gets the value of the sachkonto property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSachkonto() {
            return sachkonto;
        }

        /**
         * Sets the value of the sachkonto property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSachkonto(String value) {
            this.sachkonto = value;
        }

        /**
         * Gets the value of the zahlungsart property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the zahlungsart property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getZahlungsart().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CodeKASSEZahlwege }
         * 
         * 
         */
        public List<CodeKASSEZahlwege> getZahlungsart() {
            if (zahlungsart == null) {
                zahlungsart = new ArrayList<CodeKASSEZahlwege>();
            }
            return this.zahlungsart;
        }

        /**
         * Gets the value of the zahlungsdatum property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getZahlungsdatum() {
            return zahlungsdatum;
        }

        /**
         * Sets the value of the zahlungsdatum property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setZahlungsdatum(XMLGregorianCalendar value) {
            this.zahlungsdatum = value;
        }

        /**
         * Gets the value of the buchungsdatum property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getBuchungsdatum() {
            return buchungsdatum;
        }

        /**
         * Sets the value of the buchungsdatum property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setBuchungsdatum(XMLGregorianCalendar value) {
            this.buchungsdatum = value;
        }

        /**
         * Gets the value of the buchungsinformationen property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBuchungsinformationen() {
            return buchungsinformationen;
        }

        /**
         * Sets the value of the buchungsinformationen property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBuchungsinformationen(String value) {
            this.buchungsinformationen = value;
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

        /**
         * Gets the value of the rechnungsnummer property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getRechnungsnummer() {
            return rechnungsnummer;
        }

        /**
         * Sets the value of the rechnungsnummer property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setRechnungsnummer(BigInteger value) {
            this.rechnungsnummer = value;
        }

        /**
         * Gets the value of the auswahlZahlender property.
         * 
         * @return
         *     possible object is
         *     {@link TypeKASSEZahlungen.Zahlung.AuswahlZahlender }
         *     
         */
        public TypeKASSEZahlungen.Zahlung.AuswahlZahlender getAuswahlZahlender() {
            return auswahlZahlender;
        }

        /**
         * Sets the value of the auswahlZahlender property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeKASSEZahlungen.Zahlung.AuswahlZahlender }
         *     
         */
        public void setAuswahlZahlender(TypeKASSEZahlungen.Zahlung.AuswahlZahlender value) {
            this.auswahlZahlender = value;
        }

        /**
         * Gets the value of the zahlungenHinweise property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the zahlungenHinweise property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getZahlungenHinweise().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getZahlungenHinweise() {
            if (zahlungenHinweise == null) {
                zahlungenHinweise = new ArrayList<String>();
            }
            return this.zahlungenHinweise;
        }

        /**
         * Gets the value of the bestaetigungZahlung property.
         * 
         * @return
         *     possible object is
         *     {@link TypeKASSEBuchungspruefung }
         *     
         */
        public TypeKASSEBuchungspruefung getBestaetigungZahlung() {
            return bestaetigungZahlung;
        }

        /**
         * Sets the value of the bestaetigungZahlung property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeKASSEBuchungspruefung }
         *     
         */
        public void setBestaetigungZahlung(TypeKASSEBuchungspruefung value) {
            this.bestaetigungZahlung = value;
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
         *         &lt;element name="zahlender" type="{http://www.xjustiz.de}Type.GDS.Ref.Beteiligtennummer"/>
         *         &lt;element name="einzahlender">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="zahlender" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeD"/>
         *                   &lt;element name="bankverbindung" type="{http://www.xjustiz.de}Type.GDS.Bankverbindung" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "zahlender",
            "einzahlender"
        })
        public static class AuswahlZahlender {

            protected TypeGDSRefBeteiligtennummer zahlender;
            protected TypeKASSEZahlungen.Zahlung.AuswahlZahlender.Einzahlender einzahlender;

            /**
             * Gets the value of the zahlender property.
             * 
             * @return
             *     possible object is
             *     {@link TypeGDSRefBeteiligtennummer }
             *     
             */
            public TypeGDSRefBeteiligtennummer getZahlender() {
                return zahlender;
            }

            /**
             * Sets the value of the zahlender property.
             * 
             * @param value
             *     allowed object is
             *     {@link TypeGDSRefBeteiligtennummer }
             *     
             */
            public void setZahlender(TypeGDSRefBeteiligtennummer value) {
                this.zahlender = value;
            }

            /**
             * Gets the value of the einzahlender property.
             * 
             * @return
             *     possible object is
             *     {@link TypeKASSEZahlungen.Zahlung.AuswahlZahlender.Einzahlender }
             *     
             */
            public TypeKASSEZahlungen.Zahlung.AuswahlZahlender.Einzahlender getEinzahlender() {
                return einzahlender;
            }

            /**
             * Sets the value of the einzahlender property.
             * 
             * @param value
             *     allowed object is
             *     {@link TypeKASSEZahlungen.Zahlung.AuswahlZahlender.Einzahlender }
             *     
             */
            public void setEinzahlender(TypeKASSEZahlungen.Zahlung.AuswahlZahlender.Einzahlender value) {
                this.einzahlender = value;
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
             *         &lt;element name="zahlender" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeD"/>
             *         &lt;element name="bankverbindung" type="{http://www.xjustiz.de}Type.GDS.Bankverbindung" minOccurs="0"/>
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
                "zahlender",
                "bankverbindung"
            })
            public static class Einzahlender {

                @XmlElement(required = true)
                protected String zahlender;
                protected TypeGDSBankverbindung bankverbindung;

                /**
                 * Gets the value of the zahlender property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getZahlender() {
                    return zahlender;
                }

                /**
                 * Sets the value of the zahlender property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setZahlender(String value) {
                    this.zahlender = value;
                }

                /**
                 * Gets the value of the bankverbindung property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TypeGDSBankverbindung }
                 *     
                 */
                public TypeGDSBankverbindung getBankverbindung() {
                    return bankverbindung;
                }

                /**
                 * Sets the value of the bankverbindung property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TypeGDSBankverbindung }
                 *     
                 */
                public void setBankverbindung(TypeGDSBankverbindung value) {
                    this.bankverbindung = value;
                }

            }

        }

    }

}
