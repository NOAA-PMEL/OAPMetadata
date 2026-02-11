
package gnp.ocmd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for person_with_role complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="person_with_role"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ncei.noaa.gov/oads/a4.1}person"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://ncei.noaa.gov/oads/a4.1}person_role" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "person_with_role", namespace = "http://ncei.noaa.gov/oads/a4.1", propOrder = {
    "personRole"
})
public class PersonWithRole
    extends Person
{

    @XmlElementRef(name = "person_role", namespace = "http://ncei.noaa.gov/oads/a4.1", type = JAXBElement.class)
    protected List<JAXBElement<?>> personRole;

    /**
     * Gets the value of the personRole property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personRole property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link ResearcherRoles }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getPersonRole() {
        if (personRole == null) {
            personRole = new ArrayList<JAXBElement<?>>();
        }
        return this.personRole;
    }

}
