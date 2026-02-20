
package gnp.ocmd;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mcdr_pathways.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="mcdr_pathways"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ocean alkalinity enhancement"/&gt;
 *     &lt;enumeration value="macroalgal cultivation for CDR"/&gt;
 *     &lt;enumeration value="direct ocean capture"/&gt;
 *     &lt;enumeration value="ocean fertilization"/&gt;
 *     &lt;enumeration value="artificial upwelling and downwelling"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "mcdr_pathways", namespace = "https://ncei.noaa.gov/ocads/v4.6")
@XmlEnum
public enum McdrPathways {

    @XmlEnumValue("ocean alkalinity enhancement")
    OCEAN_ALKALINITY_ENHANCEMENT("ocean alkalinity enhancement"),
    @XmlEnumValue("macroalgal cultivation for CDR")
    MACROALGAL_CULTIVATION_FOR_CDR("macroalgal cultivation for CDR"),
    @XmlEnumValue("direct ocean capture")
    DIRECT_OCEAN_CAPTURE("direct ocean capture"),
    @XmlEnumValue("ocean fertilization")
    OCEAN_FERTILIZATION("ocean fertilization"),
    @XmlEnumValue("artificial upwelling and downwelling")
    ARTIFICIAL_UPWELLING_AND_DOWNWELLING("artificial upwelling and downwelling"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    McdrPathways(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static McdrPathways fromValue(String v) {
        for (McdrPathways c: McdrPathways.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
