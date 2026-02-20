
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for co2_measured_base complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="co2_measured_base"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://ncei.noaa.gov/ocads/v4.6}basic_measured_observation_base"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="water_vapor_correction" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="temperature_correction_method" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="gas_detector" type="{https://ncei.noaa.gov/ocads/v4.6}co2_gas_detector"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "co2_measured_base", namespace = "https://ncei.noaa.gov/ocads/v4.6", propOrder = {
    "waterVaporCorrection",
    "temperatureCorrectionMethod",
    "gasDetector"
})
@XmlSeeAlso({
    Co2ContinuousVariable.class,
    Co2DiscreteVariable.class
})
public abstract class Co2MeasuredBase
    extends BasicMeasuredObservationBase
{

    @XmlElement(name = "water_vapor_correction", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected String waterVaporCorrection;
    @XmlElement(name = "temperature_correction_method", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected String temperatureCorrectionMethod;
    @XmlElement(name = "gas_detector", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected Co2GasDetector gasDetector;

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
     * Gets the value of the gasDetector property.
     * 
     * @return
     *     possible object is
     *     {@link Co2GasDetector }
     *     
     */
    public Co2GasDetector getGasDetector() {
        return gasDetector;
    }

    /**
     * Sets the value of the gasDetector property.
     * 
     * @param value
     *     allowed object is
     *     {@link Co2GasDetector }
     *     
     */
    public void setGasDetector(Co2GasDetector value) {
        this.gasDetector = value;
    }

}
