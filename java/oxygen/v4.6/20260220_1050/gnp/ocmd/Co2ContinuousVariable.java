
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for co2_continuous_variable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="co2_continuous_variable"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://ncei.noaa.gov/ocads/v4.6}co2_measured_base"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="equilibrator" type="{https://ncei.noaa.gov/ocads/v4.6}equilibrator" minOccurs="0"/&gt;
 *         &lt;element name="co2_drying_method" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="eq_pressure_measurement" type="{https://ncei.noaa.gov/ocads/v4.6}sensor_measurement"/&gt;
 *         &lt;element name="eq_temperature_measurement" type="{https://ncei.noaa.gov/ocads/v4.6}sensor_measurement"/&gt;
 *         &lt;element name="atm_pressure_measurement" type="{https://ncei.noaa.gov/ocads/v4.6}sensor_measurement"/&gt;
 *         &lt;element name="atm_co2" type="{https://ncei.noaa.gov/ocads/v4.6}atm_co2"/&gt;
 *         &lt;element name="xco2_pco2_calculation_method" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pco2_fco2_calculation_method" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "co2_continuous_variable", namespace = "https://ncei.noaa.gov/ocads/v4.6", propOrder = {
    "equilibrator",
    "co2DryingMethod",
    "eqPressureMeasurement",
    "eqTemperatureMeasurement",
    "atmPressureMeasurement",
    "atmCo2",
    "xco2Pco2CalculationMethod",
    "pco2Fco2CalculationMethod"
})
public class Co2ContinuousVariable
    extends Co2MeasuredBase
{

    @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected Equilibrator equilibrator;
    @XmlElement(name = "co2_drying_method", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected String co2DryingMethod;
    @XmlElement(name = "eq_pressure_measurement", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected SensorMeasurement eqPressureMeasurement;
    @XmlElement(name = "eq_temperature_measurement", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected SensorMeasurement eqTemperatureMeasurement;
    @XmlElement(name = "atm_pressure_measurement", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected SensorMeasurement atmPressureMeasurement;
    @XmlElement(name = "atm_co2", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected AtmCo2 atmCo2;
    @XmlElement(name = "xco2_pco2_calculation_method", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected String xco2Pco2CalculationMethod;
    @XmlElement(name = "pco2_fco2_calculation_method", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected String pco2Fco2CalculationMethod;

    /**
     * Gets the value of the equilibrator property.
     * 
     * @return
     *     possible object is
     *     {@link Equilibrator }
     *     
     */
    public Equilibrator getEquilibrator() {
        return equilibrator;
    }

    /**
     * Sets the value of the equilibrator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Equilibrator }
     *     
     */
    public void setEquilibrator(Equilibrator value) {
        this.equilibrator = value;
    }

    /**
     * Gets the value of the co2DryingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCo2DryingMethod() {
        return co2DryingMethod;
    }

    /**
     * Sets the value of the co2DryingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCo2DryingMethod(String value) {
        this.co2DryingMethod = value;
    }

    /**
     * Gets the value of the eqPressureMeasurement property.
     * 
     * @return
     *     possible object is
     *     {@link SensorMeasurement }
     *     
     */
    public SensorMeasurement getEqPressureMeasurement() {
        return eqPressureMeasurement;
    }

    /**
     * Sets the value of the eqPressureMeasurement property.
     * 
     * @param value
     *     allowed object is
     *     {@link SensorMeasurement }
     *     
     */
    public void setEqPressureMeasurement(SensorMeasurement value) {
        this.eqPressureMeasurement = value;
    }

    /**
     * Gets the value of the eqTemperatureMeasurement property.
     * 
     * @return
     *     possible object is
     *     {@link SensorMeasurement }
     *     
     */
    public SensorMeasurement getEqTemperatureMeasurement() {
        return eqTemperatureMeasurement;
    }

    /**
     * Sets the value of the eqTemperatureMeasurement property.
     * 
     * @param value
     *     allowed object is
     *     {@link SensorMeasurement }
     *     
     */
    public void setEqTemperatureMeasurement(SensorMeasurement value) {
        this.eqTemperatureMeasurement = value;
    }

    /**
     * Gets the value of the atmPressureMeasurement property.
     * 
     * @return
     *     possible object is
     *     {@link SensorMeasurement }
     *     
     */
    public SensorMeasurement getAtmPressureMeasurement() {
        return atmPressureMeasurement;
    }

    /**
     * Sets the value of the atmPressureMeasurement property.
     * 
     * @param value
     *     allowed object is
     *     {@link SensorMeasurement }
     *     
     */
    public void setAtmPressureMeasurement(SensorMeasurement value) {
        this.atmPressureMeasurement = value;
    }

    /**
     * Gets the value of the atmCo2 property.
     * 
     * @return
     *     possible object is
     *     {@link AtmCo2 }
     *     
     */
    public AtmCo2 getAtmCo2() {
        return atmCo2;
    }

    /**
     * Sets the value of the atmCo2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link AtmCo2 }
     *     
     */
    public void setAtmCo2(AtmCo2 value) {
        this.atmCo2 = value;
    }

    /**
     * Gets the value of the xco2Pco2CalculationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXco2Pco2CalculationMethod() {
        return xco2Pco2CalculationMethod;
    }

    /**
     * Sets the value of the xco2Pco2CalculationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXco2Pco2CalculationMethod(String value) {
        this.xco2Pco2CalculationMethod = value;
    }

    /**
     * Gets the value of the pco2Fco2CalculationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPco2Fco2CalculationMethod() {
        return pco2Fco2CalculationMethod;
    }

    /**
     * Sets the value of the pco2Fco2CalculationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPco2Fco2CalculationMethod(String value) {
        this.pco2Fco2CalculationMethod = value;
    }

}
