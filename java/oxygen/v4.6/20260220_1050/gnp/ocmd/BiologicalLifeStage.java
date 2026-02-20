
package gnp.ocmd;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for biological_life_stage.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="biological_life_stage"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="egg"/&gt;
 *     &lt;enumeration value="embryo"/&gt;
 *     &lt;enumeration value="larva"/&gt;
 *     &lt;enumeration value="juvenile"/&gt;
 *     &lt;enumeration value="adult"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "biological_life_stage", namespace = "https://ncei.noaa.gov/ocads/v4.6")
@XmlEnum
public enum BiologicalLifeStage {

    @XmlEnumValue("egg")
    EGG("egg"),
    @XmlEnumValue("embryo")
    EMBRYO("embryo"),
    @XmlEnumValue("larva")
    LARVA("larva"),
    @XmlEnumValue("juvenile")
    JUVENILE("juvenile"),
    @XmlEnumValue("adult")
    ADULT("adult");
    private final String value;

    BiologicalLifeStage(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BiologicalLifeStage fromValue(String v) {
        for (BiologicalLifeStage c: BiologicalLifeStage.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
