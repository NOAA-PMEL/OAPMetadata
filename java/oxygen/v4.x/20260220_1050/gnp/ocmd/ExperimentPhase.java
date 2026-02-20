
package gnp.ocmd;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for experiment_phase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="experiment_phase"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="baseline"/&gt;
 *     &lt;enumeration value="intervention"/&gt;
 *     &lt;enumeration value="control"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "experiment_phase", namespace = "https://ncei.noaa.gov/ocads/v4.6")
@XmlEnum
public enum ExperimentPhase {

    @XmlEnumValue("baseline")
    BASELINE("baseline"),
    @XmlEnumValue("intervention")
    INTERVENTION("intervention"),
    @XmlEnumValue("control")
    CONTROL("control");
    private final String value;

    ExperimentPhase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExperimentPhase fromValue(String v) {
        for (ExperimentPhase c: ExperimentPhase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
