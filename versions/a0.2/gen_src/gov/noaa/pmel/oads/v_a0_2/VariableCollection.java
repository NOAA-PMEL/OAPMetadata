//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.06 at 08:47:27 AM PST 
//


package gov.noaa.pmel.oads.v_a0_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for variable_collection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="variable_collection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="variable" type="{http://ncei.noaa.gov/oads_metadata}base_variable_type"/>
 *         &lt;element name="measured" type="{http://ncei.noaa.gov/oads_metadata}measured_variable"/>
 *         &lt;element name="dic" type="{http://ncei.noaa.gov/oads_metadata}dic_sample_type"/>
 *         &lt;element name="ta" type="{http://ncei.noaa.gov/oads_metadata}ta_sample_type"/>
 *         &lt;element name="ph" type="{http://ncei.noaa.gov/oads_metadata}ph_sample_type"/>
 *         &lt;element name="co2a" type="{http://ncei.noaa.gov/oads_metadata}co2_atonomous"/>
 *         &lt;element name="co2d" type="{http://ncei.noaa.gov/oads_metadata}co2_discrete"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "variable_collection", propOrder = {
    "variableOrMeasuredOrDic"
})
public class VariableCollection {

    @XmlElements({
        @XmlElement(name = "variable"),
        @XmlElement(name = "measured", type = MeasuredVariable.class),
        @XmlElement(name = "dic", type = DicSampleType.class),
        @XmlElement(name = "ta", type = TaSampleType.class),
        @XmlElement(name = "ph", type = PhSampleType.class),
        @XmlElement(name = "co2a", type = Co2Atonomous.class),
        @XmlElement(name = "co2d", type = Co2Discrete.class)
    })
    protected List<BaseVariableType> variableOrMeasuredOrDic;

    /**
     * Gets the value of the variableOrMeasuredOrDic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the variableOrMeasuredOrDic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVariableOrMeasuredOrDic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BaseVariableType }
     * {@link MeasuredVariable }
     * {@link DicSampleType }
     * {@link TaSampleType }
     * {@link PhSampleType }
     * {@link Co2Atonomous }
     * {@link Co2Discrete }
     * 
     * 
     */
    public List<BaseVariableType> getVariableOrMeasuredOrDic() {
        if (variableOrMeasuredOrDic == null) {
            variableOrMeasuredOrDic = new ArrayList<BaseVariableType>();
        }
        return this.variableOrMeasuredOrDic;
    }

}