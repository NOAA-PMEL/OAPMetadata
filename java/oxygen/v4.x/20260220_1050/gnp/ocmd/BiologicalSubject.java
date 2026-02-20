
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for biological_subject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="biological_subject"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="organism_description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="species_identifier" type="{https://ncei.noaa.gov/ocads/v4.6}typed_identifier"/&gt;
 *         &lt;element name="life_stage" type="{https://ncei.noaa.gov/ocads/v4.6}biological_life_stage"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "biological_subject", namespace = "https://ncei.noaa.gov/ocads/v4.6", propOrder = {
    "organismDescription",
    "speciesIdentifier",
    "lifeStage"
})
public class BiologicalSubject {

    @XmlElement(name = "organism_description", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected String organismDescription;
    @XmlElement(name = "species_identifier", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected TypedIdentifier speciesIdentifier;
    @XmlElement(name = "life_stage", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    @XmlSchemaType(name = "string")
    protected BiologicalLifeStage lifeStage;

    /**
     * Gets the value of the organismDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganismDescription() {
        return organismDescription;
    }

    /**
     * Sets the value of the organismDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganismDescription(String value) {
        this.organismDescription = value;
    }

    /**
     * Gets the value of the speciesIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link TypedIdentifier }
     *     
     */
    public TypedIdentifier getSpeciesIdentifier() {
        return speciesIdentifier;
    }

    /**
     * Sets the value of the speciesIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypedIdentifier }
     *     
     */
    public void setSpeciesIdentifier(TypedIdentifier value) {
        this.speciesIdentifier = value;
    }

    /**
     * Gets the value of the lifeStage property.
     * 
     * @return
     *     possible object is
     *     {@link BiologicalLifeStage }
     *     
     */
    public BiologicalLifeStage getLifeStage() {
        return lifeStage;
    }

    /**
     * Sets the value of the lifeStage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BiologicalLifeStage }
     *     
     */
    public void setLifeStage(BiologicalLifeStage value) {
        this.lifeStage = value;
    }

}
