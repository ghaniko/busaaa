import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Please give a number below 10: ");
        Scanner input = new Scanner(System.in);
        int theNumber = input.nextInt();
        System.out.println("The factorial of the number is: " + factorial(theNumber));
    }
    public static int factorial(int number){
        int factNum = 1;
        for (int i = 1; i <= number; i++){
            factNum = factNum * i;
        }
        return factNum;
    }
}
