
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for funding_source complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="funding_source"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="funding_agency"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="country" type="{https://ncei.noaa.gov/ocads/v4.6}vocabulary_item_reference"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="project_title" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="project_identifier" type="{http://www.w3.org/2001/XMLSchema}ID"/&gt;
 *         &lt;element name="project_duration" type="{https://ncei.noaa.gov/ocads/v4.6}temporal_extents" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "funding_source", namespace = "https://ncei.noaa.gov/ocads/v4.6", propOrder = {
    "fundingAgency",
    "projectTitle",
    "projectIdentifier",
    "projectDuration"
})
public class FundingSource {

    @XmlElement(name = "funding_agency", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected FundingSource.FundingAgency fundingAgency;
    @XmlElement(name = "project_title", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected String projectTitle;
    @XmlElement(name = "project_identifier", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String projectIdentifier;
    @XmlElement(name = "project_duration", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected TemporalExtents projectDuration;

    /**
     * Gets the value of the fundingAgency property.
     * 
     * @return
     *     possible object is
     *     {@link FundingSource.FundingAgency }
     *     
     */
    public FundingSource.FundingAgency getFundingAgency() {
        return fundingAgency;
    }

    /**
     * Sets the value of the fundingAgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundingSource.FundingAgency }
     *     
     */
    public void setFundingAgency(FundingSource.FundingAgency value) {
        this.fundingAgency = value;
    }

    /**
     * Gets the value of the projectTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectTitle() {
        return projectTitle;
    }

    /**
     * Sets the value of the projectTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectTitle(String value) {
        this.projectTitle = value;
    }

    /**
     * Gets the value of the projectIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectIdentifier() {
        return projectIdentifier;
    }

    /**
     * Sets the value of the projectIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectIdentifier(String value) {
        this.projectIdentifier = value;
    }

    /**
     * Gets the value of the projectDuration property.
     * 
     * @return
     *     possible object is
     *     {@link TemporalExtents }
     *     
     */
    public TemporalExtents getProjectDuration() {
        return projectDuration;
    }

    /**
     * Sets the value of the projectDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemporalExtents }
     *     
     */
    public void setProjectDuration(TemporalExtents value) {
        this.projectDuration = value;
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
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="country" type="{https://ncei.noaa.gov/ocads/v4.6}vocabulary_item_reference"/&gt;
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
        "name",
        "country"
    })
    public static class FundingAgency {

        @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
        protected String name;
        @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
        protected VocabularyItemReference country;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the country property.
         * 
         * @return
         *     possible object is
         *     {@link VocabularyItemReference }
         *     
         */
        public VocabularyItemReference getCountry() {
            return country;
        }

        /**
         * Sets the value of the country property.
         * 
         * @param value
         *     allowed object is
         *     {@link VocabularyItemReference }
         *     
         */
        public void setCountry(VocabularyItemReference value) {
            this.country = value;
        }

    }

}
