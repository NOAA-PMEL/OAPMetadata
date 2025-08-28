
package gnp.ocmd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gnp.ocmd package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Person_QNAME = new QName("http://ncei.noaa.gov/oads/a4.1", "person");
    private final static QName _PersonPid_QNAME = new QName("http://ncei.noaa.gov/oads/a4.1", "person_pid");
    private final static QName _PersonDef_QNAME = new QName("http://ncei.noaa.gov/oads/a4.1", "person_def");
    private final static QName _PersonRole_QNAME = new QName("http://ncei.noaa.gov/oads/a4.1", "person_role");
    private final static QName _ResearcherRole_QNAME = new QName("http://ncei.noaa.gov/oads/a4.1", "researcher_role");
    private final static QName _PersonTest_QNAME = new QName("http://ncei.noaa.gov/oads/a4.1", "person_test");
    private final static QName _Instrument_QNAME = new QName("http://ncei.noaa.gov/oads/a4.1", "instrument");
    private final static QName _DatasetMetadata_QNAME = new QName("http://ncei.noaa.gov/oads/a4.1", "dataset_metadata");
    private final static QName _OceanCarbonDataMetadataDocumentPublicationsPublicationDOI_QNAME = new QName("http://ncei.noaa.gov/oads/a4.1", "DOI");
    private final static QName _OceanCarbonDataMetadataDocumentPublicationsPublicationURL_QNAME = new QName("http://ncei.noaa.gov/oads/a4.1", "URL");
    private final static QName _OceanCarbonDataMetadataDocumentPublicationsPublicationCitation_QNAME = new QName("http://ncei.noaa.gov/oads/a4.1", "citation");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gnp.ocmd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DatasetCitation }
     * 
     */
    public DatasetCitation createDatasetCitation() {
        return new DatasetCitation();
    }

    /**
     * Create an instance of {@link EquilibratorSensor }
     * 
     */
    public EquilibratorSensor createEquilibratorSensor() {
        return new EquilibratorSensor();
    }

    /**
     * Create an instance of {@link QcFlagInfo }
     * 
     */
    public QcFlagInfo createQcFlagInfo() {
        return new QcFlagInfo();
    }

    /**
     * Create an instance of {@link BaseCalibrationInfo }
     * 
     */
    public BaseCalibrationInfo createBaseCalibrationInfo() {
        return new BaseCalibrationInfo();
    }

    /**
     * Create an instance of {@link ArchiveInfo }
     * 
     */
    public ArchiveInfo createArchiveInfo() {
        return new ArchiveInfo();
    }

    /**
     * Create an instance of {@link FundingSource }
     * 
     */
    public FundingSource createFundingSource() {
        return new FundingSource();
    }

    /**
     * Create an instance of {@link Citation }
     * 
     */
    public Citation createCitation() {
        return new Citation();
    }

    /**
     * Create an instance of {@link OceanCarbonDataMetadataDocument }
     * 
     */
    public OceanCarbonDataMetadataDocument createOceanCarbonDataMetadataDocument() {
        return new OceanCarbonDataMetadataDocument();
    }

    /**
     * Create an instance of {@link OceanCarbonDataMetadataDocument.DataProduct }
     * 
     */
    public OceanCarbonDataMetadataDocument.DataProduct createOceanCarbonDataMetadataDocumentDataProduct() {
        return new OceanCarbonDataMetadataDocument.DataProduct();
    }

    /**
     * Create an instance of {@link OceanCarbonDataMetadataDocument.PhysiologicalResponseStudy }
     * 
     */
    public OceanCarbonDataMetadataDocument.PhysiologicalResponseStudy createOceanCarbonDataMetadataDocumentPhysiologicalResponseStudy() {
        return new OceanCarbonDataMetadataDocument.PhysiologicalResponseStudy();
    }

    /**
     * Create an instance of {@link OceanCarbonDataMetadataDocument.ObservationIdentifiers }
     * 
     */
    public OceanCarbonDataMetadataDocument.ObservationIdentifiers createOceanCarbonDataMetadataDocumentObservationIdentifiers() {
        return new OceanCarbonDataMetadataDocument.ObservationIdentifiers();
    }

    /**
     * Create an instance of {@link OceanCarbonDataMetadataDocument.Publications }
     * 
     */
    public OceanCarbonDataMetadataDocument.Publications createOceanCarbonDataMetadataDocumentPublications() {
        return new OceanCarbonDataMetadataDocument.Publications();
    }

    /**
     * Create an instance of {@link PersonPid }
     * 
     */
    public PersonPid createPersonPid() {
        return new PersonPid();
    }

    /**
     * Create an instance of {@link PersonDefinition }
     * 
     */
    public PersonDefinition createPersonDefinition() {
        return new PersonDefinition();
    }

    /**
     * Create an instance of {@link PersonTest }
     * 
     */
    public PersonTest createPersonTest() {
        return new PersonTest();
    }

    /**
     * Create an instance of {@link DecimalValue }
     * 
     */
    public DecimalValue createDecimalValue() {
        return new DecimalValue();
    }

    /**
     * Create an instance of {@link DimensionedQuantity }
     * 
     */
    public DimensionedQuantity createDimensionedQuantity() {
        return new DimensionedQuantity();
    }

    /**
     * Create an instance of {@link MeasuredValue }
     * 
     */
    public MeasuredValue createMeasuredValue() {
        return new MeasuredValue();
    }

    /**
     * Create an instance of {@link AltitudeM }
     * 
     */
    public AltitudeM createAltitudeM() {
        return new AltitudeM();
    }

    /**
     * Create an instance of {@link DepthM }
     * 
     */
    public DepthM createDepthM() {
        return new DepthM();
    }

    /**
     * Create an instance of {@link OrderedStringElement }
     * 
     */
    public OrderedStringElement createOrderedStringElement() {
        return new OrderedStringElement();
    }

    /**
     * Create an instance of {@link TypedElement }
     * 
     */
    public TypedElement createTypedElement() {
        return new TypedElement();
    }

    /**
     * Create an instance of {@link TypedString }
     * 
     */
    public TypedString createTypedString() {
        return new TypedString();
    }

    /**
     * Create an instance of {@link TypedIdentifier }
     * 
     */
    public TypedIdentifier createTypedIdentifier() {
        return new TypedIdentifier();
    }

    /**
     * Create an instance of {@link ValueWithUnit }
     * 
     */
    public ValueWithUnit createValueWithUnit() {
        return new ValueWithUnit();
    }

    /**
     * Create an instance of {@link StandardIdentifier }
     * 
     */
    public StandardIdentifier createStandardIdentifier() {
        return new StandardIdentifier();
    }

    /**
     * Create an instance of {@link OrderedReference }
     * 
     */
    public OrderedReference createOrderedReference() {
        return new OrderedReference();
    }

    /**
     * Create an instance of {@link URIReference }
     * 
     */
    public URIReference createURIReference() {
        return new URIReference();
    }

    /**
     * Create an instance of {@link ReferenceOrDescription }
     * 
     */
    public ReferenceOrDescription createReferenceOrDescription() {
        return new ReferenceOrDescription();
    }

    /**
     * Create an instance of {@link DescribedReference }
     * 
     */
    public DescribedReference createDescribedReference() {
        return new DescribedReference();
    }

    /**
     * Create an instance of {@link DataReference }
     * 
     */
    public DataReference createDataReference() {
        return new DataReference();
    }

    /**
     * Create an instance of {@link Country }
     * 
     */
    public Country createCountry() {
        return new Country();
    }

    /**
     * Create an instance of {@link TemporalExtents }
     * 
     */
    public TemporalExtents createTemporalExtents() {
        return new TemporalExtents();
    }

    /**
     * Create an instance of {@link DatetimeDuration }
     * 
     */
    public DatetimeDuration createDatetimeDuration() {
        return new DatetimeDuration();
    }

    /**
     * Create an instance of {@link SpatialExtents }
     * 
     */
    public SpatialExtents createSpatialExtents() {
        return new SpatialExtents();
    }

    /**
     * Create an instance of {@link SpatialBounds }
     * 
     */
    public SpatialBounds createSpatialBounds() {
        return new SpatialBounds();
    }

    /**
     * Create an instance of {@link SiteLocation }
     * 
     */
    public SiteLocation createSiteLocation() {
        return new SiteLocation();
    }

    /**
     * Create an instance of {@link AltitudeRange }
     * 
     */
    public AltitudeRange createAltitudeRange() {
        return new AltitudeRange();
    }

    /**
     * Create an instance of {@link DepthRange }
     * 
     */
    public DepthRange createDepthRange() {
        return new DepthRange();
    }

    /**
     * Create an instance of {@link ContactInfo }
     * 
     */
    public ContactInfo createContactInfo() {
        return new ContactInfo();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link Organization }
     * 
     */
    public Organization createOrganization() {
        return new Organization();
    }

    /**
     * Create an instance of {@link OrganizationReference }
     * 
     */
    public OrganizationReference createOrganizationReference() {
        return new OrganizationReference();
    }

    /**
     * Create an instance of {@link OrganizationOrRef }
     * 
     */
    public OrganizationOrRef createOrganizationOrRef() {
        return new OrganizationOrRef();
    }

    /**
     * Create an instance of {@link OrganizationCollection }
     * 
     */
    public OrganizationCollection createOrganizationCollection() {
        return new OrganizationCollection();
    }

    /**
     * Create an instance of {@link PidReference }
     * 
     */
    public PidReference createPidReference() {
        return new PidReference();
    }

    /**
     * Create an instance of {@link ElementReference }
     * 
     */
    public ElementReference createElementReference() {
        return new ElementReference();
    }

    /**
     * Create an instance of {@link InstanceReference }
     * 
     */
    public InstanceReference createInstanceReference() {
        return new InstanceReference();
    }

    /**
     * Create an instance of {@link OrcidReference }
     * 
     */
    public OrcidReference createOrcidReference() {
        return new OrcidReference();
    }

    /**
     * Create an instance of {@link ResearcheridReference }
     * 
     */
    public ResearcheridReference createResearcheridReference() {
        return new ResearcheridReference();
    }

    /**
     * Create an instance of {@link OceanExpertReference }
     * 
     */
    public OceanExpertReference createOceanExpertReference() {
        return new OceanExpertReference();
    }

    /**
     * Create an instance of {@link PersonPIDReference }
     * 
     */
    public PersonPIDReference createPersonPIDReference() {
        return new PersonPIDReference();
    }

    /**
     * Create an instance of {@link PersonRef }
     * 
     */
    public PersonRef createPersonRef() {
        return new PersonRef();
    }

    /**
     * Create an instance of {@link PersonName }
     * 
     */
    public PersonName createPersonName() {
        return new PersonName();
    }

    /**
     * Create an instance of {@link PersonReference }
     * 
     */
    public PersonReference createPersonReference() {
        return new PersonReference();
    }

    /**
     * Create an instance of {@link PersonWithRole }
     * 
     */
    public PersonWithRole createPersonWithRole() {
        return new PersonWithRole();
    }

    /**
     * Create an instance of {@link ResearcherWithRole }
     * 
     */
    public ResearcherWithRole createResearcherWithRole() {
        return new ResearcherWithRole();
    }

    /**
     * Create an instance of {@link PersonCollection }
     * 
     */
    public PersonCollection createPersonCollection() {
        return new PersonCollection();
    }

    /**
     * Create an instance of {@link ArchivalInfo }
     * 
     */
    public ArchivalInfo createArchivalInfo() {
        return new ArchivalInfo();
    }

    /**
     * Create an instance of {@link SubmissionInfo }
     * 
     */
    public SubmissionInfo createSubmissionInfo() {
        return new SubmissionInfo();
    }

    /**
     * Create an instance of {@link Revision }
     * 
     */
    public Revision createRevision() {
        return new Revision();
    }

    /**
     * Create an instance of {@link BaseInstrument }
     * 
     */
    public BaseInstrument createBaseInstrument() {
        return new BaseInstrument();
    }

    /**
     * Create an instance of {@link InstrumentCollection }
     * 
     */
    public InstrumentCollection createInstrumentCollection() {
        return new InstrumentCollection();
    }

    /**
     * Create an instance of {@link CrmCalibration }
     * 
     */
    public CrmCalibration createCrmCalibration() {
        return new CrmCalibration();
    }

    /**
     * Create an instance of {@link CalibrationEvent }
     * 
     */
    public CalibrationEvent createCalibrationEvent() {
        return new CalibrationEvent();
    }

    /**
     * Create an instance of {@link VariableUncertainty }
     * 
     */
    public VariableUncertainty createVariableUncertainty() {
        return new VariableUncertainty();
    }

    /**
     * Create an instance of {@link BaseVariable }
     * 
     */
    public BaseVariable createBaseVariable() {
        return new BaseVariable();
    }

    /**
     * Create an instance of {@link MeasuredVariable }
     * 
     */
    public MeasuredVariable createMeasuredVariable() {
        return new MeasuredVariable();
    }

    /**
     * Create an instance of {@link DicVariable }
     * 
     */
    public DicVariable createDicVariable() {
        return new DicVariable();
    }

    /**
     * Create an instance of {@link TaVariable }
     * 
     */
    public TaVariable createTaVariable() {
        return new TaVariable();
    }

    /**
     * Create an instance of {@link PhVariable }
     * 
     */
    public PhVariable createPhVariable() {
        return new PhVariable();
    }

    /**
     * Create an instance of {@link Co2Base }
     * 
     */
    public Co2Base createCo2Base() {
        return new Co2Base();
    }

    /**
     * Create an instance of {@link Co2Autonomous }
     * 
     */
    public Co2Autonomous createCo2Autonomous() {
        return new Co2Autonomous();
    }

    /**
     * Create an instance of {@link Co2Discrete }
     * 
     */
    public Co2Discrete createCo2Discrete() {
        return new Co2Discrete();
    }

    /**
     * Create an instance of {@link BiologicalVariable }
     * 
     */
    public BiologicalVariable createBiologicalVariable() {
        return new BiologicalVariable();
    }

    /**
     * Create an instance of {@link Equilibrator }
     * 
     */
    public Equilibrator createEquilibrator() {
        return new Equilibrator();
    }

    /**
     * Create an instance of {@link GasDetector }
     * 
     */
    public GasDetector createGasDetector() {
        return new GasDetector();
    }

    /**
     * Create an instance of {@link Standardization }
     * 
     */
    public Standardization createStandardization() {
        return new Standardization();
    }

    /**
     * Create an instance of {@link Crm }
     * 
     */
    public Crm createCrm() {
        return new Crm();
    }

    /**
     * Create an instance of {@link StandardGas }
     * 
     */
    public StandardGas createStandardGas() {
        return new StandardGas();
    }

    /**
     * Create an instance of {@link Poison }
     * 
     */
    public Poison createPoison() {
        return new Poison();
    }

    /**
     * Create an instance of {@link CalculationMethod }
     * 
     */
    public CalculationMethod createCalculationMethod() {
        return new CalculationMethod();
    }

    /**
     * Create an instance of {@link CalculationParameter }
     * 
     */
    public CalculationParameter createCalculationParameter() {
        return new CalculationParameter();
    }

    /**
     * Create an instance of {@link VariableCollection }
     * 
     */
    public VariableCollection createVariableCollection() {
        return new VariableCollection();
    }

    /**
     * Create an instance of {@link SpatioTemporalExtents }
     * 
     */
    public SpatioTemporalExtents createSpatioTemporalExtents() {
        return new SpatioTemporalExtents();
    }

    /**
     * Create an instance of {@link Platform }
     * 
     */
    public Platform createPlatform() {
        return new Platform();
    }

    /**
     * Create an instance of {@link ResearchProject }
     * 
     */
    public ResearchProject createResearchProject() {
        return new ResearchProject();
    }

    /**
     * Create an instance of {@link RelatedDataset }
     * 
     */
    public RelatedDataset createRelatedDataset() {
        return new RelatedDataset();
    }

    /**
     * Create an instance of {@link SynthesisProduct }
     * 
     */
    public SynthesisProduct createSynthesisProduct() {
        return new SynthesisProduct();
    }

    /**
     * Create an instance of {@link CalculatedProduct }
     * 
     */
    public CalculatedProduct createCalculatedProduct() {
        return new CalculatedProduct();
    }

    /**
     * Create an instance of {@link DocumentMetadata }
     * 
     */
    public DocumentMetadata createDocumentMetadata() {
        return new DocumentMetadata();
    }

    /**
     * Create an instance of {@link DatasetCitation.Authors }
     * 
     */
    public DatasetCitation.Authors createDatasetCitationAuthors() {
        return new DatasetCitation.Authors();
    }

    /**
     * Create an instance of {@link EquilibratorSensor.Sensor }
     * 
     */
    public EquilibratorSensor.Sensor createEquilibratorSensorSensor() {
        return new EquilibratorSensor.Sensor();
    }

    /**
     * Create an instance of {@link QcFlagInfo.FlaggingScheme }
     * 
     */
    public QcFlagInfo.FlaggingScheme createQcFlagInfoFlaggingScheme() {
        return new QcFlagInfo.FlaggingScheme();
    }

    /**
     * Create an instance of {@link BaseCalibrationInfo.CalibrationHistory }
     * 
     */
    public BaseCalibrationInfo.CalibrationHistory createBaseCalibrationInfoCalibrationHistory() {
        return new BaseCalibrationInfo.CalibrationHistory();
    }

    /**
     * Create an instance of {@link ArchiveInfo.RevisionHistory }
     * 
     */
    public ArchiveInfo.RevisionHistory createArchiveInfoRevisionHistory() {
        return new ArchiveInfo.RevisionHistory();
    }

    /**
     * Create an instance of {@link FundingSource.Agency }
     * 
     */
    public FundingSource.Agency createFundingSourceAgency() {
        return new FundingSource.Agency();
    }

    /**
     * Create an instance of {@link Citation.Authors }
     * 
     */
    public Citation.Authors createCitationAuthors() {
        return new Citation.Authors();
    }

    /**
     * Create an instance of {@link OceanCarbonDataMetadataDocument.DatasetContact }
     * 
     */
    public OceanCarbonDataMetadataDocument.DatasetContact createOceanCarbonDataMetadataDocumentDatasetContact() {
        return new OceanCarbonDataMetadataDocument.DatasetContact();
    }

    /**
     * Create an instance of {@link OceanCarbonDataMetadataDocument.Researchers }
     * 
     */
    public OceanCarbonDataMetadataDocument.Researchers createOceanCarbonDataMetadataDocumentResearchers() {
        return new OceanCarbonDataMetadataDocument.Researchers();
    }

    /**
     * Create an instance of {@link OceanCarbonDataMetadataDocument.CitedAuthors }
     * 
     */
    public OceanCarbonDataMetadataDocument.CitedAuthors createOceanCarbonDataMetadataDocumentCitedAuthors() {
        return new OceanCarbonDataMetadataDocument.CitedAuthors();
    }

    /**
     * Create an instance of {@link OceanCarbonDataMetadataDocument.SeaNames }
     * 
     */
    public OceanCarbonDataMetadataDocument.SeaNames createOceanCarbonDataMetadataDocumentSeaNames() {
        return new OceanCarbonDataMetadataDocument.SeaNames();
    }

    /**
     * Create an instance of {@link OceanCarbonDataMetadataDocument.Funding }
     * 
     */
    public OceanCarbonDataMetadataDocument.Funding createOceanCarbonDataMetadataDocumentFunding() {
        return new OceanCarbonDataMetadataDocument.Funding();
    }

    /**
     * Create an instance of {@link OceanCarbonDataMetadataDocument.ResearchProjects }
     * 
     */
    public OceanCarbonDataMetadataDocument.ResearchProjects createOceanCarbonDataMetadataDocumentResearchProjects() {
        return new OceanCarbonDataMetadataDocument.ResearchProjects();
    }

    /**
     * Create an instance of {@link OceanCarbonDataMetadataDocument.RelatedDatasets }
     * 
     */
    public OceanCarbonDataMetadataDocument.RelatedDatasets createOceanCarbonDataMetadataDocumentRelatedDatasets() {
        return new OceanCarbonDataMetadataDocument.RelatedDatasets();
    }

    /**
     * Create an instance of {@link OceanCarbonDataMetadataDocument.Platforms }
     * 
     */
    public OceanCarbonDataMetadataDocument.Platforms createOceanCarbonDataMetadataDocumentPlatforms() {
        return new OceanCarbonDataMetadataDocument.Platforms();
    }

    /**
     * Create an instance of {@link OceanCarbonDataMetadataDocument.OceanAlcalinityEnhancementStudy }
     * 
     */
    public OceanCarbonDataMetadataDocument.OceanAlcalinityEnhancementStudy createOceanCarbonDataMetadataDocumentOceanAlcalinityEnhancementStudy() {
        return new OceanCarbonDataMetadataDocument.OceanAlcalinityEnhancementStudy();
    }

    /**
     * Create an instance of {@link OceanCarbonDataMetadataDocument.ModelOutput }
     * 
     */
    public OceanCarbonDataMetadataDocument.ModelOutput createOceanCarbonDataMetadataDocumentModelOutput() {
        return new OceanCarbonDataMetadataDocument.ModelOutput();
    }

    /**
     * Create an instance of {@link OceanCarbonDataMetadataDocument.DataProduct.DataSources }
     * 
     */
    public OceanCarbonDataMetadataDocument.DataProduct.DataSources createOceanCarbonDataMetadataDocumentDataProductDataSources() {
        return new OceanCarbonDataMetadataDocument.DataProduct.DataSources();
    }

    /**
     * Create an instance of {@link OceanCarbonDataMetadataDocument.PhysiologicalResponseStudy.OrganismCollectionRegions }
     * 
     */
    public OceanCarbonDataMetadataDocument.PhysiologicalResponseStudy.OrganismCollectionRegions createOceanCarbonDataMetadataDocumentPhysiologicalResponseStudyOrganismCollectionRegions() {
        return new OceanCarbonDataMetadataDocument.PhysiologicalResponseStudy.OrganismCollectionRegions();
    }

    /**
     * Create an instance of {@link OceanCarbonDataMetadataDocument.ObservationIdentifiers.Expocodes }
     * 
     */
    public OceanCarbonDataMetadataDocument.ObservationIdentifiers.Expocodes createOceanCarbonDataMetadataDocumentObservationIdentifiersExpocodes() {
        return new OceanCarbonDataMetadataDocument.ObservationIdentifiers.Expocodes();
    }

    /**
     * Create an instance of {@link OceanCarbonDataMetadataDocument.ObservationIdentifiers.CruiseIds }
     * 
     */
    public OceanCarbonDataMetadataDocument.ObservationIdentifiers.CruiseIds createOceanCarbonDataMetadataDocumentObservationIdentifiersCruiseIds() {
        return new OceanCarbonDataMetadataDocument.ObservationIdentifiers.CruiseIds();
    }

    /**
     * Create an instance of {@link OceanCarbonDataMetadataDocument.ObservationIdentifiers.StationIds }
     * 
     */
    public OceanCarbonDataMetadataDocument.ObservationIdentifiers.StationIds createOceanCarbonDataMetadataDocumentObservationIdentifiersStationIds() {
        return new OceanCarbonDataMetadataDocument.ObservationIdentifiers.StationIds();
    }

    /**
     * Create an instance of {@link OceanCarbonDataMetadataDocument.Publications.Publication }
     * 
     */
    public OceanCarbonDataMetadataDocument.Publications.Publication createOceanCarbonDataMetadataDocumentPublicationsPublication() {
        return new OceanCarbonDataMetadataDocument.Publications.Publication();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Person }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Person }{@code >}
     */
    @XmlElementDecl(namespace = "http://ncei.noaa.gov/oads/a4.1", name = "person")
    public JAXBElement<Person> createPerson(Person value) {
        return new JAXBElement<Person>(_Person_QNAME, Person.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonPid }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PersonPid }{@code >}
     */
    @XmlElementDecl(namespace = "http://ncei.noaa.gov/oads/a4.1", name = "person_pid", substitutionHeadNamespace = "http://ncei.noaa.gov/oads/a4.1", substitutionHeadName = "person")
    public JAXBElement<PersonPid> createPersonPid(PersonPid value) {
        return new JAXBElement<PersonPid>(_PersonPid_QNAME, PersonPid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonDefinition }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PersonDefinition }{@code >}
     */
    @XmlElementDecl(namespace = "http://ncei.noaa.gov/oads/a4.1", name = "person_def", substitutionHeadNamespace = "http://ncei.noaa.gov/oads/a4.1", substitutionHeadName = "person")
    public JAXBElement<PersonDefinition> createPersonDef(PersonDefinition value) {
        return new JAXBElement<PersonDefinition>(_PersonDef_QNAME, PersonDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ncei.noaa.gov/oads/a4.1", name = "person_role")
    public JAXBElement<String> createPersonRole(String value) {
        return new JAXBElement<String>(_PersonRole_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResearcherRoles }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResearcherRoles }{@code >}
     */
    @XmlElementDecl(namespace = "http://ncei.noaa.gov/oads/a4.1", name = "researcher_role", substitutionHeadNamespace = "http://ncei.noaa.gov/oads/a4.1", substitutionHeadName = "person_role")
    public JAXBElement<ResearcherRoles> createResearcherRole(ResearcherRoles value) {
        return new JAXBElement<ResearcherRoles>(_ResearcherRole_QNAME, ResearcherRoles.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonTest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PersonTest }{@code >}
     */
    @XmlElementDecl(namespace = "http://ncei.noaa.gov/oads/a4.1", name = "person_test")
    public JAXBElement<PersonTest> createPersonTest(PersonTest value) {
        return new JAXBElement<PersonTest>(_PersonTest_QNAME, PersonTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Instrument }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Instrument }{@code >}
     */
    @XmlElementDecl(namespace = "http://ncei.noaa.gov/oads/a4.1", name = "instrument")
    public JAXBElement<Instrument> createInstrument(Instrument value) {
        return new JAXBElement<Instrument>(_Instrument_QNAME, Instrument.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OceanCarbonDataMetadataDocument }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OceanCarbonDataMetadataDocument }{@code >}
     */
    @XmlElementDecl(namespace = "http://ncei.noaa.gov/oads/a4.1", name = "dataset_metadata")
    public JAXBElement<OceanCarbonDataMetadataDocument> createDatasetMetadata(OceanCarbonDataMetadataDocument value) {
        return new JAXBElement<OceanCarbonDataMetadataDocument>(_DatasetMetadata_QNAME, OceanCarbonDataMetadataDocument.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ncei.noaa.gov/oads/a4.1", name = "DOI", scope = OceanCarbonDataMetadataDocument.Publications.Publication.class)
    public JAXBElement<String> createOceanCarbonDataMetadataDocumentPublicationsPublicationDOI(String value) {
        return new JAXBElement<String>(_OceanCarbonDataMetadataDocumentPublicationsPublicationDOI_QNAME, String.class, OceanCarbonDataMetadataDocument.Publications.Publication.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link URIReference }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link URIReference }{@code >}
     */
    @XmlElementDecl(namespace = "http://ncei.noaa.gov/oads/a4.1", name = "URL", scope = OceanCarbonDataMetadataDocument.Publications.Publication.class)
    public JAXBElement<URIReference> createOceanCarbonDataMetadataDocumentPublicationsPublicationURL(URIReference value) {
        return new JAXBElement<URIReference>(_OceanCarbonDataMetadataDocumentPublicationsPublicationURL_QNAME, URIReference.class, OceanCarbonDataMetadataDocument.Publications.Publication.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ncei.noaa.gov/oads/a4.1", name = "citation", scope = OceanCarbonDataMetadataDocument.Publications.Publication.class)
    public JAXBElement<String> createOceanCarbonDataMetadataDocumentPublicationsPublicationCitation(String value) {
        return new JAXBElement<String>(_OceanCarbonDataMetadataDocumentPublicationsPublicationCitation_QNAME, String.class, OceanCarbonDataMetadataDocument.Publications.Publication.class, value);
    }

}
