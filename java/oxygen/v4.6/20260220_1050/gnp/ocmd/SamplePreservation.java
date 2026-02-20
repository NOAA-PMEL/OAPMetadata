
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sample_preservation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sample_preservation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="preservative" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="volume" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="correction_description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sample_preservation", namespace = "https://ncei.noaa.gov/ocads/v4.6", propOrder = {
    "preservative",
    "volume",
    "correctionDescription"
})
public class SamplePreservation {

    @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected String preservative;
    @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected String volume;
    @XmlElement(name = "correction_description", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected String correctionDescription;

    /**
     * Gets the value of the preservative property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreservative() {
        return preservative;
    }

    /**
     * Sets the value of the preservative property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreservative(String value) {
        this.preservative = value;
    }

    /**
     * Gets the value of the volume property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolume() {
        return volume;
    }

    /**
     * Sets the value of the volume property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolume(String value) {
        this.volume = value;
    }

    /**
     * Gets the value of the correctionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrectionDescription() {
        return correctionDescription;
    }

    /**
     * Sets the value of the correctionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrectionDescription(String value) {
        this.correctionDescription = value;
    }

}
