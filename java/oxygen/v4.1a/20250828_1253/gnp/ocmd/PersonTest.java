
package gnp.ocmd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for person_test complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="person_test"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded"&gt;
 *         &lt;element ref="{http://ncei.noaa.gov/oads/a4.1}person_pid"/&gt;
 *         &lt;element ref="{http://ncei.noaa.gov/oads/a4.1}person_def"/&gt;
 *         &lt;element name="data_submitter" type="{http://ncei.noaa.gov/oads/a4.1}person_ref"/&gt;
 *         &lt;element name="people" type="{http://ncei.noaa.gov/oads/a4.1}person_collection"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "person_test", namespace = "http://ncei.noaa.gov/oads/a4.1", propOrder = {
    "personPidOrPersonDefOrDataSubmitter"
})
public class PersonTest {

    @XmlElements({
        @XmlElement(name = "person_pid", namespace = "http://ncei.noaa.gov/oads/a4.1", type = PersonPid.class),
        @XmlElement(name = "person_def", namespace = "http://ncei.noaa.gov/oads/a4.1", type = PersonDefinition.class),
        @XmlElement(name = "data_submitter", namespace = "http://ncei.noaa.gov/oads/a4.1", type = PersonRef.class),
        @XmlElement(name = "people", namespace = "http://ncei.noaa.gov/oads/a4.1", type = PersonCollection.class)
    })
    protected List<Object> personPidOrPersonDefOrDataSubmitter;

    /**
     * Gets the value of the personPidOrPersonDefOrDataSubmitter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personPidOrPersonDefOrDataSubmitter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonPidOrPersonDefOrDataSubmitter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonPid }
     * {@link PersonDefinition }
     * {@link PersonRef }
     * {@link PersonCollection }
     * 
     * 
     */
    public List<Object> getPersonPidOrPersonDefOrDataSubmitter() {
        if (personPidOrPersonDefOrDataSubmitter == null) {
            personPidOrPersonDefOrDataSubmitter = new ArrayList<Object>();
        }
        return this.personPidOrPersonDefOrDataSubmitter;
    }

}
