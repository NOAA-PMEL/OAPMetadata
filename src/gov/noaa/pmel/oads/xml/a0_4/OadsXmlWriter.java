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

import gov.noaa.ncei.oads.xml.v_a0_4.ArchiveInfoType;
import gov.noaa.ncei.oads.xml.v_a0_4.OadsMetadataDocumentType;
import gov.noaa.ncei.oads.xml.v_a0_4.ObjectFactory;
import gov.noaa.ncei.oads.xml.v_a0_4.PersonContactInfoType;
import gov.noaa.ncei.oads.xml.v_a0_4.PersonNameType;
import gov.noaa.ncei.oads.xml.v_a0_4.PersonType;
import gov.noaa.ncei.oads.xml.v_a0_4.SubmissionInfoType;
import gov.noaa.ncei.oads.xml.v_a0_4.TemporalExtentsType;

/**
 * @author kamb
 *
 */
public class OadsXmlWriter {

    private static final String VERSION = "a0.4";
    
    private static final String NAMESPACE = "http://ncei.noaa.gov/oads/v_a0_4";
    
    private static final String LOCAL_SCHEMA_LOCATION = "file:///Users/kamb/workspace/oap_metadata/schema/oads_metadata.xsd";
    private static final String WEB_SCHEMA_LOCATION = "https://pmel.noaa.gov/oap/schema/a0.4/oads_metadata.xsd";
    
    private static final String SCHEMA_LOCATION = LOCAL_SCHEMA_LOCATION;
    
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
        metadata.setVersion(VERSION);
        JAXBContext content =  JAXBContext.newInstance(OadsMetadataDocumentType.class);
        Marshaller marshaller = content.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        marshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, NAMESPACE + " " + SCHEMA_LOCATION );
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
                                   .refId("LinusJKamb")
                                   .build();
            TemporalExtentsType tempExtents = TemporalExtentsType.builder()
                    .startDate(new Date())
                    .endDate(new Date())
                    .build();
            OadsMetadataDocumentType oads = OadsMetadataDocumentType.builder()
                    // dataSubmitter part of ArchiveInfo/Submission structure
//                    .dataSubmitter(person)
                      .archiveInfo(ArchiveInfoType.builder()
                                          .initialSubmission(SubmissionInfoType.builder()
                                                             .submissionDate(new Date())
                                                             .submittedBy(person)
                                                             .build())
                                          .build())
                    .addInvestigator(person)
                    .temporalExtents(tempExtents)
                    // authors now part of the CitationType
//                    .addAuthor("John Doe").addAuthor("Emily Picket")
                    .addPerson(person)
                    .build();
//            oads.setKeywords(null);
            writeXml(oads, new File("oads.xml"));
        } catch (Exception ex) {
            ex.printStackTrace();
            // TODO: handle exception
        }

    }

}
