
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
 *         &lt;element name="volume" type="{https://ncei.noaa.gov/ocads/v4.6}liter_volume" minOccurs="0"/&gt;
 *         &lt;element name="vented" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="gas_flow_rate" type="{https://ncei.noaa.gov/ocads/v4.6}flow_rate" minOccurs="0"/&gt;
 *         &lt;element name="water_flow_rate" type="{https://ncei.noaa.gov/ocads/v4.6}flow_rate" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "equilibrator", namespace = "https://ncei.noaa.gov/ocads/v4.6", propOrder = {
    "type",
    "volume",
    "vented",
    "gasFlowRate",
    "waterFlowRate"
})
public class Equilibrator {

    @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected String type;
    @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected LiterVolume volume;
    @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected Boolean vented;
    @XmlElement(name = "gas_flow_rate", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected FlowRate gasFlowRate;
    @XmlElement(name = "water_flow_rate", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected FlowRate waterFlowRate;

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
     *     {@link LiterVolume }
     *     
     */
    public LiterVolume getVolume() {
        return volume;
    }

    /**
     * Sets the value of the volume property.
     * 
     * @param value
     *     allowed object is
     *     {@link LiterVolume }
     *     
     */
    public void setVolume(LiterVolume value) {
        this.volume = value;
    }

    /**
     * Gets the value of the vented property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVented() {
        return vented;
    }

    /**
     * Sets the value of the vented property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVented(Boolean value) {
        this.vented = value;
    }

    /**
     * Gets the value of the gasFlowRate property.
     * 
     * @return
     *     possible object is
     *     {@link FlowRate }
     *     
     */
    public FlowRate getGasFlowRate() {
        return gasFlowRate;
    }

    /**
     * Sets the value of the gasFlowRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlowRate }
     *     
     */
    public void setGasFlowRate(FlowRate value) {
        this.gasFlowRate = value;
    }

    /**
     * Gets the value of the waterFlowRate property.
     * 
     * @return
     *     possible object is
     *     {@link FlowRate }
     *     
     */
    public FlowRate getWaterFlowRate() {
        return waterFlowRate;
    }

    /**
     * Sets the value of the waterFlowRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlowRate }
     *     
     */
    public void setWaterFlowRate(FlowRate value) {
        this.waterFlowRate = value;
    }

}
