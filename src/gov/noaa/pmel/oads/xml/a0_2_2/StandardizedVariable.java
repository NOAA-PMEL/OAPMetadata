/**
 * 
 */
package gov.noaa.pmel.oads.xml.a0_2_2;

import gov.noaa.ncei.oads.xml.v_a0_2_2s.StandardizationType;

/**
 * @author kamb
 *
 */
public interface StandardizedVariable {
    StandardizationType getStandardization();
    void setStandardization(StandardizationType standard);
}
