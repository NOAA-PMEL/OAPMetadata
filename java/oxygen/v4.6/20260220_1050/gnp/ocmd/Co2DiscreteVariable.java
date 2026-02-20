
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for co2_discrete_variable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="co2_discrete_variable"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://ncei.noaa.gov/ocads/v4.6}co2_measured_base"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="storage_method" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="seawater_volume" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="headspace_volume" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="measurement_temperature" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "co2_discrete_variable", namespace = "https://ncei.noaa.gov/ocads/v4.6", propOrder = {
    "storageMethod",
    "seawaterVolume",
    "headspaceVolume",
    "measurementTemperature"
})
public class Co2DiscreteVariable
    extends Co2MeasuredBase
{

    @XmlElement(name = "storage_method", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected String storageMethod;
    @XmlElement(name = "seawater_volume", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected String seawaterVolume;
    @XmlElement(name = "headspace_volume", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected String headspaceVolume;
    @XmlElement(name = "measurement_temperature", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected String measurementTemperature;

    /**
     * Gets the value of the storageMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStorageMethod() {
        return storageMethod;
    }

    /**
     * Sets the value of the storageMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStorageMethod(String value) {
        this.storageMethod = value;
    }

    /**
     * Gets the value of the seawaterVolume property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeawaterVolume() {
        return seawaterVolume;
    }

    /**
     * Sets the value of the seawaterVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeawaterVolume(String value) {
        this.seawaterVolume = value;
    }

    /**
     * Gets the value of the headspaceVolume property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeadspaceVolume() {
        return headspaceVolume;
    }

    /**
     * Sets the value of the headspaceVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeadspaceVolume(String value) {
        this.headspaceVolume = value;
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

}
