package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.setCharAt(indexToCapitalize,Character.toUpperCase(sb.charAt(indexToCapitalize)));
        return sb.toString();
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {


        return (baseString.charAt(indexOfString) == characterToCheckFor);
    }

    public static String[] getAllSubStrings(String string) {
        List<String> allSubsList = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i+1; j < string.length()+1; j++) {
                allSubsList.add(string.substring(i,j));
            }
        }
        List<String> noDupesList = allSubsList.stream().distinct().collect(Collectors.toList());
        return noDupesList.toArray(new String[0]);
    }

    public static Integer getNumberOfSubStrings(String input){

        return getAllSubStrings(input).length;
    }
}
