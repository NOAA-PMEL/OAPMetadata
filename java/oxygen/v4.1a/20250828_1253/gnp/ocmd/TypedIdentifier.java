
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
 *     &lt;extension base="&lt;http://ncei.noaa.gov/oads/a4.1&gt;typed_string"&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typed_identifier", namespace = "http://ncei.noaa.gov/oads/a4.1")
public class TypedIdentifier
    extends TypedString
{


}
