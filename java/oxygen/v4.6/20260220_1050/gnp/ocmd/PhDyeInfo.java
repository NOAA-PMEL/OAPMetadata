
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ph_dye_info complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ph_dye_info"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dye_type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="manufacturer" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="purified" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="correction_for_unpurified_dye" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="correction_method" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ph_dye_info", namespace = "https://ncei.noaa.gov/ocads/v4.6", propOrder = {
    "dyeType",
    "manufacturer",
    "purified",
    "correctionForUnpurifiedDye",
    "correctionMethod"
})
public class PhDyeInfo {

    @XmlElement(name = "dye_type", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected String dyeType;
    @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected String manufacturer;
    @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected boolean purified;
    @XmlElement(name = "correction_for_unpurified_dye", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected String correctionForUnpurifiedDye;
    @XmlElement(name = "correction_method", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected String correctionMethod;

    /**
     * Gets the value of the dyeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDyeType() {
        return dyeType;
    }

    /**
     * Sets the value of the dyeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDyeType(String value) {
        this.dyeType = value;
    }

    /**
     * Gets the value of the manufacturer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * Sets the value of the manufacturer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturer(String value) {
        this.manufacturer = value;
    }

    /**
     * Gets the value of the purified property.
     * 
     */
    public boolean isPurified() {
        return purified;
    }

    /**
     * Sets the value of the purified property.
     * 
     */
    public void setPurified(boolean value) {
        this.purified = value;
    }

    /**
     * Gets the value of the correctionForUnpurifiedDye property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrectionForUnpurifiedDye() {
        return correctionForUnpurifiedDye;
    }

    /**
     * Sets the value of the correctionForUnpurifiedDye property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrectionForUnpurifiedDye(String value) {
        this.correctionForUnpurifiedDye = value;
    }

    /**
     * Gets the value of the correctionMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrectionMethod() {
        return correctionMethod;
    }

    /**
     * Sets the value of the correctionMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrectionMethod(String value) {
        this.correctionMethod = value;
    }

}
