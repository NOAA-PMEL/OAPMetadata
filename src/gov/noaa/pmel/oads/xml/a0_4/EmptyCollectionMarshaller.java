/**
 * 
 */
package gov.noaa.pmel.oads.xml.a0_4;

import javax.xml.bind.Marshaller.Listener;

import gov.noaa.ncei.oads.xml.v_a0_4.OadsMetadataDocumentType;

/**
 * @author kamb
 *
 */
public class EmptyCollectionMarshaller extends Listener {


    @Override
    public void beforeMarshal(Object object) {
        if ( object != null && object instanceof OadsMetadataDocumentType ) {
             ((OadsMetadataDocumentType)object).clearEmptyCollections();
        }
    }
}
