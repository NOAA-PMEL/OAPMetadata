//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.06 at 08:47:27 AM PST 
//


package gov.noaa.pmel.oads.v_a0_2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for standardization_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="standardization_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="frequency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="temperature" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="standardGas" maxOccurs="unbounded" minOccurs="0">
 *               &lt;complexType>
 *                 &lt;complexContent>
 *                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                     &lt;sequence>
 *                       &lt;element name="manufacturer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                       &lt;element name="concentration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                       &lt;element name="uncertainty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;/sequence>
 *                   &lt;/restriction>
 *                 &lt;/complexContent>
 *               &lt;/complexType>
 *             &lt;/element>
 *             &lt;element name="crm" type="{http://ncei.noaa.gov/oads_metadata}crm_type" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;element name="phOfStandards" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "standardization_type", propOrder = {
    "description",
    "frequency",
    "temperature",
    "standardGas",
    "crm",
    "phOfStandards"
})
public class StandardizationType {

    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected String frequency;
    protected BigDecimal temperature;
    protected List<StandardizationType.StandardGas> standardGas;
    protected CrmType crm;
    protected String phOfStandards;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the frequency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrequency(String value) {
        this.frequency = value;
    }

    /**
     * Gets the value of the temperature property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTemperature() {
        return temperature;
    }

    /**
     * Sets the value of the temperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTemperature(BigDecimal value) {
        this.temperature = value;
    }

    /**
     * Gets the value of the standardGas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the standardGas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStandardGas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StandardizationType.StandardGas }
     * 
     * 
     */
    public List<StandardizationType.StandardGas> getStandardGas() {
        if (standardGas == null) {
            standardGas = new ArrayList<StandardizationType.StandardGas>();
        }
        return this.standardGas;
    }

    /**
     * Gets the value of the crm property.
     * 
     * @return
     *     possible object is
     *     {@link CrmType }
     *     
     */
    public CrmType getCrm() {
        return crm;
    }

    /**
     * Sets the value of the crm property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrmType }
     *     
     */
    public void setCrm(CrmType value) {
        this.crm = value;
    }

    /**
     * Gets the value of the phOfStandards property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhOfStandards() {
        return phOfStandards;
    }

    /**
     * Sets the value of the phOfStandards property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhOfStandards(String value) {
        this.phOfStandards = value;
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
     *         &lt;element name="manufacturer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="concentration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="uncertainty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "manufacturer",
        "concentration",
        "uncertainty"
    })
    public static class StandardGas {

        protected String manufacturer;
        protected String concentration;
        protected String uncertainty;

        /**
         * Gets the value of the manufacturer property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getManufacturer() {
            return manufacturer;
        }

        /**
         * Sets the value of the manufacturer property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setManufacturer(String value) {
            this.manufacturer = value;
        }

        /**
         * Gets the value of the concentration property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getConcentration() {
            return concentration;
        }

        /**
         * Sets the value of the concentration property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setConcentration(String value) {
            this.concentration = value;
        }

        /**
         * Gets the value of the uncertainty property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUncertainty() {
            return uncertainty;
        }

        /**
         * Sets the value of the uncertainty property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUncertainty(String value) {
            this.uncertainty = value;
        }

    }

}