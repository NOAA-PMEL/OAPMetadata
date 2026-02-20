
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gridded_product complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gridded_product"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://ncei.noaa.gov/ocads/v4.6}data_product"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="grid_resolution" type="{https://ncei.noaa.gov/ocads/v4.6}grid_resolution" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gridded_product", namespace = "https://ncei.noaa.gov/ocads/v4.6", propOrder = {
    "gridResolution"
})
public class GriddedProduct
    extends DataProduct
{

    @XmlElement(name = "grid_resolution", namespace = "https://ncei.noaa.gov/ocads/v4.6")
    protected GridResolution gridResolution;

    /**
     * Gets the value of the gridResolution property.
     * 
     * @return
     *     possible object is
     *     {@link GridResolution }
     *     
     */
    public GridResolution getGridResolution() {
        return gridResolution;
    }

    /**
     * Sets the value of the gridResolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link GridResolution }
     *     
     */
    public void setGridResolution(GridResolution value) {
        this.gridResolution = value;
    }

}
