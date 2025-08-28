
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 *  An ORCID persistant identifier. 
 * 
 * <p>Java class for orcid_reference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="orcid_reference"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;restriction base="&lt;http://ncei.noaa.gov/oads/a4.1&gt;pid_reference"&gt;
 *       &lt;attribute name="pid_type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" fixed="ORCID" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "orcid_reference", namespace = "http://ncei.noaa.gov/oads/a4.1")
public class OrcidReference
    extends PidReference
{


}
