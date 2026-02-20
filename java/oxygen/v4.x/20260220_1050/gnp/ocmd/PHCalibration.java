
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pH_calibration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pH_calibration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://ncei.noaa.gov/ocads/v4.6}basic_calibration_info"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dye_information" type="{https://ncei.noaa.gov/ocads/v4.6}ph_dye_info"/&gt;
 *         &lt;element name="ph_of_standards" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="calibration_temperature" type="{https://ncei.noaa.gov/ocads/v4.6}measured_value" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pH_calibration", namespace = "https://ncei.noaa.gov/ocads/v4.6", propOrder = {
    "dyeInformation",
    "phOfStandards",
    "calibrationTemperature"
})
public class PHCalibration
    extends BasicCalibrationInfo
{

    @XmlElement(name = "dye_information", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected PhDyeInfo dyeInformation;
    @XmlElement(name = "ph_of_standards", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected String phOfStandards;
    @XmlElement(name = "calibration_temperature", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected MeasuredValue calibrationTemperature;

    /**
     * Gets the value of the dyeInformation property.
     * 
     * @return
     *     possible object is
     *     {@link PhDyeInfo }
     *     
     */
    public PhDyeInfo getDyeInformation() {
        return dyeInformation;
    }

    /**
     * Sets the value of the dyeInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhDyeInfo }
     *     
     */
    public void setDyeInformation(PhDyeInfo value) {
        this.dyeInformation = value;
    }

    /**
     * Gets the value of the phOfStandards property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhOfStandards() {
        return phOfStandards;
    }

    /**
     * Sets the value of the phOfStandards property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhOfStandards(String value) {
        this.phOfStandards = value;
    }

    /**
     * Gets the value of the calibrationTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link MeasuredValue }
     *     
     */
    public MeasuredValue getCalibrationTemperature() {
        return calibrationTemperature;
    }

    /**
     * Sets the value of the calibrationTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredValue }
     *     
     */
    public void setCalibrationTemperature(MeasuredValue value) {
        this.calibrationTemperature = value;
    }

}
