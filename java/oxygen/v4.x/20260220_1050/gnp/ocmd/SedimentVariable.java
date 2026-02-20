
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sediment_variable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sediment_variable"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://ncei.noaa.gov/ocads/v4.6}basic_variable"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sediment_var_fields" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sediment_variable", namespace = "https://ncei.noaa.gov/ocads/v4.6", propOrder = {
    "sedimentVarFields"
})
public class SedimentVariable
    extends BasicVariable
{

    @XmlElement(name = "sediment_var_fields", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected String sedimentVarFields;

    /**
     * Gets the value of the sedimentVarFields property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSedimentVarFields() {
        return sedimentVarFields;
    }

    /**
     * Sets the value of the sedimentVarFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSedimentVarFields(String value) {
        this.sedimentVarFields = value;
    }

}
