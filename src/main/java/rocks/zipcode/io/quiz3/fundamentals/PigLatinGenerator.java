package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {



    public String translate(String str) {
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String word : words){
            if(VowelUtils.hasVowels(word)) {
                if (VowelUtils.startsWithVowel(word)) {
                    word += "way";
                    sb.append(word+ " ");
                } else if (VowelUtils.hasVowels(word)) {
                    word = word + (word.substring(0, VowelUtils.getIndexOfFirstVowel(word)) + "ay");
                    word = word.replaceFirst(word.substring(0, VowelUtils.getIndexOfFirstVowel(word)), "");
                    sb.append(word + " ");
                }
            }
            else{
                word += "ay";
                sb.append(word + " ");
            }

        }

            sb.delete(sb.length()-1,sb.length());


        return sb.toString();
    }






}
