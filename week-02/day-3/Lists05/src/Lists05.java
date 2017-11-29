import java.util.*;
public class Lists05 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));

        // Check if the arrayList contains "7" if it contains print "Hoorray" otherwise print "Noooooo"
        // Do this again with a different solution using different list functions!
        System.out.println("Check if your number is in the Arraylist - 3 attempts:");
        Scanner scanner = new Scanner(System.in);
        int searchedNumber = scanner.nextInt();
        if(arrayList.contains(searchedNumber)){

            System.out.println("Hoorray, it's in, you're a GENIOUS!");
        }
        else{
            System.out.println("Check if your number is in the Arraylist - 2 more attempts:");
            searchedNumber = scanner.nextInt();
            if(arrayList.contains(searchedNumber)){

                System.out.println("Hoorray, it's in, you're a GENIOUS!");
            }
            else{
                System.out.println("Check if your number is in the Arraylist - last attempt:");
                searchedNumber = scanner.nextInt();
                if(arrayList.contains(searchedNumber)){

                    System.out.println("Hoorray, it's in, you're a GENIOUS!");
                }
                else {
                    System.out.println("Sorry you couldn't guess it...");
                }

        }

        /* System.out.println("Check if your number is in the Arraylist:");
        Scanner scanner = new Scanner(System.in);
        int searchedNumber = scanner.nextInt();
        if(arrayList.contains(searchedNumber)){

            System.out.println("Hoorray, it's in, you're a GENIOUS!");
        }
        else{
            System.out.println("Noooooo, maybe next time...");
            }

        } */

    }
}
}
