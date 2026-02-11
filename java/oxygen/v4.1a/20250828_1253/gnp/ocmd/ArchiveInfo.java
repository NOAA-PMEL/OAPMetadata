
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
 * <p>Java class for archive_info complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="archive_info"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="data_center" type="{http://ncei.noaa.gov/oads/a4.1}organization_or_ref"/&gt;
 *         &lt;element name="archival_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dataset_URL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="metadata_URL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="date_published" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="initial_submission" type="{http://ncei.noaa.gov/oads/a4.1}submission_info"/&gt;
 *         &lt;element name="latest_revision" type="{http://ncei.noaa.gov/oads/a4.1}submission_info"/&gt;
 *         &lt;element name="revision_history"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="revision" type="{http://ncei.noaa.gov/oads/a4.1}revision" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="primary" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "archive_info", namespace = "http://ncei.noaa.gov/oads/a4.1", propOrder = {
    "dataCenter",
    "archivalId",
    "datasetURL",
    "metadataURL",
    "datePublished",
    "initialSubmission",
    "latestRevision",
    "revisionHistory"
})
public class ArchiveInfo {

    @XmlElement(name = "data_center", namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
    protected OrganizationOrRef dataCenter;
    @XmlElement(name = "archival_id", namespace = "http://ncei.noaa.gov/oads/a4.1")
    protected String archivalId;
    @XmlElement(name = "dataset_URL", namespace = "http://ncei.noaa.gov/oads/a4.1")
    @XmlSchemaType(name = "anyURI")
    protected String datasetURL;
    @XmlElement(name = "metadata_URL", namespace = "http://ncei.noaa.gov/oads/a4.1")
    @XmlSchemaType(name = "anyURI")
    protected String metadataURL;
    @XmlElement(name = "date_published", namespace = "http://ncei.noaa.gov/oads/a4.1")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datePublished;
    @XmlElement(name = "initial_submission", namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
    protected SubmissionInfo initialSubmission;
    @XmlElement(name = "latest_revision", namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
    protected SubmissionInfo latestRevision;
    @XmlElement(name = "revision_history", namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
    protected ArchiveInfo.RevisionHistory revisionHistory;
    @XmlAttribute(name = "primary")
    protected Boolean primary;

    /**
     * Gets the value of the dataCenter property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationOrRef }
     *     
     */
    public OrganizationOrRef getDataCenter() {
        return dataCenter;
    }

    /**
     * Sets the value of the dataCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationOrRef }
     *     
     */
    public void setDataCenter(OrganizationOrRef value) {
        this.dataCenter = value;
    }

    /**
     * Gets the value of the archivalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArchivalId() {
        return archivalId;
    }

    /**
     * Sets the value of the archivalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArchivalId(String value) {
        this.archivalId = value;
    }

    /**
     * Gets the value of the datasetURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatasetURL() {
        return datasetURL;
    }

    /**
     * Sets the value of the datasetURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatasetURL(String value) {
        this.datasetURL = value;
    }

    /**
     * Gets the value of the metadataURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetadataURL() {
        return metadataURL;
    }

    /**
     * Sets the value of the metadataURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetadataURL(String value) {
        this.metadataURL = value;
    }

    /**
     * Gets the value of the datePublished property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatePublished() {
        return datePublished;
    }

    /**
     * Sets the value of the datePublished property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatePublished(XMLGregorianCalendar value) {
        this.datePublished = value;
    }

    /**
     * Gets the value of the initialSubmission property.
     * 
     * @return
     *     possible object is
     *     {@link SubmissionInfo }
     *     
     */
    public SubmissionInfo getInitialSubmission() {
        return initialSubmission;
    }

    /**
     * Sets the value of the initialSubmission property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubmissionInfo }
     *     
     */
    public void setInitialSubmission(SubmissionInfo value) {
        this.initialSubmission = value;
    }

    /**
     * Gets the value of the latestRevision property.
     * 
     * @return
     *     possible object is
     *     {@link SubmissionInfo }
     *     
     */
    public SubmissionInfo getLatestRevision() {
        return latestRevision;
    }

    /**
     * Sets the value of the latestRevision property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubmissionInfo }
     *     
     */
    public void setLatestRevision(SubmissionInfo value) {
        this.latestRevision = value;
    }

    /**
     * Gets the value of the revisionHistory property.
     * 
     * @return
     *     possible object is
     *     {@link ArchiveInfo.RevisionHistory }
     *     
     */
    public ArchiveInfo.RevisionHistory getRevisionHistory() {
        return revisionHistory;
    }

    /**
     * Sets the value of the revisionHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArchiveInfo.RevisionHistory }
     *     
     */
    public void setRevisionHistory(ArchiveInfo.RevisionHistory value) {
        this.revisionHistory = value;
    }

    /**
     * Gets the value of the primary property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrimary() {
        return primary;
    }

    /**
     * Sets the value of the primary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrimary(Boolean value) {
        this.primary = value;
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
     *         &lt;element name="revision" type="{http://ncei.noaa.gov/oads/a4.1}revision" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "revision"
    })
    public static class RevisionHistory {

        @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1")
        protected List<Revision> revision;

        /**
         * Gets the value of the revision property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the revision property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRevision().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Revision }
         * 
         * 
         */
        public List<Revision> getRevision() {
            if (revision == null) {
                revision = new ArrayList<Revision>();
            }
            return this.revision;
        }

    }

}
