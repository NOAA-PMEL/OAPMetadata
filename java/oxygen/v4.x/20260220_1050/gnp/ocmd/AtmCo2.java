
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for atm_co2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="atm_co2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="height" type="{https://ncei.noaa.gov/ocads/v4.6}altitude_m"/&gt;
 *         &lt;element name="measurement_interval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="measured" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "atm_co2", namespace = "https://ncei.noaa.gov/ocads/v4.6", propOrder = {
    "location",
    "height",
    "measurementInterval"
})
public class AtmCo2 {

    @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected String location;
    @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected AltitudeM height;
    @XmlElement(name = "measurement_interval", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected String measurementInterval;
    @XmlAttribute(name = "measured", required = true)
    protected boolean measured;

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link AltitudeM }
     *     
     */
    public AltitudeM getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link AltitudeM }
     *     
     */
    public void setHeight(AltitudeM value) {
        this.height = value;
    }

    /**
     * Gets the value of the measurementInterval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasurementInterval() {
        return measurementInterval;
    }

    /**
     * Sets the value of the measurementInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasurementInterval(String value) {
        this.measurementInterval = value;
    }

    /**
     * Gets the value of the measured property.
     * 
     */
    public boolean isMeasured() {
        return measured;
    }

    /**
     * Sets the value of the measured property.
     * 
     */
    public void setMeasured(boolean value) {
        this.measured = value;
    }

}
