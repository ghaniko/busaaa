import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountLettersTest {
  CountLetters myCountLetters = new CountLetters();
  @Test
  public void makeDictionary() throws Exception {

    String myTestString = "aaabbc";
    HashMap<Character,Integer> testDict = new HashMap<Character,Integer>(){{put('a',3);put('b',2);put('c',1);}};
    assertEquals(testDict, myCountLetters.makeDictionary(myTestString));
  }

}