
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for basic_measured_variable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="basic_measured_variable"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://ncei.noaa.gov/ocads/v4.6}basic_measured_observation_base"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="analyzing_instrument" type="{https://ncei.noaa.gov/ocads/v4.6}standard_instrument"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "basic_measured_variable", namespace = "https://ncei.noaa.gov/ocads/v4.6", propOrder = {
    "analyzingInstrument"
})
public class BasicMeasuredVariable
    extends BasicMeasuredObservationBase
{

    @XmlElement(name = "analyzing_instrument", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected StandardInstrument analyzingInstrument;

    /**
     * Gets the value of the analyzingInstrument property.
     * 
     * @return
     *     possible object is
     *     {@link StandardInstrument }
     *     
     */
    public StandardInstrument getAnalyzingInstrument() {
        return analyzingInstrument;
    }

    /**
     * Sets the value of the analyzingInstrument property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandardInstrument }
     *     
     */
    public void setAnalyzingInstrument(StandardInstrument value) {
        this.analyzingInstrument = value;
    }

}
