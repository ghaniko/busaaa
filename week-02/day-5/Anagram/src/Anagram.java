import java.util.*;
public class Anagram {
    public static void main(String[] args) {
        String myString1 = "blauk";
        String myString2 = "baluk  ";

        if (!anagram(myString1, myString2)){
            System.out.println("The two are not an anagram");
        }
        else{
            System.out.println("The 2 are anagrams");
        }

    }

    private static Boolean anagram(String string1, String string2) {
        //string1.toCharArray();
        //string2.toCharArray();
        char[] string1Array = string1.toCharArray();
        char[] string2Array = string2.toCharArray();

        Arrays.sort(string1Array);
        Arrays.sort(string2Array);

        String stringToBeCompared1 = Arrays.toString(string1Array);
        String stringToBeCompared2 = Arrays.toString(string2Array);

        return stringToBeCompared1.equals(stringToBeCompared2);
    }
}
