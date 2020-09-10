/**
 * 
 */
package gov.noaa.pmel.oads.xml.a0_2_2;

import java.io.File;

import gov.noaa.ncei.oads.xml.v_a0_2_2.Co2Discrete;
import gov.noaa.ncei.oads.xml.v_a0_2_2.DicVariableType;
import gov.noaa.ncei.oads.xml.v_a0_2_2.OadsMetadataDocumentType;
import gov.noaa.pmel.oads.xml.a0_2_2.OadsXmlWriter;

/**
 * @author kamb
 *
 */
public class RestrictionTest {

    /**
     * 
     */
    public RestrictionTest() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        try {
        DicVariableType dic = new DicVariableType();
        OadsMetadataDocumentType.OadsMetadataDocumentTypeBuilder mb = OadsMetadataDocumentType.builder().addVariable(dic);
        Co2Discrete dCO2 = new Co2Discrete();
        mb.addVariable(dCO2);
        OadsMetadataDocumentType omd = mb.build();
        String xml = OadsXmlWriter.getXml(mb.build());
        System.out.println(xml);
        File outputFile = new File("vars.xml");
        OadsXmlWriter.writeXml(omd, outputFile);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
