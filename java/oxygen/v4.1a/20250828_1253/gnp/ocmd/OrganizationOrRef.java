
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for organization_or_ref complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="organization_or_ref"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="organization" type="{http://ncei.noaa.gov/oads/a4.1}organization"/&gt;
 *         &lt;element name="organization_ref" type="{http://ncei.noaa.gov/oads/a4.1}organization_reference"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "organization_or_ref", namespace = "http://ncei.noaa.gov/oads/a4.1", propOrder = {
    "organization",
    "organizationRef"
})
public class OrganizationOrRef {

    @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1")
    protected Organization organization;
    @XmlElement(name = "organization_ref", namespace = "http://ncei.noaa.gov/oads/a4.1")
    protected OrganizationReference organizationRef;

    /**
     * Gets the value of the organization property.
     * 
     * @return
     *     possible object is
     *     {@link Organization }
     *     
     */
    public Organization getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organization }
     *     
     */
    public void setOrganization(Organization value) {
        this.organization = value;
    }

    /**
     * Gets the value of the organizationRef property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationReference }
     *     
     */
    public OrganizationReference getOrganizationRef() {
        return organizationRef;
    }

    /**
     * Sets the value of the organizationRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationReference }
     *     
     */
    public void setOrganizationRef(OrganizationReference value) {
        this.organizationRef = value;
    }

}
