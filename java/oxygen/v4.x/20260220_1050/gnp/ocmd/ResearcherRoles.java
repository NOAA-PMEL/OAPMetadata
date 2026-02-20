
package gnp.ocmd;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for researcher_roles.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="researcher_roles"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RESEARCHER"/&gt;
 *     &lt;enumeration value="INVESTIGATOR"/&gt;
 *     &lt;enumeration value="PRINCIPAL_INVESTIGATOR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "researcher_roles", namespace = "https://ncei.noaa.gov/ocads/v4.6")
@XmlEnum
public enum ResearcherRoles {

    RESEARCHER,
    INVESTIGATOR,
    PRINCIPAL_INVESTIGATOR;

    public String value() {
        return name();
    }

    public static ResearcherRoles fromValue(String v) {
        return valueOf(v);
    }

}
