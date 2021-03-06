//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.14 at 02:00:27 PM CDT 
//


package com.mastercard.api.moneysend.v2.mapping.domain;

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
 *         &lt;element name="SubscriberId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SubscriberType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AccountUsage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DefaultIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Alias" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ICA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}Long"/>
 *         &lt;element name="ExpiryDate" type="{http://www.w3.org/2001/XMLSchema}Integer"/>
 *         &lt;element name="CardholderFullName">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CardholderFirstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="CardholderMiddleName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="CardholderLastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Address">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Line1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Line2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="CountrySubdivision" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}Integer"/>
 *                   &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DateOfBirth" type="{http://www.w3.org/2001/XMLSchema}Integer"/>
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
    "subscriberId",
    "subscriberType",
    "accountUsage",
    "defaultIndicator",
    "alias",
    "ica",
    "accountNumber",
    "expiryDate",
    "cardholderFullName",
    "address",
    "dateOfBirth"
})
@XmlRootElement(name = "CreateMappingRequest")
public class CreateMappingRequest {

    @XmlElement(name = "SubscriberId")
    protected String subscriberId;
    @XmlElement(name = "SubscriberType", required = true)
    protected String subscriberType;
    @XmlElement(name = "AccountUsage", required = true)
    protected String accountUsage;
    @XmlElement(name = "DefaultIndicator", required = true)
    protected String defaultIndicator;
    @XmlElement(name = "Alias", required = true)
    protected String alias;
    @XmlElement(name = "ICA")
    protected String ica;
    @XmlElement(name = "AccountNumber")
    protected Long accountNumber;
    @XmlElement(name = "ExpiryDate")
    protected Integer expiryDate;
    @XmlElement(name = "CardholderFullName", required = true)
    protected CardholderFullName cardholderFullName;
    @XmlElement(name = "Address", required = true)
    protected Address address;
    @XmlElement(name = "DateOfBirth")
    protected Integer dateOfBirth;

    /**
     * Gets the value of the subscriberId property.
     * 
     */
    public String getSubscriberId() {
        return subscriberId;
    }

    /**
     * Sets the value of the subscriberId property.
     * 
     */
    public void setSubscriberId(String value) {
        this.subscriberId = value;
    }

    /**
     * Gets the value of the subscriberType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberType() {
        return subscriberType;
    }

    /**
     * Sets the value of the subscriberType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberType(String value) {
        this.subscriberType = value;
    }

    /**
     * Gets the value of the accountUsage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountUsage() {
        return accountUsage;
    }

    /**
     * Sets the value of the accountUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountUsage(String value) {
        this.accountUsage = value;
    }

    /**
     * Gets the value of the defaultIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultIndicator() {
        return defaultIndicator;
    }

    /**
     * Sets the value of the defaultIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultIndicator(String value) {
        this.defaultIndicator = value;
    }

    /**
     * Gets the value of the alias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlias() {
        return alias;
    }

    /**
     * Sets the value of the alias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlias(String value) {
        this.alias = value;
    }

    /**
     * Gets the value of the ica property.
     * 
     */
    public String getICA() {
        return ica;
    }

    /**
     * Sets the value of the ica property.
     * 
     */
    public void setICA(String value) {
        this.ica = value;
    }

    /**
     * Gets the value of the accountNumber property.
     * 
     */
    public Long getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     */
    public void setAccountNumber(Long value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the expiryDate property.
     * 
     */
    public Integer getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     */
    public void setExpiryDate(Integer value) {
        this.expiryDate = value;
    }

    /**
     * Gets the value of the cardholderFullName property.
     * 
     * @return
     *     possible object is
     *     {@link com.mastercard.api.moneysend.v2.mapping.domain.CreateMappingRequest.CardholderFullName }
     *     
     */
    public CardholderFullName getCardholderFullName() {
        return cardholderFullName;
    }

    /**
     * Sets the value of the cardholderFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.mastercard.api.moneysend.v2.mapping.domain.CreateMappingRequest.CardholderFullName }
     *     
     */
    public void setCardholderFullName(CardholderFullName value) {
        this.cardholderFullName = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link com.mastercard.api.moneysend.v2.mapping.domain.CreateMappingRequest.Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.mastercard.api.moneysend.v2.mapping.domain.CreateMappingRequest.Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the dateOfBirth property.
     * 
     */
    public Integer getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     */
    public void setDateOfBirth(Integer value) {
        this.dateOfBirth = value;
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
     *         &lt;element name="Line1" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Line2" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="CountrySubdivision" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}Integer"/>
     *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "line1",
        "line2",
        "city",
        "countrySubdivision",
        "postalCode",
        "country"
    })
    public static class Address {

        @XmlElement(name = "Line1", required = true)
        protected String line1;
        @XmlElement(name = "Line2", required = true)
        protected String line2;
        @XmlElement(name = "City", required = true)
        protected String city;
        @XmlElement(name = "CountrySubdivision", required = true)
        protected String countrySubdivision;
        @XmlElement(name = "PostalCode")
        protected Integer postalCode;
        @XmlElement(name = "Country", required = true)
        protected String country;

        /**
         * Gets the value of the line1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLine1() {
            return line1;
        }

        /**
         * Sets the value of the line1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLine1(String value) {
            this.line1 = value;
        }

        /**
         * Gets the value of the line2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLine2() {
            return line2;
        }

        /**
         * Sets the value of the line2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLine2(String value) {
            this.line2 = value;
        }

        /**
         * Gets the value of the city property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCity() {
            return city;
        }

        /**
         * Sets the value of the city property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCity(String value) {
            this.city = value;
        }

        /**
         * Gets the value of the countrySubdivision property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCountrySubdivision() {
            return countrySubdivision;
        }

        /**
         * Sets the value of the countrySubdivision property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCountrySubdivision(String value) {
            this.countrySubdivision = value;
        }

        /**
         * Gets the value of the postalCode property.
         * 
         */
        public Integer getPostalCode() {
            return postalCode;
        }

        /**
         * Sets the value of the postalCode property.
         * 
         */
        public void setPostalCode(Integer value) {
            this.postalCode = value;
        }

        /**
         * Gets the value of the country property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCountry() {
            return country;
        }

        /**
         * Sets the value of the country property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCountry(String value) {
            this.country = value;
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
     *         &lt;element name="CardholderFirstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="CardholderMiddleName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="CardholderLastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "cardholderFirstName",
        "cardholderMiddleName",
        "cardholderLastName"
    })
    public static class CardholderFullName {

        @XmlElement(name = "CardholderFirstName", required = true)
        protected String cardholderFirstName;
        @XmlElement(name = "CardholderMiddleName", required = true)
        protected String cardholderMiddleName;
        @XmlElement(name = "CardholderLastName", required = true)
        protected String cardholderLastName;

        /**
         * Gets the value of the cardholderFirstName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCardholderFirstName() {
            return cardholderFirstName;
        }

        /**
         * Sets the value of the cardholderFirstName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCardholderFirstName(String value) {
            this.cardholderFirstName = value;
        }

        /**
         * Gets the value of the cardholderMiddleName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCardholderMiddleName() {
            return cardholderMiddleName;
        }

        /**
         * Sets the value of the cardholderMiddleName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCardholderMiddleName(String value) {
            this.cardholderMiddleName = value;
        }

        /**
         * Gets the value of the cardholderLastName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCardholderLastName() {
            return cardholderLastName;
        }

        /**
         * Sets the value of the cardholderLastName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCardholderLastName(String value) {
            this.cardholderLastName = value;
        }

    }

}
