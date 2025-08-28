
package gnp.ocmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 *  An inline instrument element referencing a concrete representation in the
 *         instruments collection. 
 * 
 * <p>Java class for instrument_ref complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="instrument_ref"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://ncei.noaa.gov/oads/a4.1}element_reference"&gt;
 *       &lt;attribute name="object_class" type="{http://www.w3.org/2001/XMLSchema}string" fixed="oads:Instrument" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "instrument_ref", namespace = "http://ncei.noaa.gov/oads/a4.1")
public abstract class InstrumentRef
    extends ElementReference
{


}
