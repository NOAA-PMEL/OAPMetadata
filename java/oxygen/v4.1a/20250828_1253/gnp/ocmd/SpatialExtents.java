
package gnp.ocmd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
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
 *       &lt;choice maxOccurs="unbounded"&gt;
 *         &lt;element name="bounds" type="{http://ncei.noaa.gov/oads/a4.1}spatial_bounds"/&gt;
 *         &lt;element name="site_location" type="{http://ncei.noaa.gov/oads/a4.1}site_location"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "spatial_extents", namespace = "http://ncei.noaa.gov/oads/a4.1", propOrder = {
    "boundsOrSiteLocation"
})
public class SpatialExtents {

    @XmlElements({
        @XmlElement(name = "bounds", type = SpatialBounds.class),
        @XmlElement(name = "site_location", type = SiteLocation.class)
    })
    protected List<Object> boundsOrSiteLocation;

    /**
     * Gets the value of the boundsOrSiteLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the boundsOrSiteLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBoundsOrSiteLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpatialBounds }
     * {@link SiteLocation }
     * 
     * 
     */
    public List<Object> getBoundsOrSiteLocation() {
        if (boundsOrSiteLocation == null) {
            boundsOrSiteLocation = new ArrayList<Object>();
        }
        return this.boundsOrSiteLocation;
    }

}
