package com.mentoria.twodarraysandmaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * A few problems on using HashMaps.
 *
 * @author Felix Jose Batista Created Dec 15, 2013.
 */
public class MapProblems {

  /**
   * Returns true if the array contains a duplicated element
   * <p>
   * This can be done with for loops, but use a map. It's okay if you don't use the "value" portion
   * of the key-value pair for anything in this problem.
   * <p>
   * {1,2,3} yields false
   * <p>
   * {1,2,1} yields true
   *
   * @param input
   * @return true if the array contains a duplicated element
   */
  public static boolean hasDuplicates(int[] input) {
    // {1,2,1}
    // n = 1
    // i = 0,
    //      j = 2

    // Solution
    // Time Complexity: O(nˆ2)
    // Space Complexity: O(1)
//        for (int i = 0; i < input.length; i++) {
//            for (int j = 0; j < input.length; j ++) {
//                if (i == j) continue;
//                if (input[i] == input[j]) return true;
//            }
//        }

    // {1,2,1}
    // i = 2, n = 1 -> {1=0,2=1,}

    // Solution
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    HashMap<Integer, Integer> map = new HashMap<>();

    for (int index = 0; index < input.length; index++) {
      Integer current = map.get(input[index]);
      if (current != null) {
        return true;
      }

      map.put(input[index], index);
    }

    return false;
  }

  /**
   * ensures: finds and returns a duplicated nickname found in nicknames
   * <br>
   * requires: at least one nickname is duplicated in the nicknames array
   * <p>
   * Hint: process the incoming arrays by building a Map<String, String> where
   * <br> key = nickname, value = realname
   * <br> While building the map, if a key already exists, then you know it is a duplicate
   *
   * @param realNames String[] real names
   * @param nicknames String[] corresponding nicknames
   * @return the duplicated nickname
   */
  public static String duplicateNicknames(String[] realNames, String[] nicknames) {
    System.out.println(Arrays.toString(nicknames));
    HashMap<String, String> map = new HashMap<>();

    for (int index = 0; index < nicknames.length; index++) {
      System.out.println(map);
      if (map.get(nicknames[index]) != null) {
        return nicknames[index];
      }

      map.put(nicknames[index], realNames[index]);
    }

    return null;
  }

  /**
   * There is a card game you play with lettered cards.  In this game, your goal is to collect as
   * many of the same card as you can.
   * <p>
   * To score your hand, look through your cards one at a time. If this is the first time you've
   * seen this card, score 1 point. Otherwise, you score the number of that card you've seen thus
   * far + 1.
   * <p>
   * So for example, the hand "ABAA" is worth 7 points. 1 for the first A 1 for the first B 2 for
   * the second A 3 for the third A
   * <p>
   * This function computes the score of the given hand.
   *
   * @param hand
   * @return the score of the given hand
   */
  public static int computeScore(String hand) {
    // needs to:
    // - iterate/look through the cards in hand
    // - track sum of points
    // - track how many times you saw a card

    int score = 0;
    HashMap<Character, Integer> map = new HashMap<>();

    // "ABAA"
    // 0 = A
    for (int index = 0; index < hand.length(); index++) {
      Character card = hand.charAt(index);
      if (map.get(card) == null) {
        map.put(card, 0); // replace this line with: map.putIfAbsent(card, 0);
      }

      Integer visitCount = map.get(card);
      visitCount++;
      map.put(card, visitCount);

      score += visitCount;
    }

    return score;
  }

  /**
   * Takes a HashMap of Integers to Strings and converts it to a HashMap of Strings to Integers.
   * <p>
   * For example:
   * <p>
   * {1->"A",2->"B",3->"C"} yields {"A"->1,"B"->2,"C"->3}
   * <p>
   * You can assume that original HashMap has no duplicates in its values. E.g. a map like
   * {1->"A",2->"A"} does not exist.
   *
   * @param input a HashMap of Integers to Strings
   * @return a corresponding HashMap of Strings to Integers.
   */
  public static HashMap<String, Integer> reverseMap(HashMap<Integer, String> input) {

    HashMap<String, Integer> reverse = new HashMap<>();

    for (Map.Entry<Integer, String> entry : input.entrySet()){
      Integer key = entry.getKey();
      String value = entry.getValue();

      reverse.put(value, key);
    }

    return reverse;

  }

  /**
   * ensures: builds and returns a map of letters (a-z) to their frequencies
   * <br> requires: input only contains letters a-z (lower-case)
   *
   * <br> Example:
   * <br> if inputString = "abcccbx", the returned map is {'a'->1, 'b'->2, 'c'->3, 'x'-> 1}
   * <p>
   * Side note: letter frequencies can be useful in cryptanalysis
   * <ahref="https://en.wikipedia.org/wiki/Frequency_analysis">(Wikipedia article)<a/>
   *
   * @param inputString a String of cipher text (coded message)
   * @return a map of each letter from a to z to the number of times it appears in inputString (can
   * omit if zero)
   */
  public static HashMap<Character, Integer> computeLetterFrequencies(String inputString) {

    // percorrer a string
    // armazenar cada letra
    // saber quantas vezes cada letra aparece
    // retornar um map
    HashMap<Character, Integer> map = new HashMap<>();

    for (int index = 0; index < inputString.length(); index++){
      Character letra = inputString.charAt(index);
      Integer count = map.get(letra);

      if (count == null) {
        map.put(letra, 1);
      }
      else {
        map.put(letra, count + 1);
      }
    }

    return map;
  }

  /**
   * Imagine a set of cities connected by one-way highways.  The map of cities to other cities is
   * represented by a HashMap, where the city name is associated with other cities it has a road
   * to.
   * <p>
   * So for example, a map like this:
   * <p>
   * {"A"->["B","C"],"B"->["D"],"C"->[],"D"->[]}
   * <p>
   * Represents cities connected like this:
   * <p>
   * A->B->D, A->C
   * <p>
   * Note that there can be loops (e.g. there might be a road from A to B AND a road from B to A)
   * <p>
   * Write a function to determine if there is a way to get from one city to another.  So in the
   * above example:
   * <p>
   * <br> canTravelTo(map,"A","D") returns true
   * <br> canTravelTo(map,"C","A") returns false
   * <br> canTravelTo(map,"B","A") returns false
   * <p>
   * This is a slightly tougher problem. Try it, then ask for a hint if you need it.
   *
   * @param cities
   * @param startCity
   * @param endCity
   * @return true if there is a way to get from one city to another; false otherwise.
   */
  public static boolean canTravelTo(HashMap<String, ArrayList<String>> cities, String startCity,
      String endCity) {
     // {"A"->["B"],"B"->["C"],"C"->["A"],"D"->["E"]}
    ArrayList<String> citiesToVisit = new ArrayList<>();
    ArrayList<String> citiesVisited = new ArrayList<>();

    // citiesToVisit = []
    citiesToVisit.add(startCity);
    // citiesToVisit = ['A']
    while (!citiesToVisit.isEmpty()) {
      // citiesToVisit = ["D"]
      String currentCity = citiesToVisit.removeFirst();
      // currentCity = ["D"]
      // citiesToVisit = []

      if (currentCity.equals(endCity)) return true;

      // citiesVisited = ["A", "B"]
      if (!citiesVisited.contains(currentCity)) {
        citiesVisited.add(currentCity);
        // citiesVisited = ["A", "B", "C"]
        citiesToVisit.addAll(cities.get(currentCity));
        // citiesToVisit = ["D"]
      }
    }

    return false;
  }

}
