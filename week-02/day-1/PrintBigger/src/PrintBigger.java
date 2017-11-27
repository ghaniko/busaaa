import java.util.Scanner;
public class PrintBigger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an number: ");
        double num1 = input.nextDouble();
        System.out.println("Please enter another number(use decimal comma:,): ");
        double num2 = input.nextDouble();
        if (num1 < num2) {
            System.out.println("The bigger number is: " + num2);
        }
        else if (num1 == num2) {
            System.out.println("The two numbers are equal");
        }
        else {
            System.out.println("The bigger number is: " + num1);
        }
    }
}
