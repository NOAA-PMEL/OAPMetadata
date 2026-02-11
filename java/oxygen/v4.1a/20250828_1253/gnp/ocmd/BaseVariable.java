
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for base_variable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="base_variable"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;group ref="{http://ncei.noaa.gov/oads/a4.1}base_variable_fields"/&gt;
 *       &lt;attribute name="identifier" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "base_variable", namespace = "http://ncei.noaa.gov/oads/a4.1", propOrder = {
    "standardName",
    "datasetVarname",
    "description",
    "variableType",
    "observationType",
    "units",
    "missingValue",
    "appropriateUseQuality",
    "uncertainty",
    "researcher"
})
@XmlSeeAlso({
    MeasuredVariable.class,
    DicVariable.class,
    PhVariable.class,
    Co2Base.class,
    BiologicalVariable.class
})
public class BaseVariable {

    @XmlElement(name = "standard_name", namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
    protected StandardIdentifier standardName;
    @XmlElement(name = "dataset_varname", namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
    protected String datasetVarname;
    @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1")
    protected String description;
    @XmlElement(name = "variable_type", namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
    protected String variableType;
    @XmlElement(name = "observation_type", namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
    protected String observationType;
    @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
    protected String units;
    @XmlElement(name = "missing_value", namespace = "http://ncei.noaa.gov/oads/a4.1")
    protected String missingValue;
    @XmlElement(name = "appropriate_use_quality", namespace = "http://ncei.noaa.gov/oads/a4.1")
    @XmlSchemaType(name = "string")
    protected AppropriateUse appropriateUseQuality;
    @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1")
    protected VariableUncertainty uncertainty;
    @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
    protected PersonWithRole researcher;
    @XmlAttribute(name = "identifier", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String identifier;

    /**
     * Gets the value of the standardName property.
     * 
     * @return
     *     possible object is
     *     {@link StandardIdentifier }
     *     
     */
    public StandardIdentifier getStandardName() {
        return standardName;
    }

    /**
     * Sets the value of the standardName property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandardIdentifier }
     *     
     */
    public void setStandardName(StandardIdentifier value) {
        this.standardName = value;
    }

    /**
     * Gets the value of the datasetVarname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatasetVarname() {
        return datasetVarname;
    }

    /**
     * Sets the value of the datasetVarname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatasetVarname(String value) {
        this.datasetVarname = value;
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
     * Gets the value of the variableType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariableType() {
        return variableType;
    }

    /**
     * Sets the value of the variableType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariableType(String value) {
        this.variableType = value;
    }

    /**
     * Gets the value of the observationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservationType() {
        return observationType;
    }

    /**
     * Sets the value of the observationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservationType(String value) {
        this.observationType = value;
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

    /**
     * Gets the value of the missingValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMissingValue() {
        return missingValue;
    }

    /**
     * Sets the value of the missingValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMissingValue(String value) {
        this.missingValue = value;
    }

    /**
     * Gets the value of the appropriateUseQuality property.
     * 
     * @return
     *     possible object is
     *     {@link AppropriateUse }
     *     
     */
    public AppropriateUse getAppropriateUseQuality() {
        return appropriateUseQuality;
    }

    /**
     * Sets the value of the appropriateUseQuality property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppropriateUse }
     *     
     */
    public void setAppropriateUseQuality(AppropriateUse value) {
        this.appropriateUseQuality = value;
    }

    /**
     * Gets the value of the uncertainty property.
     * 
     * @return
     *     possible object is
     *     {@link VariableUncertainty }
     *     
     */
    public VariableUncertainty getUncertainty() {
        return uncertainty;
    }

    /**
     * Sets the value of the uncertainty property.
     * 
     * @param value
     *     allowed object is
     *     {@link VariableUncertainty }
     *     
     */
    public void setUncertainty(VariableUncertainty value) {
        this.uncertainty = value;
    }

    /**
     * Gets the value of the researcher property.
     * 
     * @return
     *     possible object is
     *     {@link PersonWithRole }
     *     
     */
    public PersonWithRole getResearcher() {
        return researcher;
    }

    /**
     * Sets the value of the researcher property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonWithRole }
     *     
     */
    public void setResearcher(PersonWithRole value) {
        this.researcher = value;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

}
