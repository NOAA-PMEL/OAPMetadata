
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for data_coverage_extents complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="data_coverage_extents"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="temporal_extents" type="{https://ncei.noaa.gov/ocads/v4.6}temporal_extents"/&gt;
 *         &lt;element name="geospatial_extents" type="{https://ncei.noaa.gov/ocads/v4.6}spatial_extents"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="depth_extents" type="{https://ncei.noaa.gov/ocads/v4.6}depth_range"/&gt;
 *           &lt;element name="altitude_extents" type="{https://ncei.noaa.gov/ocads/v4.6}altitude_range"/&gt;
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
@XmlType(name = "data_coverage_extents", namespace = "https://ncei.noaa.gov/ocads/v4.6", propOrder = {
    "temporalExtents",
    "geospatialExtents",
    "depthExtents",
    "altitudeExtents"
})
public class DataCoverageExtents {

    @XmlElement(name = "temporal_extents", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected TemporalExtents temporalExtents;
    @XmlElement(name = "geospatial_extents", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected SpatialExtents geospatialExtents;
    @XmlElement(name = "depth_extents", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected DepthRange depthExtents;
    @XmlElement(name = "altitude_extents", namespace = "https://ncei.noaa.gov/ocads/v4.6")
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
     * @return
     *     possible object is
     *     {@link SpatialExtents }
     *     
     */
    public SpatialExtents getGeospatialExtents() {
        return geospatialExtents;
    }

    /**
     * Sets the value of the geospatialExtents property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpatialExtents }
     *     
     */
    public void setGeospatialExtents(SpatialExtents value) {
        this.geospatialExtents = value;
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
