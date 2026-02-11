
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for crm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="crm"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="manufacturer" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="batch" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="bottle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "crm", namespace = "http://ncei.noaa.gov/oads/a4.1", propOrder = {
    "manufacturer",
    "batch",
    "bottle"
})
public class Crm {

    @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
    protected String manufacturer;
    @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
    protected String batch;
    @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1")
    protected String bottle;

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
     * Gets the value of the batch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatch() {
        return batch;
    }

    /**
     * Sets the value of the batch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatch(String value) {
        this.batch = value;
    }

    /**
     * Gets the value of the bottle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBottle() {
        return bottle;
    }

    /**
     * Sets the value of the bottle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBottle(String value) {
        this.bottle = value;
    }

}
