/**
 * 
 */
package gov.noaa.pmel.oads.xml.a0_2_2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

/**
 * @author kamb
 *
 */
public class Transform {

    private static final String DEFAULT_XSL = "a022to00.xsl";
    
    private Transformer transformer;
    private static boolean verbose = false;
    
    public static Transform Instance(InputStream xslInputStream, String obsType) throws Exception {
        Transformer xfrm = getTransformer(xslInputStream, obsType);
        return new Transform(xfrm);
    }
    /**
     * @param xslFileName
     * @return
     * @throws FileNotFoundException 
     * @throws TransformerConfigurationException 
     */
    private static Transformer getTransformer(InputStream xslStream, String obsType) throws Exception {
        TransformerFactory xfrmFactory = TransformerFactory.newInstance();
        Transformer xfrm = xfrmFactory.newTransformer(new StreamSource(xslStream));
        xfrm.setOutputProperty(OutputKeys.INDENT, "yes");
//        xfrm.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
        xfrm.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "3");
        xfrm.setParameter("obs_type", obsType);
        return xfrm;
    }
    private Transform(Transformer transformer) {
        this.transformer = transformer;
    }

    private static void log(String message) {
        if (verbose) {
            System.out.println(message);
        }
    }
    
    void doXslTransformation(InputStream inXml, OutputStream outXfrm) 
            throws FileNotFoundException, TransformerException 
    {
        transformer.transform(new StreamSource(inXml), new StreamResult(outXfrm));
    }
    
    private static void usage(boolean exit) {
        System.out.println("transform [-o observation_type] <input_xml_file> [output_file_name] [XSL file]");
        System.out.println("  With no output file specified, output will be written to stdout.");
        System.out.println("  Default XSL file is a022to00.xsl");
        System.out.println("  Use '-' for output file name to send output to stdout and specify XSL file.");
        System.out.println("  -o observation_type will set the obs_type XSLT param, used in a022to00.xsl for the <type> element.");
        if ( exit ) {
            System.exit(0);
        }
    }
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        String inputFileName = null; // "/Users/kamb/workspace/oa_dashboard_test_data/test_xml/oap_metadata_33GG20191015.xml";
        String obsType = "";
        int filePosIdx = 0;
        do {
            if ( args.length > filePosIdx ) {
                if ( args[0].equals("-h") || args[0].equals("-?")) {
                    usage(true);
                } else if ( args[filePosIdx].equals("-o")) {
                    obsType = args[++filePosIdx];
                } else if ( args[filePosIdx].equals("-v")) {
                    verbose = true;
                } else {
                    inputFileName = args[filePosIdx];
                }
            } else {
                usage(true);
            }
            filePosIdx += 1;
        } while ( inputFileName == null && filePosIdx < args.length );
        
        File infile = new File(inputFileName);
        String outFileName = null;
        File outfile = null;
        if ( args.length > filePosIdx ) {
            outFileName = args[filePosIdx];
            if ( ! outFileName.equals("-")) {
                outfile = new File(outFileName);
            }
        }
        filePosIdx +=1;
        String xslFileName = DEFAULT_XSL;
        if ( args.length > filePosIdx ) {
            xslFileName = args[filePosIdx];
        }
        try ( InputStream xslStream = findResource(xslFileName);
              InputStream instream = new FileInputStream(infile);
              OutputStream outstream = ( outfile != null ?
                                           new FileOutputStream(outfile) :
                                           System.out ); ) {
            Transform.Instance(xslStream, obsType).doXslTransformation(instream, outstream);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @SuppressWarnings("resource")
    private static InputStream findResource(String xslFileName) throws FileNotFoundException {
        File tryFile = new File(xslFileName);
        if ( tryFile.exists() ) {
            log("using xsl file " + tryFile.getPath());
            return new FileInputStream(tryFile);
        }
        String tryResourceName = xslFileName;
        InputStream resource = Transform.class.getResourceAsStream(tryResourceName);
        if ( resource == null ) {
            if ( tryResourceName.startsWith("/")) {
                tryResourceName = tryResourceName.substring(1);
            } else {
                tryResourceName = "/" + tryResourceName;
            }
            resource = Transform.class.getResourceAsStream(tryResourceName);
            log("Found XSL file resource " + tryResourceName);
            if ( resource == null ) {
                throw new FileNotFoundException(xslFileName);
            }
        }
        return resource;
    }

}
