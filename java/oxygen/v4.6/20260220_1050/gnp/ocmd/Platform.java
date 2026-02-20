
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for platform complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="platform"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="identifier" type="{https://ncei.noaa.gov/ocads/v4.6}typed_identifier"/&gt;
 *         &lt;element name="type" type="{https://ncei.noaa.gov/ocads/v4.6}platform_type"/&gt;
 *         &lt;element name="owner" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="country_code" type="{https://ncei.noaa.gov/ocads/v4.6}vocabulary_item_reference"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "platform", namespace = "https://ncei.noaa.gov/ocads/v4.6", propOrder = {
    "name",
    "identifier",
    "type",
    "owner",
    "countryCode"
})
public class Platform {

    @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected String name;
    @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected TypedIdentifier identifier;
    @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected String type;
    @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected String owner;
    @XmlElement(name = "country_code", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected VocabularyItemReference countryCode;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link TypedIdentifier }
     *     
     */
    public TypedIdentifier getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypedIdentifier }
     *     
     */
    public void setIdentifier(TypedIdentifier value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwner(String value) {
        this.owner = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link VocabularyItemReference }
     *     
     */
    public VocabularyItemReference getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link VocabularyItemReference }
     *     
     */
    public void setCountryCode(VocabularyItemReference value) {
        this.countryCode = value;
    }

}
