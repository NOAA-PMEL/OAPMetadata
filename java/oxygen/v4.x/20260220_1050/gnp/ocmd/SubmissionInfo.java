
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for submission_info complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="submission_info"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="submitted_by" type="{https://ncei.noaa.gov/ocads/v4.6}person_ref"/&gt;
 *         &lt;element name="submission_date" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "submission_info", namespace = "https://ncei.noaa.gov/ocads/v4.6", propOrder = {
    "submittedBy",
    "submissionDate"
})
@XmlSeeAlso({
    Revision.class
})
public class SubmissionInfo {

    @XmlElement(name = "submitted_by", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected PersonRef submittedBy;
    @XmlElement(name = "submission_date", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar submissionDate;

    /**
     * Gets the value of the submittedBy property.
     * 
     * @return
     *     possible object is
     *     {@link PersonRef }
     *     
     */
    public PersonRef getSubmittedBy() {
        return submittedBy;
    }

    /**
     * Sets the value of the submittedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonRef }
     *     
     */
    public void setSubmittedBy(PersonRef value) {
        this.submittedBy = value;
    }

    /**
     * Gets the value of the submissionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSubmissionDate() {
        return submissionDate;
    }

    /**
     * Sets the value of the submissionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSubmissionDate(XMLGregorianCalendar value) {
        this.submissionDate = value;
    }

}
