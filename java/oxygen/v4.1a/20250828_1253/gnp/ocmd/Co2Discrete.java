
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for co2_discrete complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="co2_discrete"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ncei.noaa.gov/oads/a4.1}co2_base"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="storageMethod" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="seawaterVolume" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="headspaceVolume" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="measurementTemperature" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "co2_discrete", namespace = "http://ncei.noaa.gov/oads/a4.1", propOrder = {
    "storageMethod",
    "seawaterVolume",
    "headspaceVolume",
    "measurementTemperature"
})
public class Co2Discrete
    extends Co2Base
{

    @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
    protected String storageMethod;
    @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
    protected String seawaterVolume;
    @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
    protected String headspaceVolume;
    @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
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
