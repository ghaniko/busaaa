import java.util.*;
public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess a number: ");
        int numberGuessed = scanner.nextInt();
        int storedNumber = 12;
        if (numberGuessed < storedNumber) {
            System.out.println("The number is higher");
        }
        else if (numberGuessed == storedNumber) {
            System.out.println("YES it is the number");
        }
        else {
            System.out.println("The number is lower");
        }
    }
}
