import java.util.Scanner;

public class ParametricAvarageGood {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give how many numbers you would like the sum and avarage number: ");
        int numberLength = scanner.nextInt();
        double numberSum = 0;
        for (int i = 0; i < numberLength; i++) {
            System.out.println("Give a number (no. " + (i+1) + "): ");
            numberSum = numberSum + scanner.nextDouble();

        }
        System.out.println("Sum: " + numberSum + "\n Avarage: " + numberSum / numberLength);
    }
}
