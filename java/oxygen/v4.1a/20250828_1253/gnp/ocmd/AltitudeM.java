
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 *  Units for altitude / elevation measurements. Units are meters, positive
 *         values up. 
 * 
 * <p>Java class for altitude_m complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="altitude_m"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://ncei.noaa.gov/oads/a4.1}measured_value"&gt;
 *       &lt;attribute name="units" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="meters" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "altitude_m", namespace = "http://ncei.noaa.gov/oads/a4.1")
public class AltitudeM
    extends MeasuredValue
{


}
