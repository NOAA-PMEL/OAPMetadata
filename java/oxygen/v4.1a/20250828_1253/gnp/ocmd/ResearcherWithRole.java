
package gnp.ocmd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for researcher_with_role complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="researcher_with_role"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ncei.noaa.gov/oads/a4.1}person"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://ncei.noaa.gov/oads/a4.1}researcher_role" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "researcher_with_role", namespace = "http://ncei.noaa.gov/oads/a4.1", propOrder = {
    "researcherRole"
})
public class ResearcherWithRole
    extends Person
{

    @XmlElement(name = "researcher_role", namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
    @XmlSchemaType(name = "string")
    protected List<ResearcherRoles> researcherRole;

    /**
     * Gets the value of the researcherRole property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the researcherRole property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResearcherRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResearcherRoles }
     * 
     * 
     */
    public List<ResearcherRoles> getResearcherRole() {
        if (researcherRole == null) {
            researcherRole = new ArrayList<ResearcherRoles>();
        }
        return this.researcherRole;
    }

}
