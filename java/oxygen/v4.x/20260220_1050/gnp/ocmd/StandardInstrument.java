
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for standard_instrument complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="standard_instrument"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://ncei.noaa.gov/ocads/v4.6}instrument_base"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="calibration" type="{https://ncei.noaa.gov/ocads/v4.6}basic_calibration_info"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "standard_instrument", namespace = "https://ncei.noaa.gov/ocads/v4.6", propOrder = {
    "calibration"
})
@XmlSeeAlso({
    Sensor.class
})
public class StandardInstrument
    extends InstrumentBase
{

    @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected BasicCalibrationInfo calibration;

    /**
     * Gets the value of the calibration property.
     * 
     * @return
     *     possible object is
     *     {@link BasicCalibrationInfo }
     *     
     */
    public BasicCalibrationInfo getCalibration() {
        return calibration;
    }

    /**
     * Sets the value of the calibration property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicCalibrationInfo }
     *     
     */
    public void setCalibration(BasicCalibrationInfo value) {
        this.calibration = value;
    }

}
