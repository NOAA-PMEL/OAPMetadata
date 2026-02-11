
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for person_pid complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="person_pid"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ncei.noaa.gov/oads/a4.1}person"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identifier" type="{http://ncei.noaa.gov/oads/a4.1}pid_reference"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "person_pid", namespace = "http://ncei.noaa.gov/oads/a4.1", propOrder = {
    "identifier"
})
public class PersonPid
    extends Person
{

    @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
    protected PidReference identifier;

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link PidReference }
     *     
     */
    public PidReference getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link PidReference }
     *     
     */
    public void setIdentifier(PidReference value) {
        this.identifier = value;
    }

}
