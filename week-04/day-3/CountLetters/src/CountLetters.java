import java.util.*;

public class CountLetters {
 String myString;


  public CountLetters(){
    this.myString = myString;
  }

  public Map makeDictionary(String myString){
    HashMap<Character, Integer> dictionary = new HashMap<>();
    for (int i = 0; i < myString.length(); i++) {
      if (dictionary.containsKey(myString.charAt(i))) {
        dictionary.put(myString.charAt(i), dictionary.get(myString.charAt(i)) + 1);
      }else{
        dictionary.put(myString.charAt(i), 1);
      }
    }
    System.out.println(dictionary);
    return dictionary;
  }
}
