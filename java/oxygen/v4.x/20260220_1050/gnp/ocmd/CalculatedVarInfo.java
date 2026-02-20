
package gnp.ocmd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         General info for calculated variables.
 *       
 * 
 * <p>Java class for calculated_var_info complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="calculated_var_info"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sampling" type="{https://ncei.noaa.gov/ocads/v4.6}sampling_type"/&gt;
 *         &lt;element name="calculation_method" type="{https://ncei.noaa.gov/ocads/v4.6}reference_or_description"/&gt;
 *         &lt;element name="calculation_parameters" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sources" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="variable" type="{https://ncei.noaa.gov/ocads/v4.6}variable_ref" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calculated_var_info", namespace = "https://ncei.noaa.gov/ocads/v4.6", propOrder = {
    "sampling",
    "calculationMethod",
    "calculationParameters",
    "sources"
})
public class CalculatedVarInfo {

    @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    @XmlSchemaType(name = "string")
    protected SamplingType sampling;
    @XmlElement(name = "calculation_method", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected ReferenceOrDescription calculationMethod;
    @XmlElement(name = "calculation_parameters", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected String calculationParameters;
    @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected CalculatedVarInfo.Sources sources;

    /**
     * Gets the value of the sampling property.
     * 
     * @return
     *     possible object is
     *     {@link SamplingType }
     *     
     */
    public SamplingType getSampling() {
        return sampling;
    }

    /**
     * Sets the value of the sampling property.
     * 
     * @param value
     *     allowed object is
     *     {@link SamplingType }
     *     
     */
    public void setSampling(SamplingType value) {
        this.sampling = value;
    }

    /**
     * Gets the value of the calculationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceOrDescription }
     *     
     */
    public ReferenceOrDescription getCalculationMethod() {
        return calculationMethod;
    }

    /**
     * Sets the value of the calculationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceOrDescription }
     *     
     */
    public void setCalculationMethod(ReferenceOrDescription value) {
        this.calculationMethod = value;
    }

    /**
     * Gets the value of the calculationParameters property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalculationParameters() {
        return calculationParameters;
    }

    /**
     * Sets the value of the calculationParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalculationParameters(String value) {
        this.calculationParameters = value;
    }

    /**
     * Gets the value of the sources property.
     * 
     * @return
     *     possible object is
     *     {@link CalculatedVarInfo.Sources }
     *     
     */
    public CalculatedVarInfo.Sources getSources() {
        return sources;
    }

    /**
     * Sets the value of the sources property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculatedVarInfo.Sources }
     *     
     */
    public void setSources(CalculatedVarInfo.Sources value) {
        this.sources = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="variable" type="{https://ncei.noaa.gov/ocads/v4.6}variable_ref" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "variable"
    })
    public static class Sources {

        @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
        protected List<VariableRef> variable;

        /**
         * Gets the value of the variable property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the variable property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVariable().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VariableRef }
         * 
         * 
         */
        public List<VariableRef> getVariable() {
            if (variable == null) {
                variable = new ArrayList<VariableRef>();
            }
            return this.variable;
        }

    }

}
