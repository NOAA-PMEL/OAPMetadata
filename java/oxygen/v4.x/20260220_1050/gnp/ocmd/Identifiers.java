
package gnp.ocmd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for identifiers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="identifiers"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="expocodes" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="expocode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="cruise_ids" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="cruise_id" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="station_ids" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="station_id" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="transect_ids" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="transect_id" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "identifiers", namespace = "https://ncei.noaa.gov/ocads/v4.6", propOrder = {
    "expocodes",
    "cruiseIds",
    "stationIds",
    "transectIds"
})
public class Identifiers {

    @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected Identifiers.Expocodes expocodes;
    @XmlElement(name = "cruise_ids", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected Identifiers.CruiseIds cruiseIds;
    @XmlElement(name = "station_ids", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected Identifiers.StationIds stationIds;
    @XmlElement(name = "transect_ids", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected Identifiers.TransectIds transectIds;

    /**
     * Gets the value of the expocodes property.
     * 
     * @return
     *     possible object is
     *     {@link Identifiers.Expocodes }
     *     
     */
    public Identifiers.Expocodes getExpocodes() {
        return expocodes;
    }

    /**
     * Sets the value of the expocodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifiers.Expocodes }
     *     
     */
    public void setExpocodes(Identifiers.Expocodes value) {
        this.expocodes = value;
    }

    /**
     * Gets the value of the cruiseIds property.
     * 
     * @return
     *     possible object is
     *     {@link Identifiers.CruiseIds }
     *     
     */
    public Identifiers.CruiseIds getCruiseIds() {
        return cruiseIds;
    }

    /**
     * Sets the value of the cruiseIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifiers.CruiseIds }
     *     
     */
    public void setCruiseIds(Identifiers.CruiseIds value) {
        this.cruiseIds = value;
    }

    /**
     * Gets the value of the stationIds property.
     * 
     * @return
     *     possible object is
     *     {@link Identifiers.StationIds }
     *     
     */
    public Identifiers.StationIds getStationIds() {
        return stationIds;
    }

    /**
     * Sets the value of the stationIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifiers.StationIds }
     *     
     */
    public void setStationIds(Identifiers.StationIds value) {
        this.stationIds = value;
    }

    /**
     * Gets the value of the transectIds property.
     * 
     * @return
     *     possible object is
     *     {@link Identifiers.TransectIds }
     *     
     */
    public Identifiers.TransectIds getTransectIds() {
        return transectIds;
    }

    /**
     * Sets the value of the transectIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifiers.TransectIds }
     *     
     */
    public void setTransectIds(Identifiers.TransectIds value) {
        this.transectIds = value;
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
     *       &lt;sequence&gt;
     *         &lt;element name="cruise_id" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "cruiseId"
    })
    public static class CruiseIds {

        @XmlElement(name = "cruise_id", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
        protected List<String> cruiseId;

        /**
         * Gets the value of the cruiseId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cruiseId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCruiseId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getCruiseId() {
            if (cruiseId == null) {
                cruiseId = new ArrayList<String>();
            }
            return this.cruiseId;
        }

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
     *       &lt;sequence&gt;
     *         &lt;element name="expocode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "expocode"
    })
    public static class Expocodes {

        @XmlElement(namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
        protected List<String> expocode;

        /**
         * Gets the value of the expocode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the expocode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getExpocode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getExpocode() {
            if (expocode == null) {
                expocode = new ArrayList<String>();
            }
            return this.expocode;
        }

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
     *       &lt;sequence&gt;
     *         &lt;element name="station_id" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "stationId"
    })
    public static class StationIds {

        @XmlElement(name = "station_id", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
        protected List<String> stationId;

        /**
         * Gets the value of the stationId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the stationId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStationId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getStationId() {
            if (stationId == null) {
                stationId = new ArrayList<String>();
            }
            return this.stationId;
        }

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
     *       &lt;sequence&gt;
     *         &lt;element name="transect_id" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "transectId"
    })
    public static class TransectIds {

        @XmlElement(name = "transect_id", namespace = "https://ncei.noaa.gov/ocads/v4.6", required = true)
        protected List<String> transectId;

        /**
         * Gets the value of the transectId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the transectId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTransectId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getTransectId() {
            if (transectId == null) {
                transectId = new ArrayList<String>();
            }
            return this.transectId;
        }

    }

}
