import java.util.Scanner;
import java.util.Arrays;

public class PrintArguments {
    public static void main(String[] args) {
        System.out.println("Please give how many names you have: ");
        Scanner input = new Scanner(System.in);
        int theNumber = input.nextInt();
        String[] stringArray = new String[theNumber];
        for(int i = 0; i < theNumber; i++){
            System.out.println("Please give one of your names: ");
            stringArray[i] = input.next();
        }
        System.out.println("Your full name is: ");
        printer(stringArray, theNumber);
    }
    public static void printer(String[] stringArrayMain, int number){
        for(int i = 0; i < number; i++) {
            System.out.print(stringArrayMain[i] + " ");
        }
    }
}
