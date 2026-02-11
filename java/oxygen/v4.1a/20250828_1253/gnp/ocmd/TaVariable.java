
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ta_variable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ta_variable"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ncei.noaa.gov/oads/a4.1}dic_variable"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cellType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="curveFitting" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="blankCorrection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ta_variable", namespace = "http://ncei.noaa.gov/oads/a4.1", propOrder = {
    "cellType",
    "curveFitting",
    "blankCorrection"
})
public class TaVariable
    extends DicVariable
{

    @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
    protected String cellType;
    @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
    protected String curveFitting;
    @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1")
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
