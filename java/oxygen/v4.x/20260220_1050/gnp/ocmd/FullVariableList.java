
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for full_variable_list complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="full_variable_list"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basic" type="{https://ncei.noaa.gov/ocads/v4.6}basic_variable"/&gt;
 *         &lt;element name="observed" type="{https://ncei.noaa.gov/ocads/v4.6}std_observed_variable"/&gt;
 *         &lt;element name="calculated" type="{https://ncei.noaa.gov/ocads/v4.6}basic_calculated_variable"/&gt;
 *         &lt;element name="DIC" type="{https://ncei.noaa.gov/ocads/v4.6}DIC_measured"/&gt;
 *         &lt;element name="TA" type="{https://ncei.noaa.gov/ocads/v4.6}TA_measured"/&gt;
 *         &lt;element name="pH" type="{https://ncei.noaa.gov/ocads/v4.6}pH_measured"/&gt;
 *         &lt;element name="co2_discrete" type="{https://ncei.noaa.gov/ocads/v4.6}co2_discrete_variable"/&gt;
 *         &lt;element name="co2_continuous" type="{https://ncei.noaa.gov/ocads/v4.6}co2_continuous_variable"/&gt;
 *         &lt;element name="co2_reported" type="{https://ncei.noaa.gov/ocads/v4.6}co2_reported_variable"/&gt;
 *         &lt;element name="biological_variable" type="{https://ncei.noaa.gov/ocads/v4.6}biological_variable"/&gt;
 *         &lt;element name="model_variable" type="{https://ncei.noaa.gov/ocads/v4.6}model_variable"/&gt;
 *         &lt;element name="phys_response_variable" type="{https://ncei.noaa.gov/ocads/v4.6}phys_response_variable"/&gt;
 *         &lt;element name="sediment_variable" type="{https://ncei.noaa.gov/ocads/v4.6}sediment_variable"/&gt;
 *         &lt;element name="social_variable" type="{https://ncei.noaa.gov/ocads/v4.6}social_variable"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "full_variable_list", namespace = "https://ncei.noaa.gov/ocads/v4.6", propOrder = {
    "basic",
    "observed",
    "calculated",
    "dic",
    "ta",
    "ph",
    "co2Discrete",
    "co2Continuous",
    "co2Reported",
    "biologicalVariable",
    "modelVariable",
    "physResponseVariable",
    "sedimentVariable",
    "socialVariable"
})
public class FullVariableList {

    @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected BasicVariable basic;
    @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected StdObservedVariable observed;
    @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected BasicCalculatedVariable calculated;
    @XmlElement(name = "DIC", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected DICMeasured dic;
    @XmlElement(name = "TA", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected TAMeasured ta;
    @XmlElement(name = "pH", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected PHMeasured ph;
    @XmlElement(name = "co2_discrete", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected Co2DiscreteVariable co2Discrete;
    @XmlElement(name = "co2_continuous", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected Co2ContinuousVariable co2Continuous;
    @XmlElement(name = "co2_reported", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected Co2ReportedVariable co2Reported;
    @XmlElement(name = "biological_variable", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected BiologicalVariable biologicalVariable;
    @XmlElement(name = "model_variable", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected ModelVariable modelVariable;
    @XmlElement(name = "phys_response_variable", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected PhysResponseVariable physResponseVariable;
    @XmlElement(name = "sediment_variable", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected SedimentVariable sedimentVariable;
    @XmlElement(name = "social_variable", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected SocialVariable socialVariable;

    /**
     * Gets the value of the basic property.
     * 
     * @return
     *     possible object is
     *     {@link BasicVariable }
     *     
     */
    public BasicVariable getBasic() {
        return basic;
    }

    /**
     * Sets the value of the basic property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicVariable }
     *     
     */
    public void setBasic(BasicVariable value) {
        this.basic = value;
    }

    /**
     * Gets the value of the observed property.
     * 
     * @return
     *     possible object is
     *     {@link StdObservedVariable }
     *     
     */
    public StdObservedVariable getObserved() {
        return observed;
    }

    /**
     * Sets the value of the observed property.
     * 
     * @param value
     *     allowed object is
     *     {@link StdObservedVariable }
     *     
     */
    public void setObserved(StdObservedVariable value) {
        this.observed = value;
    }

    /**
     * Gets the value of the calculated property.
     * 
     * @return
     *     possible object is
     *     {@link BasicCalculatedVariable }
     *     
     */
    public BasicCalculatedVariable getCalculated() {
        return calculated;
    }

    /**
     * Sets the value of the calculated property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicCalculatedVariable }
     *     
     */
    public void setCalculated(BasicCalculatedVariable value) {
        this.calculated = value;
    }

    /**
     * Gets the value of the dic property.
     * 
     * @return
     *     possible object is
     *     {@link DICMeasured }
     *     
     */
    public DICMeasured getDIC() {
        return dic;
    }

    /**
     * Sets the value of the dic property.
     * 
     * @param value
     *     allowed object is
     *     {@link DICMeasured }
     *     
     */
    public void setDIC(DICMeasured value) {
        this.dic = value;
    }

    /**
     * Gets the value of the ta property.
     * 
     * @return
     *     possible object is
     *     {@link TAMeasured }
     *     
     */
    public TAMeasured getTA() {
        return ta;
    }

    /**
     * Sets the value of the ta property.
     * 
     * @param value
     *     allowed object is
     *     {@link TAMeasured }
     *     
     */
    public void setTA(TAMeasured value) {
        this.ta = value;
    }

    /**
     * Gets the value of the ph property.
     * 
     * @return
     *     possible object is
     *     {@link PHMeasured }
     *     
     */
    public PHMeasured getPH() {
        return ph;
    }

    /**
     * Sets the value of the ph property.
     * 
     * @param value
     *     allowed object is
     *     {@link PHMeasured }
     *     
     */
    public void setPH(PHMeasured value) {
        this.ph = value;
    }

    /**
     * Gets the value of the co2Discrete property.
     * 
     * @return
     *     possible object is
     *     {@link Co2DiscreteVariable }
     *     
     */
    public Co2DiscreteVariable getCo2Discrete() {
        return co2Discrete;
    }

    /**
     * Sets the value of the co2Discrete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Co2DiscreteVariable }
     *     
     */
    public void setCo2Discrete(Co2DiscreteVariable value) {
        this.co2Discrete = value;
    }

    /**
     * Gets the value of the co2Continuous property.
     * 
     * @return
     *     possible object is
     *     {@link Co2ContinuousVariable }
     *     
     */
    public Co2ContinuousVariable getCo2Continuous() {
        return co2Continuous;
    }

    /**
     * Sets the value of the co2Continuous property.
     * 
     * @param value
     *     allowed object is
     *     {@link Co2ContinuousVariable }
     *     
     */
    public void setCo2Continuous(Co2ContinuousVariable value) {
        this.co2Continuous = value;
    }

    /**
     * Gets the value of the co2Reported property.
     * 
     * @return
     *     possible object is
     *     {@link Co2ReportedVariable }
     *     
     */
    public Co2ReportedVariable getCo2Reported() {
        return co2Reported;
    }

    /**
     * Sets the value of the co2Reported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Co2ReportedVariable }
     *     
     */
    public void setCo2Reported(Co2ReportedVariable value) {
        this.co2Reported = value;
    }

    /**
     * Gets the value of the biologicalVariable property.
     * 
     * @return
     *     possible object is
     *     {@link BiologicalVariable }
     *     
     */
    public BiologicalVariable getBiologicalVariable() {
        return biologicalVariable;
    }

    /**
     * Sets the value of the biologicalVariable property.
     * 
     * @param value
     *     allowed object is
     *     {@link BiologicalVariable }
     *     
     */
    public void setBiologicalVariable(BiologicalVariable value) {
        this.biologicalVariable = value;
    }

    /**
     * Gets the value of the modelVariable property.
     * 
     * @return
     *     possible object is
     *     {@link ModelVariable }
     *     
     */
    public ModelVariable getModelVariable() {
        return modelVariable;
    }

    /**
     * Sets the value of the modelVariable property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModelVariable }
     *     
     */
    public void setModelVariable(ModelVariable value) {
        this.modelVariable = value;
    }

    /**
     * Gets the value of the physResponseVariable property.
     * 
     * @return
     *     possible object is
     *     {@link PhysResponseVariable }
     *     
     */
    public PhysResponseVariable getPhysResponseVariable() {
        return physResponseVariable;
    }

    /**
     * Sets the value of the physResponseVariable property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysResponseVariable }
     *     
     */
    public void setPhysResponseVariable(PhysResponseVariable value) {
        this.physResponseVariable = value;
    }

    /**
     * Gets the value of the sedimentVariable property.
     * 
     * @return
     *     possible object is
     *     {@link SedimentVariable }
     *     
     */
    public SedimentVariable getSedimentVariable() {
        return sedimentVariable;
    }

    /**
     * Sets the value of the sedimentVariable property.
     * 
     * @param value
     *     allowed object is
     *     {@link SedimentVariable }
     *     
     */
    public void setSedimentVariable(SedimentVariable value) {
        this.sedimentVariable = value;
    }

    /**
     * Gets the value of the socialVariable property.
     * 
     * @return
     *     possible object is
     *     {@link SocialVariable }
     *     
     */
    public SocialVariable getSocialVariable() {
        return socialVariable;
    }

    /**
     * Sets the value of the socialVariable property.
     * 
     * @param value
     *     allowed object is
     *     {@link SocialVariable }
     *     
     */
    public void setSocialVariable(SocialVariable value) {
        this.socialVariable = value;
    }

}
