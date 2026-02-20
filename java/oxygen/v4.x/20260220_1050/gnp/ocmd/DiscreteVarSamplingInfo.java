
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for discrete_var_sampling_info complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="discrete_var_sampling_info"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="storage_method" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="container_volume" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="container_airspace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="field_replicate_info" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "discrete_var_sampling_info", namespace = "https://ncei.noaa.gov/ocads/v4.6", propOrder = {
    "storageMethod",
    "containerVolume",
    "containerAirspace",
    "fieldReplicateInfo"
})
public class DiscreteVarSamplingInfo {

    @XmlElement(name = "storage_method", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected String storageMethod;
    @XmlElement(name = "container_volume", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected String containerVolume;
    @XmlElement(name = "container_airspace", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected String containerAirspace;
    @XmlElement(name = "field_replicate_info", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected String fieldReplicateInfo;

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
     * Gets the value of the containerVolume property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContainerVolume() {
        return containerVolume;
    }

    /**
     * Sets the value of the containerVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContainerVolume(String value) {
        this.containerVolume = value;
    }

    /**
     * Gets the value of the containerAirspace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContainerAirspace() {
        return containerAirspace;
    }

    /**
     * Sets the value of the containerAirspace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContainerAirspace(String value) {
        this.containerAirspace = value;
    }

    /**
     * Gets the value of the fieldReplicateInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldReplicateInfo() {
        return fieldReplicateInfo;
    }

    /**
     * Sets the value of the fieldReplicateInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldReplicateInfo(String value) {
        this.fieldReplicateInfo = value;
    }

}
