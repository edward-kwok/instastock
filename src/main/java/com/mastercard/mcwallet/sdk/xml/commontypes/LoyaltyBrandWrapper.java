//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.08.21 at 12:20:47 PM CDT 
//


package com.mastercard.mcwallet.sdk.xml.commontypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoyaltyBrandWrapper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoyaltyBrandWrapper">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LoyaltyBrand" type="{}LoyaltyBrand"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoyaltyBrandWrapper", propOrder = {
    "loyaltyBrand"
})
public class LoyaltyBrandWrapper {

    @XmlElement(name = "LoyaltyBrand", required = true)
    protected LoyaltyBrand loyaltyBrand;

    /**
     * Gets the value of the loyaltyBrand property.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyBrand }
     *     
     */
    public LoyaltyBrand getLoyaltyBrand() {
        return loyaltyBrand;
    }

    /**
     * Sets the value of the loyaltyBrand property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyBrand }
     *     
     */
    public void setLoyaltyBrand(LoyaltyBrand value) {
        this.loyaltyBrand = value;
    }

}
