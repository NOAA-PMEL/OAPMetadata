
package gnp.ocmd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for instrument_base complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="instrument_base"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://ncei.noaa.gov/ocads/v4.6}instrument"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{https://ncei.noaa.gov/ocads/v4.6}base_instrument"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "instrument_base", namespace = "https://ncei.noaa.gov/ocads/v4.6", propOrder = {
    "type",
    "manufacturer",
    "model",
    "serial",
    "description",
    "reference",
    "accuracy",
    "precision",
    "uncertainty"
})
@XmlSeeAlso({
    StandardInstrument.class,
    CrmInstrument.class,
    PHInstrument.class,
    Co2GasDetector.class
})
public abstract class InstrumentBase
    extends Instrument
{

    @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected String type;
    @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected String manufacturer;
    @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected String model;
    @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected String serial;
    @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected String description;
    @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected List<URIReference> reference;
    @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected DimensionedQuantity accuracy;
    @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected DimensionedQuantity precision;
    @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected DimensionedQuantity uncertainty;

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
     * Gets the value of the manufacturer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * Sets the value of the manufacturer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturer(String value) {
        this.manufacturer = value;
    }

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModel(String value) {
        this.model = value;
    }

    /**
     * Gets the value of the serial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerial() {
        return serial;
    }

    /**
     * Sets the value of the serial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerial(String value) {
        this.serial = value;
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
     * Gets the value of the reference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link URIReference }
     * 
     * 
     */
    public List<URIReference> getReference() {
        if (reference == null) {
            reference = new ArrayList<URIReference>();
        }
        return this.reference;
    }

    /**
     * Gets the value of the accuracy property.
     * 
     * @return
     *     possible object is
     *     {@link DimensionedQuantity }
     *     
     */
    public DimensionedQuantity getAccuracy() {
        return accuracy;
    }

    /**
     * Sets the value of the accuracy property.
     * 
     * @param value
     *     allowed object is
     *     {@link DimensionedQuantity }
     *     
     */
    public void setAccuracy(DimensionedQuantity value) {
        this.accuracy = value;
    }

    /**
     * Gets the value of the precision property.
     * 
     * @return
     *     possible object is
     *     {@link DimensionedQuantity }
     *     
     */
    public DimensionedQuantity getPrecision() {
        return precision;
    }

    /**
     * Sets the value of the precision property.
     * 
     * @param value
     *     allowed object is
     *     {@link DimensionedQuantity }
     *     
     */
    public void setPrecision(DimensionedQuantity value) {
        this.precision = value;
    }

    /**
     * Gets the value of the uncertainty property.
     * 
     * @return
     *     possible object is
     *     {@link DimensionedQuantity }
     *     
     */
    public DimensionedQuantity getUncertainty() {
        return uncertainty;
    }

    /**
     * Sets the value of the uncertainty property.
     * 
     * @param value
     *     allowed object is
     *     {@link DimensionedQuantity }
     *     
     */
    public void setUncertainty(DimensionedQuantity value) {
        this.uncertainty = value;
    }

}
