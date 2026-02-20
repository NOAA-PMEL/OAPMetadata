
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for person complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="person"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{https://ncei.noaa.gov/ocads/v4.6}element_instance"&gt;
 *       &lt;attribute name="object_class" type="{http://www.w3.org/2001/XMLSchema}string" fixed="Person" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "person", namespace = "https://ncei.noaa.gov/ocads/v4.6")
@XmlSeeAlso({
    PersonDefinition.class,
    PersonPid.class
})
public abstract class Person
    extends ElementInstance
{


}
