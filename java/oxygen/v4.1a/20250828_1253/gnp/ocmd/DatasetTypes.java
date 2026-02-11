
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
 *     &lt;enumeration value="Original Dataset"/&gt;
 *     &lt;enumeration value="Data Compilation Product"/&gt;
 *     &lt;enumeration value="Derived Product"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "dataset_types", namespace = "http://ncei.noaa.gov/oads/a4.1")
@XmlEnum
public enum DatasetTypes {

    @XmlEnumValue("Original Dataset")
    ORIGINAL_DATASET("Original Dataset"),
    @XmlEnumValue("Data Compilation Product")
    DATA_COMPILATION_PRODUCT("Data Compilation Product"),
    @XmlEnumValue("Derived Product")
    DERIVED_PRODUCT("Derived Product");
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
