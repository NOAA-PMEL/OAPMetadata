
package gnp.ocmd;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for variable_genesis.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="variable_genesis"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OBSERVED"/&gt;
 *     &lt;enumeration value="CALCULATED"/&gt;
 *     &lt;enumeration value="GENERATED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "variable_genesis", namespace = "http://ncei.noaa.gov/oads/a4.1")
@XmlEnum
public enum VariableGenesis {

    OBSERVED,
    CALCULATED,
    GENERATED;

    public String value() {
        return name();
    }

    public static VariableGenesis fromValue(String v) {
        return valueOf(v);
    }

}
