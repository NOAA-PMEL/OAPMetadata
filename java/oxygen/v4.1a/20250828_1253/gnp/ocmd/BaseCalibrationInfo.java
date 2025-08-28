
package gnp.ocmd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for base_calibration_info complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="base_calibration_info"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="technique_description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="method_reference" type="{http://ncei.noaa.gov/oads/a4.1}reference_or_description"/&gt;
 *         &lt;element name="frequency" type="{http://ncei.noaa.gov/oads/a4.1}dimensioned_quantity" minOccurs="0"/&gt;
 *         &lt;element name="last_calibration" type="{http://ncei.noaa.gov/oads/a4.1}calibration_event" minOccurs="0"/&gt;
 *         &lt;element name="calibration_history" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="calibration" type="{http://ncei.noaa.gov/oads/a4.1}calibration_event" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "base_calibration_info", namespace = "http://ncei.noaa.gov/oads/a4.1", propOrder = {
    "techniqueDescription",
    "methodReference",
    "frequency",
    "lastCalibration",
    "calibrationHistory"
})
@XmlSeeAlso({
    CrmCalibration.class
})
public class BaseCalibrationInfo {

    @XmlElement(name = "technique_description", namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
    protected String techniqueDescription;
    @XmlElement(name = "method_reference", namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
    protected ReferenceOrDescription methodReference;
    @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1")
    protected DimensionedQuantity frequency;
    @XmlElement(name = "last_calibration", namespace = "http://ncei.noaa.gov/oads/a4.1")
    protected CalibrationEvent lastCalibration;
    @XmlElement(name = "calibration_history", namespace = "http://ncei.noaa.gov/oads/a4.1")
    protected BaseCalibrationInfo.CalibrationHistory calibrationHistory;

    /**
     * Gets the value of the techniqueDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechniqueDescription() {
        return techniqueDescription;
    }

    /**
     * Sets the value of the techniqueDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechniqueDescription(String value) {
        this.techniqueDescription = value;
    }

    /**
     * Gets the value of the methodReference property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceOrDescription }
     *     
     */
    public ReferenceOrDescription getMethodReference() {
        return methodReference;
    }

    /**
     * Sets the value of the methodReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceOrDescription }
     *     
     */
    public void setMethodReference(ReferenceOrDescription value) {
        this.methodReference = value;
    }

    /**
     * Gets the value of the frequency property.
     * 
     * @return
     *     possible object is
     *     {@link DimensionedQuantity }
     *     
     */
    public DimensionedQuantity getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link DimensionedQuantity }
     *     
     */
    public void setFrequency(DimensionedQuantity value) {
        this.frequency = value;
    }

    /**
     * Gets the value of the lastCalibration property.
     * 
     * @return
     *     possible object is
     *     {@link CalibrationEvent }
     *     
     */
    public CalibrationEvent getLastCalibration() {
        return lastCalibration;
    }

    /**
     * Sets the value of the lastCalibration property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalibrationEvent }
     *     
     */
    public void setLastCalibration(CalibrationEvent value) {
        this.lastCalibration = value;
    }

    /**
     * Gets the value of the calibrationHistory property.
     * 
     * @return
     *     possible object is
     *     {@link BaseCalibrationInfo.CalibrationHistory }
     *     
     */
    public BaseCalibrationInfo.CalibrationHistory getCalibrationHistory() {
        return calibrationHistory;
    }

    /**
     * Sets the value of the calibrationHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseCalibrationInfo.CalibrationHistory }
     *     
     */
    public void setCalibrationHistory(BaseCalibrationInfo.CalibrationHistory value) {
        this.calibrationHistory = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="calibration" type="{http://ncei.noaa.gov/oads/a4.1}calibration_event" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "calibration"
    })
    public static class CalibrationHistory {

        @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
        protected List<CalibrationEvent> calibration;

        /**
         * Gets the value of the calibration property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the calibration property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCalibration().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CalibrationEvent }
         * 
         * 
         */
        public List<CalibrationEvent> getCalibration() {
            if (calibration == null) {
                calibration = new ArrayList<CalibrationEvent>();
            }
            return this.calibration;
        }

    }

}
