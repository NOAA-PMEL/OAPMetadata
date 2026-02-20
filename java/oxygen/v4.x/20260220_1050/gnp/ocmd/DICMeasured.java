
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DIC_measured complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DIC_measured"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://ncei.noaa.gov/ocads/v4.6}basic_measured_observation_base"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="analyzing_instrument" type="{https://ncei.noaa.gov/ocads/v4.6}crm_instrument"/&gt;
 *         &lt;element name="sample_preservation" type="{https://ncei.noaa.gov/ocads/v4.6}sample_preservation" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DIC_measured", namespace = "https://ncei.noaa.gov/ocads/v4.6", propOrder = {
    "analyzingInstrument",
    "samplePreservation"
})
@XmlSeeAlso({
    TAMeasured.class
})
public class DICMeasured
    extends BasicMeasuredObservationBase
{

    @XmlElement(name = "analyzing_instrument", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected CrmInstrument analyzingInstrument;
    @XmlElement(name = "sample_preservation", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected SamplePreservation samplePreservation;

    /**
     * Gets the value of the analyzingInstrument property.
     * 
     * @return
     *     possible object is
     *     {@link CrmInstrument }
     *     
     */
    public CrmInstrument getAnalyzingInstrument() {
        return analyzingInstrument;
    }

    /**
     * Sets the value of the analyzingInstrument property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrmInstrument }
     *     
     */
    public void setAnalyzingInstrument(CrmInstrument value) {
        this.analyzingInstrument = value;
    }

    /**
     * Gets the value of the samplePreservation property.
     * 
     * @return
     *     possible object is
     *     {@link SamplePreservation }
     *     
     */
    public SamplePreservation getSamplePreservation() {
        return samplePreservation;
    }

    /**
     * Sets the value of the samplePreservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SamplePreservation }
     *     
     */
    public void setSamplePreservation(SamplePreservation value) {
        this.samplePreservation = value;
    }

}
