package rocks.zipcode.io.quiz3.arrays;

import java.util.Arrays;

/**
 * @author leon on 09/12/2018.
 */
public class SquareArrayAnalyzer {
    public static Boolean compare(Integer[] input, Integer[] squaredValues) {
        boolean isSquare = false;
        for (Integer numberToCheck:
             input) {
            isSquare = checkSquare(numberToCheck,squaredValues);
            if(!isSquare){
                return false;
            }
        }
        return true;
    }

    public static boolean checkSquare(Integer a,Integer[] b){
        for(Integer squaredNum : b){
            if(a*a == squaredNum){
                return true;
            }
        }
        return false;
    }

}
