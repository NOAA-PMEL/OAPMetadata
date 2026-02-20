
package gnp.ocmd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Abstract base of a concrete instance that is a full definition of the object type
 *       
 * 
 * <p>Java class for instance_definition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="instance_definition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://ncei.noaa.gov/ocads/v4.6}element_reference"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pid" type="{https://ncei.noaa.gov/ocads/v4.6}pid_reference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "instance_definition", namespace = "https://ncei.noaa.gov/ocads/v4.6", propOrder = {
    "pid"
})
public abstract class InstanceDefinition
    extends ElementReference
{

    @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected List<PidReference> pid;

    /**
     * Gets the value of the pid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPid().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PidReference }
     * 
     * 
     */
    public List<PidReference> getPid() {
        if (pid == null) {
            pid = new ArrayList<PidReference>();
        }
        return this.pid;
    }

}
