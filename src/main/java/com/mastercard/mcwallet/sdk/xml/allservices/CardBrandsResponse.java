//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.08.21 at 12:20:26 PM CDT 
//


package com.mastercard.mcwallet.sdk.xml.allservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardBrandsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardBrandsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CardBrands" type="{}CardBrands"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardBrandsResponse", propOrder = {
    "cardBrands"
})
public class CardBrandsResponse {

    @XmlElement(name = "CardBrands", required = true)
    protected CardBrands cardBrands;

    /**
     * Gets the value of the cardBrands property.
     * 
     * @return
     *     possible object is
     *     {@link CardBrands }
     *     
     */
    public CardBrands getCardBrands() {
        return cardBrands;
    }

    /**
     * Sets the value of the cardBrands property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardBrands }
     *     
     */
    public void setCardBrands(CardBrands value) {
        this.cardBrands = value;
    }

}
