import java.util.*;
public class Lists07 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

        // Accidentally I messed up this quote from Richard Feynman.
        // Two words are out of place
        // Your task is to fix it by swapping the right words with code

        // Also, print the sentence to the output with spaces in between.

        Collections.swap(list,2 , 5);
        System.out.println(list);
        for (int i = 0; i < 8; i++){
            System.out.print(list.get(i) + " ");
        }
    }
}
