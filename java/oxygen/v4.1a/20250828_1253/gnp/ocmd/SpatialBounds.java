
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
 *         &lt;element name="western_bounds" type="{http://ncei.noaa.gov/oads/a4.1}longitude_180"/&gt;
 *         &lt;element name="eastern_bounds" type="{http://ncei.noaa.gov/oads/a4.1}longitude_180"/&gt;
 *         &lt;element name="northern_bounds" type="{http://ncei.noaa.gov/oads/a4.1}latitude"/&gt;
 *         &lt;element name="southern_bounds" type="{http://ncei.noaa.gov/oads/a4.1}latitude"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "spatial_bounds", namespace = "http://ncei.noaa.gov/oads/a4.1", propOrder = {
    "westernBounds",
    "easternBounds",
    "northernBounds",
    "southernBounds"
})
public class SpatialBounds {

    @XmlElement(name = "western_bounds", required = true)
    protected BigDecimal westernBounds;
    @XmlElement(name = "eastern_bounds", required = true)
    protected BigDecimal easternBounds;
    @XmlElement(name = "northern_bounds", required = true)
    protected BigDecimal northernBounds;
    @XmlElement(name = "southern_bounds", required = true)
    protected BigDecimal southernBounds;

    /**
     * Gets the value of the westernBounds property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWesternBounds() {
        return westernBounds;
    }

    /**
     * Sets the value of the westernBounds property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWesternBounds(BigDecimal value) {
        this.westernBounds = value;
    }

    /**
     * Gets the value of the easternBounds property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEasternBounds() {
        return easternBounds;
    }

    /**
     * Sets the value of the easternBounds property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEasternBounds(BigDecimal value) {
        this.easternBounds = value;
    }

    /**
     * Gets the value of the northernBounds property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNorthernBounds() {
        return northernBounds;
    }

    /**
     * Sets the value of the northernBounds property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNorthernBounds(BigDecimal value) {
        this.northernBounds = value;
    }

    /**
     * Gets the value of the southernBounds property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSouthernBounds() {
        return southernBounds;
    }

    /**
     * Sets the value of the southernBounds property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSouthernBounds(BigDecimal value) {
        this.southernBounds = value;
    }

}
