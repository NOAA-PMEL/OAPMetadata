/**
 * 
 */
package gov.noaa.pmel.oads.util;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * @author linus
 *
 */
public class StringUtils {
	
// 0: 48
// 9: 57
// A: 65
// Z: 90
// a: 97
// z: 122
//	static char[] extras = new char[] { '!', '#', '$', '&', '%' };
	static char[] characters = new char[61];
	static {
		int idx = 0;
		int pos = 0;
		for ( idx = 0; idx < 9; idx++ ) {
			characters[pos+idx] = (char)('1' + idx);
		}
		pos += idx;
		for ( idx = 0; idx < 26; idx++ ) {
			characters[pos+idx] = (char)('A' + idx);
		}
		pos += idx;
		for ( idx = 0; idx < 26; idx++ ) {
			characters[pos+idx] = (char)('a' + idx);
		}
//		for ( idx = 0; idx < extras.length; idx++ ) {
//			characters[pos+idx] = extras[idx];
//		}
	}
	
	public static String generateRandomAlphaNumeric(int len) {
		Random random = new Random();
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < len; i++ ) {
			builder.append( characters[random.nextInt(characters.length)] );
		}
		
		return builder.toString();
	}

	public static boolean equalOrNull(String str1, String str2) {
		if ( str1 == null ) {
			return str2 == null;
		}
		return str1.trim().equals(str2.trim());
	}

	public static boolean emptyOrNull(String str) {
		return str == null || str.trim().length() == 0;
	}
	
	public static boolean emptyOrNullOrNull(String str) {
		return emptyOrNull(str) || "null".equalsIgnoreCase(str) || "<null>".equalsIgnoreCase(str);
	}
	
	public static String choose(String... choices) {
		if ( choices == null ) {
			return null;
		}
		String choice = null;
		for ( String option : choices ) {
			if ( option != null ) {
				choice = option;
				if ( option.trim().length() != 0 ) {
					break;
				}
			}
		}
		return choice;
	}
	
	public static BigDecimal trimScale(BigDecimal bd, int toScale) {
		BigDecimal trimmed;
		if (bd.scale() > toScale) {
			trimmed = bd.setScale(toScale, RoundingMode.HALF_UP);
		} else {
			trimmed = bd;
		}
		return trimmed;
	}

	private static Map<String, String> doubleFmtStrings = new HashMap<String, String>();
	public static String format(double d, int decimalPlaces) {
		return format(d, decimalPlaces, false);
	}
	
	public static String format(double d, int decimalPlaces, boolean force) {
		Integer places = new Integer(decimalPlaces);
		String key = String.valueOf(places)+String.valueOf(force);
		String formatStr = doubleFmtStrings.get(key);
		if ( formatStr == null ) {
			StringBuilder fmtStr = new StringBuilder("#.");
			String decimal = force ? "0" : "#";
			for (int i=0; i < decimalPlaces; i++ ) {
				fmtStr.append(decimal);
			}
			formatStr = fmtStr.toString();
			doubleFmtStrings.put(key, formatStr);
		}
		DecimalFormat fmt = new DecimalFormat(formatStr);
		return fmt.format(d);
	}
	
	public static byte[] computeHash(String algorithm, String x) 
		throws NoSuchAlgorithmException
	{
		java.security.MessageDigest d = null;
		d = java.security.MessageDigest.getInstance(algorithm);
		d.reset();
		d.update(x.getBytes());
		return d.digest();
	}

	public static String byteArrayToHexString(byte[] b) {
		StringBuffer sb = new StringBuffer(b.length * 2);
		for (int i = 0; i < b.length; i++) {
			int v = b[i] & 0xff;
			if (v < 16) {
				sb.append('0');
			}
			sb.append(Integer.toHexString(v));
		}
		return sb.toString().toUpperCase();
	}

	public static String humanReadableSize(long size) {
		return humanReadableByteCount(size, false);
	}
	
	public static String humanReadableByteCount(long bytes, boolean si) {
	    int unit = si ? 1000 : 1024;
	    if (bytes < unit) return bytes + " B";
	    int exp = (int) (Math.log(bytes) / Math.log(unit));
	    String pre = String.valueOf((si ? "kMGTPE" : "KMGTPE").charAt(exp-1)); //  + (si ? "" : "i");
	    return String.format("%.1f %sB", bytes / Math.pow(unit, exp), pre);
	}
	
	public static String asCommaSeparatedList(Iterable<String> strings) {
		return asSeparatedList(strings, ",");
	}
	
	public static String asSeparatedList(Iterable<String> strings, String separator) {
		StringBuilder b = new StringBuilder();
		String sep = "";
		for (String v : strings) {
			b.append(sep).append(v);
			sep = separator;
		}
		return b.toString();
	}
}
