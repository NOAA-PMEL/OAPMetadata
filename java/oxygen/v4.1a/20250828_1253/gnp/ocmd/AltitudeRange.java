
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *  Min and max altitudes in the dataaset. Positive down. 
 * 
 * <p>Java class for altitude_range complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="altitude_range"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="max_altitude" type="{http://ncei.noaa.gov/oads/a4.1}altitude_m"/&gt;
 *         &lt;element name="min_altitude" type="{http://ncei.noaa.gov/oads/a4.1}altitude_m"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "altitude_range", namespace = "http://ncei.noaa.gov/oads/a4.1", propOrder = {
    "maxAltitude",
    "minAltitude"
})
public class AltitudeRange {

    @XmlElement(name = "max_altitude", required = true)
    protected AltitudeM maxAltitude;
    @XmlElement(name = "min_altitude", required = true)
    protected AltitudeM minAltitude;

    /**
     * Gets the value of the maxAltitude property.
     * 
     * @return
     *     possible object is
     *     {@link AltitudeM }
     *     
     */
    public AltitudeM getMaxAltitude() {
        return maxAltitude;
    }

    /**
     * Sets the value of the maxAltitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link AltitudeM }
     *     
     */
    public void setMaxAltitude(AltitudeM value) {
        this.maxAltitude = value;
    }

    /**
     * Gets the value of the minAltitude property.
     * 
     * @return
     *     possible object is
     *     {@link AltitudeM }
     *     
     */
    public AltitudeM getMinAltitude() {
        return minAltitude;
    }

    /**
     * Sets the value of the minAltitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link AltitudeM }
     *     
     */
    public void setMinAltitude(AltitudeM value) {
        this.minAltitude = value;
    }

}
