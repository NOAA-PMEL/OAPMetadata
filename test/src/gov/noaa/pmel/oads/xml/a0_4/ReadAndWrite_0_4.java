/**
 * 
 */
package gov.noaa.pmel.oads.xml.a0_4;

import java.io.File;

import gov.noaa.ncei.oads.xml.v_a0_4.OadsMetadataDocumentType;

/**
 * @author kamb
 *
 */
public class ReadAndWrite_0_4 {

    /**
     * 
     */
    public ReadAndWrite_0_4() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        try {
            String defaultInputFile = "test/data/a0.4/sample_a0.4.xml";
            String defaultOutputFile = "sample_a0.4-out.xml";
            String filepath = args.length > 0 ? args[0] : defaultInputFile;
            File xmlFile = new File(filepath);
            OadsMetadataDocumentType oads = OadsXmlReader.read(xmlFile);
            filepath = args.length > 1 ? args[1] : defaultOutputFile;
            xmlFile = new File(filepath);
            String xml = OadsXmlWriter.getXml(oads);
            OadsXmlWriter.writeXml(oads, xmlFile);
        } catch (Exception ex) {
            ex.printStackTrace();
            // TODO: handle exception
        }

    }

}
