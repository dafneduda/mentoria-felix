package com.rhit.arraysandlists;

import java.util.ArrayList;
import java.util.Arrays;

public class CodingBatPractice {

    public static void main(String[] args) {

        //Example  print to check method functionality
        System.out.println("fizzArray3(5, 10):");
        System.out.println("Expected: [5, 6, 7, 8, 9]");
        System.out.println("Actual:" + Arrays.toString(fizzArray3(5, 10)));

        //TODO create calls to methods to test them here

    }

    /**
     * Given start and end numbers, return a new array containing the sequence of integers from start up to but not
     * including end, so start=5 and end=10 yields {5, 6, 7, 8, 9}. The end number will be greater or equal to the start
     * number. Note that a length-0 array is valid. (See also: FizzBuzz Code)
     * fizzArray3(5, 10) → [5, 6, 7, 8, 9]
     * fizzArray3(11, 18) → [11, 12, 13, 14, 15, 16, 17]
     * fizzArray3(1, 3) → [1, 2]
     */

    /**
     * Solve this method from: https://codingbat.com/prob/p142539
     * <p>
     * Explanation of pieces of method signature:
     * <p>
     * public       = method can be accessed from any other class (anywhere)
     * start, end   = input parameters
     * int[]        = return type  (this method returns an int array)
     * static       = because main is static (we will learn about static more later in the course)
     */
    public static int[] fizzArray3(int start, int end) {
        // How to initialize an array in Java? https://sentry.io/answers/java-initialize-array/
        if (end - start == 0) return new int[0];

        int[] array = new int[end - start];
        array[0] = start;

        for (int indice = 1; indice < array.length; indice++){
            array[indice] = array[indice - 1] + 1;
        }

        return array;

//        Usando ArrayList:
//
//        ArrayList<Integer> result = new ArrayList<>();
//
//        for (int number = start; number < end; number++) {
//            result.add(number);
//        }
//
//        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    //TODO make additional methods here to test out


}
