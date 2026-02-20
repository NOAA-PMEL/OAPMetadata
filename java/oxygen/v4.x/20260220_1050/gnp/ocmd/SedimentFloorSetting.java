
package gnp.ocmd;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sediment_floor_setting.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="sediment_floor_setting"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="River"/&gt;
 *     &lt;enumeration value="Estuary"/&gt;
 *     &lt;enumeration value="Continental Shelf"/&gt;
 *     &lt;enumeration value="Slope"/&gt;
 *     &lt;enumeration value="Abyssal Plain"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "sediment_floor_setting", namespace = "https://ncei.noaa.gov/ocads/v4.6")
@XmlEnum
public enum SedimentFloorSetting {

    @XmlEnumValue("River")
    RIVER("River"),
    @XmlEnumValue("Estuary")
    ESTUARY("Estuary"),
    @XmlEnumValue("Continental Shelf")
    CONTINENTAL_SHELF("Continental Shelf"),
    @XmlEnumValue("Slope")
    SLOPE("Slope"),
    @XmlEnumValue("Abyssal Plain")
    ABYSSAL_PLAIN("Abyssal Plain");
    private final String value;

    SedimentFloorSetting(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SedimentFloorSetting fromValue(String v) {
        for (SedimentFloorSetting c: SedimentFloorSetting.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
