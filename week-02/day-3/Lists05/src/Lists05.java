import java.util.*;
public class Lists05 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));

        // Check if the arrayList contains "7" if it contains print "Hoorray" otherwise print "Noooooo"
        // Do this again with a different solution using different list functions!
        System.out.println("Give me a number how many attempts you would like: ");
        Scanner scanner = new Scanner(System.in);
        int attemptsNumber = scanner.nextInt();
        System.out.println("Check if your number is in the Arraylist - " + attemptsNumber + " more attempts:");


        int i = 0;
        int searchedNumber = 100;
        while (i < attemptsNumber && !arrayList.contains(searchedNumber)) {
            searchedNumber = scanner.nextInt();
            if (arrayList.contains(searchedNumber)) {
                System.out.println("Hoorray, it's in, you got lucky!");
            }
            else if (i == attemptsNumber - 1) {
                System.out.println("Sorry, you couldn't guess the elements");
            }
            else {
                    System.out.println("Nope, again! \nCheck if your number is in the Arraylist - " + (attemptsNumber - 1 - i) + " more attempts:");
            }
            i++;
        }
    }
}

        /*
        int i = 0;
        while (i < attemptsNumber) {
            if (arrayList.contains(searchedNumber)) {

                System.out.println("Hoorray, it's in, you're a GENIOUS!");
                break;
            } else {
                System.out.println("Check if your number is in the Arraylist - " + (attemptsNumber - 1 - i) + " more attempts:");
                searchedNumber = scanner.nextInt();
            }
            i = i + 1;
        }
    }
}
*/

        /*
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
                */



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


