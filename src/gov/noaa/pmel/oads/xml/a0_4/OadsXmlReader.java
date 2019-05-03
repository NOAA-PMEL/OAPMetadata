/**
 * 
 */
package gov.noaa.pmel.oads.xml.a0_4;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.stream.StreamSource;

import org.xml.sax.SAXException;

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

    public static OadsMetadataDocumentType read(File xmlFile) 
            throws JAXBException, SAXException, IOException, Exception {
        return read(getDocBuilder().parse(xmlFile));
    }
    public static OadsMetadataDocumentType read(InputStream inStream) 
            throws JAXBException, SAXException, IOException, Exception {
        return read(getDocBuilder().parse(inStream));
    }
    public static OadsMetadataDocumentType read(String xmlText) 
            throws JAXBException, SAXException, IOException, Exception {
        return read(getDocBuilder().parse(new ByteArrayInputStream(xmlText.getBytes())));
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
    
    private static DocumentBuilder getDocBuilder() throws Exception {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setNamespaceAware(true);
        DocumentBuilder db = dbf.newDocumentBuilder();
        return db;
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
        String filename = args.length > 0 ? args[0] : "test/data/a0.4/sample_a0.4.xml";
        try (InputStream is = new FileInputStream(filename)) {
            OadsMetadataDocumentType metadata = read(is);
            System.out.println(metadata);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }
}
