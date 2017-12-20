import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class UniqueCharacters {
  String myString;


  public UniqueCharacters(){
    this.myString = myString;
  }


  public ArrayList<Character> makeDictionary(String myString){
    HashMap<Character, Integer> dictionary = new HashMap<>();
    ArrayList<Character> output = new ArrayList<>();
    for (int i = 0; i < myString.length(); i++) {
      if (dictionary.containsKey(myString.charAt(i))) {
        dictionary.put(myString.charAt(i), dictionary.get(myString.charAt(i)) + 1);
      }else{
        dictionary.put(myString.charAt(i), 1);
      }
    }

    for (int i = 0; i < myString.length() ; i++) {
      if (dictionary.get(myString.charAt(i)) == 1){
        output.add(myString.charAt(i));
      }
    }

    return output;
  }
}
