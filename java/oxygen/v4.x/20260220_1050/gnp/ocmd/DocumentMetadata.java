
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 *  Metadata about *this* metadata document. 
 * 
 * <p>Java class for document_metadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="document_metadata"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="document_date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="document_source" type="{https://ncei.noaa.gov/ocads/v4.6}organization_ref"/&gt;
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "document_metadata", namespace = "https://ncei.noaa.gov/ocads/v4.6", propOrder = {
    "documentDate",
    "documentSource",
    "comment"
})
public class DocumentMetadata {

    @XmlElement(name = "document_date", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar documentDate;
    @XmlElement(name = "document_source", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected OrganizationRef documentSource;
    @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected String comment;

    /**
     * Gets the value of the documentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocumentDate() {
        return documentDate;
    }

    /**
     * Sets the value of the documentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocumentDate(XMLGregorianCalendar value) {
        this.documentDate = value;
    }

    /**
     * Gets the value of the documentSource property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationRef }
     *     
     */
    public OrganizationRef getDocumentSource() {
        return documentSource;
    }

    /**
     * Sets the value of the documentSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationRef }
     *     
     */
    public void setDocumentSource(OrganizationRef value) {
        this.documentSource = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

}
