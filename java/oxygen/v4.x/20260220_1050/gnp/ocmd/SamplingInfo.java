
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sampling_info complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sampling_info"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="discrete" type="{https://ncei.noaa.gov/ocads/v4.6}discrete_var_sampling_info"/&gt;
 *         &lt;element name="continuous" type="{https://ncei.noaa.gov/ocads/v4.6}continuous_var_sampling_info"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sampling_info", namespace = "https://ncei.noaa.gov/ocads/v4.6", propOrder = {
    "discrete",
    "continuous"
})
public class SamplingInfo {

    @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected DiscreteVarSamplingInfo discrete;
    @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected ContinuousVarSamplingInfo continuous;

    /**
     * Gets the value of the discrete property.
     * 
     * @return
     *     possible object is
     *     {@link DiscreteVarSamplingInfo }
     *     
     */
    public DiscreteVarSamplingInfo getDiscrete() {
        return discrete;
    }

    /**
     * Sets the value of the discrete property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscreteVarSamplingInfo }
     *     
     */
    public void setDiscrete(DiscreteVarSamplingInfo value) {
        this.discrete = value;
    }

    /**
     * Gets the value of the continuous property.
     * 
     * @return
     *     possible object is
     *     {@link ContinuousVarSamplingInfo }
     *     
     */
    public ContinuousVarSamplingInfo getContinuous() {
        return continuous;
    }

    /**
     * Sets the value of the continuous property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContinuousVarSamplingInfo }
     *     
     */
    public void setContinuous(ContinuousVarSamplingInfo value) {
        this.continuous = value;
    }

}
