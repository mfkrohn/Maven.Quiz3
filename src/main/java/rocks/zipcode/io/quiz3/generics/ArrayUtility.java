package rocks.zipcode.io.quiz3.generics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {
        for(SomeType thing : array){
            if(getNumberOfOccurrences(thing)%2 == 1){
                return thing;
            }
        }
        return null;
    }

    public SomeType findEvenOccurringValue() {
        for(SomeType thing : array){
            if(getNumberOfOccurrences(thing)%2 == 0){
                return thing;
            }
        }
        return null;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {

        return Collections.frequency(Arrays.asList(array),valueToEvaluate);
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        List<SomeType> newList = new ArrayList<>();
        for(SomeType thing : array){
            if(predicate.apply(thing)){
                newList.add(thing);
            }
        }

        return (SomeType[]) newList.toArray(new Integer[0]);
    }
}
