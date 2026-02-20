
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         An inline person element referencing a concrete representation in the people collection. 
 *       
 * 
 * <p>Java class for person_ref complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="person_ref"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{https://ncei.noaa.gov/ocads/v4.6}element_reference"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="role" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="object_class" type="{http://www.w3.org/2001/XMLSchema}string" fixed="Person" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "person_ref", namespace = "https://ncei.noaa.gov/ocads/v4.6")
@XmlSeeAlso({
    OrderedPersonRef.class
})
public class PersonRef
    extends ElementReference
{


}
