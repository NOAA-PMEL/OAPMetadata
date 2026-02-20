
package gnp.ocmd;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sediment_type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="sediment_type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Mud"/&gt;
 *     &lt;enumeration value="Clay"/&gt;
 *     &lt;enumeration value="Silt"/&gt;
 *     &lt;enumeration value="Sand"/&gt;
 *     &lt;enumeration value="Gravel"/&gt;
 *     &lt;enumeration value="Ooze"/&gt;
 *     &lt;enumeration value="Mixed"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "sediment_type", namespace = "https://ncei.noaa.gov/ocads/v4.6")
@XmlEnum
public enum SedimentType {

    @XmlEnumValue("Mud")
    MUD("Mud"),
    @XmlEnumValue("Clay")
    CLAY("Clay"),
    @XmlEnumValue("Silt")
    SILT("Silt"),
    @XmlEnumValue("Sand")
    SAND("Sand"),
    @XmlEnumValue("Gravel")
    GRAVEL("Gravel"),
    @XmlEnumValue("Ooze")
    OOZE("Ooze"),
    @XmlEnumValue("Mixed")
    MIXED("Mixed"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    SedimentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SedimentType fromValue(String v) {
        for (SedimentType c: SedimentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
