
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for research_project complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="research_project"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="organization" type="{https://ncei.noaa.gov/ocads/v4.6}organization_ref"/&gt;
 *         &lt;element name="desription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "research_project", namespace = "https://ncei.noaa.gov/ocads/v4.6", propOrder = {
    "title",
    "organization",
    "desription",
    "url"
})
public class ResearchProject {

    @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected String title;
    @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected OrganizationRef organization;
    @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected String desription;
    @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6")
    @XmlSchemaType(name = "anyURI")
    protected String url;

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the organization property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationRef }
     *     
     */
    public OrganizationRef getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationRef }
     *     
     */
    public void setOrganization(OrganizationRef value) {
        this.organization = value;
    }

    /**
     * Gets the value of the desription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesription() {
        return desription;
    }

    /**
     * Sets the value of the desription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesription(String value) {
        this.desription = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

}
