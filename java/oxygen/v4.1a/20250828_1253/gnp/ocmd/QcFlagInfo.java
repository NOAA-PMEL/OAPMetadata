
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for qc_flag_info complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="qc_flag_info"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="flagging_scheme"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="scheme" type="{http://ncei.noaa.gov/oads/a4.1}URI_reference"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="qc_flag_varname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "qc_flag_info", namespace = "http://ncei.noaa.gov/oads/a4.1", propOrder = {
    "flaggingScheme",
    "qcFlagVarname"
})
public class QcFlagInfo {

    @XmlElement(name = "flagging_scheme", namespace = "http://ncei.noaa.gov/oads/a4.1", required = true)
    protected QcFlagInfo.FlaggingScheme flaggingScheme;
    @XmlElement(name = "qc_flag_varname", namespace = "http://ncei.noaa.gov/oads/a4.1")
    protected String qcFlagVarname;

    /**
     * Gets the value of the flaggingScheme property.
     * 
     * @return
     *     possible object is
     *     {@link QcFlagInfo.FlaggingScheme }
     *     
     */
    public QcFlagInfo.FlaggingScheme getFlaggingScheme() {
        return flaggingScheme;
    }

    /**
     * Sets the value of the flaggingScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link QcFlagInfo.FlaggingScheme }
     *     
     */
    public void setFlaggingScheme(QcFlagInfo.FlaggingScheme value) {
        this.flaggingScheme = value;
    }

    /**
     * Gets the value of the qcFlagVarname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQcFlagVarname() {
        return qcFlagVarname;
    }

    /**
     * Sets the value of the qcFlagVarname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQcFlagVarname(String value) {
        this.qcFlagVarname = value;
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
     *       &lt;choice&gt;
     *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;sequence&gt;
     *           &lt;element name="scheme" type="{http://ncei.noaa.gov/oads/a4.1}URI_reference"/&gt;
     *         &lt;/sequence&gt;
     *       &lt;/choice&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "description",
        "scheme"
    })
    public static class FlaggingScheme {

        @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1")
        protected String description;
        @XmlElement(namespace = "http://ncei.noaa.gov/oads/a4.1")
        protected URIReference scheme;

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescription() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescription(String value) {
            this.description = value;
        }

        /**
         * Gets the value of the scheme property.
         * 
         * @return
         *     possible object is
         *     {@link URIReference }
         *     
         */
        public URIReference getScheme() {
            return scheme;
        }

        /**
         * Sets the value of the scheme property.
         * 
         * @param value
         *     allowed object is
         *     {@link URIReference }
         *     
         */
        public void setScheme(URIReference value) {
            this.scheme = value;
        }

    }

}
