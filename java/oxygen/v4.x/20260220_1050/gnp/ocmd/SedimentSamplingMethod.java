
package gnp.ocmd;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sediment_sampling_method.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="sediment_sampling_method"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Core"/&gt;
 *     &lt;enumeration value="Grab"/&gt;
 *     &lt;enumeration value="Dredging"/&gt;
 *     &lt;enumeration value="Drilling"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "sediment_sampling_method", namespace = "https://ncei.noaa.gov/ocads/v4.6")
@XmlEnum
public enum SedimentSamplingMethod {

    @XmlEnumValue("Core")
    CORE("Core"),
    @XmlEnumValue("Grab")
    GRAB("Grab"),
    @XmlEnumValue("Dredging")
    DREDGING("Dredging"),
    @XmlEnumValue("Drilling")
    DRILLING("Drilling"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    SedimentSamplingMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SedimentSamplingMethod fromValue(String v) {
        for (SedimentSamplingMethod c: SedimentSamplingMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
