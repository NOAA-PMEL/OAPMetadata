
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for co2_gas_detector complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="co2_gas_detector"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://ncei.noaa.gov/ocads/v4.6}instrument_base"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="calibration" type="{https://ncei.noaa.gov/ocads/v4.6}co2_calibration" minOccurs="0"/&gt;
 *         &lt;element name="measurement_frequency" type="{https://ncei.noaa.gov/ocads/v4.6}positive_dimensioned_quantity"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "co2_gas_detector", namespace = "https://ncei.noaa.gov/ocads/v4.6", propOrder = {
    "calibration",
    "measurementFrequency"
})
public class Co2GasDetector
    extends InstrumentBase
{

    @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected Co2Calibration calibration;
    @XmlElement(name = "measurement_frequency", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected PositiveDimensionedQuantity measurementFrequency;

    /**
     * Gets the value of the calibration property.
     * 
     * @return
     *     possible object is
     *     {@link Co2Calibration }
     *     
     */
    public Co2Calibration getCalibration() {
        return calibration;
    }

    /**
     * Sets the value of the calibration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Co2Calibration }
     *     
     */
    public void setCalibration(Co2Calibration value) {
        this.calibration = value;
    }

    /**
     * Gets the value of the measurementFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link PositiveDimensionedQuantity }
     *     
     */
    public PositiveDimensionedQuantity getMeasurementFrequency() {
        return measurementFrequency;
    }

    /**
     * Sets the value of the measurementFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositiveDimensionedQuantity }
     *     
     */
    public void setMeasurementFrequency(PositiveDimensionedQuantity value) {
        this.measurementFrequency = value;
    }

}
