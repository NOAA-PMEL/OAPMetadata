
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for grid_resolution complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="grid_resolution"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="longitudinal_resolution" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="latitudinal_resolution" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="vertical_resolution" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="temporal_resolution" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "grid_resolution", namespace = "https://ncei.noaa.gov/ocads/v4.6", propOrder = {
    "longitudinalResolution",
    "latitudinalResolution",
    "verticalResolution",
    "temporalResolution"
})
public class GridResolution {

    @XmlElement(name = "longitudinal_resolution", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected String longitudinalResolution;
    @XmlElement(name = "latitudinal_resolution", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected String latitudinalResolution;
    @XmlElement(name = "vertical_resolution", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected String verticalResolution;
    @XmlElement(name = "temporal_resolution", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected String temporalResolution;

    /**
     * Gets the value of the longitudinalResolution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongitudinalResolution() {
        return longitudinalResolution;
    }

    /**
     * Sets the value of the longitudinalResolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongitudinalResolution(String value) {
        this.longitudinalResolution = value;
    }

    /**
     * Gets the value of the latitudinalResolution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatitudinalResolution() {
        return latitudinalResolution;
    }

    /**
     * Sets the value of the latitudinalResolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatitudinalResolution(String value) {
        this.latitudinalResolution = value;
    }

    /**
     * Gets the value of the verticalResolution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerticalResolution() {
        return verticalResolution;
    }

    /**
     * Sets the value of the verticalResolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerticalResolution(String value) {
        this.verticalResolution = value;
    }

    /**
     * Gets the value of the temporalResolution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemporalResolution() {
        return temporalResolution;
    }

    /**
     * Sets the value of the temporalResolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemporalResolution(String value) {
        this.temporalResolution = value;
    }

}
