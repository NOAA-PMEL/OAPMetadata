
package gnp.ocmd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for basic_calibration_info complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="basic_calibration_info"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://ncei.noaa.gov/ocads/v4.6}calibration"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="technique_description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="method_reference" type="{https://ncei.noaa.gov/ocads/v4.6}reference_or_description"/&gt;
 *         &lt;element name="frequency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="last_calibration" type="{https://ncei.noaa.gov/ocads/v4.6}calibration_event"/&gt;
 *           &lt;element name="calibration_history"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="calibration" type="{https://ncei.noaa.gov/ocads/v4.6}calibration_event" maxOccurs="unbounded"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="calibration_certificate_info" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "basic_calibration_info", namespace = "https://ncei.noaa.gov/ocads/v4.6", propOrder = {
    "techniqueDescription",
    "methodReference",
    "frequency",
    "lastCalibration",
    "calibrationHistory",
    "calibrationCertificateInfo"
})
@XmlSeeAlso({
    CrmCalibration.class,
    PHCalibration.class,
    Co2Calibration.class
})
public class BasicCalibrationInfo
    extends Calibration
{

    @XmlElement(name = "technique_description", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected String techniqueDescription;
    @XmlElement(name = "method_reference", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected ReferenceOrDescription methodReference;
    @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected String frequency;
    @XmlElement(name = "last_calibration", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected CalibrationEvent lastCalibration;
    @XmlElement(name = "calibration_history", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected BasicCalibrationInfo.CalibrationHistory calibrationHistory;
    @XmlElement(name = "calibration_certificate_info", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected String calibrationCertificateInfo;

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
     *     {@link BasicCalibrationInfo.CalibrationHistory }
     *     
     */
    public BasicCalibrationInfo.CalibrationHistory getCalibrationHistory() {
        return calibrationHistory;
    }

    /**
     * Sets the value of the calibrationHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicCalibrationInfo.CalibrationHistory }
     *     
     */
    public void setCalibrationHistory(BasicCalibrationInfo.CalibrationHistory value) {
        this.calibrationHistory = value;
    }

    /**
     * Gets the value of the calibrationCertificateInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalibrationCertificateInfo() {
        return calibrationCertificateInfo;
    }

    /**
     * Sets the value of the calibrationCertificateInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalibrationCertificateInfo(String value) {
        this.calibrationCertificateInfo = value;
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
     *         &lt;element name="calibration" type="{https://ncei.noaa.gov/ocads/v4.6}calibration_event" maxOccurs="unbounded"/&gt;
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

        @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
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
