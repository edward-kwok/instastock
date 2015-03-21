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
 * <p>Java class for RewardProgram complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RewardProgram">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RewardNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RewardId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RewardName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExpiryMonth" type="{}Month" minOccurs="0"/>
 *         &lt;element name="ExpiryYear" type="{}Year" minOccurs="0"/>
 *         &lt;element name="ExtensionPoint" type="{}ExtensionPoint" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RewardProgram", propOrder = {
    "rewardNumber",
    "rewardId",
    "rewardName",
    "expiryMonth",
    "expiryYear",
    "extensionPoint"
})
public class RewardProgram {

    @XmlElement(name = "RewardNumber", required = true)
    protected String rewardNumber;
    @XmlElement(name = "RewardId", required = true)
    protected String rewardId;
    @XmlElement(name = "RewardName")
    protected String rewardName;
    @XmlElement(name = "ExpiryMonth")
    protected Integer expiryMonth;
    @XmlElement(name = "ExpiryYear")
    protected Integer expiryYear;
    @XmlElement(name = "ExtensionPoint")
    protected ExtensionPoint extensionPoint;

    /**
     * Gets the value of the rewardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRewardNumber() {
        return rewardNumber;
    }

    /**
     * Sets the value of the rewardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRewardNumber(String value) {
        this.rewardNumber = value;
    }

    /**
     * Gets the value of the rewardId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRewardId() {
        return rewardId;
    }

    /**
     * Sets the value of the rewardId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRewardId(String value) {
        this.rewardId = value;
    }

    /**
     * Gets the value of the rewardName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRewardName() {
        return rewardName;
    }

    /**
     * Sets the value of the rewardName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRewardName(String value) {
        this.rewardName = value;
    }

    /**
     * Gets the value of the expiryMonth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExpiryMonth() {
        return expiryMonth;
    }

    /**
     * Sets the value of the expiryMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExpiryMonth(Integer value) {
        this.expiryMonth = value;
    }

    /**
     * Gets the value of the expiryYear property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExpiryYear() {
        return expiryYear;
    }

    /**
     * Sets the value of the expiryYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExpiryYear(Integer value) {
        this.expiryYear = value;
    }

    /**
     * Gets the value of the extensionPoint property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionPoint }
     *     
     */
    public ExtensionPoint getExtensionPoint() {
        return extensionPoint;
    }

    /**
     * Sets the value of the extensionPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionPoint }
     *     
     */
    public void setExtensionPoint(ExtensionPoint value) {
        this.extensionPoint = value;
    }

}
