
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ph_variable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ph_variable"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ncei.noaa.gov/oads/a4.1}base_variable"&gt;
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
@XmlType(name = "ph_variable", namespace = "http://ncei.noaa.gov/oads/a4.1", propOrder = {
    "phScale",
    "measurementTemperature",
    "temperatureCorrectionMethod",
    "phReportTemperature"
})
public class PhVariable
    extends BaseVariable
{

    @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
    protected String phScale;
    @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1")
    protected String measurementTemperature;
    @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1")
    protected String temperatureCorrectionMethod;
    @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
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

}
