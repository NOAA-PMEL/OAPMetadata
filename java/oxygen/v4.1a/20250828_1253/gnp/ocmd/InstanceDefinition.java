
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for instance_definition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="instance_definition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ncei.noaa.gov/oads/a4.1}instance_reference"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "instance_definition", namespace = "http://ncei.noaa.gov/oads/a4.1")
public abstract class InstanceDefinition
    extends InstanceReference
{


}
