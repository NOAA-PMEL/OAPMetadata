
package gnp.ocmd;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for countries_list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="countries_list"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="country1"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "countries_list", namespace = "http://ncei.noaa.gov/oads/a4.1")
@XmlEnum
public enum CountriesList {

    @XmlEnumValue("country1")
    COUNTRY_1("country1");
    private final String value;

    CountriesList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CountriesList fromValue(String v) {
        for (CountriesList c: CountriesList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
