
package gnp.ocmd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="data_center" type="{https://ncei.noaa.gov/ocads/v4.6}organization_ref"/&gt;
 *         &lt;element name="archival_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dataset_URL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="metadata_URL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="revision_history"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="revision" type="{https://ncei.noaa.gov/ocads/v4.6}revision" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "archive_info", namespace = "https://ncei.noaa.gov/ocads/v4.6", propOrder = {
    "dataCenter",
    "archivalId",
    "datasetURL",
    "metadataURL",
    "revisionHistory"
})
public class ArchiveInfo {

    @XmlElement(name = "data_center", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected OrganizationRef dataCenter;
    @XmlElement(name = "archival_id", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected String archivalId;
    @XmlElement(name = "dataset_URL", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    @XmlSchemaType(name = "anyURI")
    protected String datasetURL;
    @XmlElement(name = "metadata_URL", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    @XmlSchemaType(name = "anyURI")
    protected String metadataURL;
    @XmlElement(name = "revision_history", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected ArchiveInfo.RevisionHistory revisionHistory;
    @XmlAttribute(name = "primary")
    protected Boolean primary;

    /**
     * Gets the value of the dataCenter property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationRef }
     *     
     */
    public OrganizationRef getDataCenter() {
        return dataCenter;
    }

    /**
     * Sets the value of the dataCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationRef }
     *     
     */
    public void setDataCenter(OrganizationRef value) {
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
     *         &lt;element name="revision" type="{https://ncei.noaa.gov/ocads/v4.6}revision" maxOccurs="unbounded" minOccurs="0"/&gt;
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

        @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6")
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
