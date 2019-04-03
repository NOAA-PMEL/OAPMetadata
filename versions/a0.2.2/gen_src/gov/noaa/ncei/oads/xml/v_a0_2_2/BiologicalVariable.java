//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.29 at 04:20:46 PM PDT 
//


package gov.noaa.ncei.oads.xml.v_a0_2_2;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;


/**
 * <p>Java class for biological_variable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="biological_variable"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ncei.noaa.gov/oads/v_a0_2_2}base_variable_type"&gt;
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
@XmlType(name = "biological_variable", propOrder = {
    "duration",
    "biologicalSubject",
    "speciesID",
    "lifeStage"
})
@SuperBuilder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class BiologicalVariable
    extends BaseVariableType
    implements Serializable
{

    private final static long serialVersionUID = 101L;
    protected String duration;
    @XmlElement(required = true)
    protected String biologicalSubject;
    @XmlElement(required = true)
    protected String speciesID;
    @XmlElement(required = true)
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

    public boolean isSetDuration() {
        return (this.duration!= null);
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

    public boolean isSetBiologicalSubject() {
        return (this.biologicalSubject!= null);
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

    public boolean isSetSpeciesID() {
        return (this.speciesID!= null);
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

    public boolean isSetLifeStage() {
        return (this.lifeStage!= null);
    }

}