
package gnp.ocmd;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for seawater_source.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="seawater_source"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="natural"/&gt;
 *     &lt;enumeration value="artificial"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "seawater_source", namespace = "https://ncei.noaa.gov/ocads/v4.6")
@XmlEnum
public enum SeawaterSource {

    @XmlEnumValue("natural")
    NATURAL("natural"),
    @XmlEnumValue("artificial")
    ARTIFICIAL("artificial");
    private final String value;

    SeawaterSource(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SeawaterSource fromValue(String v) {
        for (SeawaterSource c: SeawaterSource.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
