import java.lang.reflect.Array;
import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palindrome(askForAString()));
    }

    private static String askForAString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give any word, I'll give you the palindrome for it: ");
        String someText = scanner.next();
        return someText;
    }
    


    private static String palindrome(String firstString) {

        String helpString = firstString + firstString;
        char[] helpStringArray = helpString.toCharArray();
        for (int i = 0; i < helpStringArray.length / 2; i++) {
            helpStringArray[helpStringArray.length - i -1] = helpStringArray[i];
        }
        String palindromeString = new String(helpStringArray);
        return palindromeString;
    }
}
