
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 *  Units for depth measurements. Units are meters, positive values down.
 *       
 * 
 * <p>Java class for depth_m complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="depth_m"&gt;
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
@XmlType(name = "depth_m", namespace = "http://ncei.noaa.gov/oads/a4.1")
public class DepthM
    extends MeasuredValue
{


}
