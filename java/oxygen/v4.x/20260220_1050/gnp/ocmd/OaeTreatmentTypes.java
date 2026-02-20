
package gnp.ocmd;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for oae_treatment_types.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="oae_treatment_types"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="electrochemical alkalinity addition"/&gt;
 *     &lt;enumeration value="mineral alkalinity addition"/&gt;
 *     &lt;enumeration value="dissolved alkalinity addition"/&gt;
 *     &lt;enumeration value="river alkalinity addition"/&gt;
 *     &lt;enumeration value="coastal enhanced weathering"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "oae_treatment_types", namespace = "https://ncei.noaa.gov/ocads/v4.6")
@XmlEnum
public enum OaeTreatmentTypes {

    @XmlEnumValue("electrochemical alkalinity addition")
    ELECTROCHEMICAL_ALKALINITY_ADDITION("electrochemical alkalinity addition"),
    @XmlEnumValue("mineral alkalinity addition")
    MINERAL_ALKALINITY_ADDITION("mineral alkalinity addition"),
    @XmlEnumValue("dissolved alkalinity addition")
    DISSOLVED_ALKALINITY_ADDITION("dissolved alkalinity addition"),
    @XmlEnumValue("river alkalinity addition")
    RIVER_ALKALINITY_ADDITION("river alkalinity addition"),
    @XmlEnumValue("coastal enhanced weathering")
    COASTAL_ENHANCED_WEATHERING("coastal enhanced weathering");
    private final String value;

    OaeTreatmentTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OaeTreatmentTypes fromValue(String v) {
        for (OaeTreatmentTypes c: OaeTreatmentTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
