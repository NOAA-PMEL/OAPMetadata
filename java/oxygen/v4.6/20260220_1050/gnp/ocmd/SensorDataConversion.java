
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sensor_data_conversion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sensor_data_conversion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="conversion_calculation_method" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="conversion_software" type="{https://ncei.noaa.gov/ocads/v4.6}software_info" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sensor_data_conversion", namespace = "https://ncei.noaa.gov/ocads/v4.6", propOrder = {
    "conversionCalculationMethod",
    "conversionSoftware"
})
public class SensorDataConversion {

    @XmlElement(name = "conversion_calculation_method", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected String conversionCalculationMethod;
    @XmlElement(name = "conversion_software", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected SoftwareInfo conversionSoftware;

    /**
     * Gets the value of the conversionCalculationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConversionCalculationMethod() {
        return conversionCalculationMethod;
    }

    /**
     * Sets the value of the conversionCalculationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConversionCalculationMethod(String value) {
        this.conversionCalculationMethod = value;
    }

    /**
     * Gets the value of the conversionSoftware property.
     * 
     * @return
     *     possible object is
     *     {@link SoftwareInfo }
     *     
     */
    public SoftwareInfo getConversionSoftware() {
        return conversionSoftware;
    }

    /**
     * Sets the value of the conversionSoftware property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoftwareInfo }
     *     
     */
    public void setConversionSoftware(SoftwareInfo value) {
        this.conversionSoftware = value;
    }

}
