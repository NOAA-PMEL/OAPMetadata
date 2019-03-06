//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.06 at 08:47:27 AM PST 
//


package gov.noaa.pmel.oads.v_a0_2;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for altitude_range_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="altitude_range_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="maxAltitude" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="minAltitude" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "altitude_range_type", propOrder = {
    "maxAltitude",
    "minAltitude"
})
public class AltitudeRangeType {

    @XmlElement(required = true)
    protected BigDecimal maxAltitude;
    @XmlElement(required = true)
    protected BigDecimal minAltitude;

    /**
     * Gets the value of the maxAltitude property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxAltitude() {
        return maxAltitude;
    }

    /**
     * Sets the value of the maxAltitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxAltitude(BigDecimal value) {
        this.maxAltitude = value;
    }

    /**
     * Gets the value of the minAltitude property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinAltitude() {
        return minAltitude;
    }

    /**
     * Sets the value of the minAltitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinAltitude(BigDecimal value) {
        this.minAltitude = value;
    }

}