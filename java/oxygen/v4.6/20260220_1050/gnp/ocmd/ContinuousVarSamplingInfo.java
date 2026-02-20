
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for continuous_var_sampling_info complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="continuous_var_sampling_info"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="intake_location" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="intake_depth" type="{https://ncei.noaa.gov/ocads/v4.6}depth_m"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "continuous_var_sampling_info", namespace = "https://ncei.noaa.gov/ocads/v4.6", propOrder = {
    "intakeLocation",
    "intakeDepth"
})
public class ContinuousVarSamplingInfo {

    @XmlElement(name = "intake_location", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected String intakeLocation;
    @XmlElement(name = "intake_depth", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected DepthM intakeDepth;

    /**
     * Gets the value of the intakeLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntakeLocation() {
        return intakeLocation;
    }

    /**
     * Sets the value of the intakeLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntakeLocation(String value) {
        this.intakeLocation = value;
    }

    /**
     * Gets the value of the intakeDepth property.
     * 
     * @return
     *     possible object is
     *     {@link DepthM }
     *     
     */
    public DepthM getIntakeDepth() {
        return intakeDepth;
    }

    /**
     * Sets the value of the intakeDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepthM }
     *     
     */
    public void setIntakeDepth(DepthM value) {
        this.intakeDepth = value;
    }

}
