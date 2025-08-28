
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
 *     &lt;extension base="{http://ncei.noaa.gov/oads/a4.1}base_calibration_info"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="certified_ref_matl" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "crm_calibration", namespace = "http://ncei.noaa.gov/oads/a4.1", propOrder = {
    "certifiedRefMatl"
})
public class CrmCalibration
    extends BaseCalibrationInfo
{

    @XmlElement(name = "certified_ref_matl", namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
    protected Object certifiedRefMatl;

    /**
     * Gets the value of the certifiedRefMatl property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCertifiedRefMatl() {
        return certifiedRefMatl;
    }

    /**
     * Sets the value of the certifiedRefMatl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCertifiedRefMatl(Object value) {
        this.certifiedRefMatl = value;
    }

}
