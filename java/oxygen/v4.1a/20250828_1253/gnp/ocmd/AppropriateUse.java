
package gnp.ocmd;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for appropriate_use.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="appropriate_use"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="climate"/&gt;
 *     &lt;enumeration value="weather"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "appropriate_use", namespace = "http://ncei.noaa.gov/oads/a4.1")
@XmlEnum
public enum AppropriateUse {

    @XmlEnumValue("climate")
    CLIMATE("climate"),
    @XmlEnumValue("weather")
    WEATHER("weather");
    private final String value;

    AppropriateUse(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AppropriateUse fromValue(String v) {
        for (AppropriateUse c: AppropriateUse.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
