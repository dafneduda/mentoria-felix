package com.dafneduda.twodarraysandmaps;

/**
 * A few problems using Two Dimensions Arrays
 *
 * @author Felix Jose Batista. Created Dec 15, 2013.
 */
public class Two2DArrayProblems {

    /**
     * Count the number of times 4 occurs in the array. So the array
     * <p>
     * int[][] intArray2 = {{0,0,0}, {4,4,0}};
     * <p>
     * returns 2
     *
     * @param data
     * @return the number of times 4 occurs in the array.
     */
    public static int count4s(int[][] data) {
        int count = 0;

        return count;
    }

    /**
     * Takes an array of strings, all of which have equal length.
     * <p>
     * Returns a 2D array of characters, where the characters correspond to the strings.
     * <p>
     * {"abc", "def"} yields {{'a','b','c'}, {'d','e','f'}};
     *
     * @param input
     * @return a 2D array of characters, where the characters correspond to the strings.
     */
    public static char[][] stringsToCharArrays(String[] input) {
        return null;
    }

    /**
     * Takes a square array of integers.
     * <p>
     * Returns true of the array is symmetric.  That is if the array[i,j] == array[j,i] for all i and
     * j
     * <p>
     * So {{1,0,0}, {0,1,0}, {0,0,1}} returns true
     * <p>
     * {{1,0,3}, {0,1,0}, {0,0,1}} returns false because [0,2] != [2,0]
     *
     * @param input
     * @return true of the array is symmetric, false otherwise.
     */
    public static boolean isSymmetric(int[][] input) {
        return true;
    }

    /**
     * Takes an array of integers representing a map.
     * <p>
     * On the map there is one square representing the person: '@' At least one and maybe more squares
     * representing an exit: 'X' And empty squares: '.'
     * <p>
     * The function returns the shortest distance from the person to an exit. Note the person can't
     * move diagonally, so it is the Manhattan distance.
     * <p>
     * If you're not sure what "Manhattan distance" is, be sure to look it up! Having that definition
     * makes things much easier.
     * <p>
     * For example, in the map
     * <br> @...
     * <br> .X.X
     * <p>
     * The function returns 2 (east, south)
     * <br> X.XX
     * <br> ....
     * <br> .@..
     * <p>
     * returns 3 (north, north, east)
     *
     * @param input
     * @return the shortest Manhattan distance from the person to an exit.
     */
    public static int distanceToExit(char[][] input) {
        return 0;
    }
}
