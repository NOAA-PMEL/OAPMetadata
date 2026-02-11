
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *  Min and max depths in the dataaset. Positive down. 
 * 
 * <p>Java class for depth_range complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="depth_range"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="max_depth" type="{http://ncei.noaa.gov/oads/a4.1}depth_m"/&gt;
 *         &lt;element name="min_depth" type="{http://ncei.noaa.gov/oads/a4.1}depth_m"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "depth_range", namespace = "http://ncei.noaa.gov/oads/a4.1", propOrder = {
    "maxDepth",
    "minDepth"
})
public class DepthRange {

    @XmlElement(name = "max_depth", required = true)
    protected DepthM maxDepth;
    @XmlElement(name = "min_depth", required = true)
    protected DepthM minDepth;

    /**
     * Gets the value of the maxDepth property.
     * 
     * @return
     *     possible object is
     *     {@link DepthM }
     *     
     */
    public DepthM getMaxDepth() {
        return maxDepth;
    }

    /**
     * Sets the value of the maxDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepthM }
     *     
     */
    public void setMaxDepth(DepthM value) {
        this.maxDepth = value;
    }

    /**
     * Gets the value of the minDepth property.
     * 
     * @return
     *     possible object is
     *     {@link DepthM }
     *     
     */
    public DepthM getMinDepth() {
        return minDepth;
    }

    /**
     * Sets the value of the minDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepthM }
     *     
     */
    public void setMinDepth(DepthM value) {
        this.minDepth = value;
    }

}
