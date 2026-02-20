
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for restricted_term_set complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="restricted_term_set"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="term" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="term_set_definition" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "restricted_term_set", namespace = "https://ncei.noaa.gov/ocads/v4.6", propOrder = {
    "term",
    "termSetDefinition",
    "description"
})
public class RestrictedTermSet {

    @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected String term;
    @XmlElement(name = "term_set_definition", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String termSetDefinition;
    @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected String description;

    /**
     * Gets the value of the term property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerm() {
        return term;
    }

    /**
     * Sets the value of the term property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerm(String value) {
        this.term = value;
    }

    /**
     * Gets the value of the termSetDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermSetDefinition() {
        return termSetDefinition;
    }

    /**
     * Sets the value of the termSetDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermSetDefinition(String value) {
        this.termSetDefinition = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
