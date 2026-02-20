
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for biological_variable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="biological_variable"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://ncei.noaa.gov/ocads/v4.6}basic_variable"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="biological_var_fields" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "biological_variable", namespace = "https://ncei.noaa.gov/ocads/v4.6", propOrder = {
    "biologicalVarFields"
})
public class BiologicalVariable
    extends BasicVariable
{

    @XmlElement(name = "biological_var_fields", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected String biologicalVarFields;

    /**
     * Gets the value of the biologicalVarFields property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBiologicalVarFields() {
        return biologicalVarFields;
    }

    /**
     * Sets the value of the biologicalVarFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBiologicalVarFields(String value) {
        this.biologicalVarFields = value;
    }

}
