/**
 * 
 */
package gov.noaa.pmel.oads.xml.a0_4;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Date;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import gov.noaa.ncei.oads.xml.v_a0_4.OadsMetadataDocumentType;
import gov.noaa.ncei.oads.xml.v_a0_4.ObjectFactory;
import gov.noaa.ncei.oads.xml.v_a0_4.PersonContactInfoType;
import gov.noaa.ncei.oads.xml.v_a0_4.PersonNameType;
import gov.noaa.ncei.oads.xml.v_a0_4.PersonType;
import gov.noaa.ncei.oads.xml.v_a0_4.TemporalExtentsType;

/**
 * @author kamb
 *
 */
public class OadsXmlWriter {

    public static String getXml(OadsMetadataDocumentType metadata) throws JAXBException, IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        outputXml(metadata, baos);
        String xml = new String(baos.toByteArray());
        return xml;
    }
    public static void writeXml(OadsMetadataDocumentType metadata, File outputFile) throws JAXBException, IOException {
        try ( FileOutputStream fos = new FileOutputStream(outputFile)) {
            outputXml(metadata, fos);
        }
    }
    public static void outputXml(OadsMetadataDocumentType metadata, OutputStream os) throws JAXBException, IOException {
        JAXBContext content =  JAXBContext.newInstance(OadsMetadataDocumentType.class);
        Marshaller marshaller = content.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        marshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, "http://ncei.noaa.gov/oads/v_a0_4 "
                                + " file:///Users/kamb/workspace/oads_xml/versions/a0.2.2/oads_metadata_a0.2.2.xsd");
        marshaller.setListener(new EmptyCollectionMarshaller());
        marshaller.marshal(new ObjectFactory().createOadsMetadata(metadata), os);
        os.flush();
    }
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        try {
            PersonType person = PersonType.builder()
                                   .name(PersonNameType.builder()
                                         .first("Linus")
                                         .middle("J")
                                         .last("Kamb").build())
                                   .contactInfo(PersonContactInfoType.builder()
                                                .phone("123-456-7890")
                                                .email("linus.kamb@noaa.gov")
                                                .build())
                                   .build();
            TemporalExtentsType tempExtents = TemporalExtentsType.builder()
                    .startDate(new Date())
                    .endDate(new Date())
                    .build();
            OadsMetadataDocumentType oads = OadsMetadataDocumentType.builder()
                    .dataSubmitter(person)
                    .addInvestigator(person)
                    .temporalExtents(tempExtents)
                    .addAuthor("John Doe").addAuthor("Emily Picket")
                    .build();
            oads.setKeywords(null);
            writeXml(oads, new File("oads.xml"));
        } catch (Exception ex) {
            ex.printStackTrace();
            // TODO: handle exception
        }

    }

}
