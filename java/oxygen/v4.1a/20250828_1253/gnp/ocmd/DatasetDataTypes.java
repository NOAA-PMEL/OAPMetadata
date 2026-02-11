
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
 *     &lt;enumeration value="in-situ measurements"/&gt;
 *     &lt;enumeration value="manipulated values"/&gt;
 *     &lt;enumeration value="model output"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "dataset_data_types", namespace = "http://ncei.noaa.gov/oads/a4.1")
@XmlEnum
public enum DatasetDataTypes {

    @XmlEnumValue("in-situ measurements")
    IN_SITU_MEASUREMENTS("in-situ measurements"),
    @XmlEnumValue("manipulated values")
    MANIPULATED_VALUES("manipulated values"),
    @XmlEnumValue("model output")
    MODEL_OUTPUT("model output");
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
