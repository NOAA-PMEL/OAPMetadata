/**
 * 
 */
package gov.noaa.pmel.oads.xml.a0_2_2;

import java.io.File;

import gov.noaa.ncei.oads.xml.v_a0_2_2.OadsMetadataDocumentType;

/**
 * @author kamb
 *
 */
public class ReadAndWrite_0_2_2 {

    /**
     * 
     */
    public ReadAndWrite_0_2_2() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        try {
//            String defaultInputFile = "test/data/a0.2.2/oap_xsi_type_33RO20120721.xml"; // "vars.xml"; // 
//            String defaultInputFile = "test/data/a0.2.2/oads_metadata_a0.2.3-wrong_version.xml"; // "vars.xml"; // 
//            String defaultInputFile = "/local/tomcat/oap_content/OAPUploadDashboard/MetadataDocs/33RO/33RO20160505/33RO20160505_OADS.xml";
//            String defaultInputFile = "/Users/kamb/workspace/oa_dashboard_test_data/33RO/oap_metadata_UJE0WU30.xml";
//            String defaultInputFile = "/Users/kamb/workspace/oa_dashboard_test_data/33RO/WCOA2016_Hydro_metadata_12202017.xml";
//            String defaultInputFile = "/Users/kamb/workspace/oa_dashboard_test_data/33RO/oap_metadata_33RO20160505-6.xml";
//            String defaultInputFile = "/local/tomcat/oap_content/OAPUploadDashboard/MetadataDocs/BEJT/BEJTEXUZ8/BEJTEXUZ8_OADS.xml";
//            String defaultOutputFile = "33RO20170528_ocads-out.xml";
            String defaultInputFile = "BFZWD90HL_metadata.xml";
            String defaultOutputFile = "oads-out.xml";
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
