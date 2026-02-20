
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reference_or_description complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reference_or_description"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="reference" type="{https://ncei.noaa.gov/ocads/v4.6}general_reference"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reference_or_description", namespace = "https://ncei.noaa.gov/ocads/v4.6", propOrder = {
    "reference",
    "description"
})
public class ReferenceOrDescription {

    @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected GeneralReference reference;
    @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected String description;

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralReference }
     *     
     */
    public GeneralReference getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralReference }
     *     
     */
    public void setReference(GeneralReference value) {
        this.reference = value;
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
