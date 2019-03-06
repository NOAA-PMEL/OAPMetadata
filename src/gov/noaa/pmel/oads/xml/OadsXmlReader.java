/**
 * 
 */
package gov.noaa.pmel.oads.xml;

import java.io.FileReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;

import gov.noaa.pmel.oads.v_a0_2.OadsMetadataDocumentType;

/**
 * @author kamb
 *
 */
public class OadsXmlReader {

    /**
     * 
     */
    public OadsXmlReader() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        String filename = args.length > 0 ? args[0] : "versions/a0.2/sample_b0.2.xml";
        try ( FileReader xmlReader = new FileReader(filename); ) {
            JAXBContext content =  JAXBContext.newInstance(OadsMetadataDocumentType.class);
            Unmarshaller unmarshaller = content.createUnmarshaller();
            StreamSource source = new StreamSource(xmlReader);
            Object obj =  unmarshaller.unmarshal(source, OadsMetadataDocumentType.class);
            JAXBElement<OadsMetadataDocumentType> jobj =  (JAXBElement<OadsMetadataDocumentType>)obj;
            Object maybe = jobj.getValue();
            OadsMetadataDocumentType metadata = (OadsMetadataDocumentType) maybe;
            System.out.println(metadata);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}
