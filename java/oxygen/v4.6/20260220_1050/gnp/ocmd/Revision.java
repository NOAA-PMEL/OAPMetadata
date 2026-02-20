
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for revision complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="revision"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://ncei.noaa.gov/ocads/v4.6}submission_info"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="revision_description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "revision", namespace = "https://ncei.noaa.gov/ocads/v4.6", propOrder = {
    "revisionDescription"
})
public class Revision
    extends SubmissionInfo
{

    @XmlElement(name = "revision_description", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected String revisionDescription;

    /**
     * Gets the value of the revisionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevisionDescription() {
        return revisionDescription;
    }

    /**
     * Sets the value of the revisionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevisionDescription(String value) {
        this.revisionDescription = value;
    }

}
