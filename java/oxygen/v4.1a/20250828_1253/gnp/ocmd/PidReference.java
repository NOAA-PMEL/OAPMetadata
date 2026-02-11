
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for pid_reference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pid_reference"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;anyURI"&gt;
 *       &lt;attribute name="pid_type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pid_reference", namespace = "http://ncei.noaa.gov/oads/a4.1", propOrder = {
    "value"
})
@XmlSeeAlso({
    OrcidReference.class,
    ResearcheridReference.class,
    OceanExpertReference.class,
    PersonPIDReference.class
})
public class PidReference {

    @XmlValue
    @XmlSchemaType(name = "anyURI")
    protected String value;
    @XmlAttribute(name = "pid_type")
    @XmlSchemaType(name = "anySimpleType")
    protected String pidType;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the pidType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPidType() {
        return pidType;
    }

    /**
     * Sets the value of the pidType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPidType(String value) {
        this.pidType = value;
    }

}
