
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         A concrete instance that is a reference to an online Persistent Identifier
 *       
 * 
 * <p>Java class for instance_reference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="instance_reference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://ncei.noaa.gov/ocads/v4.6}element_instance"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pid" type="{https://ncei.noaa.gov/ocads/v4.6}pid_reference"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "instance_reference", namespace = "https://ncei.noaa.gov/ocads/v4.6", propOrder = {
    "pid"
})
public class InstanceReference
    extends ElementInstance
{

    @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected PidReference pid;

    /**
     * Gets the value of the pid property.
     * 
     * @return
     *     possible object is
     *     {@link PidReference }
     *     
     */
    public PidReference getPid() {
        return pid;
    }

    /**
     * Sets the value of the pid property.
     * 
     * @param value
     *     allowed object is
     *     {@link PidReference }
     *     
     */
    public void setPid(PidReference value) {
        this.pid = value;
    }

}
