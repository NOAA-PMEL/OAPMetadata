
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for spatial_extents complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="spatial_extents"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="bounds" type="{https://ncei.noaa.gov/ocads/v4.6}spatial_bounds"/&gt;
 *         &lt;element name="site_location" type="{https://ncei.noaa.gov/ocads/v4.6}site_location"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "spatial_extents", namespace = "https://ncei.noaa.gov/ocads/v4.6", propOrder = {
    "bounds",
    "siteLocation"
})
public class SpatialExtents {

    @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected SpatialBounds bounds;
    @XmlElement(name = "site_location", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected SiteLocation siteLocation;

    /**
     * Gets the value of the bounds property.
     * 
     * @return
     *     possible object is
     *     {@link SpatialBounds }
     *     
     */
    public SpatialBounds getBounds() {
        return bounds;
    }

    /**
     * Sets the value of the bounds property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpatialBounds }
     *     
     */
    public void setBounds(SpatialBounds value) {
        this.bounds = value;
    }

    /**
     * Gets the value of the siteLocation property.
     * 
     * @return
     *     possible object is
     *     {@link SiteLocation }
     *     
     */
    public SiteLocation getSiteLocation() {
        return siteLocation;
    }

    /**
     * Sets the value of the siteLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteLocation }
     *     
     */
    public void setSiteLocation(SiteLocation value) {
        this.siteLocation = value;
    }

}
