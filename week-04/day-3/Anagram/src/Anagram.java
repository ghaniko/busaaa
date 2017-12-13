import java.util.*;
public class Anagram {

    String myString1;
    String myString2;

    public Anagram(String myString1, String myString2){
      this.myString1 = myString1;
      this.myString2 = myString2;
    }

    public Boolean anagram(String string1, String string2) {
      char[] string1Array = string1.toCharArray();
      char[] string2Array = string2.toCharArray();

      Arrays.sort(string1Array);
      Arrays.sort(string2Array);

      String stringToBeCompared1 = Arrays.toString(string1Array);
      String stringToBeCompared2 = Arrays.toString(string2Array);

      return stringToBeCompared1.equals(stringToBeCompared2);
    }
}
