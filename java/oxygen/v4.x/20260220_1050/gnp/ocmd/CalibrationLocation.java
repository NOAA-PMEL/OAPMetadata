
package gnp.ocmd;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for calibration_location.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="calibration_location"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FACTORY"/&gt;
 *     &lt;enumeration value="LAB"/&gt;
 *     &lt;enumeration value="FIELD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "calibration_location", namespace = "https://ncei.noaa.gov/ocads/v4.6")
@XmlEnum
public enum CalibrationLocation {

    FACTORY,
    LAB,
    FIELD;

    public String value() {
        return name();
    }

    public static CalibrationLocation fromValue(String v) {
        return valueOf(v);
    }

}
