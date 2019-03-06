//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.06 at 08:47:27 AM PST 
//


package gov.noaa.pmel.oads.v_a0_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ta_sample_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ta_sample_type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ncei.noaa.gov/oads_metadata}dic_sample_type">
 *       &lt;sequence>
 *         &lt;element name="titrationType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cellType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="curveFitting" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="blankCorrection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ta_sample_type", propOrder = {
    "titrationType",
    "cellType",
    "curveFitting",
    "blankCorrection"
})
public class TaSampleType
    extends DicSampleType
{

    @XmlElement(required = true)
    protected String titrationType;
    @XmlElement(required = true)
    protected String cellType;
    @XmlElement(required = true)
    protected String curveFitting;
    protected String blankCorrection;

    /**
     * Gets the value of the titrationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitrationType() {
        return titrationType;
    }

    /**
     * Sets the value of the titrationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitrationType(String value) {
        this.titrationType = value;
    }

    /**
     * Gets the value of the cellType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellType() {
        return cellType;
    }

    /**
     * Sets the value of the cellType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellType(String value) {
        this.cellType = value;
    }

    /**
     * Gets the value of the curveFitting property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurveFitting() {
        return curveFitting;
    }

    /**
     * Sets the value of the curveFitting property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurveFitting(String value) {
        this.curveFitting = value;
    }

    /**
     * Gets the value of the blankCorrection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlankCorrection() {
        return blankCorrection;
    }

    /**
     * Sets the value of the blankCorrection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlankCorrection(String value) {
        this.blankCorrection = value;
    }

}