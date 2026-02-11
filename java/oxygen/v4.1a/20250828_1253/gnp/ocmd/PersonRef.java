
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 *  An inline person element referencing a concrete representation in the
 *         people collection. 
 * 
 * <p>Java class for person_ref complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="person_ref"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://ncei.noaa.gov/oads/a4.1}element_reference"&gt;
 *       &lt;attribute name="object_class" type="{http://www.w3.org/2001/XMLSchema}string" fixed="oads:Person" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "person_ref", namespace = "http://ncei.noaa.gov/oads/a4.1")
public class PersonRef
    extends ElementReference
{


}
