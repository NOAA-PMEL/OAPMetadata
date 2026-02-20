
package gnp.ocmd;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for observation_geometry.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="observation_geometry"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Point"/&gt;
 *     &lt;enumeration value="Timeseries"/&gt;
 *     &lt;enumeration value="Trajectory"/&gt;
 *     &lt;enumeration value="Profile"/&gt;
 *     &lt;enumeration value="Timeseries_Profile"/&gt;
 *     &lt;enumeration value="Trajectory_Profile"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "observation_geometry", namespace = "https://ncei.noaa.gov/ocads/v4.6")
@XmlEnum
public enum ObservationGeometry {

    @XmlEnumValue("Point")
    POINT("Point"),
    @XmlEnumValue("Timeseries")
    TIMESERIES("Timeseries"),
    @XmlEnumValue("Trajectory")
    TRAJECTORY("Trajectory"),
    @XmlEnumValue("Profile")
    PROFILE("Profile"),
    @XmlEnumValue("Timeseries_Profile")
    TIMESERIES_PROFILE("Timeseries_Profile"),
    @XmlEnumValue("Trajectory_Profile")
    TRAJECTORY_PROFILE("Trajectory_Profile");
    private final String value;

    ObservationGeometry(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ObservationGeometry fromValue(String v) {
        for (ObservationGeometry c: ObservationGeometry.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
