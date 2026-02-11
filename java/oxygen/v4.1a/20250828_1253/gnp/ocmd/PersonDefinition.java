
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
 *     &lt;extension base="{http://ncei.noaa.gov/oads/a4.1}person"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://ncei.noaa.gov/oads/a4.1}person_name"/&gt;
 *         &lt;element name="organization" type="{http://ncei.noaa.gov/oads/a4.1}organization_or_ref" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="contact_info" type="{http://ncei.noaa.gov/oads/a4.1}contact_info" minOccurs="0"/&gt;
 *         &lt;element name="identifier" type="{http://ncei.noaa.gov/oads/a4.1}pid_reference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="link" type="{http://ncei.noaa.gov/oads/a4.1}URI_reference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "person_definition", namespace = "http://ncei.noaa.gov/oads/a4.1", propOrder = {
    "name",
    "organization",
    "contactInfo",
    "identifier",
    "link"
})
public class PersonDefinition
    extends Person
{

    @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
    protected PersonName name;
    @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1")
    protected List<OrganizationOrRef> organization;
    @XmlElement(name = "contact_info", namespace = "http://ncei.noaa.gov/oads/a4.1")
    protected ContactInfo contactInfo;
    @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1")
    protected List<PidReference> identifier;
    @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1")
    protected List<URIReference> link;

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
     * {@link OrganizationOrRef }
     * 
     * 
     */
    public List<OrganizationOrRef> getOrganization() {
        if (organization == null) {
            organization = new ArrayList<OrganizationOrRef>();
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
