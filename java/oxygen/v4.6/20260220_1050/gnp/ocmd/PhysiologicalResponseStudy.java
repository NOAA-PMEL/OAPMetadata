
package gnp.ocmd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 *  
 *         Fields relating to datasets of physiological manipulation / response studies. 
 *       
 * 
 * <p>Java class for physiological_response_study complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="physiological_response_study"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{https://ncei.noaa.gov/ocads/v4.6}manipulation_response_ds_fields"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "physiological_response_study", namespace = "https://ncei.noaa.gov/ocads/v4.6", propOrder = {
    "experimentDescription",
    "biologicalSubjects",
    "organismCollectionRegions",
    "mcdrPathway",
    "oaeTreatmentType",
    "site",
    "targetedAcidityOrAlkalinityLevels",
    "seawaterSource",
    "seawaterTreatment",
    "manipulationMethod",
    "locationWhereTheExperimentWasCarriedOut",
    "locationWhereBiologicalSubjectWasCollected",
    "treatmentDuration",
    "additionalDetails"
})
public class PhysiologicalResponseStudy {

    @XmlElement(name = "experiment_description", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected String experimentDescription;
    @XmlElement(name = "biological_subjects", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected PhysiologicalResponseStudy.BiologicalSubjects biologicalSubjects;
    @XmlElement(name = "organism_collection_regions", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected PhysiologicalResponseStudy.OrganismCollectionRegions organismCollectionRegions;
    @XmlElement(name = "mcdr_pathway", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    @XmlSchemaType(name = "string")
    protected McdrPathways mcdrPathway;
    @XmlElement(name = "oae_treatment_type", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    @XmlSchemaType(name = "string")
    protected OaeTreatmentTypes oaeTreatmentType;
    @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    @XmlSchemaType(name = "string")
    protected ExperimentLocation site;
    @XmlElement(name = "targeted_acidity_or_alkalinity_levels", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected String targetedAcidityOrAlkalinityLevels;
    @XmlElement(name = "seawater_source", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    @XmlSchemaType(name = "string")
    protected SeawaterSource seawaterSource;
    @XmlElement(name = "seawater_treatment", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected String seawaterTreatment;
    @XmlElement(name = "manipulation_method", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected String manipulationMethod;
    @XmlElement(name = "location_where_the_experiment_was_carried_out", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected String locationWhereTheExperimentWasCarriedOut;
    @XmlElement(name = "location_where_biological_subject_was_collected", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected String locationWhereBiologicalSubjectWasCollected;
    @XmlElement(name = "treatment_duration", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected DatetimeDuration treatmentDuration;
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
     * Gets the value of the biologicalSubjects property.
     * 
     * @return
     *     possible object is
     *     {@link PhysiologicalResponseStudy.BiologicalSubjects }
     *     
     */
    public PhysiologicalResponseStudy.BiologicalSubjects getBiologicalSubjects() {
        return biologicalSubjects;
    }

    /**
     * Sets the value of the biologicalSubjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysiologicalResponseStudy.BiologicalSubjects }
     *     
     */
    public void setBiologicalSubjects(PhysiologicalResponseStudy.BiologicalSubjects value) {
        this.biologicalSubjects = value;
    }

    /**
     * Gets the value of the organismCollectionRegions property.
     * 
     * @return
     *     possible object is
     *     {@link PhysiologicalResponseStudy.OrganismCollectionRegions }
     *     
     */
    public PhysiologicalResponseStudy.OrganismCollectionRegions getOrganismCollectionRegions() {
        return organismCollectionRegions;
    }

    /**
     * Sets the value of the organismCollectionRegions property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysiologicalResponseStudy.OrganismCollectionRegions }
     *     
     */
    public void setOrganismCollectionRegions(PhysiologicalResponseStudy.OrganismCollectionRegions value) {
        this.organismCollectionRegions = value;
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
     * Gets the value of the site property.
     * 
     * @return
     *     possible object is
     *     {@link ExperimentLocation }
     *     
     */
    public ExperimentLocation getSite() {
        return site;
    }

    /**
     * Sets the value of the site property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExperimentLocation }
     *     
     */
    public void setSite(ExperimentLocation value) {
        this.site = value;
    }

    /**
     * Gets the value of the targetedAcidityOrAlkalinityLevels property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetedAcidityOrAlkalinityLevels() {
        return targetedAcidityOrAlkalinityLevels;
    }

    /**
     * Sets the value of the targetedAcidityOrAlkalinityLevels property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetedAcidityOrAlkalinityLevels(String value) {
        this.targetedAcidityOrAlkalinityLevels = value;
    }

    /**
     * Gets the value of the seawaterSource property.
     * 
     * @return
     *     possible object is
     *     {@link SeawaterSource }
     *     
     */
    public SeawaterSource getSeawaterSource() {
        return seawaterSource;
    }

    /**
     * Sets the value of the seawaterSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeawaterSource }
     *     
     */
    public void setSeawaterSource(SeawaterSource value) {
        this.seawaterSource = value;
    }

    /**
     * Gets the value of the seawaterTreatment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeawaterTreatment() {
        return seawaterTreatment;
    }

    /**
     * Sets the value of the seawaterTreatment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeawaterTreatment(String value) {
        this.seawaterTreatment = value;
    }

    /**
     * Gets the value of the manipulationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManipulationMethod() {
        return manipulationMethod;
    }

    /**
     * Sets the value of the manipulationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManipulationMethod(String value) {
        this.manipulationMethod = value;
    }

    /**
     * Gets the value of the locationWhereTheExperimentWasCarriedOut property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationWhereTheExperimentWasCarriedOut() {
        return locationWhereTheExperimentWasCarriedOut;
    }

    /**
     * Sets the value of the locationWhereTheExperimentWasCarriedOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationWhereTheExperimentWasCarriedOut(String value) {
        this.locationWhereTheExperimentWasCarriedOut = value;
    }

    /**
     * Gets the value of the locationWhereBiologicalSubjectWasCollected property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationWhereBiologicalSubjectWasCollected() {
        return locationWhereBiologicalSubjectWasCollected;
    }

    /**
     * Sets the value of the locationWhereBiologicalSubjectWasCollected property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationWhereBiologicalSubjectWasCollected(String value) {
        this.locationWhereBiologicalSubjectWasCollected = value;
    }

    /**
     * Gets the value of the treatmentDuration property.
     * 
     * @return
     *     possible object is
     *     {@link DatetimeDuration }
     *     
     */
    public DatetimeDuration getTreatmentDuration() {
        return treatmentDuration;
    }

    /**
     * Sets the value of the treatmentDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatetimeDuration }
     *     
     */
    public void setTreatmentDuration(DatetimeDuration value) {
        this.treatmentDuration = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="subject" type="{https://ncei.noaa.gov/ocads/v4.6}biological_subject" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "subject"
    })
    public static class BiologicalSubjects {

        @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
        protected List<BiologicalSubject> subject;

        /**
         * Gets the value of the subject property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the subject property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSubject().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BiologicalSubject }
         * 
         * 
         */
        public List<BiologicalSubject> getSubject() {
            if (subject == null) {
                subject = new ArrayList<BiologicalSubject>();
            }
            return this.subject;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="region" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "region"
    })
    public static class OrganismCollectionRegions {

        @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
        protected List<String> region;

        /**
         * Gets the value of the region property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the region property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRegion().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getRegion() {
            if (region == null) {
                region = new ArrayList<String>();
            }
            return this.region;
        }

    }

}
