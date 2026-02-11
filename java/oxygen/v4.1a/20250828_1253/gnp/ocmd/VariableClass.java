
package gnp.ocmd;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for variable_class.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="variable_class"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UNSPECIFIED"/&gt;
 *     &lt;enumeration value="MEASURED"/&gt;
 *     &lt;enumeration value="DERIVED"/&gt;
 *     &lt;enumeration value="SYNTHESIS"/&gt;
 *     &lt;enumeration value="DATA_PRODUCT"/&gt;
 *     &lt;enumeration value="MODEL_OUTPUT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "variable_class", namespace = "http://ncei.noaa.gov/oads/a4.1")
@XmlEnum
public enum VariableClass {

    UNSPECIFIED,
    MEASURED,
    DERIVED,
    SYNTHESIS,
    DATA_PRODUCT,
    MODEL_OUTPUT;

    public String value() {
        return name();
    }

    public static VariableClass fromValue(String v) {
        return valueOf(v);
    }

}
