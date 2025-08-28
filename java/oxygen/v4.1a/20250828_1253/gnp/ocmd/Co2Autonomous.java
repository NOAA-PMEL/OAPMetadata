
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for co2_autonomous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="co2_autonomous"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ncei.noaa.gov/oads/a4.1}co2_base"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="locationSeawaterIntake" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="depthSeawaterIntake" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="equilibrator" type="{http://ncei.noaa.gov/oads/a4.1}equilibrator" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "co2_autonomous", namespace = "http://ncei.noaa.gov/oads/a4.1", propOrder = {
    "locationSeawaterIntake",
    "depthSeawaterIntake",
    "equilibrator"
})
public class Co2Autonomous
    extends Co2Base
{

    @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1")
    protected String locationSeawaterIntake;
    @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1")
    protected String depthSeawaterIntake;
    @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1")
    protected Equilibrator equilibrator;

    /**
     * Gets the value of the locationSeawaterIntake property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationSeawaterIntake() {
        return locationSeawaterIntake;
    }

    /**
     * Sets the value of the locationSeawaterIntake property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationSeawaterIntake(String value) {
        this.locationSeawaterIntake = value;
    }

    /**
     * Gets the value of the depthSeawaterIntake property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepthSeawaterIntake() {
        return depthSeawaterIntake;
    }

    /**
     * Sets the value of the depthSeawaterIntake property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepthSeawaterIntake(String value) {
        this.depthSeawaterIntake = value;
    }

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

}
