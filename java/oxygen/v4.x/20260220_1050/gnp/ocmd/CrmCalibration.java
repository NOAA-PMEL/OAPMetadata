
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for crm_calibration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="crm_calibration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://ncei.noaa.gov/ocads/v4.6}basic_calibration_info"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="certified_reference_material" type="{https://ncei.noaa.gov/ocads/v4.6}crm_info"/&gt;
 *         &lt;element name="reported_values_adjusted_to_crm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "crm_calibration", namespace = "https://ncei.noaa.gov/ocads/v4.6", propOrder = {
    "certifiedReferenceMaterial",
    "reportedValuesAdjustedToCrm"
})
public class CrmCalibration
    extends BasicCalibrationInfo
{

    @XmlElement(name = "certified_reference_material", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected CrmInfo certifiedReferenceMaterial;
    @XmlElement(name = "reported_values_adjusted_to_crm", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected Boolean reportedValuesAdjustedToCrm;

    /**
     * Gets the value of the certifiedReferenceMaterial property.
     * 
     * @return
     *     possible object is
     *     {@link CrmInfo }
     *     
     */
    public CrmInfo getCertifiedReferenceMaterial() {
        return certifiedReferenceMaterial;
    }

    /**
     * Sets the value of the certifiedReferenceMaterial property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrmInfo }
     *     
     */
    public void setCertifiedReferenceMaterial(CrmInfo value) {
        this.certifiedReferenceMaterial = value;
    }

    /**
     * Gets the value of the reportedValuesAdjustedToCrm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReportedValuesAdjustedToCrm() {
        return reportedValuesAdjustedToCrm;
    }

    /**
     * Sets the value of the reportedValuesAdjustedToCrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReportedValuesAdjustedToCrm(Boolean value) {
        this.reportedValuesAdjustedToCrm = value;
    }

}
