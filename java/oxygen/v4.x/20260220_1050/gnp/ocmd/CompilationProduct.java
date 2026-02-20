
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for compilation_product complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="compilation_product"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://ncei.noaa.gov/ocads/v4.6}data_product"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="data_quality_description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "compilation_product", namespace = "https://ncei.noaa.gov/ocads/v4.6", propOrder = {
    "dataQualityDescription"
})
public class CompilationProduct
    extends DataProduct
{

    @XmlElement(name = "data_quality_description", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected String dataQualityDescription;

    /**
     * Gets the value of the dataQualityDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataQualityDescription() {
        return dataQualityDescription;
    }

    /**
     * Sets the value of the dataQualityDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataQualityDescription(String value) {
        this.dataQualityDescription = value;
    }

}
