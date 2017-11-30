import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number for the Multiplication table: ");
        int number = scanner.nextInt();
        for (int i = 0; i < 10; i++){
            System.out.println( (i + 1) + " * " + number + " = " + (i + 1) * number);
        }
    }
}
