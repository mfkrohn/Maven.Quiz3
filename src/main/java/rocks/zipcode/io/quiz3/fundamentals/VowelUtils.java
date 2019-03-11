package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    private static char[] vowels = {'a','e','i','o','u','A','I','O','E','U'};
    public static Boolean hasVowels(String word) {

        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < vowels.length; j++) {
                if(word.charAt(i) == vowels[j]){
                    return true;
                }
            }

        }

        return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < vowels.length; j++) {
                if(word.charAt(i) == vowels[j]){
                    return i;
                }
            }
        }
        return null;
    }
    public static Boolean startsWithVowel(String word){
        if(getIndexOfFirstVowel(word) == 0){
            return true;
        }
        return false;
    }





    public static Boolean isVowel(Character character) {
        for (int i = 0; i < vowels.length; i++) {
            if(vowels[i] == character){
                return true;
            }
        }

        return false;
    }
}
