
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for biological_variable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="biological_variable"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ncei.noaa.gov/oads/a4.1}base_variable"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="biologicalSubject" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="speciesID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="lifeStage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "biological_variable", namespace = "http://ncei.noaa.gov/oads/a4.1", propOrder = {
    "duration",
    "biologicalSubject",
    "speciesID",
    "lifeStage"
})
public class BiologicalVariable
    extends BaseVariable
{

    @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1")
    protected String duration;
    @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
    protected String biologicalSubject;
    @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
    protected String speciesID;
    @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
    protected String lifeStage;

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuration(String value) {
        this.duration = value;
    }

    /**
     * Gets the value of the biologicalSubject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBiologicalSubject() {
        return biologicalSubject;
    }

    /**
     * Sets the value of the biologicalSubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBiologicalSubject(String value) {
        this.biologicalSubject = value;
    }

    /**
     * Gets the value of the speciesID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeciesID() {
        return speciesID;
    }

    /**
     * Sets the value of the speciesID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeciesID(String value) {
        this.speciesID = value;
    }

    /**
     * Gets the value of the lifeStage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLifeStage() {
        return lifeStage;
    }

    /**
     * Sets the value of the lifeStage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLifeStage(String value) {
        this.lifeStage = value;
    }

}
