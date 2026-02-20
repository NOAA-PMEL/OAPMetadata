
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for measured_var_info complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="measured_var_info"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="collection_method" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="collection_instrument_type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sampling" type="{https://ncei.noaa.gov/ocads/v4.6}sampling_info"/&gt;
 *         &lt;element name="analysis_method" type="{https://ncei.noaa.gov/ocads/v4.6}reference_or_description"/&gt;
 *         &lt;element name="deviations_from_method" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sensor_data_conversion" type="{https://ncei.noaa.gov/ocads/v4.6}sensor_data_conversion" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "measured_var_info", namespace = "https://ncei.noaa.gov/ocads/v4.6", propOrder = {
    "collectionMethod",
    "collectionInstrumentType",
    "sampling",
    "analysisMethod",
    "deviationsFromMethod",
    "sensorDataConversion"
})
public class MeasuredVarInfo {

    @XmlElement(name = "collection_method", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected String collectionMethod;
    @XmlElement(name = "collection_instrument_type", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected String collectionInstrumentType;
    @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected SamplingInfo sampling;
    @XmlElement(name = "analysis_method", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected ReferenceOrDescription analysisMethod;
    @XmlElement(name = "deviations_from_method", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected String deviationsFromMethod;
    @XmlElement(name = "sensor_data_conversion", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected SensorDataConversion sensorDataConversion;

    /**
     * Gets the value of the collectionMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectionMethod() {
        return collectionMethod;
    }

    /**
     * Sets the value of the collectionMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectionMethod(String value) {
        this.collectionMethod = value;
    }

    /**
     * Gets the value of the collectionInstrumentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectionInstrumentType() {
        return collectionInstrumentType;
    }

    /**
     * Sets the value of the collectionInstrumentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectionInstrumentType(String value) {
        this.collectionInstrumentType = value;
    }

    /**
     * Gets the value of the sampling property.
     * 
     * @return
     *     possible object is
     *     {@link SamplingInfo }
     *     
     */
    public SamplingInfo getSampling() {
        return sampling;
    }

    /**
     * Sets the value of the sampling property.
     * 
     * @param value
     *     allowed object is
     *     {@link SamplingInfo }
     *     
     */
    public void setSampling(SamplingInfo value) {
        this.sampling = value;
    }

    /**
     * Gets the value of the analysisMethod property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceOrDescription }
     *     
     */
    public ReferenceOrDescription getAnalysisMethod() {
        return analysisMethod;
    }

    /**
     * Sets the value of the analysisMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceOrDescription }
     *     
     */
    public void setAnalysisMethod(ReferenceOrDescription value) {
        this.analysisMethod = value;
    }

    /**
     * Gets the value of the deviationsFromMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviationsFromMethod() {
        return deviationsFromMethod;
    }

    /**
     * Sets the value of the deviationsFromMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviationsFromMethod(String value) {
        this.deviationsFromMethod = value;
    }

    /**
     * Gets the value of the sensorDataConversion property.
     * 
     * @return
     *     possible object is
     *     {@link SensorDataConversion }
     *     
     */
    public SensorDataConversion getSensorDataConversion() {
        return sensorDataConversion;
    }

    /**
     * Sets the value of the sensorDataConversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link SensorDataConversion }
     *     
     */
    public void setSensorDataConversion(SensorDataConversion value) {
        this.sensorDataConversion = value;
    }

}
