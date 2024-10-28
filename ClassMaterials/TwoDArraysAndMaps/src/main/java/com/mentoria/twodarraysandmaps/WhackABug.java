package com.mentoria.twodarraysandmaps;

/**
 * This class provides some buggy methods that you can use to practice with the debugger.
 *
 * @author Curt Clifton. Created Sep 21, 2008.  Modified by Claude Anderson Dec 14, 2008.
 */
public class WhackABug {

  /**
   * Runs the buggy methods.
   *
   * @param args ignore
   */
  public static void main(String[] args) {
    // DONE: uncomment call to a buggy method, use debugger to find the bug, repeat
//    hasABug1();
//    hasABug2();
//    hasABug3();
//    hasABug4();
  }

  private static void hasABug1() {
    // TODO
    System.out.println("Powers of two:");

    int base = 2;
    int exp = 0;
    int numberToPrint = 10;

    while (numberToPrint > 0) {
      int power = (int) Math.pow(base, exp);
      System.out.printf("%d ^ %d = %3d%n", base, exp, power);
      exp++;
      numberToPrint++;
    }
  }

  private static void hasABug2() {
    // TODO
    final double STEP_SIZE_DEG = 30.0;
    final double STEP_SIZE = Math.toRadians(STEP_SIZE_DEG);

    System.out.printf("Values of cosine, every %.2f*pi radians:%n", STEP_SIZE / Math.PI);

    double angle = 0.0;
    while (angle <= Math.PI * 2.0) {
      double coef = angle / Math.PI;
      double value = Math.cos(angle);
      System.out.printf("cos(%4.2f*pi) = %4.2f%n", coef, value);
      angle += 1;
    }
  }

  private static void hasABug3() {
    // TODO
    System.out.println("Rounding errors when counting by tenths:");

    double delta = 0.0001;
    for (double d = 0.0; d <= 1.0 - delta || d >= 1.0 + delta; d += 0.1) {
      System.out.printf("%1.1d is actually %s%n", d, d);
    }
  }

  private static void hasABug4() {
    // TODO
    String msg = "Rose";

    for (int i = 0; i < msg.length(); i++) {
      System.out.printf("Character %d: %d%n", i, msg.charAt(i));
    }
  }
}
