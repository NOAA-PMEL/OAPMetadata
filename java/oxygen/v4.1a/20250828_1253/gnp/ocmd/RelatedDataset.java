
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for related_dataset complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="related_dataset"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="link" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="decription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "related_dataset", namespace = "http://ncei.noaa.gov/oads/a4.1", propOrder = {
    "link",
    "title",
    "decription"
})
public class RelatedDataset {

    @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String link;
    @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1")
    protected String title;
    @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1")
    protected String decription;

    /**
     * Gets the value of the link property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLink() {
        return link;
    }

    /**
     * Sets the value of the link property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLink(String value) {
        this.link = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the decription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecription() {
        return decription;
    }

    /**
     * Sets the value of the decription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecription(String value) {
        this.decription = value;
    }

}
