import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.dafneduda.twodarraysandmaps.MapProblems;
import java.util.ArrayList;
import java.util.HashMap;
import org.junit.Test;


/**
 * Tests for the {@link MapProblems} class.
 *
 * @author Michael Hewner and Delvin Defoe. Created Dec 15, 2013.
 */
public class MapProblemsTest {

    /**
     * Tests for the {@link MapProblems#hasDuplicates(int[])} method.
     */
    @Test
    public void testHasDuplicates() {
        int[] test1 = {1, 2, 3};
        int[] test2 = {1, 2, 3, 1, 4};
        int[] test3 = {1, 2, 3, 1};
        int[] test4 = {1, 2, 2};
        assertFalse(MapProblems.hasDuplicates(test1));
        assertTrue(MapProblems.hasDuplicates(test2));
        assertTrue(MapProblems.hasDuplicates(test3));
        assertTrue(MapProblems.hasDuplicates(test4));
    }

    @Test
    public void testDuplicateNicknames() {
        String[] names = {"Arun", "Bill", "Nala"};
        String[] test1 = {"Foo", "Bar", "Foo"};
        String[] test2 = {"Foo", "Baz", "Baz"};
        assertEquals("Foo", MapProblems.duplicateNicknames(names, test1));
        assertEquals("Baz", MapProblems.duplicateNicknames(names, test2));
    }

    /**
     * Tests for the {@link MapProblems#computeScore(String)} method.
     */
    @Test
    public void testComputeScore() {
        assertEquals(7, MapProblems.computeScore("ABAA"));
        assertEquals(7, MapProblems.computeScore("BAAA"));
        assertEquals(3, MapProblems.computeScore("ABC"));
        assertEquals(6, MapProblems.computeScore("ABAB"));
        assertEquals(9, MapProblems.computeScore("KQKQQ"));
        assertEquals(0, MapProblems.computeScore(""));
    }


    /**
     * Tests for the {@link MapProblems#reverseMap(HashMap)} method.
     */
    @Test
    public void testReverseMap() {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        HashMap<String, Integer> result = MapProblems.reverseMap(map);
        assertEquals(1, (int) result.get("A"));
        assertEquals(2, (int) result.get("B"));
        assertEquals(3, (int) result.get("C"));

        // Clear out the inputMap
        // Make sure the inverse of an empty map is an empty map, i.e., has size = 0
        map.clear();
        HashMap<String, Integer> returnedMap = MapProblems.reverseMap(map);
        assertEquals(0, returnedMap.size());
    }

    @Test
    public void testComputeLetterFrequencies() {
        String inputString;
        HashMap<Character, Integer> letterFreqs;

        // Test empty string
        inputString = "";
        letterFreqs = MapProblems.computeLetterFrequencies(inputString);
        assertEquals(0, letterFreqs.size());

        inputString = "abbcccdddd";
        letterFreqs = MapProblems.computeLetterFrequencies(inputString);
        assertEquals(4, letterFreqs.size());
        assertEquals(1, (int) letterFreqs.get('a'));
        assertEquals(2, (int) letterFreqs.get('b'));
        assertEquals(3, (int) letterFreqs.get('c'));
        assertEquals(4, (int) letterFreqs.get('d'));

        inputString = "thequickbrownfoxjumpsoveralazydog";
        letterFreqs = MapProblems.computeLetterFrequencies(inputString);
        for (char c = 'a'; c <= 'z'; c++) {
            if (c == 'a' || c == 'e' || c == 'r' || c == 'u') {
                assertEquals(2, (int) letterFreqs.get(c));
            } else if (c == 'o') {
                assertEquals(4, (int) letterFreqs.get(c));
            } else {
                assertEquals(1, (int) letterFreqs.get(c));
            }
        }
    }

    /**
     * Tests for the {@link MapProblems#canTravelTo(HashMap, String, String)} method.
     */
    @Test
    public void testCanTravelTo() {
        HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
        ArrayList<String> cities = new ArrayList<String>();
        ArrayList<String> emptyList = new ArrayList<String>();

        /*
         * The city network represented here looks like this
         *
         *  A->B->D
         *  \
         *   ->C->E
         *
         *  F->G->H (H is also connected back to G)
         *     \
         *      ->I->J
         */
        cities.add("B");
        cities.add("C");
        map.put("A", cities);
        cities = new ArrayList<String>();
        cities.add("D");
        map.put("B", cities);
        cities = new ArrayList<String>();
        cities.add("E");
        map.put("C", cities);
        map.put("D", emptyList);
        map.put("E", emptyList);
        cities = new ArrayList<String>();
        cities.add("G");
        map.put("F", cities);
        map.put("H", cities);
        cities = new ArrayList<String>();
        cities.add("H");
        cities.add("I");
        map.put("G", cities);
        cities = new ArrayList<String>();
        cities.add("J");
        map.put("I", cities);
        map.put("J", emptyList);

        assertTrue(MapProblems.canTravelTo(map, "A", "B"));
        assertTrue(MapProblems.canTravelTo(map, "A", "D"));
        assertTrue(MapProblems.canTravelTo(map, "A", "E"));
        assertFalse(MapProblems.canTravelTo(map, "A", "F"));
        assertFalse(MapProblems.canTravelTo(map, "B", "A"));
        assertFalse(MapProblems.canTravelTo(map, "H", "F"));
        assertTrue(MapProblems.canTravelTo(map, "H", "G"));
        assertTrue(MapProblems.canTravelTo(map, "F", "J"));
        assertFalse(MapProblems.canTravelTo(map, "J", "A"));
    }
}
