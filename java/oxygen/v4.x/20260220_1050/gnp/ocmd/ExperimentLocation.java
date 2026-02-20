
package gnp.ocmd;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for experiment_location.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="experiment_location"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="lab"/&gt;
 *     &lt;enumeration value="field"/&gt;
 *     &lt;enumeration value="mesocosm"/&gt;
 *     &lt;enumeration value="natural_analogue"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "experiment_location", namespace = "https://ncei.noaa.gov/ocads/v4.6")
@XmlEnum
public enum ExperimentLocation {

    @XmlEnumValue("lab")
    LAB("lab"),
    @XmlEnumValue("field")
    FIELD("field"),
    @XmlEnumValue("mesocosm")
    MESOCOSM("mesocosm"),
    @XmlEnumValue("natural_analogue")
    NATURAL_ANALOGUE("natural_analogue");
    private final String value;

    ExperimentLocation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExperimentLocation fromValue(String v) {
        for (ExperimentLocation c: ExperimentLocation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
