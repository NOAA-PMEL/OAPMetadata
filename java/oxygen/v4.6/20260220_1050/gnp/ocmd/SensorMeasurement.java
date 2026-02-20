
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sensor_measurement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sensor_measurement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="method" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sensor" type="{https://ncei.noaa.gov/ocads/v4.6}sensor"/&gt;
 *         &lt;element name="sensor_location" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sensor_measurement", namespace = "https://ncei.noaa.gov/ocads/v4.6", propOrder = {
    "method",
    "sensor",
    "sensorLocation",
    "comments"
})
public class SensorMeasurement {

    @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected String method;
    @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected Sensor sensor;
    @XmlElement(name = "sensor_location", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected String sensorLocation;
    @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected String comments;

    /**
     * Gets the value of the method property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMethod() {
        return method;
    }

    /**
     * Sets the value of the method property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMethod(String value) {
        this.method = value;
    }

    /**
     * Gets the value of the sensor property.
     * 
     * @return
     *     possible object is
     *     {@link Sensor }
     *     
     */
    public Sensor getSensor() {
        return sensor;
    }

    /**
     * Sets the value of the sensor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sensor }
     *     
     */
    public void setSensor(Sensor value) {
        this.sensor = value;
    }

    /**
     * Gets the value of the sensorLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSensorLocation() {
        return sensorLocation;
    }

    /**
     * Sets the value of the sensorLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSensorLocation(String value) {
        this.sensorLocation = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

}
