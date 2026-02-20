
package gnp.ocmd;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for spatial_bounds complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="spatial_bounds"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="western_bound" type="{https://ncei.noaa.gov/ocads/v4.6}longitude_180"/&gt;
 *         &lt;element name="eastern_bound" type="{https://ncei.noaa.gov/ocads/v4.6}longitude_180"/&gt;
 *         &lt;element name="northern_bound" type="{https://ncei.noaa.gov/ocads/v4.6}latitude"/&gt;
 *         &lt;element name="southern_bound" type="{https://ncei.noaa.gov/ocads/v4.6}latitude"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "spatial_bounds", namespace = "https://ncei.noaa.gov/ocads/v4.6", propOrder = {
    "westernBound",
    "easternBound",
    "northernBound",
    "southernBound"
})
public class SpatialBounds {

    @XmlElement(name = "western_bound", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected BigDecimal westernBound;
    @XmlElement(name = "eastern_bound", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected BigDecimal easternBound;
    @XmlElement(name = "northern_bound", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected BigDecimal northernBound;
    @XmlElement(name = "southern_bound", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected BigDecimal southernBound;

    /**
     * Gets the value of the westernBound property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWesternBound() {
        return westernBound;
    }

    /**
     * Sets the value of the westernBound property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWesternBound(BigDecimal value) {
        this.westernBound = value;
    }

    /**
     * Gets the value of the easternBound property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEasternBound() {
        return easternBound;
    }

    /**
     * Sets the value of the easternBound property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEasternBound(BigDecimal value) {
        this.easternBound = value;
    }

    /**
     * Gets the value of the northernBound property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNorthernBound() {
        return northernBound;
    }

    /**
     * Sets the value of the northernBound property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNorthernBound(BigDecimal value) {
        this.northernBound = value;
    }

    /**
     * Gets the value of the southernBound property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSouthernBound() {
        return southernBound;
    }

    /**
     * Sets the value of the southernBound property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSouthernBound(BigDecimal value) {
        this.southernBound = value;
    }

}
