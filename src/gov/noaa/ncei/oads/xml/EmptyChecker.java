/**
 * 
 */
package gov.noaa.ncei.oads.xml;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import gov.noaa.ncei.oads.xml.v_a0_2_2s.BaseVariableType;
import gov.noaa.ncei.oads.xml.v_a0_2_2s.OadsMetadataDocumentType;
import gov.noaa.pmel.oads.xml.a0_2_2.OadsXmlReader;

/**
 * 
 */
public class EmptyChecker {

    static List<Field> getAllFields(Class clazz) {
        if (clazz == null || clazz.getName().endsWith("Object")) {
            return Collections.emptyList();
        }

        List<Field> result = new ArrayList<Field>(getAllFields(clazz.getSuperclass()));
        List<Field> filteredFields = Arrays.stream(clazz.getDeclaredFields())
          .filter(f -> Modifier.isPublic(f.getModifiers()) || Modifier.isProtected(f.getModifiers()))
          .collect(Collectors.toList());
        result.addAll(filteredFields);
        return result;
    }    
    static String spaces(int n) {
        String space = "";
        for (int i = 0; i < n; i++) {
            space += ".";
        }
        return space;
    }
    public static boolean isEmpty(Object obj) throws IllegalArgumentException, IllegalAccessException {
        return isEmpty(obj, 0);
    }
    public static boolean isEmpty(Object obj, int depth) throws IllegalArgumentException, IllegalAccessException {
        boolean empty = true;
        if ( obj == null ) { return true; }
        if ( obj instanceof String ) { return ((String)obj).trim().isEmpty(); }
        System.out.print(spaces(depth));
        if ( obj instanceof Collection<?> ) {
            Collection<?> objc = (Collection<?>)obj;
            if ( objc.isEmpty() ) { return true; }
            for (Object cobj : objc) {
                if ( ! isEmpty(cobj, depth+1)) { return false; }
            }
        }
        if ( obj.getClass().getName().endsWith("Type") ||
                obj instanceof BaseVariableType ) {
            int idx = 0;
            List<Field> fields = getAllFields(obj.getClass());
            if ( fields.size() == 0 ) { // what the hell?
                System.out.println("Found object with no fields: " + obj);
                return false;
            }
            do {
                Field field = fields.get(idx++);
                if ( (field.getModifiers() & Modifier.PRIVATE) == 0 ) {
                    Object fo = field.get(obj);
                    field.setAccessible(true);
                    empty = isEmpty(fo, depth+1);
//                } else {
//                    System.out.println("no access : " + field);
                }
            } while ( empty && idx < fields.size());
        } else {
            System.out.print(" :: " + obj);
            return false;
        }
        
        return empty;
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        try {
            String xmlFileName = "/Users/kamb/workspace/oa_dashboard_test_data/people/steve/11SS_me.xml";
            File xmlFile = new File(xmlFileName);
            OadsMetadataDocumentType mdoc = OadsXmlReader.read(xmlFile);
            Field[] fields = mdoc.getClass().getDeclaredFields();
            System.out.println("PRIVATE: " + Modifier.PRIVATE);
            for (Field field : fields) {
                System.out.print(field + " : ");
//                int modifiers = field.getModifiers();
//                System.out.print(modifiers + ": " + (field.getModifiers() & Modifier.PRIVATE) + ": ");
                if ( (field.getModifiers() & Modifier.PRIVATE) == 0 ) {
                    field.setAccessible(true);
                    Object fo = field.get(mdoc);
                    System.out.println(" is empty: " + isEmpty(fo, 0));
                } else {
                    System.out.println("no access ");
                }
            }
        } catch (Exception ex) {
            System.err.println();
            ex.printStackTrace();
            // TODO: handle exception
        }

    }

}
