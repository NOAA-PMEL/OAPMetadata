/**
 * 
 */
package gov.noaa.pmel.oads.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;

/**
 * @author kamb
 *
 */
public class TimeUtils {
	
	public class Times {
		public static final long HOUR_ms = 60 * 60 * 1000;
	}

	public static TimeZone TZ_UTC = TimeZone.getTimeZone("UTC");
	
	public static final String STD_ISO8601_NO_TZ = "yyyy-MM-dd'T'HH:mm:ss"; 
	public static final String HMS = "HH:mm:ss";
	public static final String HMS_Z = "HH:mm:ss'Z'";
	public static final String HMS_SPACE_Z = "HH:mm:ss' Z'";

    public static final String STD_DATE = "yyyy-MM-dd";
    
	public static final String STD_ISO_8601_Z = "yyyy-MM-dd'T'HH:mm:ss.S'Z'";
	public static final String STD_ISO_8601_nofrac_Z = "yyyy-MM-dd'T'HH:mm:ss'Z'";
	public static final String STD_ISO_8601_SPACE_Z = "yyyy-MM-dd'T'HH:mm:ss.S' Z'";
	public static final String STD_ISO_8601_nofrac_SPACE_Z = "yyyy-MM-dd'T'HH:mm:ss' Z'";
	
	public static final String STD_ISO_8601_TZ = "yyyy-MM-dd'T'HH:mm:ss.SZ";
	public static final String STD_ISO_8601_Tz = "yyyy-MM-dd'T'HH:mm:ss.Sz";
	public static final String STD_ISO_8601_SPACE_TZ = "yyyy-MM-dd'T'HH:mm:ss.S Z";
	public static final String STD_ISO_8601_SPACE_Tz = "yyyy-MM-dd'T'HH:mm:ss.S z";
	
	public static final String STD_ISO_8601_nofrac_TZ = "yyyy-MM-dd'T'HH:mm:ssZ";
	public static final String STD_ISO_8601_nofrac_Tz = "yyyy-MM-dd'T'HH:mm:ssz";
	public static final String STD_ISO_8601_nofrac_SPACE_TZ = "yyyy-MM-dd'T'HH:mm:ss Z";
	public static final String STD_ISO_8601_nofrac_SPACE_Tz = "yyyy-MM-dd'T'HH:mm:ss z";
	
	public static final String non_std_ISO_8601_Z = "yyyy-MM-dd HH:mm:ss.S'Z'";
	public static final String non_std_ISO_8601_nofrac_Z = "yyyy-MM-dd HH:mm:ss'Z'";
	public static final String non_std_ISO_8601_SPACE_Z = "yyyy-MM-dd HH:mm:ss.S Z";
	public static final String non_std_ISO_8601_nofrac_SPACE_Z = "yyyy-MM-dd HH:mm:ss Z";

	public static final String ISO8601_COMPRESSED = "yyyyMMdd'T'HHmmss";
	public static final String ISO8601_COMPRESSED_Z = "yyyyMMdd'T'HHmmss'Z'";
	public static final String ISO8601_COMPRESSED_SPACE_Z = "yyyyMMdd'T'HHmmss' Z'";
	public static final String ISO8601_COMPRESSED_Tz = "yyyyMMdd'T'HHmmss z";
	
	public static final String YMD_SLASH_DATE_SPACE_NO_TZ = "yyyy/MM/dd HH:mm:ss"; 
	public static final String MDY_SLASH_DATE_SPACE_NO_TZ = "MM/dd/yyyy HH:mm:ss"; 
	
	public static final String YEAR_FIRST_DATE_ONLY_DASHED = "yyyy-mm-dd";
	public static final String YEAR_FIRST_DATE_ONLY_COMPRESSED = "yyyymmdd";
	
	public static final String DAY_FIRST_DATE_ONLY_DASHED = "dd-MM-yyyy";
	public static final String DAY_FIRST_DATE_ONLY_COMPRESSED = "ddMMyyyy";
	
	private static String[] utcTryFormats = new String[] {
		STD_ISO_8601_nofrac_Tz,
	    STD_ISO_8601_Z,
	    STD_ISO_8601_SPACE_Z,
	    STD_ISO_8601_nofrac_Z,
	    STD_ISO_8601_nofrac_SPACE_Z,
	    non_std_ISO_8601_Z,
	    non_std_ISO_8601_SPACE_Z,
	    non_std_ISO_8601_nofrac_Z,
	    non_std_ISO_8601_nofrac_SPACE_Z
	};
	
	@SuppressWarnings("serial")
	private static final Map<String, String> DATE_FORMAT_REGEXPS = new HashMap<String, String>() {{
	    put("^\\d{4}-\\d{1,2}-\\d{1,2}$", "yyyy-MM-dd");
	    put("^\\d{4}-\\d{1,2}-\\d{1,2}T\\d{1,2}:\\d{2}:\\d{2}$", "yyyy-MM-dd'T'HH:mm:ss");
	    put("^\\d{4}-\\d{1,2}-\\d{1,2}T\\d{1,2}:\\d{2}:\\d{2}Z$", "yyyy-MM-dd'T'HH:mm:ss'Z'");
	    put("^\\d{4}-\\d{1,2}-\\d{1,2}T\\d{1,2}:\\d{2}:\\d{2}\\sZ$", "yyyy-MM-dd'T'HH:mm:ss 'Z'");
	    
	    put("^\\d{4}-\\d{1,2}-\\d{1,2}T\\d{1,2}:\\d{2}:\\d{2}\\s?[+-]\\d{2}:?\\d{2}$", "yyyy-MM-dd'T'HH:mm:ssX");
	    put("^\\d{4}-\\d{1,2}-\\d{1,2}T\\d{1,2}:\\d{2}:\\d{2}\\s[a-zA-Z]{3}$", "yyyy-MM-dd'T'HH:mm:ss z");
	    put("^\\d{4}-\\d{1,2}-\\d{1,2}T\\d{1,2}:\\d{2}:\\d{2}\\.\\d{1,4}$", "yyyy-MM-dd'T'HH:mm:ss.S");
	    put("^\\d{4}-\\d{1,2}-\\d{1,2}T\\d{1,2}:\\d{2}:\\d{2}\\.\\d{1,4}Z$", "yyyy-MM-dd'T'HH:mm:ss.S'Z'");
	    put("^\\d{4}-\\d{1,2}-\\d{1,2}T\\d{1,2}:\\d{2}:\\d{2}\\.\\d{1,4}\\sZ$", "yyyy-MM-dd'T'HH:mm:ss.S 'Z'");
	    // It seems that you have to specify the exact number of S's as there are fractional digits.
	    put("^\\d{4}-\\d{1,2}-\\d{1,2}T\\d{1,2}:\\d{2}:\\d{2}\\.\\d{1}\\s?[+-]\\d{2}:?\\d{2}$", "yyyy-MM-dd'T'HH:mm:ss.SX");
	    put("^\\d{4}-\\d{1,2}-\\d{1,2}T\\d{1,2}:\\d{2}:\\d{2}\\.\\d{2}\\s?[+-]\\d{2}:?\\d{2}$", "yyyy-MM-dd'T'HH:mm:ss.SSX");
	    put("^\\d{4}-\\d{1,2}-\\d{1,2}T\\d{1,2}:\\d{2}:\\d{2}\\.\\d{3}\\s?[+-]\\d{2}:?\\d{2}$", "yyyy-MM-dd'T'HH:mm:ss.SSSX");
	    
	    put("^\\d{4}-\\d{1,2}-\\d{1,2}\\s\\d{1,2}:\\d{2}:\\d{2}z$", "yyyy-MM-dd HH:mm:ss'Z'");
	    put("^\\d{4}-\\d{1,2}-\\d{1,2}\\s\\d{1,2}:\\d{2}:\\d{2}\\sz$", "yyyy-MM-dd HH:mm:ss 'Z'");
	    put("^\\d{4}-\\d{1,2}-\\d{1,2}\\s\\d{1,2}:\\d{2}:\\d{2}\\s[a-zA-Z]{3}$", "yyyy-MM-dd HH:mm:ss z");
	    put("^\\d{4}-\\d{1,2}-\\d{1,2}\\s\\d{1,2}:\\d{2}:\\d{2}\\s[+-]\\d{4}$", "yyyy-MM-dd HH:mm:ss Z");
	    put("^\\d{4}-\\d{1,2}-\\d{1,2}\\s\\d{1,2}:\\d{2}:\\d{2}[+-]\\d{4}$", "yyyy-MM-dd HH:mm:ssZ");
	    
	    put("^\\d{8}$", "yyyyMMdd");
	    put("^\\d{1,2}-\\d{1,2}-\\d{4}$", "dd-MM-yyyy");
	    put("^\\d{4}-\\d{1,2}-\\d{1,2}$", "yyyy-MM-dd");
	    put("^\\d{1,2}/\\d{1,2}/\\d{4}$", "MM/dd/yyyy");
	    put("^\\d{4}/\\d{1,2}/\\d{1,2}$", "yyyy/MM/dd");
	    put("^\\d{1,2}\\s[a-z]{3}\\s\\d{4}$", "dd MMM yyyy");
	    put("^\\d{1,2}\\s[a-z]{4,}\\s\\d{4}$", "dd MMMM yyyy");
	    put("^\\d{12}$", "yyyyMMddHHmm");
	    put("^\\d{8}\\s\\d{4}$", "yyyyMMdd HHmm");
	    put("^\\d{1,2}-\\d{1,2}-\\d{4}\\s\\d{1,2}:\\d{2}$", "dd-MM-yyyy HH:mm");
	    put("^\\d{4}-\\d{1,2}-\\d{1,2}\\s\\d{1,2}:\\d{2}$", "yyyy-MM-dd HH:mm");
	    
	    put("^\\d{1,2}/\\d{1,2}/\\d{4}\\s\\d{1,2}:\\d{2}$", "MM/dd/yyyy HH:mm");
	    put("^\\d{4}/\\d{1,2}/\\d{1,2}\\s\\d{1,2}:\\d{2}$", "yyyy/MM/dd HH:mm");
	    put("^\\d{1,2}\\s[a-z]{3}\\s\\d{4}\\s\\d{1,2}:\\d{2}$", "dd MMM yyyy HH:mm");
	    put("^\\d{1,2}\\s[a-z]{4,}\\s\\d{4}\\s\\d{1,2}:\\d{2}$", "dd MMMM yyyy HH:mm");
	    put("^\\d{14}$", "yyyyMMddHHmmss");
	    put("^\\d{8}\\s\\d{6}$", "yyyyMMdd HHmmss");
	    put("^\\d{1,2}-\\d{1,2}-\\d{4}\\s\\d{1,2}:\\d{2}:\\d{2}$", "dd-MM-yyyy HH:mm:ss");
	    put("^\\d{4}-\\d{1,2}-\\d{1,2}\\s\\d{1,2}:\\d{2}:\\d{2}$", "yyyy-MM-dd HH:mm:ss");
	    put("^\\d{1,2}/\\d{1,2}/\\d{4}\\s\\d{1,2}:\\d{2}:\\d{2}$", "MM/dd/yyyy HH:mm:ss");
	    put("^\\d{4}/\\d{1,2}/\\d{1,2}\\s\\d{1,2}:\\d{2}:\\d{2}$", "yyyy/MM/dd HH:mm:ss");
	    put("^\\d{1,2}\\s[a-z]{3}\\s\\d{4}\\s\\d{1,2}:\\d{2}:\\d{2}$", "dd MMM yyyy HH:mm:ss");
	    put("^\\d{1,2}\\s[a-z]{4,}\\s\\d{4}\\s\\d{1,2}:\\d{2}:\\d{2}$", "dd MMMM yyyy HH:mm:ss");
	}};

	public static Date ONE_HOUR_AGO() {
		return new Date(System.currentTimeMillis()-60*60*1000);
	}
	
	public static Date X_HOURS_AGO(double x) {
		return new Date((long)(System.currentTimeMillis()-(x*60*60*1000)));
	}

	/**
	 * Determine SimpleDateFormat pattern matching with the given date string. Returns null if
	 * format is unknown. You can simply extend DateUtil with more formats if needed.
	 * @param dateString The date string to determine the SimpleDateFormat pattern for.
	 * @return The matching SimpleDateFormat pattern, or null if format is unknown.
	 * @see SimpleDateFormat
	 */
	private static String determineDateFormat(String dateString) {
		if ( StringUtils.emptyOrNull(dateString)) {
			return null;
		}
		String cleanString = dateString.trim();
	    for (String regexp : DATE_FORMAT_REGEXPS.keySet()) {
	        if (cleanString.matches(regexp)) {
	            return DATE_FORMAT_REGEXPS.get(regexp);
//	        } else {
//	        	String withTz = tryTimeZones(regexp, cleanString);
//	        	if ( withTz != null ) {
//	        		return withTz;
//	        	}
	        }
	    }
	    return null; // Unknown format.
	}
	
	private static final String[] TIME_ZONE_PATTERNS = new String[] { "'Z'", "Z", "z", " 'Z'", " Z", " z" };

	public static final int DAY_ms = 1000 * 60 * 60 * 24;

	private static String tryTimeZones(String pattern, String dateString) {
		for (String zone : TIME_ZONE_PATTERNS) {
			String withTz = pattern + zone;
			if ( dateString.matches(withTz)) {
				return DATE_FORMAT_REGEXPS.get(pattern) + zone;
			}
		}
		return null;
	}
	
	public static Date parseUTC(String timeString)
	{
		if ( timeString == null ) { return null; }
		Date d = null;
		SimpleDateFormat sdf;
		for ( String format : utcTryFormats ) {
			sdf = new SimpleDateFormat(format);
			sdf.setTimeZone(TZ_UTC);
			try {
				d = sdf.parse(timeString);
				break;
			} catch (Exception e) {
				// ignore;
			}
		}
		if ( d == null ) {
			d = parseUnspecifiedDateTimeString(timeString, true);
		}
		if ( d == null ) {
			String s = "Unable to parse time string as UTC: " + timeString;
			throw new IllegalArgumentException(s);
		}
		return d;
	}
		
	private static boolean isUTCtime(String timeString) {
		if ( StringUtils.emptyOrNull(timeString)) {
			return false;
		}
		
		return timeString.endsWith("Z") ||
				timeString.endsWith("UTC") ||
				timeString.endsWith("GMT") ||  // technically not correct, I believe, for some subtle reason
				timeString.endsWith("+00:00") ||
				timeString.endsWith("-00:00") ||
				timeString.endsWith("+0000") ||
				timeString.endsWith("-0000");
	}
	
	public static String formatCurrentLocalTime_ISO_COMPRESSEDfmt() {
		return format_ISO_COMPRESSED(new Date());
	}
	
	public static String format_ISO_COMPRESSED(Date date) {
		if ( date == null ) { return null; }
		SimpleDateFormat sdf = new SimpleDateFormat(ISO8601_COMPRESSED);
		return sdf.format(date);
	}
	
	public static String formatISO8601(Date date) {
		if ( date == null ) { return null; }
		SimpleDateFormat sdf = new SimpleDateFormat(STD_ISO_8601_nofrac_TZ);
		return sdf.format(date);
	}
	
	private static void testString(String dateString) {
		try {
		System.out.println("\ntime string:"+dateString);
		String pattern = determineDateFormat(dateString);
		System.out.println("pattern:"+pattern);
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		if ( isUTCtime(dateString)) {
			System.out.println("Found UTC time");
			sdf.setTimeZone(TZ_UTC);
		}
		Date ddd = sdf.parse(dateString);
		System.out.println("ddd:"+ddd);
		System.out.println("ddd:"+formatUTC(ddd));
		Date dd = parseUTC(dateString);
		System.out.println("dd:"+dd);
		System.out.println("dd:"+formatUTC(dd));
		} catch (ParseException pe) {
			pe.printStackTrace();
		}
	}
		
	public static String formatUTC(long time) {
		return formatUTC(new Date(time), STD_ISO_8601_SPACE_Z);
	}
	
    public static String formatUTCdate(Date date) {
        return formatUTC(date, STD_DATE);
    }
    public static Date parseUTCdate(String date) {
        return parseUnspecifiedDateTimeString(date, true);
    }
    
	public static String formatUTC(Date time) {
		return formatUTC(time, STD_ISO_8601_nofrac_SPACE_Z);
	}
	
	public static String formatUTC(Date time, String format) {
		if ( time == null ) {
			return null;
		}
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		sdf.setTimeZone(TZ_UTC);
		return sdf.format(time);
	}

	public static Date parseDateTimeString(String timeStr) {
		Date date = null;
		if ( StringUtils.emptyOrNull(timeStr)) { 
			return null;
		}
		try {
			long epochTime = Long.parseLong(timeStr);
			date = new Date(epochTime);
		} catch (NumberFormatException nfx) {
			date = parseUnspecifiedDateTimeString(timeStr);
		}
		return date;
	}
	
	public static Date parseUnspecifiedDateTimeString(String timeStr) {
		return parseUnspecifiedDateTimeString(timeStr, isUTCtime(timeStr));
	}
	
	public static Date parseUnspecifiedDateTimeString(String timeStr, boolean asUTC) {
		Date date = null;
		String datePattern = determineDateFormat(timeStr);
		if ( datePattern !=  null ) {
			try {
				SimpleDateFormat sdf = new SimpleDateFormat(datePattern);
				if ( asUTC ) {
					sdf.setTimeZone(TZ_UTC);
				}
				date = sdf.parse(timeStr);
			} catch (ParseException e) {
				System.err.println("parse error:"+timeStr+" as " + datePattern + ": " + e);
			}
		} else {
			System.err.println("No matching date pattern found for : " + timeStr);
		}
		return date;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
//			String regex = "^\\d{4}-\\d{1,2}-\\d{1,2}T\\d{1,2}:\\d{2}:\\d{2}.\\d{1,4}\\s?[+-]\\d{2}:?\\d{2}$";
//			String regex = "^\\d{4}-\\d{1,2}-\\d{1,2}T\\d{1,2}:\\d{2}:\\d{2}\\s?[+-]\\d{2}:?\\d{2}$";
//			if ( "2016-01-24T10:30:29+0800".matches(regex)) {
//				System.out.println("yaoo");
//			} else {
//				System.out.println("nope");
//			}
//			System.exit(1);
			String dateString = "2016-01-24T10:30:29 Z";
//			testString(dateString);
//			dateString = "2016-01-24T10:30:29Z";
//			testString(dateString);
//			dateString = "2016-01-24T10:30:29.32Z";
//			testString(dateString);
//			dateString = "2016-01-24T10:30:29.32 Z";
//			testString(dateString);
//			dateString = "2016-01-24T10:30:29-0800";
//			testString(dateString);
//			dateString = "2016-01-24T10:30:29+0800";
//			testString(dateString);
//			dateString = "2016-01-24T10:30:29 -0800";
//			testString(dateString);
//			dateString = "2016-01-24T10:30:29-08:00";
//			testString(dateString);
//			dateString = "2016-01-24T10:30:29 -08:00";
//			testString(dateString);
			dateString = "2016-01-24T10:30:29.4+08:00";
			testString(dateString);
			dateString = "2016-01-24T10:30:29.42-0800";
			testString(dateString);
			dateString = "2016-01-24T10:30:29.425 -0000";
			testString(dateString);
			dateString = "2016-01-24T10:30:29.42-08:00";
			testString(dateString);
			dateString = "2016-01-24T10:30:29.42 -08:00";
			testString(dateString);
			dateString = "2016-01-24T10:30:29 UTC";
			testString(dateString);
			dateString = "2016-01-24 10:30:29 GMT";
			testString(dateString);
			dateString = "2016-01-24T10:30:29";
			testString(dateString);
			dateString = "2012-10-28";
			testString(dateString);
				/*
		SimpleDateFormat sdf1 = new SimpleDateFormat(STD_ISO_8601_TZ);
		sdf1.setTimeZone(TZ_UTC);
		SimpleDateFormat sdf2 = new SimpleDateFormat(STD_ISO_8601_Tz);
		sdf2.setTimeZone(TZ_UTC);
		
		SimpleDateFormat sdf3 = new SimpleDateFormat(STD_ISO_8601_TZ);
		SimpleDateFormat sdf4 = new SimpleDateFormat(STD_ISO_8601_Tz);
		
		Date d = new Date();
		
		System.out.println("TZ: " + sdf1.format(d));
		System.out.println("Tz: " + sdf2.format(d));
		System.out.println("TZ: " + sdf3.format(d));
		System.out.println("Tz: " + sdf4.format(d));
		*/
		} catch (Exception ex) {
			ex.printStackTrace(); // main
		}
	}

}
