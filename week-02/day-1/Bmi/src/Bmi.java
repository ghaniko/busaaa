import java.util.Scanner;
public class Bmi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your weight (use decimal comma:,): ");
        double myWeight = input.nextDouble();
        System.out.println("Please enter your height in meters (use decimal comma:,): ");
        double myHeight = input.nextDouble();
        System.out.println("Your BMI is: " + myWeight / myHeight);
    }
}
