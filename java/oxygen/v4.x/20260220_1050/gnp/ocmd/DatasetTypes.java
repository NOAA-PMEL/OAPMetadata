
package gnp.ocmd;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dataset_types.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dataset_types"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Individual"/&gt;
 *     &lt;enumeration value="Data Compilation"/&gt;
 *     &lt;enumeration value="Gridded Product"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "dataset_types", namespace = "https://ncei.noaa.gov/ocads/v4.6")
@XmlEnum
public enum DatasetTypes {

    @XmlEnumValue("Individual")
    INDIVIDUAL("Individual"),
    @XmlEnumValue("Data Compilation")
    DATA_COMPILATION("Data Compilation"),
    @XmlEnumValue("Gridded Product")
    GRIDDED_PRODUCT("Gridded Product");
    private final String value;

    DatasetTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DatasetTypes fromValue(String v) {
        for (DatasetTypes c: DatasetTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
