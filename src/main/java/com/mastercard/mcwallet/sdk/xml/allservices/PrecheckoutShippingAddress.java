//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.08.27 at 10:02:54 AM CDT 
//


package com.mastercard.mcwallet.sdk.xml.allservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrecheckoutShippingAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrecheckoutShippingAddress">
 *   &lt;complexContent>
 *     &lt;extension base="{}Address">
 *       &lt;sequence>
 *         &lt;element name="RecipientName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RecipientPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AddressId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SelectedAsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ShippingAlias" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrecheckoutShippingAddress", propOrder = {
    "recipientName",
    "recipientPhoneNumber",
    "addressId",
    "selectedAsDefault",
    "shippingAlias"
})
public class PrecheckoutShippingAddress
    extends Address
{

    @XmlElement(name = "RecipientName", required = true)
    protected String recipientName;
    @XmlElement(name = "RecipientPhoneNumber", required = true)
    protected String recipientPhoneNumber;
    @XmlElement(name = "AddressId", required = true)
    protected String addressId;
    @XmlElement(name = "SelectedAsDefault")
    protected boolean selectedAsDefault;
    @XmlElement(name = "ShippingAlias", required = true)
    protected String shippingAlias;

    /**
     * Gets the value of the recipientName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientName() {
        return recipientName;
    }

    /**
     * Sets the value of the recipientName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientName(String value) {
        this.recipientName = value;
    }

    /**
     * Gets the value of the recipientPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientPhoneNumber() {
        return recipientPhoneNumber;
    }

    /**
     * Sets the value of the recipientPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientPhoneNumber(String value) {
        this.recipientPhoneNumber = value;
    }

    /**
     * Gets the value of the addressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressId() {
        return addressId;
    }

    /**
     * Sets the value of the addressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressId(String value) {
        this.addressId = value;
    }

    /**
     * Gets the value of the selectedAsDefault property.
     * 
     */
    public boolean isSelectedAsDefault() {
        return selectedAsDefault;
    }

    /**
     * Sets the value of the selectedAsDefault property.
     * 
     */
    public void setSelectedAsDefault(boolean value) {
        this.selectedAsDefault = value;
    }

    /**
     * Gets the value of the shippingAlias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingAlias() {
        return shippingAlias;
    }

    /**
     * Sets the value of the shippingAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingAlias(String value) {
        this.shippingAlias = value;
    }

}
