
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for equilibrator complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="equilibrator"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="volume" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vented" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="waterFlowRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gasFlowRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="temperatureMeasurement" type="{http://ncei.noaa.gov/oads/a4.1}equilibrator_sensor"/&gt;
 *         &lt;element name="pressureMeasurement" type="{http://ncei.noaa.gov/oads/a4.1}equilibrator_sensor"/&gt;
 *         &lt;element name="dryMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "equilibrator", namespace = "http://ncei.noaa.gov/oads/a4.1", propOrder = {
    "type",
    "volume",
    "vented",
    "waterFlowRate",
    "gasFlowRate",
    "temperatureMeasurement",
    "pressureMeasurement",
    "dryMethod"
})
public class Equilibrator {

    @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1")
    protected String type;
    @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1")
    protected String volume;
    @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1")
    protected String vented;
    @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1")
    protected String waterFlowRate;
    @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1")
    protected String gasFlowRate;
    @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
    protected EquilibratorSensor temperatureMeasurement;
    @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
    protected EquilibratorSensor pressureMeasurement;
    @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1")
    protected String dryMethod;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the volume property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolume() {
        return volume;
    }

    /**
     * Sets the value of the volume property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolume(String value) {
        this.volume = value;
    }

    /**
     * Gets the value of the vented property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVented() {
        return vented;
    }

    /**
     * Sets the value of the vented property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVented(String value) {
        this.vented = value;
    }

    /**
     * Gets the value of the waterFlowRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaterFlowRate() {
        return waterFlowRate;
    }

    /**
     * Sets the value of the waterFlowRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaterFlowRate(String value) {
        this.waterFlowRate = value;
    }

    /**
     * Gets the value of the gasFlowRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGasFlowRate() {
        return gasFlowRate;
    }

    /**
     * Sets the value of the gasFlowRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGasFlowRate(String value) {
        this.gasFlowRate = value;
    }

    /**
     * Gets the value of the temperatureMeasurement property.
     * 
     * @return
     *     possible object is
     *     {@link EquilibratorSensor }
     *     
     */
    public EquilibratorSensor getTemperatureMeasurement() {
        return temperatureMeasurement;
    }

    /**
     * Sets the value of the temperatureMeasurement property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquilibratorSensor }
     *     
     */
    public void setTemperatureMeasurement(EquilibratorSensor value) {
        this.temperatureMeasurement = value;
    }

    /**
     * Gets the value of the pressureMeasurement property.
     * 
     * @return
     *     possible object is
     *     {@link EquilibratorSensor }
     *     
     */
    public EquilibratorSensor getPressureMeasurement() {
        return pressureMeasurement;
    }

    /**
     * Sets the value of the pressureMeasurement property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquilibratorSensor }
     *     
     */
    public void setPressureMeasurement(EquilibratorSensor value) {
        this.pressureMeasurement = value;
    }

    /**
     * Gets the value of the dryMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDryMethod() {
        return dryMethod;
    }

    /**
     * Sets the value of the dryMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDryMethod(String value) {
        this.dryMethod = value;
    }

}
