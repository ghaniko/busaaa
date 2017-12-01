import java.lang.reflect.Array;
import java.util.*;
public class FindTheSubstring {
    public static void main(String[] args) {
        String myString1 = "This is the first string";
        String myString2 = "the";
        System.out.println(substring(myString1, myString2));
      }

   private static Integer substring(String string1, String string2) {
        if (string1.contains(string2)){
            String[] myStringNew = string1.split(string2);
            return myStringNew[0].length() - 1;
        }
        else{
            return -1;
        }
    }

}