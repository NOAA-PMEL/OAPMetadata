
package gnp.ocmd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for co2_calibration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="co2_calibration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://ncei.noaa.gov/ocads/v4.6}basic_calibration_info"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="calibration_temperature" type="{https://ncei.noaa.gov/ocads/v4.6}measured_value" minOccurs="0"/&gt;
 *         &lt;element name="standard_gases"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="gas" type="{https://ncei.noaa.gov/ocads/v4.6}standard_gas" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="wmo_traceable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "co2_calibration", namespace = "https://ncei.noaa.gov/ocads/v4.6", propOrder = {
    "calibrationTemperature",
    "standardGases"
})
public class Co2Calibration
    extends BasicCalibrationInfo
{

    @XmlElement(name = "calibration_temperature", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected MeasuredValue calibrationTemperature;
    @XmlElement(name = "standard_gases", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected Co2Calibration.StandardGases standardGases;

    /**
     * Gets the value of the calibrationTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link MeasuredValue }
     *     
     */
    public MeasuredValue getCalibrationTemperature() {
        return calibrationTemperature;
    }

    /**
     * Sets the value of the calibrationTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredValue }
     *     
     */
    public void setCalibrationTemperature(MeasuredValue value) {
        this.calibrationTemperature = value;
    }

    /**
     * Gets the value of the standardGases property.
     * 
     * @return
     *     possible object is
     *     {@link Co2Calibration.StandardGases }
     *     
     */
    public Co2Calibration.StandardGases getStandardGases() {
        return standardGases;
    }

    /**
     * Sets the value of the standardGases property.
     * 
     * @param value
     *     allowed object is
     *     {@link Co2Calibration.StandardGases }
     *     
     */
    public void setStandardGases(Co2Calibration.StandardGases value) {
        this.standardGases = value;
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
     *         &lt;element name="gas" type="{https://ncei.noaa.gov/ocads/v4.6}standard_gas" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="wmo_traceable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
        "gas",
        "wmoTraceable"
    })
    public static class StandardGases {

        @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6")
        protected List<StandardGas> gas;
        @XmlElement(name = "wmo_traceable", namespace = "https://ncei.noaa.gov/ocads/v4.6")
        protected boolean wmoTraceable;

        /**
         * Gets the value of the gas property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the gas property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGas().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link StandardGas }
         * 
         * 
         */
        public List<StandardGas> getGas() {
            if (gas == null) {
                gas = new ArrayList<StandardGas>();
            }
            return this.gas;
        }

        /**
         * Gets the value of the wmoTraceable property.
         * 
         */
        public boolean isWmoTraceable() {
            return wmoTraceable;
        }

        /**
         * Sets the value of the wmoTraceable property.
         * 
         */
        public void setWmoTraceable(boolean value) {
            this.wmoTraceable = value;
        }

    }

}
