
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for calculated_product complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="calculated_product"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://ncei.noaa.gov/ocads/v4.6}data_product"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="calculation_method_reference" type="{https://ncei.noaa.gov/ocads/v4.6}reference_or_description" minOccurs="0"/&gt;
 *         &lt;element name="calculation_method_description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calculated_product", namespace = "https://ncei.noaa.gov/ocads/v4.6", propOrder = {
    "calculationMethodReference",
    "calculationMethodDescription"
})
public class CalculatedProduct
    extends DataProduct
{

    @XmlElement(name = "calculation_method_reference", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected ReferenceOrDescription calculationMethodReference;
    @XmlElement(name = "calculation_method_description", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected String calculationMethodDescription;

    /**
     * Gets the value of the calculationMethodReference property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceOrDescription }
     *     
     */
    public ReferenceOrDescription getCalculationMethodReference() {
        return calculationMethodReference;
    }

    /**
     * Sets the value of the calculationMethodReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceOrDescription }
     *     
     */
    public void setCalculationMethodReference(ReferenceOrDescription value) {
        this.calculationMethodReference = value;
    }

    /**
     * Gets the value of the calculationMethodDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalculationMethodDescription() {
        return calculationMethodDescription;
    }

    /**
     * Sets the value of the calculationMethodDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalculationMethodDescription(String value) {
        this.calculationMethodDescription = value;
    }

}
