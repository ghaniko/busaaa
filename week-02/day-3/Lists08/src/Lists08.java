import java.util.*;
public class Lists08 {
    public static void main(String[] args) {
        System.out.println("Oi, gimme an operation you would like to be executed MF (+, -, *, /, %(it's modulo you MF)): " );
        Scanner scanner = new Scanner(System.in);
        String operation = scanner.next();

        System.out.println("Oi, gimme a number, you MF (use decimal comma): " );
        double  number1 = scanner.nextDouble();

        System.out.println("Oi, gimme another number, you MF (use decimal comma): " );
        double  number2 = scanner.nextDouble();
        double result;
        if (operation.equals("+")){
            result = number1 + number2;
            System.out.println(result);
        }
        else if (operation.equals("-"){
            result = number1 - number2;
            System.out.println(result);
        }
        else if (operation.equals("*")){
            System.out.println(number1 * number2);
        }
        else if (operation.equals("/")){
            System.out.println(number1 / number2);
        }
        else if (operation.equals("%")){
            System.out.println(number1 % number2);
        }
        else {
            System.out.println("You messed up something, you MF");
        }
    }
}
