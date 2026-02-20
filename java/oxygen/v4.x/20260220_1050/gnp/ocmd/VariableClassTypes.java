
package gnp.ocmd;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for variable_class_types.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="variable_class_types"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MEASURED"/&gt;
 *     &lt;enumeration value="DERIVED"/&gt;
 *     &lt;enumeration value="COMPILATION"/&gt;
 *     &lt;enumeration value="MANIPULATION"/&gt;
 *     &lt;enumeration value="GENERATED"/&gt;
 *     &lt;enumeration value="SOCIAL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "variable_class_types", namespace = "https://ncei.noaa.gov/ocads/v4.6")
@XmlEnum
public enum VariableClassTypes {

    MEASURED,
    DERIVED,
    COMPILATION,
    MANIPULATION,
    GENERATED,
    SOCIAL;

    public String value() {
        return name();
    }

    public static VariableClassTypes fromValue(String v) {
        return valueOf(v);
    }

}
