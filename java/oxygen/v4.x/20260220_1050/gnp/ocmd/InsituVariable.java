
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for insitu_variable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="insitu_variable"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://ncei.noaa.gov/ocads/v4.6}std_variable_base"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="measured" type="{https://ncei.noaa.gov/ocads/v4.6}measured_var_info"/&gt;
 *           &lt;element name="calculated" type="{https://ncei.noaa.gov/ocads/v4.6}calculated_var_info"/&gt;
 *           &lt;element name="gridded" type="{https://ncei.noaa.gov/ocads/v4.6}gridded_var_info"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insitu_variable", namespace = "https://ncei.noaa.gov/ocads/v4.6", propOrder = {
    "measured",
    "calculated",
    "gridded"
})
@XmlSeeAlso({
    BasicMeasuredObservationBase.class,
    BasicCalculatedObservationBase.class
})
public abstract class InsituVariable
    extends StdVariableBase
{

    @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected MeasuredVarInfo measured;
    @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected CalculatedVarInfo calculated;
    @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected GriddedVarInfo gridded;

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

    /**
     * Gets the value of the gridded property.
     * 
     * @return
     *     possible object is
     *     {@link GriddedVarInfo }
     *     
     */
    public GriddedVarInfo getGridded() {
        return gridded;
    }

    /**
     * Sets the value of the gridded property.
     * 
     * @param value
     *     allowed object is
     *     {@link GriddedVarInfo }
     *     
     */
    public void setGridded(GriddedVarInfo value) {
        this.gridded = value;
    }

}
