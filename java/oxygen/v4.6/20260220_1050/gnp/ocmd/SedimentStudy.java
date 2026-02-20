
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sediment_study complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sediment_study"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sediment_floor_setting" type="{https://ncei.noaa.gov/ocads/v4.6}sediment_floor_setting"/&gt;
 *         &lt;element name="sediment_type" type="{https://ncei.noaa.gov/ocads/v4.6}sediment_type"/&gt;
 *         &lt;element name="sediment_sampling_method" type="{https://ncei.noaa.gov/ocads/v4.6}sediment_sampling_method"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sediment_study", namespace = "https://ncei.noaa.gov/ocads/v4.6", propOrder = {
    "sedimentFloorSetting",
    "sedimentType",
    "sedimentSamplingMethod"
})
public class SedimentStudy {

    @XmlElement(name = "sediment_floor_setting", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    @XmlSchemaType(name = "string")
    protected SedimentFloorSetting sedimentFloorSetting;
    @XmlElement(name = "sediment_type", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    @XmlSchemaType(name = "string")
    protected SedimentType sedimentType;
    @XmlElement(name = "sediment_sampling_method", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    @XmlSchemaType(name = "string")
    protected SedimentSamplingMethod sedimentSamplingMethod;

    /**
     * Gets the value of the sedimentFloorSetting property.
     * 
     * @return
     *     possible object is
     *     {@link SedimentFloorSetting }
     *     
     */
    public SedimentFloorSetting getSedimentFloorSetting() {
        return sedimentFloorSetting;
    }

    /**
     * Sets the value of the sedimentFloorSetting property.
     * 
     * @param value
     *     allowed object is
     *     {@link SedimentFloorSetting }
     *     
     */
    public void setSedimentFloorSetting(SedimentFloorSetting value) {
        this.sedimentFloorSetting = value;
    }

    /**
     * Gets the value of the sedimentType property.
     * 
     * @return
     *     possible object is
     *     {@link SedimentType }
     *     
     */
    public SedimentType getSedimentType() {
        return sedimentType;
    }

    /**
     * Sets the value of the sedimentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SedimentType }
     *     
     */
    public void setSedimentType(SedimentType value) {
        this.sedimentType = value;
    }

    /**
     * Gets the value of the sedimentSamplingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link SedimentSamplingMethod }
     *     
     */
    public SedimentSamplingMethod getSedimentSamplingMethod() {
        return sedimentSamplingMethod;
    }

    /**
     * Sets the value of the sedimentSamplingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link SedimentSamplingMethod }
     *     
     */
    public void setSedimentSamplingMethod(SedimentSamplingMethod value) {
        this.sedimentSamplingMethod = value;
    }

}
