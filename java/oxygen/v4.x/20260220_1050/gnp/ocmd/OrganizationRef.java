
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         An inline organization element referencing a concrete representation in the organizations collection. 
 *       
 * 
 * <p>Java class for organization_ref complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="organization_ref"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{https://ncei.noaa.gov/ocads/v4.6}element_reference"&gt;
 *       &lt;attribute name="object_class" type="{http://www.w3.org/2001/XMLSchema}string" fixed="Organization" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "organization_ref", namespace = "https://ncei.noaa.gov/ocads/v4.6")
public class OrganizationRef
    extends ElementReference
{


}
