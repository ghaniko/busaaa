import java.util.*;
public class Lists06 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));

        // Check if list contains all of the following elements: 4,8,12,16
        // Print "true" if it contains all, otherwise print "false"
        // Can you do both the different approaches you tried in the previous one?
        ArrayList<Integer> listHelp = new ArrayList<Integer>(Arrays.asList(4, 8, 12, 16));
        System.out.println(list.containsAll(listHelp));



        boolean checkIfContains = list.contains(4) && list.contains(8) && list.contains(12) && list.contains(16);
        if (checkIfContains){
            System.out.println("yeey, it contains all of them");
        }
        else{
            System.out.println("None or not all of these are in");
        }
    }
}
