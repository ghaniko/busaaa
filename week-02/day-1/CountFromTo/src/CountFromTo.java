import java.util.*;
public class CountFromTo {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number: ");
        int number1 = scanner.nextInt();
        System.out.println("Give me another number: ");
        int number2 = scanner.nextInt();
        if (number2 <= number1){
            System.out.println("The second number should be bigger");
        }
        else{
            for(int i = 0; i < number2 - number1 +1; i++)
                System.out.println(number1 + i);
        }
    }
}
