
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 *  Extensible list of Standard Identifiers for people. 
 * 
 * <p>Java class for person_PID_reference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="person_PID_reference"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://ncei.noaa.gov/oads/a4.1&gt;pid_reference"&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "person_PID_reference", namespace = "http://ncei.noaa.gov/oads/a4.1")
public class PersonPIDReference
    extends PidReference
{


}
