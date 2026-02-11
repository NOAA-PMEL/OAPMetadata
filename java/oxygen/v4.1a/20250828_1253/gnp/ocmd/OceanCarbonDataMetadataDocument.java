
package gnp.ocmd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="document_metadata" type="{http://ncei.noaa.gov/oads/a4.1}document_metadata"/&gt;
 *         &lt;group ref="{http://ncei.noaa.gov/oads/a4.1}dataset_base_fields"/&gt;
 *         &lt;group ref="{http://ncei.noaa.gov/oads/a4.1}observations_ds_fields" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="physiological_response_study"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;group ref="{http://ncei.noaa.gov/oads/a4.1}manipulation_response_ds_fields"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="ocean_alcalinity_enhancement_study"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;group ref="{http://ncei.noaa.gov/oads/a4.1}ocean_alcalinity_enhancement_ds_fields"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="data_product" minOccurs="0"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;group ref="{http://ncei.noaa.gov/oads/a4.1}data_product_ds_fields"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="model_output" minOccurs="0"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;group ref="{http://ncei.noaa.gov/oads/a4.1}model_ds_fields"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *         &lt;/choice&gt;
 *         &lt;group ref="{http://ncei.noaa.gov/oads/a4.1}dataset_collections"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://ncei.noaa.gov/oads/a4.1}metadata_standard"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ocean_carbon_data_metadata_document", namespace = "http://ncei.noaa.gov/oads/a4.1", propOrder = {
    "documentMetadata",
    "doi",
    "dataSubmitter",
    "archival",
    "datasetType",
    "datasetDataType",
    "datasetContact",
    "dataProvider",
    "datasetTitle",
    "datasetDescription",
    "dataLicense",
    "researchers",
    "citedAuthors",
    "dataCoverage",
    "seaNames",
    "funding",
    "researchProjects",
    "publications",
    "relatedDatasets",
    "defaultDataFlaggingScheme",
    "defaultMissingValueIndicator",
    "supplementalInformation",
    "platforms",
    "observationIdentifiers",
    "physiologicalResponseStudy",
    "oceanAlcalinityEnhancementStudy",
    "dataProduct",
    "modelOutput",
    "variables",
    "people",
    "organizations",
    "instruments"
})
public class OceanCarbonDataMetadataDocument {

    @XmlElement(name = "document_metadata", namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
    protected DocumentMetadata documentMetadata;
    @XmlElement(name = "DOI", namespace = "http://ncei.noaa.gov/oads/a4.1")
    @XmlSchemaType(name = "anyURI")
    protected String doi;
    @XmlElement(name = "data_submitter", namespace = "http://ncei.noaa.gov/oads/a4.1")
    protected PersonRef dataSubmitter;
    @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1")
    protected ArchivalInfo archival;
    @XmlElement(name = "dataset_type", namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
    @XmlSchemaType(name = "string")
    protected DatasetTypes datasetType;
    @XmlElement(name = "dataset_data_type", namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
    @XmlSchemaType(name = "string")
    protected DatasetDataTypes datasetDataType;
    @XmlElement(name = "dataset_contact", namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
    protected OceanCarbonDataMetadataDocument.DatasetContact datasetContact;
    @XmlElement(name = "data_provider", namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
    protected OrganizationOrRef dataProvider;
    @XmlElement(name = "dataset_title", namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
    protected String datasetTitle;
    @XmlElement(name = "dataset_description", namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
    protected String datasetDescription;
    @XmlElement(name = "data_license", namespace = "http://ncei.noaa.gov/oads/a4.1")
    protected TypedElement dataLicense;
    @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
    protected OceanCarbonDataMetadataDocument.Researchers researchers;
    @XmlElement(name = "cited_authors", namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
    protected OceanCarbonDataMetadataDocument.CitedAuthors citedAuthors;
    @XmlElement(name = "data_coverage", namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
    protected SpatioTemporalExtents dataCoverage;
    @XmlElement(name = "sea_names", namespace = "http://ncei.noaa.gov/oads/a4.1")
    protected OceanCarbonDataMetadataDocument.SeaNames seaNames;
    @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1")
    protected OceanCarbonDataMetadataDocument.Funding funding;
    @XmlElement(name = "research_projects", namespace = "http://ncei.noaa.gov/oads/a4.1")
    protected OceanCarbonDataMetadataDocument.ResearchProjects researchProjects;
    @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1")
    protected OceanCarbonDataMetadataDocument.Publications publications;
    @XmlElement(name = "related_datasets", namespace = "http://ncei.noaa.gov/oads/a4.1")
    protected OceanCarbonDataMetadataDocument.RelatedDatasets relatedDatasets;
    @XmlElement(name = "default_data_flagging_scheme", namespace = "http://ncei.noaa.gov/oads/a4.1")
    protected ReferenceOrDescription defaultDataFlaggingScheme;
    @XmlElement(name = "default_missing_value_indicator", namespace = "http://ncei.noaa.gov/oads/a4.1")
    protected String defaultMissingValueIndicator;
    @XmlElement(name = "supplemental_information", namespace = "http://ncei.noaa.gov/oads/a4.1")
    protected String supplementalInformation;
    @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1")
    protected OceanCarbonDataMetadataDocument.Platforms platforms;
    @XmlElement(name = "observation_identifiers", namespace = "http://ncei.noaa.gov/oads/a4.1")
    protected OceanCarbonDataMetadataDocument.ObservationIdentifiers observationIdentifiers;
    @XmlElement(name = "physiological_response_study", namespace = "http://ncei.noaa.gov/oads/a4.1")
    protected OceanCarbonDataMetadataDocument.PhysiologicalResponseStudy physiologicalResponseStudy;
    @XmlElement(name = "ocean_alcalinity_enhancement_study", namespace = "http://ncei.noaa.gov/oads/a4.1")
    protected OceanCarbonDataMetadataDocument.OceanAlcalinityEnhancementStudy oceanAlcalinityEnhancementStudy;
    @XmlElement(name = "data_product", namespace = "http://ncei.noaa.gov/oads/a4.1")
    protected OceanCarbonDataMetadataDocument.DataProduct dataProduct;
    @XmlElement(name = "model_output", namespace = "http://ncei.noaa.gov/oads/a4.1")
    protected OceanCarbonDataMetadataDocument.ModelOutput modelOutput;
    @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
    protected VariableCollection variables;
    @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
    protected PersonCollection people;
    @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
    protected OrganizationCollection organizations;
    @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
    protected InstrumentCollection instruments;
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
    public String getDOI() {
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
    public void setDOI(String value) {
        this.doi = value;
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
     *     {@link OrganizationOrRef }
     *     
     */
    public OrganizationOrRef getDataProvider() {
        return dataProvider;
    }

    /**
     * Sets the value of the dataProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationOrRef }
     *     
     */
    public void setDataProvider(OrganizationOrRef value) {
        this.dataProvider = value;
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
     * Gets the value of the dataCoverage property.
     * 
     * @return
     *     possible object is
     *     {@link SpatioTemporalExtents }
     *     
     */
    public SpatioTemporalExtents getDataCoverage() {
        return dataCoverage;
    }

    /**
     * Sets the value of the dataCoverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpatioTemporalExtents }
     *     
     */
    public void setDataCoverage(SpatioTemporalExtents value) {
        this.dataCoverage = value;
    }

    /**
     * Gets the value of the seaNames property.
     * 
     * @return
     *     possible object is
     *     {@link OceanCarbonDataMetadataDocument.SeaNames }
     *     
     */
    public OceanCarbonDataMetadataDocument.SeaNames getSeaNames() {
        return seaNames;
    }

    /**
     * Sets the value of the seaNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link OceanCarbonDataMetadataDocument.SeaNames }
     *     
     */
    public void setSeaNames(OceanCarbonDataMetadataDocument.SeaNames value) {
        this.seaNames = value;
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
     * Gets the value of the defaultDataFlaggingScheme property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceOrDescription }
     *     
     */
    public ReferenceOrDescription getDefaultDataFlaggingScheme() {
        return defaultDataFlaggingScheme;
    }

    /**
     * Sets the value of the defaultDataFlaggingScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceOrDescription }
     *     
     */
    public void setDefaultDataFlaggingScheme(ReferenceOrDescription value) {
        this.defaultDataFlaggingScheme = value;
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
     * Gets the value of the observationIdentifiers property.
     * 
     * @return
     *     possible object is
     *     {@link OceanCarbonDataMetadataDocument.ObservationIdentifiers }
     *     
     */
    public OceanCarbonDataMetadataDocument.ObservationIdentifiers getObservationIdentifiers() {
        return observationIdentifiers;
    }

    /**
     * Sets the value of the observationIdentifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link OceanCarbonDataMetadataDocument.ObservationIdentifiers }
     *     
     */
    public void setObservationIdentifiers(OceanCarbonDataMetadataDocument.ObservationIdentifiers value) {
        this.observationIdentifiers = value;
    }

    /**
     * Gets the value of the physiologicalResponseStudy property.
     * 
     * @return
     *     possible object is
     *     {@link OceanCarbonDataMetadataDocument.PhysiologicalResponseStudy }
     *     
     */
    public OceanCarbonDataMetadataDocument.PhysiologicalResponseStudy getPhysiologicalResponseStudy() {
        return physiologicalResponseStudy;
    }

    /**
     * Sets the value of the physiologicalResponseStudy property.
     * 
     * @param value
     *     allowed object is
     *     {@link OceanCarbonDataMetadataDocument.PhysiologicalResponseStudy }
     *     
     */
    public void setPhysiologicalResponseStudy(OceanCarbonDataMetadataDocument.PhysiologicalResponseStudy value) {
        this.physiologicalResponseStudy = value;
    }

    /**
     * Gets the value of the oceanAlcalinityEnhancementStudy property.
     * 
     * @return
     *     possible object is
     *     {@link OceanCarbonDataMetadataDocument.OceanAlcalinityEnhancementStudy }
     *     
     */
    public OceanCarbonDataMetadataDocument.OceanAlcalinityEnhancementStudy getOceanAlcalinityEnhancementStudy() {
        return oceanAlcalinityEnhancementStudy;
    }

    /**
     * Sets the value of the oceanAlcalinityEnhancementStudy property.
     * 
     * @param value
     *     allowed object is
     *     {@link OceanCarbonDataMetadataDocument.OceanAlcalinityEnhancementStudy }
     *     
     */
    public void setOceanAlcalinityEnhancementStudy(OceanCarbonDataMetadataDocument.OceanAlcalinityEnhancementStudy value) {
        this.oceanAlcalinityEnhancementStudy = value;
    }

    /**
     * Gets the value of the dataProduct property.
     * 
     * @return
     *     possible object is
     *     {@link OceanCarbonDataMetadataDocument.DataProduct }
     *     
     */
    public OceanCarbonDataMetadataDocument.DataProduct getDataProduct() {
        return dataProduct;
    }

    /**
     * Sets the value of the dataProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link OceanCarbonDataMetadataDocument.DataProduct }
     *     
     */
    public void setDataProduct(OceanCarbonDataMetadataDocument.DataProduct value) {
        this.dataProduct = value;
    }

    /**
     * Gets the value of the modelOutput property.
     * 
     * @return
     *     possible object is
     *     {@link OceanCarbonDataMetadataDocument.ModelOutput }
     *     
     */
    public OceanCarbonDataMetadataDocument.ModelOutput getModelOutput() {
        return modelOutput;
    }

    /**
     * Sets the value of the modelOutput property.
     * 
     * @param value
     *     allowed object is
     *     {@link OceanCarbonDataMetadataDocument.ModelOutput }
     *     
     */
    public void setModelOutput(OceanCarbonDataMetadataDocument.ModelOutput value) {
        this.modelOutput = value;
    }

    /**
     * Gets the value of the variables property.
     * 
     * @return
     *     possible object is
     *     {@link VariableCollection }
     *     
     */
    public VariableCollection getVariables() {
        return variables;
    }

    /**
     * Sets the value of the variables property.
     * 
     * @param value
     *     allowed object is
     *     {@link VariableCollection }
     *     
     */
    public void setVariables(VariableCollection value) {
        this.variables = value;
    }

    /**
     * Gets the value of the people property.
     * 
     * @return
     *     possible object is
     *     {@link PersonCollection }
     *     
     */
    public PersonCollection getPeople() {
        return people;
    }

    /**
     * Sets the value of the people property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonCollection }
     *     
     */
    public void setPeople(PersonCollection value) {
        this.people = value;
    }

    /**
     * Gets the value of the organizations property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationCollection }
     *     
     */
    public OrganizationCollection getOrganizations() {
        return organizations;
    }

    /**
     * Sets the value of the organizations property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationCollection }
     *     
     */
    public void setOrganizations(OrganizationCollection value) {
        this.organizations = value;
    }

    /**
     * Gets the value of the instruments property.
     * 
     * @return
     *     possible object is
     *     {@link InstrumentCollection }
     *     
     */
    public InstrumentCollection getInstruments() {
        return instruments;
    }

    /**
     * Sets the value of the instruments property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstrumentCollection }
     *     
     */
    public void setInstruments(InstrumentCollection value) {
        this.instruments = value;
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
            return "$PKG_VERSION;";
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
            return "a4.1";
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
     *         &lt;element name="author" type="{http://ncei.noaa.gov/oads/a4.1}ordered_reference" maxOccurs="unbounded"/&gt;
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

        @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
        protected List<OrderedReference> author;

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
         * {@link OrderedReference }
         * 
         * 
         */
        public List<OrderedReference> getAuthor() {
            if (author == null) {
                author = new ArrayList<OrderedReference>();
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
     *       &lt;sequence&gt;
     *         &lt;group ref="{http://ncei.noaa.gov/oads/a4.1}data_product_ds_fields"/&gt;
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
        "dataSources",
        "synthesisProduct",
        "calculatedProduct"
    })
    public static class DataProduct {

        @XmlElement(name = "data_sources", namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
        protected OceanCarbonDataMetadataDocument.DataProduct.DataSources dataSources;
        @XmlElement(name = "synthesis_product", namespace = "http://ncei.noaa.gov/oads/a4.1")
        protected SynthesisProduct synthesisProduct;
        @XmlElement(name = "calculated_product", namespace = "http://ncei.noaa.gov/oads/a4.1")
        protected CalculatedProduct calculatedProduct;

        /**
         * Gets the value of the dataSources property.
         * 
         * @return
         *     possible object is
         *     {@link OceanCarbonDataMetadataDocument.DataProduct.DataSources }
         *     
         */
        public OceanCarbonDataMetadataDocument.DataProduct.DataSources getDataSources() {
            return dataSources;
        }

        /**
         * Sets the value of the dataSources property.
         * 
         * @param value
         *     allowed object is
         *     {@link OceanCarbonDataMetadataDocument.DataProduct.DataSources }
         *     
         */
        public void setDataSources(OceanCarbonDataMetadataDocument.DataProduct.DataSources value) {
            this.dataSources = value;
        }

        /**
         * Gets the value of the synthesisProduct property.
         * 
         * @return
         *     possible object is
         *     {@link SynthesisProduct }
         *     
         */
        public SynthesisProduct getSynthesisProduct() {
            return synthesisProduct;
        }

        /**
         * Sets the value of the synthesisProduct property.
         * 
         * @param value
         *     allowed object is
         *     {@link SynthesisProduct }
         *     
         */
        public void setSynthesisProduct(SynthesisProduct value) {
            this.synthesisProduct = value;
        }

        /**
         * Gets the value of the calculatedProduct property.
         * 
         * @return
         *     possible object is
         *     {@link CalculatedProduct }
         *     
         */
        public CalculatedProduct getCalculatedProduct() {
            return calculatedProduct;
        }

        /**
         * Sets the value of the calculatedProduct property.
         * 
         * @param value
         *     allowed object is
         *     {@link CalculatedProduct }
         *     
         */
        public void setCalculatedProduct(CalculatedProduct value) {
            this.calculatedProduct = value;
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
         *         &lt;element name="source" type="{http://ncei.noaa.gov/oads/a4.1}data_reference" maxOccurs="unbounded"/&gt;
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
            "source"
        })
        public static class DataSources {

            @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
            protected List<DataReference> source;

            /**
             * Gets the value of the source property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the source property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSource().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link DataReference }
             * 
             * 
             */
            public List<DataReference> getSource() {
                if (source == null) {
                    source = new ArrayList<DataReference>();
                }
                return this.source;
            }

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
     *         &lt;element name="person" type="{http://ncei.noaa.gov/oads/a4.1}person_with_role"/&gt;
     *         &lt;element name="organization" type="{http://ncei.noaa.gov/oads/a4.1}organization_or_ref"/&gt;
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

        @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1")
        protected PersonWithRole person;
        @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1")
        protected OrganizationOrRef organization;

        /**
         * Gets the value of the person property.
         * 
         * @return
         *     possible object is
         *     {@link PersonWithRole }
         *     
         */
        public PersonWithRole getPerson() {
            return person;
        }

        /**
         * Sets the value of the person property.
         * 
         * @param value
         *     allowed object is
         *     {@link PersonWithRole }
         *     
         */
        public void setPerson(PersonWithRole value) {
            this.person = value;
        }

        /**
         * Gets the value of the organization property.
         * 
         * @return
         *     possible object is
         *     {@link OrganizationOrRef }
         *     
         */
        public OrganizationOrRef getOrganization() {
            return organization;
        }

        /**
         * Sets the value of the organization property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrganizationOrRef }
         *     
         */
        public void setOrganization(OrganizationOrRef value) {
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
     *         &lt;element name="funding_source" type="{http://ncei.noaa.gov/oads/a4.1}funding_source" maxOccurs="unbounded"/&gt;
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

        @XmlElement(name = "funding_source", namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
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
     *         &lt;group ref="{http://ncei.noaa.gov/oads/a4.1}model_ds_fields"/&gt;
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
        "modelName",
        "modelVersion",
        "physicsComponentNameAndVersion",
        "bgcComponentNameAndVersion",
        "modelledRegion",
        "modelResolution",
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
    public static class ModelOutput {

        @XmlElement(name = "model_name", namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
        protected String modelName;
        @XmlElement(name = "model_version", namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
        protected String modelVersion;
        @XmlElement(name = "physics_component_name_and_version", namespace = "http://ncei.noaa.gov/oads/a4.1")
        protected String physicsComponentNameAndVersion;
        @XmlElement(name = "bgc_component_name_and_version", namespace = "http://ncei.noaa.gov/oads/a4.1")
        protected String bgcComponentNameAndVersion;
        @XmlElement(name = "modelled_region", namespace = "http://ncei.noaa.gov/oads/a4.1")
        protected String modelledRegion;
        @XmlElement(name = "model_resolution", namespace = "http://ncei.noaa.gov/oads/a4.1")
        protected String modelResolution;
        @XmlElement(name = "model_configuration", namespace = "http://ncei.noaa.gov/oads/a4.1")
        protected String modelConfiguration;
        @XmlElement(name = "boundary_conditions", namespace = "http://ncei.noaa.gov/oads/a4.1")
        protected String boundaryConditions;
        @XmlElement(name = "atmospheric_forcing", namespace = "http://ncei.noaa.gov/oads/a4.1")
        protected String atmosphericForcing;
        @XmlElement(name = "tidal_forcing", namespace = "http://ncei.noaa.gov/oads/a4.1")
        protected String tidalForcing;
        @XmlElement(name = "other_model_forcing_details", namespace = "http://ncei.noaa.gov/oads/a4.1")
        protected String otherModelForcingDetails;
        @XmlElement(name = "river_and_sediment_flux_details", namespace = "http://ncei.noaa.gov/oads/a4.1")
        protected String riverAndSedimentFluxDetails;
        @XmlElement(name = "spin_up_protocol", namespace = "http://ncei.noaa.gov/oads/a4.1")
        protected String spinUpProtocol;
        @XmlElement(name = "description_of_acid_or_alkalinity_addition", namespace = "http://ncei.noaa.gov/oads/a4.1")
        protected String descriptionOfAcidOrAlkalinityAddition;
        @XmlElement(name = "codebase_link", namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
        protected String codebaseLink;
        @XmlElement(name = "additional_details", namespace = "http://ncei.noaa.gov/oads/a4.1")
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
         *     {@link String }
         *     
         */
        public String getModelledRegion() {
            return modelledRegion;
        }

        /**
         * Sets the value of the modelledRegion property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setModelledRegion(String value) {
            this.modelledRegion = value;
        }

        /**
         * Gets the value of the modelResolution property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getModelResolution() {
            return modelResolution;
        }

        /**
         * Sets the value of the modelResolution property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setModelResolution(String value) {
            this.modelResolution = value;
        }

        /**
         * Gets the value of the modelConfiguration property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getModelConfiguration() {
            return modelConfiguration;
        }

        /**
         * Sets the value of the modelConfiguration property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setModelConfiguration(String value) {
            this.modelConfiguration = value;
        }

        /**
         * Gets the value of the boundaryConditions property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBoundaryConditions() {
            return boundaryConditions;
        }

        /**
         * Sets the value of the boundaryConditions property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBoundaryConditions(String value) {
            this.boundaryConditions = value;
        }

        /**
         * Gets the value of the atmosphericForcing property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAtmosphericForcing() {
            return atmosphericForcing;
        }

        /**
         * Sets the value of the atmosphericForcing property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAtmosphericForcing(String value) {
            this.atmosphericForcing = value;
        }

        /**
         * Gets the value of the tidalForcing property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTidalForcing() {
            return tidalForcing;
        }

        /**
         * Sets the value of the tidalForcing property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTidalForcing(String value) {
            this.tidalForcing = value;
        }

        /**
         * Gets the value of the otherModelForcingDetails property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOtherModelForcingDetails() {
            return otherModelForcingDetails;
        }

        /**
         * Sets the value of the otherModelForcingDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOtherModelForcingDetails(String value) {
            this.otherModelForcingDetails = value;
        }

        /**
         * Gets the value of the riverAndSedimentFluxDetails property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRiverAndSedimentFluxDetails() {
            return riverAndSedimentFluxDetails;
        }

        /**
         * Sets the value of the riverAndSedimentFluxDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRiverAndSedimentFluxDetails(String value) {
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
         *     {@link String }
         *     
         */
        public String getCodebaseLink() {
            return codebaseLink;
        }

        /**
         * Sets the value of the codebaseLink property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodebaseLink(String value) {
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
     *         &lt;element name="expocodes" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="expocode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="cruise_ids" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="cruise_id" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="station_ids" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="station_id" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
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
        "expocodes",
        "cruiseIds",
        "stationIds"
    })
    public static class ObservationIdentifiers {

        @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1")
        protected OceanCarbonDataMetadataDocument.ObservationIdentifiers.Expocodes expocodes;
        @XmlElement(name = "cruise_ids", namespace = "http://ncei.noaa.gov/oads/a4.1")
        protected OceanCarbonDataMetadataDocument.ObservationIdentifiers.CruiseIds cruiseIds;
        @XmlElement(name = "station_ids", namespace = "http://ncei.noaa.gov/oads/a4.1")
        protected OceanCarbonDataMetadataDocument.ObservationIdentifiers.StationIds stationIds;

        /**
         * Gets the value of the expocodes property.
         * 
         * @return
         *     possible object is
         *     {@link OceanCarbonDataMetadataDocument.ObservationIdentifiers.Expocodes }
         *     
         */
        public OceanCarbonDataMetadataDocument.ObservationIdentifiers.Expocodes getExpocodes() {
            return expocodes;
        }

        /**
         * Sets the value of the expocodes property.
         * 
         * @param value
         *     allowed object is
         *     {@link OceanCarbonDataMetadataDocument.ObservationIdentifiers.Expocodes }
         *     
         */
        public void setExpocodes(OceanCarbonDataMetadataDocument.ObservationIdentifiers.Expocodes value) {
            this.expocodes = value;
        }

        /**
         * Gets the value of the cruiseIds property.
         * 
         * @return
         *     possible object is
         *     {@link OceanCarbonDataMetadataDocument.ObservationIdentifiers.CruiseIds }
         *     
         */
        public OceanCarbonDataMetadataDocument.ObservationIdentifiers.CruiseIds getCruiseIds() {
            return cruiseIds;
        }

        /**
         * Sets the value of the cruiseIds property.
         * 
         * @param value
         *     allowed object is
         *     {@link OceanCarbonDataMetadataDocument.ObservationIdentifiers.CruiseIds }
         *     
         */
        public void setCruiseIds(OceanCarbonDataMetadataDocument.ObservationIdentifiers.CruiseIds value) {
            this.cruiseIds = value;
        }

        /**
         * Gets the value of the stationIds property.
         * 
         * @return
         *     possible object is
         *     {@link OceanCarbonDataMetadataDocument.ObservationIdentifiers.StationIds }
         *     
         */
        public OceanCarbonDataMetadataDocument.ObservationIdentifiers.StationIds getStationIds() {
            return stationIds;
        }

        /**
         * Sets the value of the stationIds property.
         * 
         * @param value
         *     allowed object is
         *     {@link OceanCarbonDataMetadataDocument.ObservationIdentifiers.StationIds }
         *     
         */
        public void setStationIds(OceanCarbonDataMetadataDocument.ObservationIdentifiers.StationIds value) {
            this.stationIds = value;
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
         *         &lt;element name="cruise_id" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
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
            "cruiseId"
        })
        public static class CruiseIds {

            @XmlElement(name = "cruise_id", namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
            protected List<String> cruiseId;

            /**
             * Gets the value of the cruiseId property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the cruiseId property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCruiseId().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getCruiseId() {
                if (cruiseId == null) {
                    cruiseId = new ArrayList<String>();
                }
                return this.cruiseId;
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
         *         &lt;element name="expocode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
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
            "expocode"
        })
        public static class Expocodes {

            @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
            protected List<String> expocode;

            /**
             * Gets the value of the expocode property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the expocode property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getExpocode().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getExpocode() {
                if (expocode == null) {
                    expocode = new ArrayList<String>();
                }
                return this.expocode;
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
         *         &lt;element name="station_id" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
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
            "stationId"
        })
        public static class StationIds {

            @XmlElement(name = "station_id", namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
            protected List<String> stationId;

            /**
             * Gets the value of the stationId property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the stationId property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getStationId().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getStationId() {
                if (stationId == null) {
                    stationId = new ArrayList<String>();
                }
                return this.stationId;
            }

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
     *         &lt;group ref="{http://ncei.noaa.gov/oads/a4.1}ocean_alcalinity_enhancement_ds_fields"/&gt;
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
        "projectId",
        "experimentId",
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
        "permitNumber",
        "permitApprovalDocument",
        "permittingAuthority",
        "dataConflictsAndUnreportedData",
        "additionalDetails"
    })
    public static class OceanAlcalinityEnhancementStudy {

        @XmlElement(name = "project_id", namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
        protected String projectId;
        @XmlElement(name = "experiment_id", namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
        protected String experimentId;
        @XmlElement(name = "experiment_description", namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
        protected String experimentDescription;
        @XmlElement(name = "mcdr_pathway", namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
        protected String mcdrPathway;
        @XmlElement(name = "oae_treatment_type", namespace = "http://ncei.noaa.gov/oads/a4.1")
        protected String oaeTreatmentType;
        @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
        @XmlSchemaType(name = "string")
        protected ExperimentPhase phase;
        @XmlElement(name = "site_description", namespace = "http://ncei.noaa.gov/oads/a4.1")
        protected Object siteDescription;
        @XmlElement(name = "previous_mcdr_research_in_the_area", namespace = "http://ncei.noaa.gov/oads/a4.1")
        protected Object previousMcdrResearchInTheArea;
        @XmlElement(name = "co-located_operations", namespace = "http://ncei.noaa.gov/oads/a4.1")
        protected Object coLocatedOperations;
        @XmlElement(name = "meteorological_and_tidal_conditions", namespace = "http://ncei.noaa.gov/oads/a4.1")
        protected Object meteorologicalAndTidalConditions;
        @XmlElement(name = "alkalinity_feedstock_type", namespace = "http://ncei.noaa.gov/oads/a4.1")
        protected Object alkalinityFeedstockType;
        @XmlElement(name = "alkalinity_feedstock_description", namespace = "http://ncei.noaa.gov/oads/a4.1")
        protected Object alkalinityFeedstockDescription;
        @XmlElement(name = "dosing_location", namespace = "http://ncei.noaa.gov/oads/a4.1")
        protected Object dosingLocation;
        @XmlElement(name = "dosing_depth", namespace = "http://ncei.noaa.gov/oads/a4.1")
        protected Object dosingDepth;
        @XmlElement(name = "dosing_duration", namespace = "http://ncei.noaa.gov/oads/a4.1")
        protected DatetimeDuration dosingDuration;
        @XmlElement(name = "dosing_mechanism", namespace = "http://ncei.noaa.gov/oads/a4.1")
        protected Object dosingMechanism;
        @XmlElement(name = "dosing_effluent_density", namespace = "http://ncei.noaa.gov/oads/a4.1")
        protected Object dosingEffluentDensity;
        @XmlElement(name = "dosing_regimen", namespace = "http://ncei.noaa.gov/oads/a4.1")
        protected Object dosingRegimen;
        @XmlElement(name = "dosing_rate_data", namespace = "http://ncei.noaa.gov/oads/a4.1")
        protected Object dosingRateData;
        @XmlElement(name = "permit_number", namespace = "http://ncei.noaa.gov/oads/a4.1")
        protected Object permitNumber;
        @XmlElement(name = "permit_approval_document", namespace = "http://ncei.noaa.gov/oads/a4.1")
        protected Object permitApprovalDocument;
        @XmlElement(name = "permitting_authority", namespace = "http://ncei.noaa.gov/oads/a4.1")
        protected Object permittingAuthority;
        @XmlElement(name = "data_conflicts_and_unreported_data", namespace = "http://ncei.noaa.gov/oads/a4.1")
        protected Object dataConflictsAndUnreportedData;
        @XmlElement(name = "additional_details", namespace = "http://ncei.noaa.gov/oads/a4.1")
        protected Object additionalDetails;

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
         * Gets the value of the experimentId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExperimentId() {
            return experimentId;
        }

        /**
         * Sets the value of the experimentId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExperimentId(String value) {
            this.experimentId = value;
        }

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
         *     {@link String }
         *     
         */
        public String getMcdrPathway() {
            return mcdrPathway;
        }

        /**
         * Sets the value of the mcdrPathway property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMcdrPathway(String value) {
            this.mcdrPathway = value;
        }

        /**
         * Gets the value of the oaeTreatmentType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOaeTreatmentType() {
            return oaeTreatmentType;
        }

        /**
         * Sets the value of the oaeTreatmentType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOaeTreatmentType(String value) {
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
         *     {@link Object }
         *     
         */
        public Object getSiteDescription() {
            return siteDescription;
        }

        /**
         * Sets the value of the siteDescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setSiteDescription(Object value) {
            this.siteDescription = value;
        }

        /**
         * Gets the value of the previousMcdrResearchInTheArea property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getPreviousMcdrResearchInTheArea() {
            return previousMcdrResearchInTheArea;
        }

        /**
         * Sets the value of the previousMcdrResearchInTheArea property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setPreviousMcdrResearchInTheArea(Object value) {
            this.previousMcdrResearchInTheArea = value;
        }

        /**
         * Gets the value of the coLocatedOperations property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getCoLocatedOperations() {
            return coLocatedOperations;
        }

        /**
         * Sets the value of the coLocatedOperations property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setCoLocatedOperations(Object value) {
            this.coLocatedOperations = value;
        }

        /**
         * Gets the value of the meteorologicalAndTidalConditions property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getMeteorologicalAndTidalConditions() {
            return meteorologicalAndTidalConditions;
        }

        /**
         * Sets the value of the meteorologicalAndTidalConditions property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setMeteorologicalAndTidalConditions(Object value) {
            this.meteorologicalAndTidalConditions = value;
        }

        /**
         * Gets the value of the alkalinityFeedstockType property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getAlkalinityFeedstockType() {
            return alkalinityFeedstockType;
        }

        /**
         * Sets the value of the alkalinityFeedstockType property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setAlkalinityFeedstockType(Object value) {
            this.alkalinityFeedstockType = value;
        }

        /**
         * Gets the value of the alkalinityFeedstockDescription property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getAlkalinityFeedstockDescription() {
            return alkalinityFeedstockDescription;
        }

        /**
         * Sets the value of the alkalinityFeedstockDescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setAlkalinityFeedstockDescription(Object value) {
            this.alkalinityFeedstockDescription = value;
        }

        /**
         * Gets the value of the dosingLocation property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getDosingLocation() {
            return dosingLocation;
        }

        /**
         * Sets the value of the dosingLocation property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setDosingLocation(Object value) {
            this.dosingLocation = value;
        }

        /**
         * Gets the value of the dosingDepth property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getDosingDepth() {
            return dosingDepth;
        }

        /**
         * Sets the value of the dosingDepth property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setDosingDepth(Object value) {
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
         *     {@link Object }
         *     
         */
        public Object getDosingMechanism() {
            return dosingMechanism;
        }

        /**
         * Sets the value of the dosingMechanism property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setDosingMechanism(Object value) {
            this.dosingMechanism = value;
        }

        /**
         * Gets the value of the dosingEffluentDensity property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getDosingEffluentDensity() {
            return dosingEffluentDensity;
        }

        /**
         * Sets the value of the dosingEffluentDensity property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setDosingEffluentDensity(Object value) {
            this.dosingEffluentDensity = value;
        }

        /**
         * Gets the value of the dosingRegimen property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getDosingRegimen() {
            return dosingRegimen;
        }

        /**
         * Sets the value of the dosingRegimen property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setDosingRegimen(Object value) {
            this.dosingRegimen = value;
        }

        /**
         * Gets the value of the dosingRateData property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getDosingRateData() {
            return dosingRateData;
        }

        /**
         * Sets the value of the dosingRateData property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setDosingRateData(Object value) {
            this.dosingRateData = value;
        }

        /**
         * Gets the value of the permitNumber property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getPermitNumber() {
            return permitNumber;
        }

        /**
         * Sets the value of the permitNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setPermitNumber(Object value) {
            this.permitNumber = value;
        }

        /**
         * Gets the value of the permitApprovalDocument property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getPermitApprovalDocument() {
            return permitApprovalDocument;
        }

        /**
         * Sets the value of the permitApprovalDocument property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setPermitApprovalDocument(Object value) {
            this.permitApprovalDocument = value;
        }

        /**
         * Gets the value of the permittingAuthority property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getPermittingAuthority() {
            return permittingAuthority;
        }

        /**
         * Sets the value of the permittingAuthority property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setPermittingAuthority(Object value) {
            this.permittingAuthority = value;
        }

        /**
         * Gets the value of the dataConflictsAndUnreportedData property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getDataConflictsAndUnreportedData() {
            return dataConflictsAndUnreportedData;
        }

        /**
         * Sets the value of the dataConflictsAndUnreportedData property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setDataConflictsAndUnreportedData(Object value) {
            this.dataConflictsAndUnreportedData = value;
        }

        /**
         * Gets the value of the additionalDetails property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getAdditionalDetails() {
            return additionalDetails;
        }

        /**
         * Sets the value of the additionalDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setAdditionalDetails(Object value) {
            this.additionalDetails = value;
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
     *         &lt;group ref="{http://ncei.noaa.gov/oads/a4.1}manipulation_response_ds_fields"/&gt;
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
        "experimentId",
        "experimentDescription",
        "organismCollectionRegions",
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
    public static class PhysiologicalResponseStudy {

        @XmlElement(name = "experiment_id", namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
        protected String experimentId;
        @XmlElement(name = "experiment_description", namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
        protected String experimentDescription;
        @XmlElement(name = "organism_collection_regions", namespace = "http://ncei.noaa.gov/oads/a4.1")
        protected OceanCarbonDataMetadataDocument.PhysiologicalResponseStudy.OrganismCollectionRegions organismCollectionRegions;
        @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
        @XmlSchemaType(name = "string")
        protected ExperimentLocation site;
        @XmlElement(name = "targeted_acidity_or_alkalinity_levels", namespace = "http://ncei.noaa.gov/oads/a4.1")
        protected Object targetedAcidityOrAlkalinityLevels;
        @XmlElement(name = "seawater_source", namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
        @XmlSchemaType(name = "string")
        protected SeawaterSource seawaterSource;
        @XmlElement(name = "seawater_treatment", namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
        protected String seawaterTreatment;
        @XmlElement(name = "manipulation_method", namespace = "http://ncei.noaa.gov/oads/a4.1")
        protected Object manipulationMethod;
        @XmlElement(name = "location_where_the_experiment_was_carried_out", namespace = "http://ncei.noaa.gov/oads/a4.1")
        protected Object locationWhereTheExperimentWasCarriedOut;
        @XmlElement(name = "location_where_biological_subject_was_collected", namespace = "http://ncei.noaa.gov/oads/a4.1")
        protected Object locationWhereBiologicalSubjectWasCollected;
        @XmlElement(name = "treatment_duration", namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
        protected DatetimeDuration treatmentDuration;
        @XmlElement(name = "additional_details", namespace = "http://ncei.noaa.gov/oads/a4.1")
        protected Object additionalDetails;

        /**
         * Gets the value of the experimentId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExperimentId() {
            return experimentId;
        }

        /**
         * Sets the value of the experimentId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExperimentId(String value) {
            this.experimentId = value;
        }

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
         * Gets the value of the organismCollectionRegions property.
         * 
         * @return
         *     possible object is
         *     {@link OceanCarbonDataMetadataDocument.PhysiologicalResponseStudy.OrganismCollectionRegions }
         *     
         */
        public OceanCarbonDataMetadataDocument.PhysiologicalResponseStudy.OrganismCollectionRegions getOrganismCollectionRegions() {
            return organismCollectionRegions;
        }

        /**
         * Sets the value of the organismCollectionRegions property.
         * 
         * @param value
         *     allowed object is
         *     {@link OceanCarbonDataMetadataDocument.PhysiologicalResponseStudy.OrganismCollectionRegions }
         *     
         */
        public void setOrganismCollectionRegions(OceanCarbonDataMetadataDocument.PhysiologicalResponseStudy.OrganismCollectionRegions value) {
            this.organismCollectionRegions = value;
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
         *     {@link Object }
         *     
         */
        public Object getTargetedAcidityOrAlkalinityLevels() {
            return targetedAcidityOrAlkalinityLevels;
        }

        /**
         * Sets the value of the targetedAcidityOrAlkalinityLevels property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setTargetedAcidityOrAlkalinityLevels(Object value) {
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
         *     {@link Object }
         *     
         */
        public Object getManipulationMethod() {
            return manipulationMethod;
        }

        /**
         * Sets the value of the manipulationMethod property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setManipulationMethod(Object value) {
            this.manipulationMethod = value;
        }

        /**
         * Gets the value of the locationWhereTheExperimentWasCarriedOut property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getLocationWhereTheExperimentWasCarriedOut() {
            return locationWhereTheExperimentWasCarriedOut;
        }

        /**
         * Sets the value of the locationWhereTheExperimentWasCarriedOut property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setLocationWhereTheExperimentWasCarriedOut(Object value) {
            this.locationWhereTheExperimentWasCarriedOut = value;
        }

        /**
         * Gets the value of the locationWhereBiologicalSubjectWasCollected property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getLocationWhereBiologicalSubjectWasCollected() {
            return locationWhereBiologicalSubjectWasCollected;
        }

        /**
         * Sets the value of the locationWhereBiologicalSubjectWasCollected property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setLocationWhereBiologicalSubjectWasCollected(Object value) {
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
         *     {@link Object }
         *     
         */
        public Object getAdditionalDetails() {
            return additionalDetails;
        }

        /**
         * Sets the value of the additionalDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setAdditionalDetails(Object value) {
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

            @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
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
     *         &lt;element name="platform" type="{http://ncei.noaa.gov/oads/a4.1}platform" maxOccurs="unbounded"/&gt;
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

        @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
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
     *       &lt;sequence maxOccurs="unbounded"&gt;
     *         &lt;element name="publication"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;choice maxOccurs="unbounded"&gt;
     *                   &lt;element name="DOI" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
     *                   &lt;element name="URL" type="{http://ncei.noaa.gov/oads/a4.1}URI_reference"/&gt;
     *                   &lt;element name="citation" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/choice&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
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

        @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
        protected List<OceanCarbonDataMetadataDocument.Publications.Publication> publication;

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
         * {@link OceanCarbonDataMetadataDocument.Publications.Publication }
         * 
         * 
         */
        public List<OceanCarbonDataMetadataDocument.Publications.Publication> getPublication() {
            if (publication == null) {
                publication = new ArrayList<OceanCarbonDataMetadataDocument.Publications.Publication>();
            }
            return this.publication;
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
         *       &lt;choice maxOccurs="unbounded"&gt;
         *         &lt;element name="DOI" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
         *         &lt;element name="URL" type="{http://ncei.noaa.gov/oads/a4.1}URI_reference"/&gt;
         *         &lt;element name="citation" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "doiOrURLOrCitation"
        })
        public static class Publication {

            @XmlElementRefs({
                @XmlElementRef(name = "DOI", namespace = "http://ncei.noaa.gov/oads/a4.1", type = JAXBElement.class, required = false),
                @XmlElementRef(name = "URL", namespace = "http://ncei.noaa.gov/oads/a4.1", type = JAXBElement.class, required = false),
                @XmlElementRef(name = "citation", namespace = "http://ncei.noaa.gov/oads/a4.1", type = JAXBElement.class, required = false)
            })
            protected List<JAXBElement<?>> doiOrURLOrCitation;

            /**
             * Gets the value of the doiOrURLOrCitation property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the doiOrURLOrCitation property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDOIOrURLOrCitation().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link JAXBElement }{@code <}{@link String }{@code >}
             * {@link JAXBElement }{@code <}{@link URIReference }{@code >}
             * {@link JAXBElement }{@code <}{@link String }{@code >}
             * 
             * 
             */
            public List<JAXBElement<?>> getDOIOrURLOrCitation() {
                if (doiOrURLOrCitation == null) {
                    doiOrURLOrCitation = new ArrayList<JAXBElement<?>>();
                }
                return this.doiOrURLOrCitation;
            }

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
     *         &lt;element name="dataset" type="{http://ncei.noaa.gov/oads/a4.1}related_dataset" maxOccurs="unbounded"/&gt;
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

        @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
        protected List<RelatedDataset> dataset;

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
         * {@link RelatedDataset }
         * 
         * 
         */
        public List<RelatedDataset> getDataset() {
            if (dataset == null) {
                dataset = new ArrayList<RelatedDataset>();
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
     *         &lt;element name="researcher" type="{http://ncei.noaa.gov/oads/a4.1}person_with_role" maxOccurs="unbounded"/&gt;
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

        @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
        protected List<PersonWithRole> researcher;

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
         * {@link PersonWithRole }
         * 
         * 
         */
        public List<PersonWithRole> getResearcher() {
            if (researcher == null) {
                researcher = new ArrayList<PersonWithRole>();
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
     *         &lt;element name="project" type="{http://ncei.noaa.gov/oads/a4.1}research_project" maxOccurs="unbounded"/&gt;
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

        @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
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
     *         &lt;element name="sea" type="{http://ncei.noaa.gov/oads/a4.1}URI_reference" maxOccurs="unbounded"/&gt;
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
        "sea"
    })
    public static class SeaNames {

        @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
        protected List<URIReference> sea;

        /**
         * Gets the value of the sea property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the sea property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSea().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link URIReference }
         * 
         * 
         */
        public List<URIReference> getSea() {
            if (sea == null) {
                sea = new ArrayList<URIReference>();
            }
            return this.sea;
        }

    }

}
