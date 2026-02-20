
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 *  
 *         Fields relating to in-situ studies.
 *         Renamed from oae_enhancement_study per Liqing.
 *       
 * 
 * <p>Java class for field_trial complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="field_trial"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{https://ncei.noaa.gov/ocads/v4.6}field_trials_ds_fields"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "field_trial", namespace = "https://ncei.noaa.gov/ocads/v4.6", propOrder = {
    "experimentDescription",
    "mcdrPathway",
    "oaeTreatmentType",
    "phase",
    "siteDescription",
    "previousMcdrResearchInTheArea",
    "coLocatedOperations",
    "meteorologicalAndTidalConditions",
    "alkalinityFeedstockType",
    "alkalinityFeedstockDescription",
    "dosingLocation",
    "dosingDepth",
    "dosingDuration",
    "dosingMechanism",
    "dosingEffluentDensity",
    "dosingRegimen",
    "dosingRateData",
    "totalAlkalinityFeedstockAdded",
    "permitNumber",
    "permitApprovalDocument",
    "permittingAuthority",
    "dataConflictsAndUnreportedData",
    "additionalDetails"
})
public class FieldTrial {

    @XmlElement(name = "experiment_description", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected String experimentDescription;
    @XmlElement(name = "mcdr_pathway", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    @XmlSchemaType(name = "string")
    protected McdrPathways mcdrPathway;
    @XmlElement(name = "oae_treatment_type", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    @XmlSchemaType(name = "string")
    protected OaeTreatmentTypes oaeTreatmentType;
    @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    @XmlSchemaType(name = "string")
    protected ExperimentPhase phase;
    @XmlElement(name = "site_description", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected String siteDescription;
    @XmlElement(name = "previous_mcdr_research_in_the_area", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected String previousMcdrResearchInTheArea;
    @XmlElement(name = "co-located_operations", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected String coLocatedOperations;
    @XmlElement(name = "meteorological_and_tidal_conditions", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected String meteorologicalAndTidalConditions;
    @XmlElement(name = "alkalinity_feedstock_type", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected String alkalinityFeedstockType;
    @XmlElement(name = "alkalinity_feedstock_description", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected String alkalinityFeedstockDescription;
    @XmlElement(name = "dosing_location", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected String dosingLocation;
    @XmlElement(name = "dosing_depth", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected DepthM dosingDepth;
    @XmlElement(name = "dosing_duration", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected DatetimeDuration dosingDuration;
    @XmlElement(name = "dosing_mechanism", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected String dosingMechanism;
    @XmlElement(name = "dosing_effluent_density", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected String dosingEffluentDensity;
    @XmlElement(name = "dosing_regimen", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected String dosingRegimen;
    @XmlElement(name = "dosing_rate_data", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected String dosingRateData;
    @XmlElement(name = "total_alkalinity_feedstock_added", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected String totalAlkalinityFeedstockAdded;
    @XmlElement(name = "permit_number", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected String permitNumber;
    @XmlElement(name = "permit_approval_document", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected URIReference permitApprovalDocument;
    @XmlElement(name = "permitting_authority", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected String permittingAuthority;
    @XmlElement(name = "data_conflicts_and_unreported_data", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected String dataConflictsAndUnreportedData;
    @XmlElement(name = "additional_details", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected String additionalDetails;

    /**
     * Gets the value of the experimentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExperimentDescription() {
        return experimentDescription;
    }

    /**
     * Sets the value of the experimentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExperimentDescription(String value) {
        this.experimentDescription = value;
    }

    /**
     * Gets the value of the mcdrPathway property.
     * 
     * @return
     *     possible object is
     *     {@link McdrPathways }
     *     
     */
    public McdrPathways getMcdrPathway() {
        return mcdrPathway;
    }

    /**
     * Sets the value of the mcdrPathway property.
     * 
     * @param value
     *     allowed object is
     *     {@link McdrPathways }
     *     
     */
    public void setMcdrPathway(McdrPathways value) {
        this.mcdrPathway = value;
    }

    /**
     * Gets the value of the oaeTreatmentType property.
     * 
     * @return
     *     possible object is
     *     {@link OaeTreatmentTypes }
     *     
     */
    public OaeTreatmentTypes getOaeTreatmentType() {
        return oaeTreatmentType;
    }

    /**
     * Sets the value of the oaeTreatmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OaeTreatmentTypes }
     *     
     */
    public void setOaeTreatmentType(OaeTreatmentTypes value) {
        this.oaeTreatmentType = value;
    }

    /**
     * Gets the value of the phase property.
     * 
     * @return
     *     possible object is
     *     {@link ExperimentPhase }
     *     
     */
    public ExperimentPhase getPhase() {
        return phase;
    }

    /**
     * Sets the value of the phase property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExperimentPhase }
     *     
     */
    public void setPhase(ExperimentPhase value) {
        this.phase = value;
    }

    /**
     * Gets the value of the siteDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteDescription() {
        return siteDescription;
    }

    /**
     * Sets the value of the siteDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteDescription(String value) {
        this.siteDescription = value;
    }

    /**
     * Gets the value of the previousMcdrResearchInTheArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousMcdrResearchInTheArea() {
        return previousMcdrResearchInTheArea;
    }

    /**
     * Sets the value of the previousMcdrResearchInTheArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousMcdrResearchInTheArea(String value) {
        this.previousMcdrResearchInTheArea = value;
    }

    /**
     * Gets the value of the coLocatedOperations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoLocatedOperations() {
        return coLocatedOperations;
    }

    /**
     * Sets the value of the coLocatedOperations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoLocatedOperations(String value) {
        this.coLocatedOperations = value;
    }

    /**
     * Gets the value of the meteorologicalAndTidalConditions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeteorologicalAndTidalConditions() {
        return meteorologicalAndTidalConditions;
    }

    /**
     * Sets the value of the meteorologicalAndTidalConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeteorologicalAndTidalConditions(String value) {
        this.meteorologicalAndTidalConditions = value;
    }

    /**
     * Gets the value of the alkalinityFeedstockType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlkalinityFeedstockType() {
        return alkalinityFeedstockType;
    }

    /**
     * Sets the value of the alkalinityFeedstockType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlkalinityFeedstockType(String value) {
        this.alkalinityFeedstockType = value;
    }

    /**
     * Gets the value of the alkalinityFeedstockDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlkalinityFeedstockDescription() {
        return alkalinityFeedstockDescription;
    }

    /**
     * Sets the value of the alkalinityFeedstockDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlkalinityFeedstockDescription(String value) {
        this.alkalinityFeedstockDescription = value;
    }

    /**
     * Gets the value of the dosingLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDosingLocation() {
        return dosingLocation;
    }

    /**
     * Sets the value of the dosingLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDosingLocation(String value) {
        this.dosingLocation = value;
    }

    /**
     * Gets the value of the dosingDepth property.
     * 
     * @return
     *     possible object is
     *     {@link DepthM }
     *     
     */
    public DepthM getDosingDepth() {
        return dosingDepth;
    }

    /**
     * Sets the value of the dosingDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepthM }
     *     
     */
    public void setDosingDepth(DepthM value) {
        this.dosingDepth = value;
    }

    /**
     * Gets the value of the dosingDuration property.
     * 
     * @return
     *     possible object is
     *     {@link DatetimeDuration }
     *     
     */
    public DatetimeDuration getDosingDuration() {
        return dosingDuration;
    }

    /**
     * Sets the value of the dosingDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatetimeDuration }
     *     
     */
    public void setDosingDuration(DatetimeDuration value) {
        this.dosingDuration = value;
    }

    /**
     * Gets the value of the dosingMechanism property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDosingMechanism() {
        return dosingMechanism;
    }

    /**
     * Sets the value of the dosingMechanism property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDosingMechanism(String value) {
        this.dosingMechanism = value;
    }

    /**
     * Gets the value of the dosingEffluentDensity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDosingEffluentDensity() {
        return dosingEffluentDensity;
    }

    /**
     * Sets the value of the dosingEffluentDensity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDosingEffluentDensity(String value) {
        this.dosingEffluentDensity = value;
    }

    /**
     * Gets the value of the dosingRegimen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDosingRegimen() {
        return dosingRegimen;
    }

    /**
     * Sets the value of the dosingRegimen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDosingRegimen(String value) {
        this.dosingRegimen = value;
    }

    /**
     * Gets the value of the dosingRateData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDosingRateData() {
        return dosingRateData;
    }

    /**
     * Sets the value of the dosingRateData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDosingRateData(String value) {
        this.dosingRateData = value;
    }

    /**
     * Gets the value of the totalAlkalinityFeedstockAdded property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalAlkalinityFeedstockAdded() {
        return totalAlkalinityFeedstockAdded;
    }

    /**
     * Sets the value of the totalAlkalinityFeedstockAdded property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalAlkalinityFeedstockAdded(String value) {
        this.totalAlkalinityFeedstockAdded = value;
    }

    /**
     * Gets the value of the permitNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermitNumber() {
        return permitNumber;
    }

    /**
     * Sets the value of the permitNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermitNumber(String value) {
        this.permitNumber = value;
    }

    /**
     * Gets the value of the permitApprovalDocument property.
     * 
     * @return
     *     possible object is
     *     {@link URIReference }
     *     
     */
    public URIReference getPermitApprovalDocument() {
        return permitApprovalDocument;
    }

    /**
     * Sets the value of the permitApprovalDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link URIReference }
     *     
     */
    public void setPermitApprovalDocument(URIReference value) {
        this.permitApprovalDocument = value;
    }

    /**
     * Gets the value of the permittingAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermittingAuthority() {
        return permittingAuthority;
    }

    /**
     * Sets the value of the permittingAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermittingAuthority(String value) {
        this.permittingAuthority = value;
    }

    /**
     * Gets the value of the dataConflictsAndUnreportedData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataConflictsAndUnreportedData() {
        return dataConflictsAndUnreportedData;
    }

    /**
     * Sets the value of the dataConflictsAndUnreportedData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataConflictsAndUnreportedData(String value) {
        this.dataConflictsAndUnreportedData = value;
    }

    /**
     * Gets the value of the additionalDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalDetails() {
        return additionalDetails;
    }

    /**
     * Sets the value of the additionalDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalDetails(String value) {
        this.additionalDetails = value;
    }

}
