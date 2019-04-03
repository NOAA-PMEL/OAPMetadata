//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.29 at 04:20:46 PM PDT 
//


package gov.noaa.ncei.oads.xml.v_a0_2_2;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;


/**
 * <p>Java class for ph_variable_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ph_variable_type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ncei.noaa.gov/oads/v_a0_2_2}base_variable_type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="phScale" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="measurementTemperature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="temperatureCorrectionMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="phReportTemperature" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ph_variable_type", propOrder = {
    "phScale",
    "measurementTemperature",
    "temperatureCorrectionMethod",
    "phReportTemperature"
})
@SuperBuilder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class PhVariableType
    extends BaseVariableType
    implements Serializable
{

    private final static long serialVersionUID = 101L;
    @XmlElement(required = true)
    protected String phScale;
    protected String measurementTemperature;
    protected String temperatureCorrectionMethod;
    @XmlElement(required = true)
    protected String phReportTemperature;

    /**
     * Gets the value of the phScale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhScale() {
        return phScale;
    }

    /**
     * Sets the value of the phScale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhScale(String value) {
        this.phScale = value;
    }

    public boolean isSetPhScale() {
        return (this.phScale!= null);
    }

    /**
     * Gets the value of the measurementTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasurementTemperature() {
        return measurementTemperature;
    }

    /**
     * Sets the value of the measurementTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasurementTemperature(String value) {
        this.measurementTemperature = value;
    }

    public boolean isSetMeasurementTemperature() {
        return (this.measurementTemperature!= null);
    }

    /**
     * Gets the value of the temperatureCorrectionMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemperatureCorrectionMethod() {
        return temperatureCorrectionMethod;
    }

    /**
     * Sets the value of the temperatureCorrectionMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemperatureCorrectionMethod(String value) {
        this.temperatureCorrectionMethod = value;
    }

    public boolean isSetTemperatureCorrectionMethod() {
        return (this.temperatureCorrectionMethod!= null);
    }

    /**
     * Gets the value of the phReportTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhReportTemperature() {
        return phReportTemperature;
    }

    /**
     * Sets the value of the phReportTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhReportTemperature(String value) {
        this.phReportTemperature = value;
    }

    public boolean isSetPhReportTemperature() {
        return (this.phReportTemperature!= null);
    }

}