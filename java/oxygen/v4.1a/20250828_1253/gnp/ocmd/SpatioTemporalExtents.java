
package gnp.ocmd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for spatio_temporal_extents complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="spatio_temporal_extents"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="temporal_extents" type="{http://ncei.noaa.gov/oads/a4.1}temporal_extents"/&gt;
 *         &lt;element name="geospatial_extents" type="{http://ncei.noaa.gov/oads/a4.1}spatial_extents" maxOccurs="unbounded"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="depth_extents" type="{http://ncei.noaa.gov/oads/a4.1}depth_range"/&gt;
 *           &lt;element name="altitude_extents" type="{http://ncei.noaa.gov/oads/a4.1}altitude_range"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "spatio_temporal_extents", namespace = "http://ncei.noaa.gov/oads/a4.1", propOrder = {
    "temporalExtents",
    "geospatialExtents",
    "depthExtents",
    "altitudeExtents"
})
public class SpatioTemporalExtents {

    @XmlElement(name = "temporal_extents", namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
    protected TemporalExtents temporalExtents;
    @XmlElement(name = "geospatial_extents", namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
    protected List<SpatialExtents> geospatialExtents;
    @XmlElement(name = "depth_extents", namespace = "http://ncei.noaa.gov/oads/a4.1")
    protected DepthRange depthExtents;
    @XmlElement(name = "altitude_extents", namespace = "http://ncei.noaa.gov/oads/a4.1")
    protected AltitudeRange altitudeExtents;

    /**
     * Gets the value of the temporalExtents property.
     * 
     * @return
     *     possible object is
     *     {@link TemporalExtents }
     *     
     */
    public TemporalExtents getTemporalExtents() {
        return temporalExtents;
    }

    /**
     * Sets the value of the temporalExtents property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemporalExtents }
     *     
     */
    public void setTemporalExtents(TemporalExtents value) {
        this.temporalExtents = value;
    }

    /**
     * Gets the value of the geospatialExtents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the geospatialExtents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeospatialExtents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpatialExtents }
     * 
     * 
     */
    public List<SpatialExtents> getGeospatialExtents() {
        if (geospatialExtents == null) {
            geospatialExtents = new ArrayList<SpatialExtents>();
        }
        return this.geospatialExtents;
    }

    /**
     * Gets the value of the depthExtents property.
     * 
     * @return
     *     possible object is
     *     {@link DepthRange }
     *     
     */
    public DepthRange getDepthExtents() {
        return depthExtents;
    }

    /**
     * Sets the value of the depthExtents property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepthRange }
     *     
     */
    public void setDepthExtents(DepthRange value) {
        this.depthExtents = value;
    }

    /**
     * Gets the value of the altitudeExtents property.
     * 
     * @return
     *     possible object is
     *     {@link AltitudeRange }
     *     
     */
    public AltitudeRange getAltitudeExtents() {
        return altitudeExtents;
    }

    /**
     * Sets the value of the altitudeExtents property.
     * 
     * @param value
     *     allowed object is
     *     {@link AltitudeRange }
     *     
     */
    public void setAltitudeExtents(AltitudeRange value) {
        this.altitudeExtents = value;
    }

}
