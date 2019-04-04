/**
 * 
 */
package gov.noaa.pmel.oads.xml.a0_4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.stream.StreamSource;

import gov.noaa.ncei.oads.xml.v_a0_4.OadsMetadataDocumentType;

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

    public static OadsMetadataDocumentType read(File xmlFile) {
        throw new IllegalStateException("Not implemented");
    }
    public static OadsMetadataDocumentType read(InputStream inStream) {
        throw new IllegalStateException("Not implemented");
    }
    public static OadsMetadataDocumentType read(String xmlText) {
        throw new IllegalStateException("Not implemented");
    }
    public static OadsMetadataDocumentType read(org.w3c.dom.Document xmlDocument) throws JAXBException {
        OadsMetadataDocumentType metadata = null;
        JAXBContext context = JAXBContext.newInstance(OadsMetadataDocumentType.class.getPackage().getName());
        Unmarshaller unmarshaller = context.createUnmarshaller();
        JAXBElement<OadsMetadataDocumentType> jbe = 
            (JAXBElement<OadsMetadataDocumentType>) unmarshaller.unmarshal(xmlDocument, OadsMetadataDocumentType.class);
        metadata = jbe.getValue();
        return metadata;
    }
    
    private static org.w3c.dom.Document getXdoc(InputStream is) throws Exception {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setNamespaceAware(true);
        DocumentBuilder db = dbf.newDocumentBuilder();
        org.w3c.dom.Document doc = db.parse(is);
        return doc;
    }
    /**
     * @param args
     */
    public static void _main(String[] args) {
        String filename = args.length > 0 ? args[0] : "versions/a0.2.2/sample_a0.2.2.xml";
//        TypedIdentifierType.builder().value("value").type("type").build();
        try ( FileReader xmlReader = new FileReader(filename); ) {
            JAXBContext content =  JAXBContext.newInstance(OadsMetadataDocumentType.class);
            Unmarshaller unmarshaller = content.createUnmarshaller();
            StreamSource source = new StreamSource(xmlReader);
            Object obj =  unmarshaller.unmarshal(source, OadsMetadataDocumentType.class);
            JAXBElement<OadsMetadataDocumentType> jobj =  (JAXBElement<OadsMetadataDocumentType>)obj;
            Object maybe = jobj.getValue();
            OadsMetadataDocumentType metadata = (OadsMetadataDocumentType) maybe;
            OadsXmlWriter.writeXml(metadata, new File("oads_output.xml"));
            String xml = OadsXmlWriter.getXml(metadata);
            System.out.println(xml);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String filename = args.length > 0 ? args[0] : "versions/a0.2.2/sample_a0.2.2.xml";
        try (InputStream is = new FileInputStream(filename)) {
            org.w3c.dom.Document doc = getXdoc(is);
            OadsMetadataDocumentType metadata = read(doc);
            System.out.println(metadata);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }
}
