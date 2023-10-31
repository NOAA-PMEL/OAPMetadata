/**
 * 
 */
package gov.noaa.ncei.oads.xml;

/**
 * 
 */
public interface HasContent {
    
    default boolean hasContent() {
        boolean empty = true;
        try {
            empty = EmptyChecker.isEmpty(this);
        } catch (Exception ex) {
            ex.printStackTrace();
            return true;  // assume is has content
        }
        
        return !empty;
    }

}
