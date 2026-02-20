
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for social_variable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="social_variable"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://ncei.noaa.gov/ocads/v4.6}basic_variable"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="social_var_fields" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "social_variable", namespace = "https://ncei.noaa.gov/ocads/v4.6", propOrder = {
    "socialVarFields"
})
public class SocialVariable
    extends BasicVariable
{

    @XmlElement(name = "social_var_fields", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected String socialVarFields;

    /**
     * Gets the value of the socialVarFields property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSocialVarFields() {
        return socialVarFields;
    }

    /**
     * Sets the value of the socialVarFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSocialVarFields(String value) {
        this.socialVarFields = value;
    }

}
