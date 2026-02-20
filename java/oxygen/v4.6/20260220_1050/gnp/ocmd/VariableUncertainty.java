
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for variable_uncertainty complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="variable_uncertainty"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="value" type="{https://ncei.noaa.gov/ocads/v4.6}dimensioned_quantity"/&gt;
 *         &lt;element name="uncertainty_description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "variable_uncertainty", namespace = "https://ncei.noaa.gov/ocads/v4.6", propOrder = {
    "value",
    "uncertaintyDescription"
})
public class VariableUncertainty {

    @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected DimensionedQuantity value;
    @XmlElement(name = "uncertainty_description", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected String uncertaintyDescription;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link DimensionedQuantity }
     *     
     */
    public DimensionedQuantity getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link DimensionedQuantity }
     *     
     */
    public void setValue(DimensionedQuantity value) {
        this.value = value;
    }

    /**
     * Gets the value of the uncertaintyDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUncertaintyDescription() {
        return uncertaintyDescription;
    }

    /**
     * Sets the value of the uncertaintyDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUncertaintyDescription(String value) {
        this.uncertaintyDescription = value;
    }

}
