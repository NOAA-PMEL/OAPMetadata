
package gnp.ocmd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ocean_carbon_data_metadata_document complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ocean_carbon_data_metadata_document"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="document_metadata" type="{https://ncei.noaa.gov/ocads/v4.6}document_metadata"/&gt;
 *         &lt;group ref="{https://ncei.noaa.gov/ocads/v4.6}dataset_base_fields"/&gt;
 *         &lt;group ref="{https://ncei.noaa.gov/ocads/v4.6}observations_ds_fields" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="physiological_response_study" type="{https://ncei.noaa.gov/ocads/v4.6}physiological_response_study"/&gt;
 *           &lt;element name="field_trial" type="{https://ncei.noaa.gov/ocads/v4.6}field_trial"/&gt;
 *           &lt;element name="compilation_product" type="{https://ncei.noaa.gov/ocads/v4.6}compilation_product"/&gt;
 *           &lt;element name="gridded_product" type="{https://ncei.noaa.gov/ocads/v4.6}gridded_product"/&gt;
 *           &lt;element name="model_output" type="{https://ncei.noaa.gov/ocads/v4.6}model_output"/&gt;
 *           &lt;element name="sediment_study" type="{https://ncei.noaa.gov/ocads/v4.6}sediment_study"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="item_collections" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{https://ncei.noaa.gov/ocads/v4.6}metadata_standard"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ocean_carbon_data_metadata_document", namespace = "https://ncei.noaa.gov/ocads/v4.6", propOrder = {
    "documentMetadata",
    "doi",
    "projectId",
    "experiementId",
    "datasetDataDate",
    "datasetMetadataDate",
    "identifiers",
    "dataSubmitter",
    "archival",
    "datasetContact",
    "dataProvider",
    "researchers",
    "citedAuthors",
    "datasetTitle",
    "datasetDescription",
    "datasetPurpose",
    "dataLicense",
    "fairUseRequest",
    "datasetType",
    "datasetDataType",
    "observationType",
    "sampling",
    "mcdr",
    "dataCoverage",
    "geographicNames",
    "sections",
    "platforms",
    "funding",
    "researchProjects",
    "publications",
    "relatedDatasets",
    "defaultQcFlaggingScheme",
    "defaultMissingValueIndicator",
    "supplementalInformation",
    "keywords",
    "observationGeometry",
    "biologicalSubjects",
    "organismCollectionRegions",
    "physiologicalResponseStudy",
    "fieldTrial",
    "compilationProduct",
    "griddedProduct",
    "modelOutput",
    "sedimentStudy",
    "itemCollections"
})
public class OceanCarbonDataMetadataDocument {

    @XmlElement(name = "document_metadata", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected DocumentMetadata documentMetadata;
    @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6")
    @XmlSchemaType(name = "anyURI")
    protected String doi;
    @XmlElement(name = "project_id", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected String projectId;
    @XmlElement(name = "experiement_id", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected String experiementId;
    @XmlElement(name = "dataset_data_date", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datasetDataDate;
    @XmlElement(name = "dataset_metadata_date", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datasetMetadataDate;
    @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected Identifiers identifiers;
    @XmlElement(name = "data_submitter", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected PersonRef dataSubmitter;
    @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected ArchivalInfo archival;
    @XmlElement(name = "dataset_contact", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected OceanCarbonDataMetadataDocument.DatasetContact datasetContact;
    @XmlElement(name = "data_provider", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected OrganizationRef dataProvider;
    @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected OceanCarbonDataMetadataDocument.Researchers researchers;
    @XmlElement(name = "cited_authors", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected OceanCarbonDataMetadataDocument.CitedAuthors citedAuthors;
    @XmlElement(name = "dataset_title", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected String datasetTitle;
    @XmlElement(name = "dataset_description", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected String datasetDescription;
    @XmlElement(name = "dataset_purpose", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected String datasetPurpose;
    @XmlElement(name = "data_license", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected TypedElement dataLicense;
    @XmlElement(name = "fair_use_request", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected String fairUseRequest;
    @XmlElement(name = "dataset_type", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    @XmlSchemaType(name = "string")
    protected DatasetTypes datasetType;
    @XmlElement(name = "dataset_data_type", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    @XmlSchemaType(name = "string")
    protected DatasetDataTypes datasetDataType;
    @XmlElement(name = "observation_type", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected String observationType;
    @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    @XmlSchemaType(name = "string")
    protected SamplingType sampling;
    @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected Boolean mcdr;
    @XmlElement(name = "data_coverage", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected DataCoverageExtents dataCoverage;
    @XmlElement(name = "geographic_names", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected OceanCarbonDataMetadataDocument.GeographicNames geographicNames;
    @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected OceanCarbonDataMetadataDocument.Sections sections;
    @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected OceanCarbonDataMetadataDocument.Platforms platforms;
    @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected OceanCarbonDataMetadataDocument.Funding funding;
    @XmlElement(name = "research_projects", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected OceanCarbonDataMetadataDocument.ResearchProjects researchProjects;
    @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected OceanCarbonDataMetadataDocument.Publications publications;
    @XmlElement(name = "related_datasets", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected OceanCarbonDataMetadataDocument.RelatedDatasets relatedDatasets;
    @XmlElement(name = "default_qc_flagging_scheme", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected ReferenceOrDescription defaultQcFlaggingScheme;
    @XmlElement(name = "default_missing_value_indicator", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected String defaultMissingValueIndicator;
    @XmlElement(name = "supplemental_information", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected String supplementalInformation;
    @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected OceanCarbonDataMetadataDocument.Keywords keywords;
    @XmlElement(name = "observation_geometry", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    @XmlSchemaType(name = "string")
    protected ObservationGeometry observationGeometry;
    @XmlElement(name = "biological_subjects", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected PhysiologicalResponseStudy.BiologicalSubjects biologicalSubjects;
    @XmlElement(name = "organism_collection_regions", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected PhysiologicalResponseStudy.OrganismCollectionRegions organismCollectionRegions;
    @XmlElement(name = "physiological_response_study", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected PhysiologicalResponseStudy physiologicalResponseStudy;
    @XmlElement(name = "field_trial", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected FieldTrial fieldTrial;
    @XmlElement(name = "compilation_product", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected CompilationProduct compilationProduct;
    @XmlElement(name = "gridded_product", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected GriddedProduct griddedProduct;
    @XmlElement(name = "model_output", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected ModelOutput modelOutput;
    @XmlElement(name = "sediment_study", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected SedimentStudy sedimentStudy;
    @XmlElement(name = "item_collections", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected String itemCollections;
    @XmlAttribute(name = "metadata_standard")
    protected String metadataStandard;
    @XmlAttribute(name = "metadata_version", required = true)
    protected String metadataVersion;

    /**
     * Gets the value of the documentMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentMetadata }
     *     
     */
    public DocumentMetadata getDocumentMetadata() {
        return documentMetadata;
    }

    /**
     * Sets the value of the documentMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentMetadata }
     *     
     */
    public void setDocumentMetadata(DocumentMetadata value) {
        this.documentMetadata = value;
    }

    /**
     * Gets the value of the doi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoi() {
        return doi;
    }

    /**
     * Sets the value of the doi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoi(String value) {
        this.doi = value;
    }

    /**
     * Gets the value of the projectId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * Sets the value of the projectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectId(String value) {
        this.projectId = value;
    }

    /**
     * Gets the value of the experiementId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExperiementId() {
        return experiementId;
    }

    /**
     * Sets the value of the experiementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExperiementId(String value) {
        this.experiementId = value;
    }

    /**
     * Gets the value of the datasetDataDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatasetDataDate() {
        return datasetDataDate;
    }

    /**
     * Sets the value of the datasetDataDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatasetDataDate(XMLGregorianCalendar value) {
        this.datasetDataDate = value;
    }

    /**
     * Gets the value of the datasetMetadataDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatasetMetadataDate() {
        return datasetMetadataDate;
    }

    /**
     * Sets the value of the datasetMetadataDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatasetMetadataDate(XMLGregorianCalendar value) {
        this.datasetMetadataDate = value;
    }

    /**
     * Gets the value of the identifiers property.
     * 
     * @return
     *     possible object is
     *     {@link Identifiers }
     *     
     */
    public Identifiers getIdentifiers() {
        return identifiers;
    }

    /**
     * Sets the value of the identifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifiers }
     *     
     */
    public void setIdentifiers(Identifiers value) {
        this.identifiers = value;
    }

    /**
     * Gets the value of the dataSubmitter property.
     * 
     * @return
     *     possible object is
     *     {@link PersonRef }
     *     
     */
    public PersonRef getDataSubmitter() {
        return dataSubmitter;
    }

    /**
     * Sets the value of the dataSubmitter property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonRef }
     *     
     */
    public void setDataSubmitter(PersonRef value) {
        this.dataSubmitter = value;
    }

    /**
     * Gets the value of the archival property.
     * 
     * @return
     *     possible object is
     *     {@link ArchivalInfo }
     *     
     */
    public ArchivalInfo getArchival() {
        return archival;
    }

    /**
     * Sets the value of the archival property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArchivalInfo }
     *     
     */
    public void setArchival(ArchivalInfo value) {
        this.archival = value;
    }

    /**
     * Gets the value of the datasetContact property.
     * 
     * @return
     *     possible object is
     *     {@link OceanCarbonDataMetadataDocument.DatasetContact }
     *     
     */
    public OceanCarbonDataMetadataDocument.DatasetContact getDatasetContact() {
        return datasetContact;
    }

    /**
     * Sets the value of the datasetContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link OceanCarbonDataMetadataDocument.DatasetContact }
     *     
     */
    public void setDatasetContact(OceanCarbonDataMetadataDocument.DatasetContact value) {
        this.datasetContact = value;
    }

    /**
     * Gets the value of the dataProvider property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationRef }
     *     
     */
    public OrganizationRef getDataProvider() {
        return dataProvider;
    }

    /**
     * Sets the value of the dataProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationRef }
     *     
     */
    public void setDataProvider(OrganizationRef value) {
        this.dataProvider = value;
    }

    /**
     * Gets the value of the researchers property.
     * 
     * @return
     *     possible object is
     *     {@link OceanCarbonDataMetadataDocument.Researchers }
     *     
     */
    public OceanCarbonDataMetadataDocument.Researchers getResearchers() {
        return researchers;
    }

    /**
     * Sets the value of the researchers property.
     * 
     * @param value
     *     allowed object is
     *     {@link OceanCarbonDataMetadataDocument.Researchers }
     *     
     */
    public void setResearchers(OceanCarbonDataMetadataDocument.Researchers value) {
        this.researchers = value;
    }

    /**
     * Gets the value of the citedAuthors property.
     * 
     * @return
     *     possible object is
     *     {@link OceanCarbonDataMetadataDocument.CitedAuthors }
     *     
     */
    public OceanCarbonDataMetadataDocument.CitedAuthors getCitedAuthors() {
        return citedAuthors;
    }

    /**
     * Sets the value of the citedAuthors property.
     * 
     * @param value
     *     allowed object is
     *     {@link OceanCarbonDataMetadataDocument.CitedAuthors }
     *     
     */
    public void setCitedAuthors(OceanCarbonDataMetadataDocument.CitedAuthors value) {
        this.citedAuthors = value;
    }

    /**
     * Gets the value of the datasetTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatasetTitle() {
        return datasetTitle;
    }

    /**
     * Sets the value of the datasetTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatasetTitle(String value) {
        this.datasetTitle = value;
    }

    /**
     * Gets the value of the datasetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatasetDescription() {
        return datasetDescription;
    }

    /**
     * Sets the value of the datasetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatasetDescription(String value) {
        this.datasetDescription = value;
    }

    /**
     * Gets the value of the datasetPurpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatasetPurpose() {
        return datasetPurpose;
    }

    /**
     * Sets the value of the datasetPurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatasetPurpose(String value) {
        this.datasetPurpose = value;
    }

    /**
     * Gets the value of the dataLicense property.
     * 
     * @return
     *     possible object is
     *     {@link TypedElement }
     *     
     */
    public TypedElement getDataLicense() {
        return dataLicense;
    }

    /**
     * Sets the value of the dataLicense property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypedElement }
     *     
     */
    public void setDataLicense(TypedElement value) {
        this.dataLicense = value;
    }

    /**
     * Gets the value of the fairUseRequest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFairUseRequest() {
        return fairUseRequest;
    }

    /**
     * Sets the value of the fairUseRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFairUseRequest(String value) {
        this.fairUseRequest = value;
    }

    /**
     * Gets the value of the datasetType property.
     * 
     * @return
     *     possible object is
     *     {@link DatasetTypes }
     *     
     */
    public DatasetTypes getDatasetType() {
        return datasetType;
    }

    /**
     * Sets the value of the datasetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatasetTypes }
     *     
     */
    public void setDatasetType(DatasetTypes value) {
        this.datasetType = value;
    }

    /**
     * Gets the value of the datasetDataType property.
     * 
     * @return
     *     possible object is
     *     {@link DatasetDataTypes }
     *     
     */
    public DatasetDataTypes getDatasetDataType() {
        return datasetDataType;
    }

    /**
     * Sets the value of the datasetDataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatasetDataTypes }
     *     
     */
    public void setDatasetDataType(DatasetDataTypes value) {
        this.datasetDataType = value;
    }

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
     * Gets the value of the sampling property.
     * 
     * @return
     *     possible object is
     *     {@link SamplingType }
     *     
     */
    public SamplingType getSampling() {
        return sampling;
    }

    /**
     * Sets the value of the sampling property.
     * 
     * @param value
     *     allowed object is
     *     {@link SamplingType }
     *     
     */
    public void setSampling(SamplingType value) {
        this.sampling = value;
    }

    /**
     * Gets the value of the mcdr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMcdr() {
        return mcdr;
    }

    /**
     * Sets the value of the mcdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMcdr(Boolean value) {
        this.mcdr = value;
    }

    /**
     * Gets the value of the dataCoverage property.
     * 
     * @return
     *     possible object is
     *     {@link DataCoverageExtents }
     *     
     */
    public DataCoverageExtents getDataCoverage() {
        return dataCoverage;
    }

    /**
     * Sets the value of the dataCoverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataCoverageExtents }
     *     
     */
    public void setDataCoverage(DataCoverageExtents value) {
        this.dataCoverage = value;
    }

    /**
     * Gets the value of the geographicNames property.
     * 
     * @return
     *     possible object is
     *     {@link OceanCarbonDataMetadataDocument.GeographicNames }
     *     
     */
    public OceanCarbonDataMetadataDocument.GeographicNames getGeographicNames() {
        return geographicNames;
    }

    /**
     * Sets the value of the geographicNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link OceanCarbonDataMetadataDocument.GeographicNames }
     *     
     */
    public void setGeographicNames(OceanCarbonDataMetadataDocument.GeographicNames value) {
        this.geographicNames = value;
    }

    /**
     * Gets the value of the sections property.
     * 
     * @return
     *     possible object is
     *     {@link OceanCarbonDataMetadataDocument.Sections }
     *     
     */
    public OceanCarbonDataMetadataDocument.Sections getSections() {
        return sections;
    }

    /**
     * Sets the value of the sections property.
     * 
     * @param value
     *     allowed object is
     *     {@link OceanCarbonDataMetadataDocument.Sections }
     *     
     */
    public void setSections(OceanCarbonDataMetadataDocument.Sections value) {
        this.sections = value;
    }

    /**
     * Gets the value of the platforms property.
     * 
     * @return
     *     possible object is
     *     {@link OceanCarbonDataMetadataDocument.Platforms }
     *     
     */
    public OceanCarbonDataMetadataDocument.Platforms getPlatforms() {
        return platforms;
    }

    /**
     * Sets the value of the platforms property.
     * 
     * @param value
     *     allowed object is
     *     {@link OceanCarbonDataMetadataDocument.Platforms }
     *     
     */
    public void setPlatforms(OceanCarbonDataMetadataDocument.Platforms value) {
        this.platforms = value;
    }

    /**
     * Gets the value of the funding property.
     * 
     * @return
     *     possible object is
     *     {@link OceanCarbonDataMetadataDocument.Funding }
     *     
     */
    public OceanCarbonDataMetadataDocument.Funding getFunding() {
        return funding;
    }

    /**
     * Sets the value of the funding property.
     * 
     * @param value
     *     allowed object is
     *     {@link OceanCarbonDataMetadataDocument.Funding }
     *     
     */
    public void setFunding(OceanCarbonDataMetadataDocument.Funding value) {
        this.funding = value;
    }

    /**
     * Gets the value of the researchProjects property.
     * 
     * @return
     *     possible object is
     *     {@link OceanCarbonDataMetadataDocument.ResearchProjects }
     *     
     */
    public OceanCarbonDataMetadataDocument.ResearchProjects getResearchProjects() {
        return researchProjects;
    }

    /**
     * Sets the value of the researchProjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link OceanCarbonDataMetadataDocument.ResearchProjects }
     *     
     */
    public void setResearchProjects(OceanCarbonDataMetadataDocument.ResearchProjects value) {
        this.researchProjects = value;
    }

    /**
     * Gets the value of the publications property.
     * 
     * @return
     *     possible object is
     *     {@link OceanCarbonDataMetadataDocument.Publications }
     *     
     */
    public OceanCarbonDataMetadataDocument.Publications getPublications() {
        return publications;
    }

    /**
     * Sets the value of the publications property.
     * 
     * @param value
     *     allowed object is
     *     {@link OceanCarbonDataMetadataDocument.Publications }
     *     
     */
    public void setPublications(OceanCarbonDataMetadataDocument.Publications value) {
        this.publications = value;
    }

    /**
     * Gets the value of the relatedDatasets property.
     * 
     * @return
     *     possible object is
     *     {@link OceanCarbonDataMetadataDocument.RelatedDatasets }
     *     
     */
    public OceanCarbonDataMetadataDocument.RelatedDatasets getRelatedDatasets() {
        return relatedDatasets;
    }

    /**
     * Sets the value of the relatedDatasets property.
     * 
     * @param value
     *     allowed object is
     *     {@link OceanCarbonDataMetadataDocument.RelatedDatasets }
     *     
     */
    public void setRelatedDatasets(OceanCarbonDataMetadataDocument.RelatedDatasets value) {
        this.relatedDatasets = value;
    }

    /**
     * Gets the value of the defaultQcFlaggingScheme property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceOrDescription }
     *     
     */
    public ReferenceOrDescription getDefaultQcFlaggingScheme() {
        return defaultQcFlaggingScheme;
    }

    /**
     * Sets the value of the defaultQcFlaggingScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceOrDescription }
     *     
     */
    public void setDefaultQcFlaggingScheme(ReferenceOrDescription value) {
        this.defaultQcFlaggingScheme = value;
    }

    /**
     * Gets the value of the defaultMissingValueIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultMissingValueIndicator() {
        return defaultMissingValueIndicator;
    }

    /**
     * Sets the value of the defaultMissingValueIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultMissingValueIndicator(String value) {
        this.defaultMissingValueIndicator = value;
    }

    /**
     * Gets the value of the supplementalInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplementalInformation() {
        return supplementalInformation;
    }

    /**
     * Sets the value of the supplementalInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplementalInformation(String value) {
        this.supplementalInformation = value;
    }

    /**
     * Gets the value of the keywords property.
     * 
     * @return
     *     possible object is
     *     {@link OceanCarbonDataMetadataDocument.Keywords }
     *     
     */
    public OceanCarbonDataMetadataDocument.Keywords getKeywords() {
        return keywords;
    }

    /**
     * Sets the value of the keywords property.
     * 
     * @param value
     *     allowed object is
     *     {@link OceanCarbonDataMetadataDocument.Keywords }
     *     
     */
    public void setKeywords(OceanCarbonDataMetadataDocument.Keywords value) {
        this.keywords = value;
    }

    /**
     * Gets the value of the observationGeometry property.
     * 
     * @return
     *     possible object is
     *     {@link ObservationGeometry }
     *     
     */
    public ObservationGeometry getObservationGeometry() {
        return observationGeometry;
    }

    /**
     * Sets the value of the observationGeometry property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObservationGeometry }
     *     
     */
    public void setObservationGeometry(ObservationGeometry value) {
        this.observationGeometry = value;
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
     * Gets the value of the physiologicalResponseStudy property.
     * 
     * @return
     *     possible object is
     *     {@link PhysiologicalResponseStudy }
     *     
     */
    public PhysiologicalResponseStudy getPhysiologicalResponseStudy() {
        return physiologicalResponseStudy;
    }

    /**
     * Sets the value of the physiologicalResponseStudy property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysiologicalResponseStudy }
     *     
     */
    public void setPhysiologicalResponseStudy(PhysiologicalResponseStudy value) {
        this.physiologicalResponseStudy = value;
    }

    /**
     * Gets the value of the fieldTrial property.
     * 
     * @return
     *     possible object is
     *     {@link FieldTrial }
     *     
     */
    public FieldTrial getFieldTrial() {
        return fieldTrial;
    }

    /**
     * Sets the value of the fieldTrial property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldTrial }
     *     
     */
    public void setFieldTrial(FieldTrial value) {
        this.fieldTrial = value;
    }

    /**
     * Gets the value of the compilationProduct property.
     * 
     * @return
     *     possible object is
     *     {@link CompilationProduct }
     *     
     */
    public CompilationProduct getCompilationProduct() {
        return compilationProduct;
    }

    /**
     * Sets the value of the compilationProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompilationProduct }
     *     
     */
    public void setCompilationProduct(CompilationProduct value) {
        this.compilationProduct = value;
    }

    /**
     * Gets the value of the griddedProduct property.
     * 
     * @return
     *     possible object is
     *     {@link GriddedProduct }
     *     
     */
    public GriddedProduct getGriddedProduct() {
        return griddedProduct;
    }

    /**
     * Sets the value of the griddedProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link GriddedProduct }
     *     
     */
    public void setGriddedProduct(GriddedProduct value) {
        this.griddedProduct = value;
    }

    /**
     * Gets the value of the modelOutput property.
     * 
     * @return
     *     possible object is
     *     {@link ModelOutput }
     *     
     */
    public ModelOutput getModelOutput() {
        return modelOutput;
    }

    /**
     * Sets the value of the modelOutput property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModelOutput }
     *     
     */
    public void setModelOutput(ModelOutput value) {
        this.modelOutput = value;
    }

    /**
     * Gets the value of the sedimentStudy property.
     * 
     * @return
     *     possible object is
     *     {@link SedimentStudy }
     *     
     */
    public SedimentStudy getSedimentStudy() {
        return sedimentStudy;
    }

    /**
     * Sets the value of the sedimentStudy property.
     * 
     * @param value
     *     allowed object is
     *     {@link SedimentStudy }
     *     
     */
    public void setSedimentStudy(SedimentStudy value) {
        this.sedimentStudy = value;
    }

    /**
     * Gets the value of the itemCollections property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemCollections() {
        return itemCollections;
    }

    /**
     * Sets the value of the itemCollections property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemCollections(String value) {
        this.itemCollections = value;
    }

    /**
     * Gets the value of the metadataStandard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetadataStandard() {
        if (metadataStandard == null) {
            return "Ocean Carbon Metadata";
        } else {
            return metadataStandard;
        }
    }

    /**
     * Sets the value of the metadataStandard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetadataStandard(String value) {
        this.metadataStandard = value;
    }

    /**
     * Gets the value of the metadataVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetadataVersion() {
        if (metadataVersion == null) {
            return "v4.6";
        } else {
            return metadataVersion;
        }
    }

    /**
     * Sets the value of the metadataVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetadataVersion(String value) {
        this.metadataVersion = value;
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
     *         &lt;element name="author" type="{https://ncei.noaa.gov/ocads/v4.6}ordered_person_ref" maxOccurs="unbounded"/&gt;
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
        "author"
    })
    public static class CitedAuthors {

        @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
        protected List<OrderedPersonRef> author;

        /**
         * Gets the value of the author property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the author property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAuthor().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OrderedPersonRef }
         * 
         * 
         */
        public List<OrderedPersonRef> getAuthor() {
            if (author == null) {
                author = new ArrayList<OrderedPersonRef>();
            }
            return this.author;
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
     *       &lt;choice&gt;
     *         &lt;element name="person" type="{https://ncei.noaa.gov/ocads/v4.6}person_ref"/&gt;
     *         &lt;element name="organization" type="{https://ncei.noaa.gov/ocads/v4.6}organization_ref"/&gt;
     *       &lt;/choice&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "person",
        "organization"
    })
    public static class DatasetContact {

        @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6")
        protected PersonRef person;
        @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6")
        protected OrganizationRef organization;

        /**
         * Gets the value of the person property.
         * 
         * @return
         *     possible object is
         *     {@link PersonRef }
         *     
         */
        public PersonRef getPerson() {
            return person;
        }

        /**
         * Sets the value of the person property.
         * 
         * @param value
         *     allowed object is
         *     {@link PersonRef }
         *     
         */
        public void setPerson(PersonRef value) {
            this.person = value;
        }

        /**
         * Gets the value of the organization property.
         * 
         * @return
         *     possible object is
         *     {@link OrganizationRef }
         *     
         */
        public OrganizationRef getOrganization() {
            return organization;
        }

        /**
         * Sets the value of the organization property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrganizationRef }
         *     
         */
        public void setOrganization(OrganizationRef value) {
            this.organization = value;
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
     *         &lt;element name="funding_source" type="{https://ncei.noaa.gov/ocads/v4.6}funding_source" maxOccurs="unbounded"/&gt;
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
        "fundingSource"
    })
    public static class Funding {

        @XmlElement(name = "funding_source", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
        protected List<FundingSource> fundingSource;

        /**
         * Gets the value of the fundingSource property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fundingSource property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFundingSource().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FundingSource }
         * 
         * 
         */
        public List<FundingSource> getFundingSource() {
            if (fundingSource == null) {
                fundingSource = new ArrayList<FundingSource>();
            }
            return this.fundingSource;
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
     *         &lt;element name="name" type="{https://ncei.noaa.gov/ocads/v4.6}vocabulary_item_reference" maxOccurs="unbounded"/&gt;
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
        "name"
    })
    public static class GeographicNames {

        @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
        protected List<VocabularyItemReference> name;

        /**
         * Gets the value of the name property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the name property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getName().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VocabularyItemReference }
         * 
         * 
         */
        public List<VocabularyItemReference> getName() {
            if (name == null) {
                name = new ArrayList<VocabularyItemReference>();
            }
            return this.name;
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
     *         &lt;element name="keyword" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
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
        "keyword"
    })
    public static class Keywords {

        @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
        protected List<String> keyword;

        /**
         * Gets the value of the keyword property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the keyword property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getKeyword().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getKeyword() {
            if (keyword == null) {
                keyword = new ArrayList<String>();
            }
            return this.keyword;
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
     *         &lt;element name="platform" type="{https://ncei.noaa.gov/ocads/v4.6}platform" maxOccurs="unbounded"/&gt;
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
        "platform"
    })
    public static class Platforms {

        @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
        protected List<Platform> platform;

        /**
         * Gets the value of the platform property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the platform property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPlatform().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Platform }
         * 
         * 
         */
        public List<Platform> getPlatform() {
            if (platform == null) {
                platform = new ArrayList<Platform>();
            }
            return this.platform;
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
     *         &lt;element name="publication" type="{https://ncei.noaa.gov/ocads/v4.6}general_reference" maxOccurs="unbounded"/&gt;
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
        "publication"
    })
    public static class Publications {

        @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
        protected List<GeneralReference> publication;

        /**
         * Gets the value of the publication property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the publication property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPublication().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GeneralReference }
         * 
         * 
         */
        public List<GeneralReference> getPublication() {
            if (publication == null) {
                publication = new ArrayList<GeneralReference>();
            }
            return this.publication;
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
     *         &lt;element name="dataset" type="{https://ncei.noaa.gov/ocads/v4.6}general_reference" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "dataset"
    })
    public static class RelatedDatasets {

        @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6")
        protected List<GeneralReference> dataset;

        /**
         * Gets the value of the dataset property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dataset property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDataset().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GeneralReference }
         * 
         * 
         */
        public List<GeneralReference> getDataset() {
            if (dataset == null) {
                dataset = new ArrayList<GeneralReference>();
            }
            return this.dataset;
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
     *         &lt;element name="researcher" type="{https://ncei.noaa.gov/ocads/v4.6}person_ref" maxOccurs="unbounded"/&gt;
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
        "researcher"
    })
    public static class Researchers {

        @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
        protected List<PersonRef> researcher;

        /**
         * Gets the value of the researcher property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the researcher property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getResearcher().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PersonRef }
         * 
         * 
         */
        public List<PersonRef> getResearcher() {
            if (researcher == null) {
                researcher = new ArrayList<PersonRef>();
            }
            return this.researcher;
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
     *         &lt;element name="project" type="{https://ncei.noaa.gov/ocads/v4.6}research_project" maxOccurs="unbounded"/&gt;
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
        "project"
    })
    public static class ResearchProjects {

        @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
        protected List<ResearchProject> project;

        /**
         * Gets the value of the project property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the project property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProject().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ResearchProject }
         * 
         * 
         */
        public List<ResearchProject> getProject() {
            if (project == null) {
                project = new ArrayList<ResearchProject>();
            }
            return this.project;
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
     *         &lt;element name="section" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
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
        "section"
    })
    public static class Sections {

        @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
        protected List<String> section;

        /**
         * Gets the value of the section property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the section property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSection().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getSection() {
            if (section == null) {
                section = new ArrayList<String>();
            }
            return this.section;
        }

    }

}
