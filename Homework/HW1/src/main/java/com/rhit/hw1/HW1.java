package com.rhit.hw1;

/**
 * Class: HW1
 *
 * @author CSSE Faculty Purpose: The primary objective of this assignment is to get working smoothly
 * the process of checking out homework projects Eclipse and submitting your .java files correctly
 * to this assignment's Moodle Dropbox
 * <p>
 * ************************************************************************************** REQUIRED
 * HELP CITATION
 * **************************************************************************************
 */
public class HW1 {
  /*
   * DONE: Either before or after your write your function, write a main that
   * tests your function and shows it working.
   *
   */

  /**
   * main method tests the twoEven method by using hardcoded numbers as the parameters. The tests
   * are checked by printing the return values in the console.
   */
  public static void main(String[] args) {
    System.out.printf("------------------------------------------------%n");
    System.out.printf("|            twoEven() testing table           |%n");
    System.out.printf("------------------------------------------------%n");
    System.out.printf("| %22s | %-8s | %-8s |%n", "PARAMS", "EXPECTED", "RECEIVED");
    System.out.printf("------------------------------------------------%n");
    System.out.printf("| %22s | %-8s | %-8s |%n", "1, 2, 3", false, twoEven(1, 2, 3));
    System.out.printf("| %22s | %-8s | %-8s |%n", "2, 4, 3", true, twoEven(2, 4, 3));
    System.out.printf("| %22s | %-8s | %-8s |%n", "7, 9, 10", false, twoEven(7, 9, 10));
    System.out.printf("| %22s | %-8s | %-8s |%n", "18, 122, 311", true, twoEven(18, 122, 311));
    System.out.printf("| %22s | %-8s | %-8s |%n", "10000001, 99999999, 3", false,
        twoEven(10000001, 99999999, 3));
    System.out.printf("| %22s | %-8s | %-8s |%n", "12, 24, 36", false, twoEven(12, 24, 36));
    System.out.printf("| %22s | %-8s | %-8s |%n", "10000000, 88888, 2", false,
        twoEven(10000000, 88888, 2));
    System.out.printf("| %22s | %-8s | %-8s |%n", "74, 28, 3", true, twoEven(74, 28, 3));
    System.out.printf("------------------------------------------------%n");
  }

  /*
   * DONE: Write a function from scratch down below here. The function should
   * take 3 whole numbers (e.g. no fractions) and return true if exactly 2 of
   * the three are even. For example:
   *
   * twoEven(3,2,6) returns true because 2 and 6 are even
   * twoEven(2,4,6) returns false because all three are even, not just 2
   * twoEven(3,99,100) returns false because only 100 is even
   *
   * Hint: take a look at section 5.7 in your textbook for some more examples
   * of boolean functions like AND and NOT. The rest of chapter 5 might be
   * good too if you're a bit confused.
   *
   * Be sure to add appropriate Javadoc comments for your function
   */

  /**
   * Tests if the exactly two of the parameters are even
   *
   * @param one   an integer to be tested whether it's even or not
   * @param two   an integer to be tested whether it's even or not
   * @param three an integer to be tested whether it's even or not
   * @return true only if exactly two of the parameters are even
   */
  public static boolean twoEven(int one, int two, int three) {
//        int count = 0;
//
//        if (one % 2 == 0) count ++;
//        if (two % 2 == 0) count ++;
//        if (three % 2 == 0) count ++;
//
//        return count == 2;

    int[] numbers = new int[]{one, two, three};
    int count = 0;

    for (int number : numbers) {
      if (number % 2 == 0) {
        count++;
      }
    }

    return count == 2;
  }

  /**
   * This method takes in 4 separate integers. The first two comprise the first fraction as the
   * numerator and denominator, respectively. The third and fourth integers comprise the second
   * fraction.
   * <p>
   * This method returns the decimal result of adding the two fractions
   * <p>
   * Example
   * <p>
   * addFraction(1,2,1,4) returns 0.75
   */
  public static double addFraction(int num1, int den1, int num2, int den2) {
    return ((double) num1 / den1) + ((double) num2 / den2);
  }

  /**
   * Takes a string that is all Ts or Fs.
   * <p>
   * T stands for touchdown and is worth 7 points. F stands for fieldgoal and is worth 3 points.
   * <p>
   * Returns the total score.
   * <p>
   * For example: "TT" returns 14 "FTF" returns 13 "FFFF" returns 12 "" returns 0;
   *
   * @param input a string only Ts and Fs
   * @return a score
   */
  public static int footballScore(String input) {
    // TODO

    // se input for uma letra diferente de T ou F, input inválido
    // if (input != "T" || input != "F") {
    //    System.out.println("Entrada inválida");

    // para cada letra T e F, fazer a soma correspondente
    // T = 7 pontos
    // F = 3 pontos
    // retornar int da pontuação total.

    // Loops:
    // for = para
    //      para i (variavel, contador), enquanto i for <condicao>, de x em x
    // while = enquanto
    //      enquanto <condicao>
    int totalScore = 0;
    for (int index = 0; index < input.length(); index++) {
      if (input.charAt(index) == 'F') {
        totalScore += 3;
      }
      if (input.charAt(index) == 'T') {
        totalScore += 7;
      }
    }
    return totalScore;
  }
}
