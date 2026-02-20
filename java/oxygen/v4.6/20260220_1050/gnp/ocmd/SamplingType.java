
package gnp.ocmd;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sampling_type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="sampling_type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="continuous"/&gt;
 *     &lt;enumeration value="discrete"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "sampling_type", namespace = "https://ncei.noaa.gov/ocads/v4.6")
@XmlEnum
public enum SamplingType {

    @XmlEnumValue("continuous")
    CONTINUOUS("continuous"),
    @XmlEnumValue("discrete")
    DISCRETE("discrete");
    private final String value;

    SamplingType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SamplingType fromValue(String v) {
        for (SamplingType c: SamplingType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
