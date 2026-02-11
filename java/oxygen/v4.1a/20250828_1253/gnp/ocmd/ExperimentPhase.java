
package gnp.ocmd;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for experiment_phase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="experiment_phase"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BASELINE"/&gt;
 *     &lt;enumeration value="INTERVENTION"/&gt;
 *     &lt;enumeration value="CONTROL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "experiment_phase", namespace = "http://ncei.noaa.gov/oads/a4.1")
@XmlEnum
public enum ExperimentPhase {

    BASELINE,
    INTERVENTION,
    CONTROL;

    public String value() {
        return name();
    }

    public static ExperimentPhase fromValue(String v) {
        return valueOf(v);
    }

}
