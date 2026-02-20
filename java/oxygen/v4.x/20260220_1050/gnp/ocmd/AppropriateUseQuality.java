
package gnp.ocmd;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for appropriate_use_quality.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="appropriate_use_quality"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="climate"/&gt;
 *     &lt;enumeration value="weather"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "appropriate_use_quality", namespace = "https://ncei.noaa.gov/ocads/v4.6")
@XmlEnum
public enum AppropriateUseQuality {

    @XmlEnumValue("climate")
    CLIMATE("climate"),
    @XmlEnumValue("weather")
    WEATHER("weather"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    AppropriateUseQuality(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AppropriateUseQuality fromValue(String v) {
        for (AppropriateUseQuality c: AppropriateUseQuality.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
