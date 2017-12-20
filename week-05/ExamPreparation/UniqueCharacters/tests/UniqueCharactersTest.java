import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class UniqueCharactersTest {
  UniqueCharacters uniChar = new UniqueCharacters();
  @Test
  public void makeDictionary() throws Exception {
    String myTestString = "aaabbc";
    ArrayList<String> testArrayList = new ArrayList(Arrays.asList('c'));
    assertEquals(testArrayList, uniChar.makeDictionary(myTestString));
    //assertTrue(testArrayList.equals(uniChar.makeDictionary(myTestString)));
    }
  @Test
  public void makeDictionary2() throws Exception {
    String myTestString = "aaabc";
    ArrayList<String>testArrayList = new ArrayList(Arrays.asList('b', 'c'));
    //assertEquals(testArrayList, uniChar.makeDictionary(myTestString));
    assertTrue(testArrayList.equals(uniChar.makeDictionary(myTestString)));
  }

  @Test
  public void makeDictionary3() throws Exception {
    String myTestString = "abc";
    ArrayList<String>testArrayList = new ArrayList(Arrays.asList('a', 'b', 'c'));
    //assertEquals(testArrayList, uniChar.makeDictionary(myTestString));
    assertTrue(testArrayList.equals(uniChar.makeDictionary(myTestString)));
  }
}