/**
 * 
 */
package gov.noaa.pmel.oads.xml.a0_4;

import gov.noaa.ncei.oads.xml.v_a0_4.BaseVariableType;

import java.io.File;
import java.util.Date;

import gov.noaa.ncei.oads.xml.v_a0_4.ArchiveInfoType;
import gov.noaa.ncei.oads.xml.v_a0_4.BaseInstrumentType;
import gov.noaa.ncei.oads.xml.v_a0_4.OadsMetadataDocumentType;
import gov.noaa.ncei.oads.xml.v_a0_4.PersonContactInfoType;
import gov.noaa.ncei.oads.xml.v_a0_4.PersonNameType;
import gov.noaa.ncei.oads.xml.v_a0_4.PersonType;
import gov.noaa.ncei.oads.xml.v_a0_4.SubmissionInfoType;

/**
 * @author kamb
 *
 */
public class BuilderTest {

    /**
     * 
     */
    public BuilderTest() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        try {
            OadsMetadataDocumentType.OadsMetadataDocumentTypeBuilder mdBuilder = OadsMetadataDocumentType.builder();
            PersonType person = PersonType.builder()
                    .name(PersonNameType.builder()
                          .first("Linus")
                          .middle("J")
                          .last("Kamb").build())
                    .contactInfo(PersonContactInfoType.builder()
                                 .phone("123-456-7890")
                                 .email("linus.kamb@noaa.gov")
                                 .build())
                    .refId("LinusKamb")
                    .build();
//            mdBuilder.dataSubmitter(person);
            mdBuilder.archiveInfo(ArchiveInfoType.builder()
                                  .initialSubmission(SubmissionInfoType.builder()
                                                     .submissionDate(new Date())
                                                     .submittedBy(person)
                                                     .build())
                                  .build());
            mdBuilder.addInvestigator(person);
            BaseInstrumentType instrument1 = BaseInstrumentType.builder()
                    .manufacturer("Master Instruments")
                    .model("super 404")
                    .description("Fabulous thingy")
                    .refId("UUID-1")
                    .build();
            BaseInstrumentType instrument2 = BaseInstrumentType.builder()
                    .manufacturer("Slave Instruments")
                    .model("super duper 404")
                    .description("Marvelous dohickey")
                    .refId("UUID-2")
                    .build();
            BaseVariableType var = BaseVariableType.builder()
                    .addAnalyzingInstrument(instrument1)
                    .addAnalyzingInstrument(instrument2)
                    .build();
            mdBuilder.addVariable(var);
            mdBuilder.addInstrument(instrument1);
            mdBuilder.addPerson(person);
            OadsMetadataDocumentType metadata = mdBuilder.build();
            OadsXmlWriter.writeXml(metadata, new File("builderTest-out.xml"));
        } catch (Exception ex) {
            ex.printStackTrace();
            // TODO: handle exception
        }

    }

}
