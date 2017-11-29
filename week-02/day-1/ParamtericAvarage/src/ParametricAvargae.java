import java.util.Scanner;
import java.util.Arrays;

public class ParametricAvarage {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a number between 1 and 10: ");
    int number = input.nextInt();

    int[] tempArray = new int[number];
    for (int i = 0; i < number; i++) {
        System.out.println("Please enter a number for the avarage and sum: ");
        tempArray[i] = input.nextInt();
    }
}