import static org.junit.Assert.assertEquals;

import com.rhit.hw1.HW1;
import org.junit.Test;

public class HW1Test {

  @Test
  public void testAddFraction() {
    assertEquals(0.75, HW1.addFraction(1, 2, 1, 4), 0.01);
    assertEquals(1.0, HW1.addFraction(1, 2, 1, 2), 0.01);
    assertEquals(0.5, HW1.addFraction(1, 4, 1, 4), 0.01);
    assertEquals(0.7, HW1.addFraction(1, 10, 3, 5), 0.01);
    assertEquals(0, HW1.addFraction(0, 2, 0, 4), 0.01);
    assertEquals(0.5, HW1.addFraction(-1, 10, 3, 5), 0.01);
    assertEquals(-0.7, HW1.addFraction(-1, 10, -3, 5), 0.01);
    assertEquals(-0.75, HW1.addFraction(-1, 2, -1, 4), 0.01);
  }

  @Test
  public void testFootballScore() {
    assertEquals(9, HW1.footballScore("FFF"));
    assertEquals(21, HW1.footballScore("TTT"));
    assertEquals(17, HW1.footballScore("TFT"));
    assertEquals(7, HW1.footballScore("T"));
    assertEquals(3, HW1.footballScore("F"));
    assertEquals(30, HW1.footballScore("FFFFFFFFFF"));
    assertEquals(0, HW1.footballScore(""));
  }
}
