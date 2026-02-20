
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TA_measured complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TA_measured"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://ncei.noaa.gov/ocads/v4.6}DIC_measured"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cell_type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="curve_fitting" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="blank_correction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TA_measured", namespace = "https://ncei.noaa.gov/ocads/v4.6", propOrder = {
    "cellType",
    "curveFitting",
    "blankCorrection"
})
public class TAMeasured
    extends DICMeasured
{

    @XmlElement(name = "cell_type", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected String cellType;
    @XmlElement(name = "curve_fitting", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
    protected String curveFitting;
    @XmlElement(name = "blank_correction", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected String blankCorrection;

    /**
     * Gets the value of the cellType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellType() {
        return cellType;
    }

    /**
     * Sets the value of the cellType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellType(String value) {
        this.cellType = value;
    }

    /**
     * Gets the value of the curveFitting property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurveFitting() {
        return curveFitting;
    }

    /**
     * Sets the value of the curveFitting property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurveFitting(String value) {
        this.curveFitting = value;
    }

    /**
     * Gets the value of the blankCorrection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlankCorrection() {
        return blankCorrection;
    }

    /**
     * Sets the value of the blankCorrection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlankCorrection(String value) {
        this.blankCorrection = value;
    }

}
