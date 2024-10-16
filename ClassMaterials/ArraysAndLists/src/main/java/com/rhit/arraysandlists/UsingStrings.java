package com.rhit.arraysandlists;

/**
 * This class demonstrates using methods on String objects, plus implicit and explicit parameters.
 *
 * @author Curt Clifton. Created Sep 7, 2008.
 */
public class UsingStrings {

  /**
   * This is the starting point for the example.
   *
   * @param args Command-line arguments, ignored here
   */
  public static void main(String[] args) {
    String name = "Bob Forapples";
    String major = "Party Game Engineering";
    int age = 20;

    int nameLength = name.length();

    System.out.println("'" + name + "' has " + nameLength + " characters");

    // TODO: print Bob's name, major and age.
    System.out.println(name + " is " + major + " and is " + age + " years old.");

    // TODO: Use the replace() method of String to replace "Party Game" with "Celebration Entertainment" in Bob's major.
    String replaceMajor = major.replace("Party Game", "Celebration Entertainment");
    System.out.println(replaceMajor);

    // TODO: print Bob's name, major, and age again.
    System.out.println(name + " is " + replaceMajor + " and is " + age + " years old.");

    // TODO: Change Bob's major again, this time to be in all uppercase. Use the toUpperCase() method of String.
    String upperCaseMajor = replaceMajor.toUpperCase();
    System.out.println(upperCaseMajor);

    // TODO: print Bob's name, major, and age again.
    System.out.println(name + " is " + upperCaseMajor + " and is " + age + " years old.");

  }
}
