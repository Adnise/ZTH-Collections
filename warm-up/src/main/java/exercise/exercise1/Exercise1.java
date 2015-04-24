package exercise.exercise1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;


/**
 * Created by Radu.Hoaghe on 4/20/2015.
 *
 * Exercise 1: Compute the sum, the minimum and the maximum element from a given list (givenList) using three
 *             different ways to iterate over a List:
 *             a) ListIterator (implement it in the iterateUsingListIterator() method)
 *             b) for loop (implement it in the iterateUsingForLoop() method)
 *             c) foreach loop (implement it in the iterateUsingForEachLoop() method)
 *
 *             In order to test your implementations you need to run the Exercise1Test from the test/java package
 *             (right-click on Exercise1Test class, then click Run 'Exercise1Test' )
 */
public class Exercise1{

    // The list that contains some Integer values
    private List<Integer> givenList;

    public Exercise1(List<Integer> l) {
       this.givenList = l;
    }

    // TODO Exercise #1 a) Compute sum and get the min and the max from givenList, iterating through it using ListIterator
    public List<Integer> iterateUsingListIterator() {

        // This List is used only for testing so you don't have to modify it
        List<Integer> testValues = new ArrayList<Integer>();

        ListIterator<Integer> it = givenList.listIterator();
        int sum = 0, min = givenList.get(0), max = givenList.get(0);

        while(it.hasNext()){
            int number = it.next();
            if(number < min)
                min = number;
            if(number > max)
                max = number;
            sum += it.next();
        }

        // TODO Exercise #1 a1) In order to pass the tests, you need to name your variables sum, min and max or if
        // TODO Exercise #1 a1) you want to name them differently you need to modify them when you add them to testValues

        // TODO Exercise #1 a2) Uncomment the following three lines in order to check your computed values using tests
        testValues.add(sum);
        testValues.add(min);
        testValues.add(max);

        return testValues;
    }

    // TODO Exercise #1 b) Compute sum and get the min and the max from list, iterating through it using classic for loop
    public List<Integer> iterateUsingForLoop(){

        // This List is used only for testing so you don't need to modify it
        List<Integer> testValues = new ArrayList<Integer>();
        int min = givenList.get(0), max = givenList.get(0), sum = 0;

        for(int i = 0; i < givenList.size(); i++) {
            int number = givenList.get(i);
            if(number < min)
                min = number;
            if(number > max)
                max = number;
            sum += givenList.get(i);
        }

        // TODO Exercise #1 b1) In order to pass the tests, you need to name your variables sum, min and max or if
        // TODO Exercise #1 b1) you want to name them differently you need to modify them when you add them to testValues

        // TODO Exercise #1 b2) Uncomment the following three lines in order to check your computed values using tests
        testValues.add(sum);
        testValues.add(min);
        testValues.add(max);

        return testValues;
    }

    // TODO Exercise #1 c) Compute sum and get the min and the max from list iterating through it using foreach loop
    public List<Integer> iterateUsingForEachLoop(){

        // This List is used only for testing so you don't need to modify it
        List<Integer> testValues = new ArrayList<Integer>();

        int sum = 0;
        int min = givenList.get(0);
        int max = givenList.get(0);

        for(Integer i : givenList) {
            sum += i;
            if(i < min) min = i;
            if(i > max) max = i;
        }

        // TODO Exercise #1 c1) In order to pass the tests, you need to name your variables sum, min and max or if
        // TODO Exercise #1 c1) you want to name them differently you need to modify them when you add them to testValues

        // TODO Exercise #1 c2) Uncomment the following three lines in order to check your computed values using tests
        testValues.add(sum);
        testValues.add(min);
        testValues.add(max);

        return testValues;
    }
}
