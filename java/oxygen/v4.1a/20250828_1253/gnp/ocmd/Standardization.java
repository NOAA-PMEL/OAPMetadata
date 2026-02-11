
package gnp.ocmd;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for standardization complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="standardization"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="frequency" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="temperature" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="standardGas" type="{http://ncei.noaa.gov/oads/a4.1}standard_gas" maxOccurs="unbounded" minOccurs="0"/&gt;
 *             &lt;element name="crm" type="{http://ncei.noaa.gov/oads/a4.1}crm" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;element name="phOfStandards" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "standardization", namespace = "http://ncei.noaa.gov/oads/a4.1", propOrder = {
    "description",
    "frequency",
    "temperature",
    "standardGas",
    "crm",
    "phOfStandards"
})
public class Standardization {

    @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
    protected String description;
    @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
    protected String frequency;
    @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1")
    protected BigDecimal temperature;
    @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1")
    protected List<StandardGas> standardGas;
    @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1")
    protected Crm crm;
    @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1")
    protected String phOfStandards;

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
     * Gets the value of the frequency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrequency(String value) {
        this.frequency = value;
    }

    /**
     * Gets the value of the temperature property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTemperature() {
        return temperature;
    }

    /**
     * Sets the value of the temperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTemperature(BigDecimal value) {
        this.temperature = value;
    }

    /**
     * Gets the value of the standardGas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the standardGas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStandardGas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StandardGas }
     * 
     * 
     */
    public List<StandardGas> getStandardGas() {
        if (standardGas == null) {
            standardGas = new ArrayList<StandardGas>();
        }
        return this.standardGas;
    }

    /**
     * Gets the value of the crm property.
     * 
     * @return
     *     possible object is
     *     {@link Crm }
     *     
     */
    public Crm getCrm() {
        return crm;
    }

    /**
     * Sets the value of the crm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Crm }
     *     
     */
    public void setCrm(Crm value) {
        this.crm = value;
    }

    /**
     * Gets the value of the phOfStandards property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhOfStandards() {
        return phOfStandards;
    }

    /**
     * Sets the value of the phOfStandards property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhOfStandards(String value) {
        this.phOfStandards = value;
    }

}
