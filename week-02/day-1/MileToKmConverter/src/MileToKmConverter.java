import java.util.Scanner;
public class MileToKmConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number to be converted to miles: ");
        double numberToBeConverted = scanner.nextDouble();
        System.out.println("The mile is: " + numberToBeConverted / 1.806);
    }
}
