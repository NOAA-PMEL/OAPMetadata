
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
 *     &lt;extension base="{https://ncei.noaa.gov/ocads/v4.6}person"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identifier" type="{https://ncei.noaa.gov/ocads/v4.6}pid_reference"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "person_pid", namespace = "https://ncei.noaa.gov/ocads/v4.6", propOrder = {
    "identifier",
    "description"
})
public class PersonPid
    extends Person
{

    @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected PidReference identifier;
    @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected String description;

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

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
