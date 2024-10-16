package com.rhit.javaintro;

/**
 * A class filled with interesting functions for learning.
 *
 * @author Michael Hewner
 */
public class ConditionalExamples {

  public static void main(String[] args) {
    System.out.println("Average of 3 4 5 is " + computeAverage(3, 4, 5));
    System.out.println("Average of 3 4 6 is " + computeAverage(3, 4, 6));

    printDivisibleBy3(12); // note in this case we print within the function
    printDivisibleBy3(13);

    // TODO Add method calls and print statements to test other functions
    printCubed(3);

    guessCubeRoot(27, 2.5); //would print "Higher"
    guessCubeRoot(27, 3.3); //would print "Lower"
    guessCubeRoot(27, 3); //would print "Perfect"

    System.out.println("Is 1000 way bigger than 1? " + isWayBigger(1000, 1)); // should return true
    System.out.println("Is 100 way bigger than 1? " + isWayBigger(100, 1)); // should return true
    System.out.println("Is 10 way bigger than 1? " + isWayBigger(10, 1)); // should return false

    System.out.println(
        "Is 1, 2 or 3 greater than 3? " + isGreaterThan3(1, 2, 3)); // should return false
    System.out.println(
        "Is 4, 5 or 6 greater than 3? " + isGreaterThan3(4, 5, 6)); // should return true
    System.out.println(
        "Is 1, 2 or 4 greater than 3? " + isGreaterThan3(1, 2, 4)); // should return true
  }

  /**
   * Computes the average of the three input numbers
   * <p>
   * I've provided the solution for this one.
   */
  public static double computeAverage(double a, double b, double c) {
    return (a + b + c) / 3;
  }

  /**
   * Computes a number cubed.
   * <p>
   * Once you get this function working, modify main (below) to test this function
   * <p>
   * NOTE: in java, there is no exponent operator (e.g. ^) There is a function called pow the in
   * math library, but if we're talking about integers often the easier way is to just multiply
   * several times
   */
  public static void printCubed(double numberToCube) {
    // double cubed = numberToCube * numberToCube * numberToCube;
    double cubed = Math.pow(numberToCube, 3);
    System.out.println(numberToCube + " cubed is: " + cubed);
  }

  /**
   * If the input number is divisible by 3, prints "divisible by 3!" Otherwise prints "NOT divisible
   * by 3"
   * <p>
   * I've provided the solution for this one
   */
  public static void printDivisibleBy3(int number) {
    if (number % 3 == 0) {
      System.out.println(number + " is divisible by 3");
    } else {
      System.out.println(number + " is NOT divisible by 3");
    }
  }

  /**
   * Takes a number and a guess for what it's cube root ought to be. If the guess is too high, print
   * "Lower" if the guess is too low, print "Higher" If the guess is just right, print "Perfect"
   * <p>
   * So guessCubeRoot(27,2.5) would print "Higher" guessCubeRoot(27,3.3) would print "Lower"
   * guessCubeRoot(27,3) would print "Perfect"
   * <p>
   * You'll solve this one yourself.  Use > < and ==
   * <p>
   * As in the previous one, modify main to test your code once you've got a plausible solution.
   * <p>
   * HINT: you could use functions in Math to compute the cube root directly, but this is not
   * needed!  Instead, compute the cube of the guess and then see how that compares to the real
   * value.
   */
  public static void guessCubeRoot(double number, double guess) {
    double cubed = guess * guess * guess;
    if (cubed > number) {
      System.out.println("Lower");
    } else if (cubed < number) {
      System.out.println("Higher");
    } else {
      System.out.println("Perfect");
    }
  }

  /**
   * We won't go over this one in class at all, just for fun if you get done with the others (do the
   * problems in the other files before coming here).
   * <p>
   * Returns true if the first number is much larger (at least 100x larger) than the second.  You
   * can assume the first number is larger than the second.
   */
  public static boolean isWayBigger(int bigger, int smaller) {
    return bigger / smaller >= 100;
  }

  /**
   * We won't go over this one in class at all, just for fun if you get done with the others.
   * <p>
   * Returns true if at least 1 one of the 3 input values is greater than 3
   * <p>
   * hint: you can do a logical OR with the || operator
   * <p>
   * Solve this one yourself
   */
  public static boolean isGreaterThan3(int one, int two, int three) {
    return one > 3 || two > 3 || three > 3;
  }

}
// less than / equal to / greater than
