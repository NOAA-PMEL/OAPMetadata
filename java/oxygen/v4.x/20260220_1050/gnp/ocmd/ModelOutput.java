
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for model_output complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="model_output"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="model_name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="model_version" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="mcdr_study" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;group ref="{https://ncei.noaa.gov/ocads/v4.6}mcdr_ds_fields"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="physics_component_name_and_version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bgc_component_name_and_version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="modelled_region" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="spatial_bounds" type="{https://ncei.noaa.gov/ocads/v4.6}spatial_bounds"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="grid_resolution" type="{https://ncei.noaa.gov/ocads/v4.6}grid_resolution" minOccurs="0"/&gt;
 *         &lt;element name="input_data_description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="output_data_description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="model_configuration" type="{https://ncei.noaa.gov/ocads/v4.6}reference_or_description" minOccurs="0"/&gt;
 *         &lt;element name="boundary_conditions" type="{https://ncei.noaa.gov/ocads/v4.6}reference_or_description" minOccurs="0"/&gt;
 *         &lt;element name="atmospheric_forcing" type="{https://ncei.noaa.gov/ocads/v4.6}reference_or_description" minOccurs="0"/&gt;
 *         &lt;element name="tidal_forcing" type="{https://ncei.noaa.gov/ocads/v4.6}reference_or_description" minOccurs="0"/&gt;
 *         &lt;element name="other_model_forcing_details" type="{https://ncei.noaa.gov/ocads/v4.6}reference_or_description" minOccurs="0"/&gt;
 *         &lt;element name="river_and_sediment_flux_details" type="{https://ncei.noaa.gov/ocads/v4.6}reference_or_description" minOccurs="0"/&gt;
 *         &lt;element name="spin_up_protocol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="description_of_acid_or_alkalinity_addition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codebase_link" type="{https://ncei.noaa.gov/ocads/v4.6}URI_reference"/&gt;
 *         &lt;element name="additional_details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "model_output", namespace = "https://ncei.noaa.gov/ocads/v4.6", propOrder = {
    "modelName",
    "modelVersion",
    "mcdrStudy",
    "physicsComponentNameAndVersion",
    "bgcComponentNameAndVersion",
    "modelledRegion",
    "gridResolution",
    "inputDataDescription",
    "outputDataDescription",
    "modelConfiguration",
    "boundaryConditions",
    "atmosphericForcing",
    "tidalForcing",
    "otherModelForcingDetails",
    "riverAndSedimentFluxDetails",
    "spinUpProtocol",
    "descriptionOfAcidOrAlkalinityAddition",
    "codebaseLink",
    "additionalDetails"
})
public class ModelOutput {

    @XmlElement(name = "model_name", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected String modelName;
    @XmlElement(name = "model_version", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected String modelVersion;
    @XmlElement(name = "mcdr_study", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected ModelOutput.McdrStudy mcdrStudy;
    @XmlElement(name = "physics_component_name_and_version", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected String physicsComponentNameAndVersion;
    @XmlElement(name = "bgc_component_name_and_version", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected String bgcComponentNameAndVersion;
    @XmlElement(name = "modelled_region", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected ModelOutput.ModelledRegion modelledRegion;
    @XmlElement(name = "grid_resolution", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected GridResolution gridResolution;
    @XmlElement(name = "input_data_description", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected String inputDataDescription;
    @XmlElement(name = "output_data_description", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected String outputDataDescription;
    @XmlElement(name = "model_configuration", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected ReferenceOrDescription modelConfiguration;
    @XmlElement(name = "boundary_conditions", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected ReferenceOrDescription boundaryConditions;
    @XmlElement(name = "atmospheric_forcing", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected ReferenceOrDescription atmosphericForcing;
    @XmlElement(name = "tidal_forcing", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected ReferenceOrDescription tidalForcing;
    @XmlElement(name = "other_model_forcing_details", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected ReferenceOrDescription otherModelForcingDetails;
    @XmlElement(name = "river_and_sediment_flux_details", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected ReferenceOrDescription riverAndSedimentFluxDetails;
    @XmlElement(name = "spin_up_protocol", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected String spinUpProtocol;
    @XmlElement(name = "description_of_acid_or_alkalinity_addition", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected String descriptionOfAcidOrAlkalinityAddition;
    @XmlElement(name = "codebase_link", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected URIReference codebaseLink;
    @XmlElement(name = "additional_details", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected String additionalDetails;

    /**
     * Gets the value of the modelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * Sets the value of the modelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelName(String value) {
        this.modelName = value;
    }

    /**
     * Gets the value of the modelVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelVersion() {
        return modelVersion;
    }

    /**
     * Sets the value of the modelVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelVersion(String value) {
        this.modelVersion = value;
    }

    /**
     * Gets the value of the mcdrStudy property.
     * 
     * @return
     *     possible object is
     *     {@link ModelOutput.McdrStudy }
     *     
     */
    public ModelOutput.McdrStudy getMcdrStudy() {
        return mcdrStudy;
    }

    /**
     * Sets the value of the mcdrStudy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModelOutput.McdrStudy }
     *     
     */
    public void setMcdrStudy(ModelOutput.McdrStudy value) {
        this.mcdrStudy = value;
    }

    /**
     * Gets the value of the physicsComponentNameAndVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhysicsComponentNameAndVersion() {
        return physicsComponentNameAndVersion;
    }

    /**
     * Sets the value of the physicsComponentNameAndVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhysicsComponentNameAndVersion(String value) {
        this.physicsComponentNameAndVersion = value;
    }

    /**
     * Gets the value of the bgcComponentNameAndVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBgcComponentNameAndVersion() {
        return bgcComponentNameAndVersion;
    }

    /**
     * Sets the value of the bgcComponentNameAndVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBgcComponentNameAndVersion(String value) {
        this.bgcComponentNameAndVersion = value;
    }

    /**
     * Gets the value of the modelledRegion property.
     * 
     * @return
     *     possible object is
     *     {@link ModelOutput.ModelledRegion }
     *     
     */
    public ModelOutput.ModelledRegion getModelledRegion() {
        return modelledRegion;
    }

    /**
     * Sets the value of the modelledRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModelOutput.ModelledRegion }
     *     
     */
    public void setModelledRegion(ModelOutput.ModelledRegion value) {
        this.modelledRegion = value;
    }

    /**
     * Gets the value of the gridResolution property.
     * 
     * @return
     *     possible object is
     *     {@link GridResolution }
     *     
     */
    public GridResolution getGridResolution() {
        return gridResolution;
    }

    /**
     * Sets the value of the gridResolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link GridResolution }
     *     
     */
    public void setGridResolution(GridResolution value) {
        this.gridResolution = value;
    }

    /**
     * Gets the value of the inputDataDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputDataDescription() {
        return inputDataDescription;
    }

    /**
     * Sets the value of the inputDataDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputDataDescription(String value) {
        this.inputDataDescription = value;
    }

    /**
     * Gets the value of the outputDataDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputDataDescription() {
        return outputDataDescription;
    }

    /**
     * Sets the value of the outputDataDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputDataDescription(String value) {
        this.outputDataDescription = value;
    }

    /**
     * Gets the value of the modelConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceOrDescription }
     *     
     */
    public ReferenceOrDescription getModelConfiguration() {
        return modelConfiguration;
    }

    /**
     * Sets the value of the modelConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceOrDescription }
     *     
     */
    public void setModelConfiguration(ReferenceOrDescription value) {
        this.modelConfiguration = value;
    }

    /**
     * Gets the value of the boundaryConditions property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceOrDescription }
     *     
     */
    public ReferenceOrDescription getBoundaryConditions() {
        return boundaryConditions;
    }

    /**
     * Sets the value of the boundaryConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceOrDescription }
     *     
     */
    public void setBoundaryConditions(ReferenceOrDescription value) {
        this.boundaryConditions = value;
    }

    /**
     * Gets the value of the atmosphericForcing property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceOrDescription }
     *     
     */
    public ReferenceOrDescription getAtmosphericForcing() {
        return atmosphericForcing;
    }

    /**
     * Sets the value of the atmosphericForcing property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceOrDescription }
     *     
     */
    public void setAtmosphericForcing(ReferenceOrDescription value) {
        this.atmosphericForcing = value;
    }

    /**
     * Gets the value of the tidalForcing property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceOrDescription }
     *     
     */
    public ReferenceOrDescription getTidalForcing() {
        return tidalForcing;
    }

    /**
     * Sets the value of the tidalForcing property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceOrDescription }
     *     
     */
    public void setTidalForcing(ReferenceOrDescription value) {
        this.tidalForcing = value;
    }

    /**
     * Gets the value of the otherModelForcingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceOrDescription }
     *     
     */
    public ReferenceOrDescription getOtherModelForcingDetails() {
        return otherModelForcingDetails;
    }

    /**
     * Sets the value of the otherModelForcingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceOrDescription }
     *     
     */
    public void setOtherModelForcingDetails(ReferenceOrDescription value) {
        this.otherModelForcingDetails = value;
    }

    /**
     * Gets the value of the riverAndSedimentFluxDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceOrDescription }
     *     
     */
    public ReferenceOrDescription getRiverAndSedimentFluxDetails() {
        return riverAndSedimentFluxDetails;
    }

    /**
     * Sets the value of the riverAndSedimentFluxDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceOrDescription }
     *     
     */
    public void setRiverAndSedimentFluxDetails(ReferenceOrDescription value) {
        this.riverAndSedimentFluxDetails = value;
    }

    /**
     * Gets the value of the spinUpProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpinUpProtocol() {
        return spinUpProtocol;
    }

    /**
     * Sets the value of the spinUpProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpinUpProtocol(String value) {
        this.spinUpProtocol = value;
    }

    /**
     * Gets the value of the descriptionOfAcidOrAlkalinityAddition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionOfAcidOrAlkalinityAddition() {
        return descriptionOfAcidOrAlkalinityAddition;
    }

    /**
     * Sets the value of the descriptionOfAcidOrAlkalinityAddition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionOfAcidOrAlkalinityAddition(String value) {
        this.descriptionOfAcidOrAlkalinityAddition = value;
    }

    /**
     * Gets the value of the codebaseLink property.
     * 
     * @return
     *     possible object is
     *     {@link URIReference }
     *     
     */
    public URIReference getCodebaseLink() {
        return codebaseLink;
    }

    /**
     * Sets the value of the codebaseLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link URIReference }
     *     
     */
    public void setCodebaseLink(URIReference value) {
        this.codebaseLink = value;
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
     *       &lt;group ref="{https://ncei.noaa.gov/ocads/v4.6}mcdr_ds_fields"/&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "mcdrPathway",
        "oaeTreatmentType"
    })
    public static class McdrStudy {

        @XmlElement(name = "mcdr_pathway", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
        @XmlSchemaType(name = "string")
        protected McdrPathways mcdrPathway;
        @XmlElement(name = "oae_treatment_type", namespace = "https://ncei.noaa.gov/ocads/v4.6")
        @XmlSchemaType(name = "string")
        protected OaeTreatmentTypes oaeTreatmentType;

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
     *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="spatial_bounds" type="{https://ncei.noaa.gov/ocads/v4.6}spatial_bounds"/&gt;
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
        "description",
        "spatialBounds"
    })
    public static class ModelledRegion {

        @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
        protected String description;
        @XmlElement(name = "spatial_bounds", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
        protected SpatialBounds spatialBounds;

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescription() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescription(String value) {
            this.description = value;
        }

        /**
         * Gets the value of the spatialBounds property.
         * 
         * @return
         *     possible object is
         *     {@link SpatialBounds }
         *     
         */
        public SpatialBounds getSpatialBounds() {
            return spatialBounds;
        }

        /**
         * Sets the value of the spatialBounds property.
         * 
         * @param value
         *     allowed object is
         *     {@link SpatialBounds }
         *     
         */
        public void setSpatialBounds(SpatialBounds value) {
            this.spatialBounds = value;
        }

    }

}
