
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for flow_rate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="flow_rate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{https://ncei.noaa.gov/ocads/v4.6}measured_value"&gt;
 *       &lt;attribute name="units" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="liters/minute" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "flow_rate", namespace = "https://ncei.noaa.gov/ocads/v4.6")
public class FlowRate
    extends MeasuredValue
{


}
