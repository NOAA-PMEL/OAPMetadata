
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pH_instrument complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pH_instrument"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://ncei.noaa.gov/ocads/v4.6}instrument_base"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="calibration" type="{https://ncei.noaa.gov/ocads/v4.6}pH_calibration"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pH_instrument", namespace = "https://ncei.noaa.gov/ocads/v4.6", propOrder = {
    "calibration"
})
public class PHInstrument
    extends InstrumentBase
{

    @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected PHCalibration calibration;

    /**
     * Gets the value of the calibration property.
     * 
     * @return
     *     possible object is
     *     {@link PHCalibration }
     *     
     */
    public PHCalibration getCalibration() {
        return calibration;
    }

    /**
     * Sets the value of the calibration property.
     * 
     * @param value
     *     allowed object is
     *     {@link PHCalibration }
     *     
     */
    public void setCalibration(PHCalibration value) {
        this.calibration = value;
    }

}
