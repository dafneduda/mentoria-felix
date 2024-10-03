package com.rhit.arraysandlists;

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
