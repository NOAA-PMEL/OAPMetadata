
package gnp.ocmd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for person_definition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="person_definition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://ncei.noaa.gov/ocads/v4.6}person"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identifier" type="{https://ncei.noaa.gov/ocads/v4.6}pid_reference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{https://ncei.noaa.gov/ocads/v4.6}person_name"/&gt;
 *         &lt;element name="organization" type="{https://ncei.noaa.gov/ocads/v4.6}organization_ref" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="contact_info" type="{https://ncei.noaa.gov/ocads/v4.6}contact_info" minOccurs="0"/&gt;
 *         &lt;element name="link" type="{https://ncei.noaa.gov/ocads/v4.6}URI_reference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "person_definition", namespace = "https://ncei.noaa.gov/ocads/v4.6", propOrder = {
    "identifier",
    "name",
    "organization",
    "contactInfo",
    "link"
})
public class PersonDefinition
    extends Person
{

    @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected List<PidReference> identifier;
    @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected PersonName name;
    @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected List<OrganizationRef> organization;
    @XmlElement(name = "contact_info", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected ContactInfo contactInfo;
    @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected List<URIReference> link;

    /**
     * Gets the value of the identifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PidReference }
     * 
     * 
     */
    public List<PidReference> getIdentifier() {
        if (identifier == null) {
            identifier = new ArrayList<PidReference>();
        }
        return this.identifier;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link PersonName }
     *     
     */
    public PersonName getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonName }
     *     
     */
    public void setName(PersonName value) {
        this.name = value;
    }

    /**
     * Gets the value of the organization property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organization property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganization().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganizationRef }
     * 
     * 
     */
    public List<OrganizationRef> getOrganization() {
        if (organization == null) {
            organization = new ArrayList<OrganizationRef>();
        }
        return this.organization;
    }

    /**
     * Gets the value of the contactInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInfo }
     *     
     */
    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    /**
     * Sets the value of the contactInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInfo }
     *     
     */
    public void setContactInfo(ContactInfo value) {
        this.contactInfo = value;
    }

    /**
     * Gets the value of the link property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the link property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLink().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link URIReference }
     * 
     * 
     */
    public List<URIReference> getLink() {
        if (link == null) {
            link = new ArrayList<URIReference>();
        }
        return this.link;
    }

}
