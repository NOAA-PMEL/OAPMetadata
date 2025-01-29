package test;

import gov.noaa.pmel.oads.xml.a0_2_2.Transform;

public class TestTransform {

	static final String[] basicArgs = new String[] {
			"xml/BHTEFGTK8_metadata.xml",
			"machineUse.xml"
	};
	static final String[] obsArgs = new String[] {
			"-o", "Laboratory experiment",
			"xml/BHTEFGTK8_metadata.xml",
			"machineUse.xml"
	};
	public static void main(String[] args) {
		try {
			Transform.main(obsArgs);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
