
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pH_measured complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pH_measured"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://ncei.noaa.gov/ocads/v4.6}basic_measured_observation_base"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="analyzing_instrument" type="{https://ncei.noaa.gov/ocads/v4.6}pH_instrument"/&gt;
 *         &lt;element name="measurement_temperature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="temperature_correction_method" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ph_report_temperature" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pH_measured", namespace = "https://ncei.noaa.gov/ocads/v4.6", propOrder = {
    "analyzingInstrument",
    "measurementTemperature",
    "temperatureCorrectionMethod",
    "phReportTemperature"
})
public class PHMeasured
    extends BasicMeasuredObservationBase
{

    @XmlElement(name = "analyzing_instrument", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected PHInstrument analyzingInstrument;
    @XmlElement(name = "measurement_temperature", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected String measurementTemperature;
    @XmlElement(name = "temperature_correction_method", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected String temperatureCorrectionMethod;
    @XmlElement(name = "ph_report_temperature", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected String phReportTemperature;

    /**
     * Gets the value of the analyzingInstrument property.
     * 
     * @return
     *     possible object is
     *     {@link PHInstrument }
     *     
     */
    public PHInstrument getAnalyzingInstrument() {
        return analyzingInstrument;
    }

    /**
     * Sets the value of the analyzingInstrument property.
     * 
     * @param value
     *     allowed object is
     *     {@link PHInstrument }
     *     
     */
    public void setAnalyzingInstrument(PHInstrument value) {
        this.analyzingInstrument = value;
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
