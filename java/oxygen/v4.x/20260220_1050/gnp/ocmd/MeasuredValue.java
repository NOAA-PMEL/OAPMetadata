
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for measured_value complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="measured_value"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;https://ncei.noaa.gov/ocads/v4.6&gt;dimensioned_quantity"&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "measured_value", namespace = "https://ncei.noaa.gov/ocads/v4.6")
@XmlSeeAlso({
    AltitudeM.class,
    FlowRate.class,
    LiterVolume.class
})
public class MeasuredValue
    extends DimensionedQuantity
{


}
