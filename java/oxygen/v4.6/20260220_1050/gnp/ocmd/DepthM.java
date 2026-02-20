
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
 *   &lt;simpleContent&gt;
 *     &lt;restriction base="&lt;https://ncei.noaa.gov/ocads/v4.6&gt;positive_dimensioned_quantity"&gt;
 *       &lt;attribute name="units" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="meters" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "depth_m", namespace = "https://ncei.noaa.gov/ocads/v4.6")
public class DepthM
    extends PositiveDimensionedQuantity
{


}
