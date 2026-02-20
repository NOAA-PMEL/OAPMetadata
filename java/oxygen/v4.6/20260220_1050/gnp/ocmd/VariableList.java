
package gnp.ocmd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for variable_list complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="variable_list"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded"&gt;
 *         &lt;element name="basic" type="{https://ncei.noaa.gov/ocads/v4.6}basic_variable"/&gt;
 *         &lt;element name="observed" type="{https://ncei.noaa.gov/ocads/v4.6}std_observed_variable"/&gt;
 *         &lt;element name="DIC" type="{https://ncei.noaa.gov/ocads/v4.6}DIC_measured"/&gt;
 *         &lt;element name="TA" type="{https://ncei.noaa.gov/ocads/v4.6}TA_measured"/&gt;
 *         &lt;element name="pH" type="{https://ncei.noaa.gov/ocads/v4.6}pH_measured"/&gt;
 *         &lt;element name="co2_discrete" type="{https://ncei.noaa.gov/ocads/v4.6}co2_discrete_variable"/&gt;
 *         &lt;element name="co2_continuous" type="{https://ncei.noaa.gov/ocads/v4.6}co2_continuous_variable"/&gt;
 *         &lt;element name="co2_reported" type="{https://ncei.noaa.gov/ocads/v4.6}co2_reported_variable"/&gt;
 *         &lt;element name="biological_variable" type="{https://ncei.noaa.gov/ocads/v4.6}biological_variable"/&gt;
 *         &lt;element name="model_variable" type="{https://ncei.noaa.gov/ocads/v4.6}model_variable"/&gt;
 *         &lt;element name="phys_response_variable" type="{https://ncei.noaa.gov/ocads/v4.6}phys_response_variable"/&gt;
 *         &lt;element name="sediment_variable" type="{https://ncei.noaa.gov/ocads/v4.6}sediment_variable"/&gt;
 *         &lt;element name="social_variable" type="{https://ncei.noaa.gov/ocads/v4.6}social_variable"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "variable_list", namespace = "https://ncei.noaa.gov/ocads/v4.6", propOrder = {
    "basicOrObservedOrDIC"
})
public class VariableList {

    @XmlElements({
        @XmlElement(name = "basic", namespace = "https://ncei.noaa.gov/ocads/v4.6"),
        @XmlElement(name = "observed", namespace = "https://ncei.noaa.gov/ocads/v4.6", type = StdObservedVariable.class),
        @XmlElement(name = "DIC", namespace = "https://ncei.noaa.gov/ocads/v4.6", type = DICMeasured.class),
        @XmlElement(name = "TA", namespace = "https://ncei.noaa.gov/ocads/v4.6", type = TAMeasured.class),
        @XmlElement(name = "pH", namespace = "https://ncei.noaa.gov/ocads/v4.6", type = PHMeasured.class),
        @XmlElement(name = "co2_discrete", namespace = "https://ncei.noaa.gov/ocads/v4.6", type = Co2DiscreteVariable.class),
        @XmlElement(name = "co2_continuous", namespace = "https://ncei.noaa.gov/ocads/v4.6", type = Co2ContinuousVariable.class),
        @XmlElement(name = "co2_reported", namespace = "https://ncei.noaa.gov/ocads/v4.6", type = Co2ReportedVariable.class),
        @XmlElement(name = "biological_variable", namespace = "https://ncei.noaa.gov/ocads/v4.6", type = BiologicalVariable.class),
        @XmlElement(name = "model_variable", namespace = "https://ncei.noaa.gov/ocads/v4.6", type = ModelVariable.class),
        @XmlElement(name = "phys_response_variable", namespace = "https://ncei.noaa.gov/ocads/v4.6", type = PhysResponseVariable.class),
        @XmlElement(name = "sediment_variable", namespace = "https://ncei.noaa.gov/ocads/v4.6", type = SedimentVariable.class),
        @XmlElement(name = "social_variable", namespace = "https://ncei.noaa.gov/ocads/v4.6", type = SocialVariable.class)
    })
    protected List<BasicVariable> basicOrObservedOrDIC;

    /**
     * Gets the value of the basicOrObservedOrDIC property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the basicOrObservedOrDIC property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBasicOrObservedOrDIC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BasicVariable }
     * {@link StdObservedVariable }
     * {@link DICMeasured }
     * {@link TAMeasured }
     * {@link PHMeasured }
     * {@link Co2DiscreteVariable }
     * {@link Co2ContinuousVariable }
     * {@link Co2ReportedVariable }
     * {@link BiologicalVariable }
     * {@link ModelVariable }
     * {@link PhysResponseVariable }
     * {@link SedimentVariable }
     * {@link SocialVariable }
     * 
     * 
     */
    public List<BasicVariable> getBasicOrObservedOrDIC() {
        if (basicOrObservedOrDIC == null) {
            basicOrObservedOrDIC = new ArrayList<BasicVariable>();
        }
        return this.basicOrObservedOrDIC;
    }

}
