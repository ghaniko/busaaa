import java.util.*;
public class PalindromeSearcher {
    public static void main(String[] args) {
        String myString = "racecar";

        System.out.println(searchPalindrome(myString));
    }

    private static String searchPalindrome(String origString) {
        String stringOutput = "";
        ArrayList<String> output = new ArrayList<>();
        for (int i = 0; i < origString.length() - 1; i++) {
            for (int j = i + 2; j < origString.length() + 1; j++){
                if (origString.substring(i, j).equals(reverseString(origString.substring(i, j)))){
                    output.add(origString.substring(i, j));
                }
            }
        }
        return String.valueOf(output);
    }


    private static String reverseString(String stringToBeReversed) {
        char[] stringToBeReversedArray = stringToBeReversed.toCharArray();
        char[] newArray = new char[stringToBeReversedArray.length];
        for (int i = 0; i <stringToBeReversedArray.length; i++) {
            newArray[stringToBeReversedArray.length - i -1] = stringToBeReversedArray[i];
        }
        String reversedString = new String(newArray);
        return (reversedString);
    }
}
