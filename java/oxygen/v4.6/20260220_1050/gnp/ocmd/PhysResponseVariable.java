
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for phys_response_variable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="phys_response_variable"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://ncei.noaa.gov/ocads/v4.6}basic_variable"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="phys_response_var_fields" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "phys_response_variable", namespace = "https://ncei.noaa.gov/ocads/v4.6", propOrder = {
    "physResponseVarFields"
})
public class PhysResponseVariable
    extends BasicVariable
{

    @XmlElement(name = "phys_response_var_fields", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected String physResponseVarFields;

    /**
     * Gets the value of the physResponseVarFields property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhysResponseVarFields() {
        return physResponseVarFields;
    }

    /**
     * Sets the value of the physResponseVarFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhysResponseVarFields(String value) {
        this.physResponseVarFields = value;
    }

}
