package rocks.zipcode.io.quiz3.arrays;


import java.util.Arrays;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {
        if(str.equals("")){
            return new String[0];
        }

        String[] wave = generateCorrectNumberOfStrings(str);
        wave[0] = capitalizeFirst(wave[0]);
        for (int i = 1; i < wave.length; i++) {
            wave[i] = capitalizeNext(wave[i-1]);
        }

        return wave;
    }

    public static String[] generateCorrectNumberOfStrings(String str){
        char[] chars = str.toCharArray();
        Integer count = 0;
        for(char thisChar: chars){
            if(Character.isAlphabetic(thisChar)){
                count++;
            }
        }

        String[] array = new String[count];
        Arrays.fill(array,str.toLowerCase());
        return array;
    }

    public static String capitalizeNext(String str){
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length-1; i++) {
            if(Character.isUpperCase(chars[i])){
                chars[i] = Character.toLowerCase(chars[i]);
                if(Character.isAlphabetic(chars[i+1])){
                chars[i+1] = Character.toUpperCase(chars[i+1]);}
                else chars[i+2] = Character.toUpperCase(chars[i+2]);
                return new String(chars);
            }

        }
        return new String(chars);
    }

    public static String capitalizeFirst(String str){
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(Character.isAlphabetic(chars[i])){
                chars[i] = Character.toUpperCase(chars[i]);
                return new String(chars);
            }
        }
        return new String(chars);
    }
}
