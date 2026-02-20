
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for basic_calculated_observation_base complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="basic_calculated_observation_base"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{https://ncei.noaa.gov/ocads/v4.6}insitu_variable"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{https://ncei.noaa.gov/ocads/v4.6}minimum_variable_fields"/&gt;
 *         &lt;element name="observation_type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;group ref="{https://ncei.noaa.gov/ocads/v4.6}common_var_additional_fields"/&gt;
 *         &lt;element name="calculated" type="{https://ncei.noaa.gov/ocads/v4.6}calculated_var_info"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "basic_calculated_observation_base", namespace = "https://ncei.noaa.gov/ocads/v4.6")
@XmlSeeAlso({
    BasicCalculatedVariable.class,
    Co2CalculatedVariable.class
})
public class BasicCalculatedObservationBase
    extends InsituVariable
{


}
