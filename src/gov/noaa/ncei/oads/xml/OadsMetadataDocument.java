/**
 * 
 */
package gov.noaa.ncei.oads.xml;

import java.util.Date;
import java.util.List;

import gov.noaa.ncei.oads.xml.v_a0_2_2s.BaseVariableType;
import gov.noaa.ncei.oads.xml.v_a0_2_2s.FundingSourceType;
import gov.noaa.ncei.oads.xml.v_a0_2_2s.PersonType;
import gov.noaa.ncei.oads.xml.v_a0_2_2s.PlatformType;
import gov.noaa.ncei.oads.xml.v_a0_2_2s.RelatedDatasetsType;
import gov.noaa.ncei.oads.xml.v_a0_2_2s.SpatialExtentsType;
import gov.noaa.ncei.oads.xml.v_a0_2_2s.TemporalExtentsType;

/**
 * @author kamb
 *
 */
public interface OadsMetadataDocument {

    /**
     * Gets the value of the submissionDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Date getSubmissionDate();

    /**
     * Sets the value of the submissionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setSubmissionDate(Date value);

    boolean isSetSubmissionDate();

    boolean isSetRelatedDataSets();

    boolean isSetInvestigators();

    /**
     * Gets the value of the dataSubmitter property.
     * 
     * @return
     *     possible object is
     *     {@link PersonType }
     *     
     */
    PersonType getDataSubmitter();

    /**
     * Sets the value of the dataSubmitter property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonType }
     *     
     */
    void setDataSubmitter(PersonType value);

    boolean isSetDataSubmitter();

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getTitle();

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setTitle(String value);

    boolean isSetTitle();

    /**
     * Gets the value of the abstract property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getAbstract();

    /**
     * Sets the value of the abstract property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setAbstract(String value);

    boolean isSetAbstract();

    /**
     * Gets the value of the useLimitation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getUseLimitation();

    /**
     * Sets the value of the useLimitation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setUseLimitation(String value);

    boolean isSetUseLimitation();

    /**
     * Gets the value of the dataUse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getDataUse();

    /**
     * Sets the value of the dataUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setDataUse(String value);

    boolean isSetDataUse();

    /**
     * Gets the value of the purpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getPurpose();

    /**
     * Sets the value of the purpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setPurpose(String value);

    boolean isSetPurpose();

    /**
     * Gets the value of the temporalExtents property.
     * 
     * @return
     *     possible object is
     *     {@link TemporalExtentsType }
     *     
     */
    TemporalExtentsType getTemporalExtents();

    /**
     * Sets the value of the temporalExtents property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemporalExtentsType }
     *     
     */
    void setTemporalExtents(TemporalExtentsType value);

    boolean isSetTemporalExtents();

    /**
     * Gets the value of the spatialExtents property.
     * 
     * @return
     *     possible object is
     *     {@link SpatialExtentsType }
     *     
     */
    SpatialExtentsType getSpatialExtents();

    /**
     * Sets the value of the spatialExtents property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpatialExtentsType }
     *     
     */
    void setSpatialExtents(SpatialExtentsType value);

    boolean isSetSpatialExtents();

    /**
     * Gets the value of the spatialReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getSpatialReference();

    /**
     * Sets the value of the spatialReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setSpatialReference(String value);

    boolean isSetSpatialReference();

    boolean isSetSampleCollectionRegions();

    boolean isSetOrganismCollectionRegions();

    boolean isSetFundingInfo();

    boolean isSetResearchProjects();

    boolean isSetPlatforms();

    boolean isSetExpocodes();

    boolean isSetCruiseIds();

    boolean isSetSections();

    boolean isSetAuthors();

    /**
     * Gets the value of the citation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getCitation();

    /**
     * Sets the value of the citation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setCitation(String value);

    boolean isSetCitation();

    boolean isSetReferences();

    /**
     * Gets the value of the supplementalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getSupplementalInfo();

    /**
     * Sets the value of the supplementalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setSupplementalInfo(String value);

    boolean isSetSupplementalInfo();

    boolean isSetKeywords();

    boolean isSetVariables();

    /**
     * Gets the value of the update property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Date getUpdate();

    /**
     * Sets the value of the update property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setUpdate(Date value);

    boolean isSetUpdate();

    List<RelatedDatasetsType> getRelatedDataSets();

    void setRelatedDataSets(List<RelatedDatasetsType> relatedDataSets);

    List<PersonType> getInvestigators();

    void setInvestigators(List<PersonType> investigators);

    List<String> getSampleCollectionRegions();

    void setSampleCollectionRegions(List<String> sampleCollectionRegions);

    List<String> getOrganismCollectionRegions();

    void setOrganismCollectionRegions(List<String> organismCollectionRegions);

    List<FundingSourceType> getFundingInfo();

    void setFundingInfo(List<FundingSourceType> fundingInfo);

    List<String> getResearchProjects();

    void setResearchProjects(List<String> researchProjects);

    List<PlatformType> getPlatforms();

    void setPlatforms(List<PlatformType> platforms);

    List<String> getExpocodes();

    void setExpocodes(List<String> expocodes);

    List<String> getCruiseIds();

    void setCruiseIds(List<String> cruiseIds);

    List<String> getSections();

    void setSections(List<String> sections);

    List<String> getAuthors();

    void setAuthors(List<String> authors);

    List<String> getReferences();

    void setReferences(List<String> references);

    List<String> getKeywords();

    void setKeywords(List<String> keywords);

    List<BaseVariableType> getVariables();

    void setVariables(List<BaseVariableType> variables);

    void clearEmptyCollections();

}