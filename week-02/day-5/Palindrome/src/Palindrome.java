import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        String firstString = "string";
        palindrome(firstString);
    }

    private static void palindrome(String myString) {
        String newString;
        for (int i = 0; i < myString.length(); i++) {
            newString = "" + myString.charAt(i) + myString.charAt(myString.length() - 1 - i);
            System.out.println(newString);
        }
    }
}
