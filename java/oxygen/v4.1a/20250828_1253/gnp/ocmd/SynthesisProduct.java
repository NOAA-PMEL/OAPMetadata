
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for synthesis_product complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="synthesis_product"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="data_quality_description" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "synthesis_product", namespace = "http://ncei.noaa.gov/oads/a4.1", propOrder = {
    "dataQualityDescription"
})
public class SynthesisProduct {

    @XmlElement(name = "data_quality_description", namespace = "http://ncei.noaa.gov/oads/a4.1")
    protected Object dataQualityDescription;

    /**
     * Gets the value of the dataQualityDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDataQualityDescription() {
        return dataQualityDescription;
    }

    /**
     * Sets the value of the dataQualityDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDataQualityDescription(Object value) {
        this.dataQualityDescription = value;
    }

}
