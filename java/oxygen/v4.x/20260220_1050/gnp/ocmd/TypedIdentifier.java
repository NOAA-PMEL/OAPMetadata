
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typed_identifier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="typed_identifier"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;https://ncei.noaa.gov/ocads/v4.6&gt;typed_string"&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typed_identifier", namespace = "https://ncei.noaa.gov/ocads/v4.6")
public class TypedIdentifier
    extends TypedString
{


}
