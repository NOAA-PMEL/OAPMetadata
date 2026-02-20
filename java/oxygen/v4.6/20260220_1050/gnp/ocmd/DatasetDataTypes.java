
package gnp.ocmd;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dataset_data_types.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dataset_data_types"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Natural"/&gt;
 *     &lt;enumeration value="Manipulated"/&gt;
 *     &lt;enumeration value="Model Output"/&gt;
 *     &lt;enumeration value="Social"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "dataset_data_types", namespace = "https://ncei.noaa.gov/ocads/v4.6")
@XmlEnum
public enum DatasetDataTypes {

    @XmlEnumValue("Natural")
    NATURAL("Natural"),
    @XmlEnumValue("Manipulated")
    MANIPULATED("Manipulated"),
    @XmlEnumValue("Model Output")
    MODEL_OUTPUT("Model Output"),
    @XmlEnumValue("Social")
    SOCIAL("Social");
    private final String value;

    DatasetDataTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DatasetDataTypes fromValue(String v) {
        for (DatasetDataTypes c: DatasetDataTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
