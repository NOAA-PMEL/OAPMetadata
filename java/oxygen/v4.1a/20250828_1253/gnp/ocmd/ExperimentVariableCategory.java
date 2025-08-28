
package gnp.ocmd;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for experiment_variable_category.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="experiment_variable_category"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BASELINE"/&gt;
 *     &lt;enumeration value="CONTROL"/&gt;
 *     &lt;enumeration value="MANIPULATION"/&gt;
 *     &lt;enumeration value="RESPONSE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "experiment_variable_category", namespace = "http://ncei.noaa.gov/oads/a4.1")
@XmlEnum
public enum ExperimentVariableCategory {

    BASELINE,
    CONTROL,
    MANIPULATION,
    RESPONSE;

    public String value() {
        return name();
    }

    public static ExperimentVariableCategory fromValue(String v) {
        return valueOf(v);
    }

}
