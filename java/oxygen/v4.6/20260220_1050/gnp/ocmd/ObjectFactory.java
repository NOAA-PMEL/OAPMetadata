
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

    private final static QName _BasicCalibration_QNAME = new QName("https://ncei.noaa.gov/ocads/v4.6", "basic_calibration");
    private final static QName _DatasetMetadata_QNAME = new QName("https://ncei.noaa.gov/ocads/v4.6", "dataset_metadata");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gnp.ocmd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ModelOutput }
     * 
     */
    public ModelOutput createModelOutput() {
        return new ModelOutput();
    }

    /**
     * Create an instance of {@link DataProduct }
     * 
     */
    public DataProduct createDataProduct() {
        return new DataProduct();
    }

    /**
     * Create an instance of {@link PhysiologicalResponseStudy }
     * 
     */
    public PhysiologicalResponseStudy createPhysiologicalResponseStudy() {
        return new PhysiologicalResponseStudy();
    }

    /**
     * Create an instance of {@link Identifiers }
     * 
     */
    public Identifiers createIdentifiers() {
        return new Identifiers();
    }

    /**
     * Create an instance of {@link CalculatedVarInfo }
     * 
     */
    public CalculatedVarInfo createCalculatedVarInfo() {
        return new CalculatedVarInfo();
    }

    /**
     * Create an instance of {@link BasicCalibrationInfo }
     * 
     */
    public BasicCalibrationInfo createBasicCalibrationInfo() {
        return new BasicCalibrationInfo();
    }

    /**
     * Create an instance of {@link Co2Calibration }
     * 
     */
    public Co2Calibration createCo2Calibration() {
        return new Co2Calibration();
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
     * Create an instance of {@link OceanCarbonDataMetadataDocument }
     * 
     */
    public OceanCarbonDataMetadataDocument createOceanCarbonDataMetadataDocument() {
        return new OceanCarbonDataMetadataDocument();
    }

    /**
     * Create an instance of {@link DimensionedQuantity }
     * 
     */
    public DimensionedQuantity createDimensionedQuantity() {
        return new DimensionedQuantity();
    }

    /**
     * Create an instance of {@link PositiveDimensionedQuantity }
     * 
     */
    public PositiveDimensionedQuantity createPositiveDimensionedQuantity() {
        return new PositiveDimensionedQuantity();
    }

    /**
     * Create an instance of {@link MeasuredValue }
     * 
     */
    public MeasuredValue createMeasuredValue() {
        return new MeasuredValue();
    }

    /**
     * Create an instance of {@link PositiveMeasuredValue }
     * 
     */
    public PositiveMeasuredValue createPositiveMeasuredValue() {
        return new PositiveMeasuredValue();
    }

    /**
     * Create an instance of {@link DepthM }
     * 
     */
    public DepthM createDepthM() {
        return new DepthM();
    }

    /**
     * Create an instance of {@link AltitudeM }
     * 
     */
    public AltitudeM createAltitudeM() {
        return new AltitudeM();
    }

    /**
     * Create an instance of {@link FlowRate }
     * 
     */
    public FlowRate createFlowRate() {
        return new FlowRate();
    }

    /**
     * Create an instance of {@link LiterVolume }
     * 
     */
    public LiterVolume createLiterVolume() {
        return new LiterVolume();
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
     * Create an instance of {@link GeneralReference }
     * 
     */
    public GeneralReference createGeneralReference() {
        return new GeneralReference();
    }

    /**
     * Create an instance of {@link RestrictedTermSet }
     * 
     */
    public RestrictedTermSet createRestrictedTermSet() {
        return new RestrictedTermSet();
    }

    /**
     * Create an instance of {@link VocabularyItemReference }
     * 
     */
    public VocabularyItemReference createVocabularyItemReference() {
        return new VocabularyItemReference();
    }

    /**
     * Create an instance of {@link PidReference }
     * 
     */
    public PidReference createPidReference() {
        return new PidReference();
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
     * Create an instance of {@link DataReference }
     * 
     */
    public DataReference createDataReference() {
        return new DataReference();
    }

    /**
     * Create an instance of {@link SoftwareInfo }
     * 
     */
    public SoftwareInfo createSoftwareInfo() {
        return new SoftwareInfo();
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
     * Create an instance of {@link ElementReference }
     * 
     */
    public ElementReference createElementReference() {
        return new ElementReference();
    }

    /**
     * Create an instance of {@link OrderedReference }
     * 
     */
    public OrderedReference createOrderedReference() {
        return new OrderedReference();
    }

    /**
     * Create an instance of {@link InstanceReference }
     * 
     */
    public InstanceReference createInstanceReference() {
        return new InstanceReference();
    }

    /**
     * Create an instance of {@link OrganizationRef }
     * 
     */
    public OrganizationRef createOrganizationRef() {
        return new OrganizationRef();
    }

    /**
     * Create an instance of {@link OrganizationDefinition }
     * 
     */
    public OrganizationDefinition createOrganizationDefinition() {
        return new OrganizationDefinition();
    }

    /**
     * Create an instance of {@link OrganizationPid }
     * 
     */
    public OrganizationPid createOrganizationPid() {
        return new OrganizationPid();
    }

    /**
     * Create an instance of {@link OrganizationCollection }
     * 
     */
    public OrganizationCollection createOrganizationCollection() {
        return new OrganizationCollection();
    }

    /**
     * Create an instance of {@link PersonRef }
     * 
     */
    public PersonRef createPersonRef() {
        return new PersonRef();
    }

    /**
     * Create an instance of {@link OrderedPersonRef }
     * 
     */
    public OrderedPersonRef createOrderedPersonRef() {
        return new OrderedPersonRef();
    }

    /**
     * Create an instance of {@link PersonDefinition }
     * 
     */
    public PersonDefinition createPersonDefinition() {
        return new PersonDefinition();
    }

    /**
     * Create an instance of {@link PersonPid }
     * 
     */
    public PersonPid createPersonPid() {
        return new PersonPid();
    }

    /**
     * Create an instance of {@link PersonName }
     * 
     */
    public PersonName createPersonName() {
        return new PersonName();
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
     * Create an instance of {@link CrmCalibration }
     * 
     */
    public CrmCalibration createCrmCalibration() {
        return new CrmCalibration();
    }

    /**
     * Create an instance of {@link CrmInfo }
     * 
     */
    public CrmInfo createCrmInfo() {
        return new CrmInfo();
    }

    /**
     * Create an instance of {@link PHCalibration }
     * 
     */
    public PHCalibration createPHCalibration() {
        return new PHCalibration();
    }

    /**
     * Create an instance of {@link PhDyeInfo }
     * 
     */
    public PhDyeInfo createPhDyeInfo() {
        return new PhDyeInfo();
    }

    /**
     * Create an instance of {@link StandardGas }
     * 
     */
    public StandardGas createStandardGas() {
        return new StandardGas();
    }

    /**
     * Create an instance of {@link CalibrationEvent }
     * 
     */
    public CalibrationEvent createCalibrationEvent() {
        return new CalibrationEvent();
    }

    /**
     * Create an instance of {@link InstrumentRef }
     * 
     */
    public InstrumentRef createInstrumentRef() {
        return new InstrumentRef();
    }

    /**
     * Create an instance of {@link SimpleInstrument }
     * 
     */
    public SimpleInstrument createSimpleInstrument() {
        return new SimpleInstrument();
    }

    /**
     * Create an instance of {@link StandardInstrument }
     * 
     */
    public StandardInstrument createStandardInstrument() {
        return new StandardInstrument();
    }

    /**
     * Create an instance of {@link Sensor }
     * 
     */
    public Sensor createSensor() {
        return new Sensor();
    }

    /**
     * Create an instance of {@link CrmInstrument }
     * 
     */
    public CrmInstrument createCrmInstrument() {
        return new CrmInstrument();
    }

    /**
     * Create an instance of {@link PHInstrument }
     * 
     */
    public PHInstrument createPHInstrument() {
        return new PHInstrument();
    }

    /**
     * Create an instance of {@link Co2GasDetector }
     * 
     */
    public Co2GasDetector createCo2GasDetector() {
        return new Co2GasDetector();
    }

    /**
     * Create an instance of {@link Equilibrator }
     * 
     */
    public Equilibrator createEquilibrator() {
        return new Equilibrator();
    }

    /**
     * Create an instance of {@link InstrumentCollection }
     * 
     */
    public InstrumentCollection createInstrumentCollection() {
        return new InstrumentCollection();
    }

    /**
     * Create an instance of {@link SamplingInfo }
     * 
     */
    public SamplingInfo createSamplingInfo() {
        return new SamplingInfo();
    }

    /**
     * Create an instance of {@link DiscreteVarSamplingInfo }
     * 
     */
    public DiscreteVarSamplingInfo createDiscreteVarSamplingInfo() {
        return new DiscreteVarSamplingInfo();
    }

    /**
     * Create an instance of {@link ContinuousVarSamplingInfo }
     * 
     */
    public ContinuousVarSamplingInfo createContinuousVarSamplingInfo() {
        return new ContinuousVarSamplingInfo();
    }

    /**
     * Create an instance of {@link GenesisType }
     * 
     */
    public GenesisType createGenesisType() {
        return new GenesisType();
    }

    /**
     * Create an instance of {@link MeasuredVarInfo }
     * 
     */
    public MeasuredVarInfo createMeasuredVarInfo() {
        return new MeasuredVarInfo();
    }

    /**
     * Create an instance of {@link SensorDataConversion }
     * 
     */
    public SensorDataConversion createSensorDataConversion() {
        return new SensorDataConversion();
    }

    /**
     * Create an instance of {@link GriddedVarInfo }
     * 
     */
    public GriddedVarInfo createGriddedVarInfo() {
        return new GriddedVarInfo();
    }

    /**
     * Create an instance of {@link VariableUncertainty }
     * 
     */
    public VariableUncertainty createVariableUncertainty() {
        return new VariableUncertainty();
    }

    /**
     * Create an instance of {@link VariableRef }
     * 
     */
    public VariableRef createVariableRef() {
        return new VariableRef();
    }

    /**
     * Create an instance of {@link BasicVariable }
     * 
     */
    public BasicVariable createBasicVariable() {
        return new BasicVariable();
    }

    /**
     * Create an instance of {@link BasicMeasuredVariable }
     * 
     */
    public BasicMeasuredVariable createBasicMeasuredVariable() {
        return new BasicMeasuredVariable();
    }

    /**
     * Create an instance of {@link BasicCalculatedObservationBase }
     * 
     */
    public BasicCalculatedObservationBase createBasicCalculatedObservationBase() {
        return new BasicCalculatedObservationBase();
    }

    /**
     * Create an instance of {@link BasicCalculatedVariable }
     * 
     */
    public BasicCalculatedVariable createBasicCalculatedVariable() {
        return new BasicCalculatedVariable();
    }

    /**
     * Create an instance of {@link StdObservedVariable }
     * 
     */
    public StdObservedVariable createStdObservedVariable() {
        return new StdObservedVariable();
    }

    /**
     * Create an instance of {@link DICMeasured }
     * 
     */
    public DICMeasured createDICMeasured() {
        return new DICMeasured();
    }

    /**
     * Create an instance of {@link SamplePreservation }
     * 
     */
    public SamplePreservation createSamplePreservation() {
        return new SamplePreservation();
    }

    /**
     * Create an instance of {@link TAMeasured }
     * 
     */
    public TAMeasured createTAMeasured() {
        return new TAMeasured();
    }

    /**
     * Create an instance of {@link PHMeasured }
     * 
     */
    public PHMeasured createPHMeasured() {
        return new PHMeasured();
    }

    /**
     * Create an instance of {@link Co2ContinuousVariable }
     * 
     */
    public Co2ContinuousVariable createCo2ContinuousVariable() {
        return new Co2ContinuousVariable();
    }

    /**
     * Create an instance of {@link Co2DiscreteVariable }
     * 
     */
    public Co2DiscreteVariable createCo2DiscreteVariable() {
        return new Co2DiscreteVariable();
    }

    /**
     * Create an instance of {@link Co2CalculatedVariable }
     * 
     */
    public Co2CalculatedVariable createCo2CalculatedVariable() {
        return new Co2CalculatedVariable();
    }

    /**
     * Create an instance of {@link Co2ReportedVariable }
     * 
     */
    public Co2ReportedVariable createCo2ReportedVariable() {
        return new Co2ReportedVariable();
    }

    /**
     * Create an instance of {@link SensorMeasurement }
     * 
     */
    public SensorMeasurement createSensorMeasurement() {
        return new SensorMeasurement();
    }

    /**
     * Create an instance of {@link AtmCo2 }
     * 
     */
    public AtmCo2 createAtmCo2() {
        return new AtmCo2();
    }

    /**
     * Create an instance of {@link BiologicalVariable }
     * 
     */
    public BiologicalVariable createBiologicalVariable() {
        return new BiologicalVariable();
    }

    /**
     * Create an instance of {@link ModelVariable }
     * 
     */
    public ModelVariable createModelVariable() {
        return new ModelVariable();
    }

    /**
     * Create an instance of {@link PhysResponseVariable }
     * 
     */
    public PhysResponseVariable createPhysResponseVariable() {
        return new PhysResponseVariable();
    }

    /**
     * Create an instance of {@link SedimentVariable }
     * 
     */
    public SedimentVariable createSedimentVariable() {
        return new SedimentVariable();
    }

    /**
     * Create an instance of {@link SocialVariable }
     * 
     */
    public SocialVariable createSocialVariable() {
        return new SocialVariable();
    }

    /**
     * Create an instance of {@link UniformVariableCollection }
     * 
     */
    public UniformVariableCollection createUniformVariableCollection() {
        return new UniformVariableCollection();
    }

    /**
     * Create an instance of {@link VariableList }
     * 
     */
    public VariableList createVariableList() {
        return new VariableList();
    }

    /**
     * Create an instance of {@link FullVariableList }
     * 
     */
    public FullVariableList createFullVariableList() {
        return new FullVariableList();
    }

    /**
     * Create an instance of {@link GenericVariablesCollection }
     * 
     */
    public GenericVariablesCollection createGenericVariablesCollection() {
        return new GenericVariablesCollection();
    }

    /**
     * Create an instance of {@link VariableCollection }
     * 
     */
    public VariableCollection createVariableCollection() {
        return new VariableCollection();
    }

    /**
     * Create an instance of {@link DataCoverageExtents }
     * 
     */
    public DataCoverageExtents createDataCoverageExtents() {
        return new DataCoverageExtents();
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
     * Create an instance of {@link BiologicalSubject }
     * 
     */
    public BiologicalSubject createBiologicalSubject() {
        return new BiologicalSubject();
    }

    /**
     * Create an instance of {@link FieldTrial }
     * 
     */
    public FieldTrial createFieldTrial() {
        return new FieldTrial();
    }

    /**
     * Create an instance of {@link SedimentStudy }
     * 
     */
    public SedimentStudy createSedimentStudy() {
        return new SedimentStudy();
    }

    /**
     * Create an instance of {@link CompilationProduct }
     * 
     */
    public CompilationProduct createCompilationProduct() {
        return new CompilationProduct();
    }

    /**
     * Create an instance of {@link GriddedProduct }
     * 
     */
    public GriddedProduct createGriddedProduct() {
        return new GriddedProduct();
    }

    /**
     * Create an instance of {@link CalculatedProduct }
     * 
     */
    public CalculatedProduct createCalculatedProduct() {
        return new CalculatedProduct();
    }

    /**
     * Create an instance of {@link GridResolution }
     * 
     */
    public GridResolution createGridResolution() {
        return new GridResolution();
    }

    /**
     * Create an instance of {@link DocumentMetadata }
     * 
     */
    public DocumentMetadata createDocumentMetadata() {
        return new DocumentMetadata();
    }

    /**
     * Create an instance of {@link ModelOutput.McdrStudy }
     * 
     */
    public ModelOutput.McdrStudy createModelOutputMcdrStudy() {
        return new ModelOutput.McdrStudy();
    }

    /**
     * Create an instance of {@link ModelOutput.ModelledRegion }
     * 
     */
    public ModelOutput.ModelledRegion createModelOutputModelledRegion() {
        return new ModelOutput.ModelledRegion();
    }

    /**
     * Create an instance of {@link DataProduct.DataSources }
     * 
     */
    public DataProduct.DataSources createDataProductDataSources() {
        return new DataProduct.DataSources();
    }

    /**
     * Create an instance of {@link PhysiologicalResponseStudy.BiologicalSubjects }
     * 
     */
    public PhysiologicalResponseStudy.BiologicalSubjects createPhysiologicalResponseStudyBiologicalSubjects() {
        return new PhysiologicalResponseStudy.BiologicalSubjects();
    }

    /**
     * Create an instance of {@link PhysiologicalResponseStudy.OrganismCollectionRegions }
     * 
     */
    public PhysiologicalResponseStudy.OrganismCollectionRegions createPhysiologicalResponseStudyOrganismCollectionRegions() {
        return new PhysiologicalResponseStudy.OrganismCollectionRegions();
    }

    /**
     * Create an instance of {@link Identifiers.Expocodes }
     * 
     */
    public Identifiers.Expocodes createIdentifiersExpocodes() {
        return new Identifiers.Expocodes();
    }

    /**
     * Create an instance of {@link Identifiers.CruiseIds }
     * 
     */
    public Identifiers.CruiseIds createIdentifiersCruiseIds() {
        return new Identifiers.CruiseIds();
    }

    /**
     * Create an instance of {@link Identifiers.StationIds }
     * 
     */
    public Identifiers.StationIds createIdentifiersStationIds() {
        return new Identifiers.StationIds();
    }

    /**
     * Create an instance of {@link Identifiers.TransectIds }
     * 
     */
    public Identifiers.TransectIds createIdentifiersTransectIds() {
        return new Identifiers.TransectIds();
    }

    /**
     * Create an instance of {@link CalculatedVarInfo.Sources }
     * 
     */
    public CalculatedVarInfo.Sources createCalculatedVarInfoSources() {
        return new CalculatedVarInfo.Sources();
    }

    /**
     * Create an instance of {@link BasicCalibrationInfo.CalibrationHistory }
     * 
     */
    public BasicCalibrationInfo.CalibrationHistory createBasicCalibrationInfoCalibrationHistory() {
        return new BasicCalibrationInfo.CalibrationHistory();
    }

    /**
     * Create an instance of {@link Co2Calibration.StandardGases }
     * 
     */
    public Co2Calibration.StandardGases createCo2CalibrationStandardGases() {
        return new Co2Calibration.StandardGases();
    }

    /**
     * Create an instance of {@link ArchiveInfo.RevisionHistory }
     * 
     */
    public ArchiveInfo.RevisionHistory createArchiveInfoRevisionHistory() {
        return new ArchiveInfo.RevisionHistory();
    }

    /**
     * Create an instance of {@link FundingSource.FundingAgency }
     * 
     */
    public FundingSource.FundingAgency createFundingSourceFundingAgency() {
        return new FundingSource.FundingAgency();
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
     * Create an instance of {@link OceanCarbonDataMetadataDocument.GeographicNames }
     * 
     */
    public OceanCarbonDataMetadataDocument.GeographicNames createOceanCarbonDataMetadataDocumentGeographicNames() {
        return new OceanCarbonDataMetadataDocument.GeographicNames();
    }

    /**
     * Create an instance of {@link OceanCarbonDataMetadataDocument.Sections }
     * 
     */
    public OceanCarbonDataMetadataDocument.Sections createOceanCarbonDataMetadataDocumentSections() {
        return new OceanCarbonDataMetadataDocument.Sections();
    }

    /**
     * Create an instance of {@link OceanCarbonDataMetadataDocument.Platforms }
     * 
     */
    public OceanCarbonDataMetadataDocument.Platforms createOceanCarbonDataMetadataDocumentPlatforms() {
        return new OceanCarbonDataMetadataDocument.Platforms();
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
     * Create an instance of {@link OceanCarbonDataMetadataDocument.Publications }
     * 
     */
    public OceanCarbonDataMetadataDocument.Publications createOceanCarbonDataMetadataDocumentPublications() {
        return new OceanCarbonDataMetadataDocument.Publications();
    }

    /**
     * Create an instance of {@link OceanCarbonDataMetadataDocument.RelatedDatasets }
     * 
     */
    public OceanCarbonDataMetadataDocument.RelatedDatasets createOceanCarbonDataMetadataDocumentRelatedDatasets() {
        return new OceanCarbonDataMetadataDocument.RelatedDatasets();
    }

    /**
     * Create an instance of {@link OceanCarbonDataMetadataDocument.Keywords }
     * 
     */
    public OceanCarbonDataMetadataDocument.Keywords createOceanCarbonDataMetadataDocumentKeywords() {
        return new OceanCarbonDataMetadataDocument.Keywords();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BasicCalibrationInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BasicCalibrationInfo }{@code >}
     */
    @XmlElementDecl(namespace = "https://ncei.noaa.gov/ocads/v4.6", name = "basic_calibration")
    public JAXBElement<BasicCalibrationInfo> createBasicCalibration(BasicCalibrationInfo value) {
        return new JAXBElement<BasicCalibrationInfo>(_BasicCalibration_QNAME, BasicCalibrationInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OceanCarbonDataMetadataDocument }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OceanCarbonDataMetadataDocument }{@code >}
     */
    @XmlElementDecl(namespace = "https://ncei.noaa.gov/ocads/v4.6", name = "dataset_metadata")
    public JAXBElement<OceanCarbonDataMetadataDocument> createDatasetMetadata(OceanCarbonDataMetadataDocument value) {
        return new JAXBElement<OceanCarbonDataMetadataDocument>(_DatasetMetadata_QNAME, OceanCarbonDataMetadataDocument.class, null, value);
    }

}
