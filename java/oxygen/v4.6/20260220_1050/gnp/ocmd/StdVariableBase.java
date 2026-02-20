
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for std_variable_base complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="std_variable_base"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://ncei.noaa.gov/ocads/v4.6}basic_variable"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="observation_type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;group ref="{https://ncei.noaa.gov/ocads/v4.6}common_var_additional_fields"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "std_variable_base", namespace = "https://ncei.noaa.gov/ocads/v4.6", propOrder = {
    "observationType",
    "missingValueIndicator",
    "qcFlaggingScheme",
    "qcFlagVariable",
    "qcStepsTaken",
    "appropriateUseQuality",
    "overallUncertainty",
    "additionalInformation",
    "measurementResearcher",
    "qcResearcher"
})
@XmlSeeAlso({
    InsituVariable.class
})
public abstract class StdVariableBase
    extends BasicVariable
{

    @XmlElement(name = "observation_type", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected String observationType;
    @XmlElement(name = "missing_value_indicator", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected String missingValueIndicator;
    @XmlElement(name = "qc_flagging_scheme", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected ReferenceOrDescription qcFlaggingScheme;
    @XmlElement(name = "qc_flag_variable", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected String qcFlagVariable;
    @XmlElement(name = "qc_steps_taken", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected String qcStepsTaken;
    @XmlElement(name = "appropriate_use_quality", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    @XmlSchemaType(name = "string")
    protected AppropriateUseQuality appropriateUseQuality;
    @XmlElement(name = "overall_uncertainty", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected VariableUncertainty overallUncertainty;
    @XmlElement(name = "additional_information", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected String additionalInformation;
    @XmlElement(name = "measurement_researcher", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected PersonRef measurementResearcher;
    @XmlElement(name = "qc_researcher", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected PersonRef qcResearcher;

    /**
     * Gets the value of the observationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservationType() {
        return observationType;
    }

    /**
     * Sets the value of the observationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservationType(String value) {
        this.observationType = value;
    }

    /**
     * Gets the value of the missingValueIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMissingValueIndicator() {
        return missingValueIndicator;
    }

    /**
     * Sets the value of the missingValueIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMissingValueIndicator(String value) {
        this.missingValueIndicator = value;
    }

    /**
     * Gets the value of the qcFlaggingScheme property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceOrDescription }
     *     
     */
    public ReferenceOrDescription getQcFlaggingScheme() {
        return qcFlaggingScheme;
    }

    /**
     * Sets the value of the qcFlaggingScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceOrDescription }
     *     
     */
    public void setQcFlaggingScheme(ReferenceOrDescription value) {
        this.qcFlaggingScheme = value;
    }

    /**
     * Gets the value of the qcFlagVariable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQcFlagVariable() {
        return qcFlagVariable;
    }

    /**
     * Sets the value of the qcFlagVariable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQcFlagVariable(String value) {
        this.qcFlagVariable = value;
    }

    /**
     * Gets the value of the qcStepsTaken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQcStepsTaken() {
        return qcStepsTaken;
    }

    /**
     * Sets the value of the qcStepsTaken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQcStepsTaken(String value) {
        this.qcStepsTaken = value;
    }

    /**
     * Gets the value of the appropriateUseQuality property.
     * 
     * @return
     *     possible object is
     *     {@link AppropriateUseQuality }
     *     
     */
    public AppropriateUseQuality getAppropriateUseQuality() {
        return appropriateUseQuality;
    }

    /**
     * Sets the value of the appropriateUseQuality property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppropriateUseQuality }
     *     
     */
    public void setAppropriateUseQuality(AppropriateUseQuality value) {
        this.appropriateUseQuality = value;
    }

    /**
     * Gets the value of the overallUncertainty property.
     * 
     * @return
     *     possible object is
     *     {@link VariableUncertainty }
     *     
     */
    public VariableUncertainty getOverallUncertainty() {
        return overallUncertainty;
    }

    /**
     * Sets the value of the overallUncertainty property.
     * 
     * @param value
     *     allowed object is
     *     {@link VariableUncertainty }
     *     
     */
    public void setOverallUncertainty(VariableUncertainty value) {
        this.overallUncertainty = value;
    }

    /**
     * Gets the value of the additionalInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalInformation() {
        return additionalInformation;
    }

    /**
     * Sets the value of the additionalInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalInformation(String value) {
        this.additionalInformation = value;
    }

    /**
     * Gets the value of the measurementResearcher property.
     * 
     * @return
     *     possible object is
     *     {@link PersonRef }
     *     
     */
    public PersonRef getMeasurementResearcher() {
        return measurementResearcher;
    }

    /**
     * Sets the value of the measurementResearcher property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonRef }
     *     
     */
    public void setMeasurementResearcher(PersonRef value) {
        this.measurementResearcher = value;
    }

    /**
     * Gets the value of the qcResearcher property.
     * 
     * @return
     *     possible object is
     *     {@link PersonRef }
     *     
     */
    public PersonRef getQcResearcher() {
        return qcResearcher;
    }

    /**
     * Sets the value of the qcResearcher property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonRef }
     *     
     */
    public void setQcResearcher(PersonRef value) {
        this.qcResearcher = value;
    }

}
