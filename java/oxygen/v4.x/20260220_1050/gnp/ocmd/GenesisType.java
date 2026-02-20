
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for genesis_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="genesis_type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="measured" type="{https://ncei.noaa.gov/ocads/v4.6}measured_var_info"/&gt;
 *         &lt;element name="calculated" type="{https://ncei.noaa.gov/ocads/v4.6}calculated_var_info"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "genesis_type", namespace = "https://ncei.noaa.gov/ocads/v4.6", propOrder = {
    "measured",
    "calculated"
})
public class GenesisType {

    @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected MeasuredVarInfo measured;
    @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected CalculatedVarInfo calculated;

    /**
     * Gets the value of the measured property.
     * 
     * @return
     *     possible object is
     *     {@link MeasuredVarInfo }
     *     
     */
    public MeasuredVarInfo getMeasured() {
        return measured;
    }

    /**
     * Sets the value of the measured property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredVarInfo }
     *     
     */
    public void setMeasured(MeasuredVarInfo value) {
        this.measured = value;
    }

    /**
     * Gets the value of the calculated property.
     * 
     * @return
     *     possible object is
     *     {@link CalculatedVarInfo }
     *     
     */
    public CalculatedVarInfo getCalculated() {
        return calculated;
    }

    /**
     * Sets the value of the calculated property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculatedVarInfo }
     *     
     */
    public void setCalculated(CalculatedVarInfo value) {
        this.calculated = value;
    }

}
