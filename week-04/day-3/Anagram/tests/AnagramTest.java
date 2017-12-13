import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {
  @Test
  public void printMessage() throws Exception {
    String testString1 = "pear";
    String testString2 = "earp";
    Anagram myAnagram = new Anagram(testString1, testString2);

    assertTrue(myAnagram.anagram(testString1, testString2));
  }

}