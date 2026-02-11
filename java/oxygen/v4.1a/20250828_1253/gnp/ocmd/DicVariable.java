
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dic_variable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dic_variable"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ncei.noaa.gov/oads/a4.1}base_variable"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="poison" type="{http://ncei.noaa.gov/oads/a4.1}poison" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dic_variable", namespace = "http://ncei.noaa.gov/oads/a4.1", propOrder = {
    "poison"
})
@XmlSeeAlso({
    TaVariable.class
})
public class DicVariable
    extends BaseVariable
{

    @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1")
    protected Poison poison;

    /**
     * Gets the value of the poison property.
     * 
     * @return
     *     possible object is
     *     {@link Poison }
     *     
     */
    public Poison getPoison() {
        return poison;
    }

    /**
     * Sets the value of the poison property.
     * 
     * @param value
     *     allowed object is
     *     {@link Poison }
     *     
     */
    public void setPoison(Poison value) {
        this.poison = value;
    }

}
