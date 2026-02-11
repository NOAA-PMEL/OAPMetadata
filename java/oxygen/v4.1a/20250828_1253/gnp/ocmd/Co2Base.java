
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for co2_base complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="co2_base"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ncei.noaa.gov/oads/a4.1}base_variable"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="gasDetector" type="{http://ncei.noaa.gov/oads/a4.1}gas_detector"/&gt;
 *         &lt;element name="waterVaporCorrection" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="temperatureCorrectionMethod" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="co2ReportTemperature" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "co2_base", namespace = "http://ncei.noaa.gov/oads/a4.1", propOrder = {
    "gasDetector",
    "waterVaporCorrection",
    "temperatureCorrectionMethod",
    "co2ReportTemperature"
})
@XmlSeeAlso({
    Co2Autonomous.class,
    Co2Discrete.class
})
public class Co2Base
    extends BaseVariable
{

    @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
    protected GasDetector gasDetector;
    @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
    protected String waterVaporCorrection;
    @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
    protected String temperatureCorrectionMethod;
    @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
    protected String co2ReportTemperature;

    /**
     * Gets the value of the gasDetector property.
     * 
     * @return
     *     possible object is
     *     {@link GasDetector }
     *     
     */
    public GasDetector getGasDetector() {
        return gasDetector;
    }

    /**
     * Sets the value of the gasDetector property.
     * 
     * @param value
     *     allowed object is
     *     {@link GasDetector }
     *     
     */
    public void setGasDetector(GasDetector value) {
        this.gasDetector = value;
    }

    /**
     * Gets the value of the waterVaporCorrection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaterVaporCorrection() {
        return waterVaporCorrection;
    }

    /**
     * Sets the value of the waterVaporCorrection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaterVaporCorrection(String value) {
        this.waterVaporCorrection = value;
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
     * Gets the value of the co2ReportTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCo2ReportTemperature() {
        return co2ReportTemperature;
    }

    /**
     * Sets the value of the co2ReportTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCo2ReportTemperature(String value) {
        this.co2ReportTemperature = value;
    }

}
