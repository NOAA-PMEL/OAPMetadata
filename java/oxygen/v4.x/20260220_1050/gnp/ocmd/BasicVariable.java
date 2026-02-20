
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for basic_variable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="basic_variable"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://ncei.noaa.gov/ocads/v4.6}variable"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{https://ncei.noaa.gov/ocads/v4.6}minimum_variable_fields"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "basic_variable", namespace = "https://ncei.noaa.gov/ocads/v4.6", propOrder = {
    "standardIdentifier",
    "datasetVariableName",
    "longName",
    "description",
    "units"
})
@XmlSeeAlso({
    StdVariableBase.class,
    Co2ReportedVariable.class,
    BiologicalVariable.class,
    ModelVariable.class,
    PhysResponseVariable.class,
    SedimentVariable.class,
    SocialVariable.class
})
public class BasicVariable
    extends Variable
{

    @XmlElement(name = "standard_identifier", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected VocabularyItemReference standardIdentifier;
    @XmlElement(name = "dataset_variable_name", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected String datasetVariableName;
    @XmlElement(name = "long_name", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected String longName;
    @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected String description;
    @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected String units;

    /**
     * Gets the value of the standardIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link VocabularyItemReference }
     *     
     */
    public VocabularyItemReference getStandardIdentifier() {
        return standardIdentifier;
    }

    /**
     * Sets the value of the standardIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link VocabularyItemReference }
     *     
     */
    public void setStandardIdentifier(VocabularyItemReference value) {
        this.standardIdentifier = value;
    }

    /**
     * Gets the value of the datasetVariableName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatasetVariableName() {
        return datasetVariableName;
    }

    /**
     * Sets the value of the datasetVariableName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatasetVariableName(String value) {
        this.datasetVariableName = value;
    }

    /**
     * Gets the value of the longName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongName() {
        return longName;
    }

    /**
     * Sets the value of the longName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongName(String value) {
        this.longName = value;
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

    /**
     * Gets the value of the units property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnits() {
        return units;
    }

    /**
     * Sets the value of the units property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnits(String value) {
        this.units = value;
    }

}
