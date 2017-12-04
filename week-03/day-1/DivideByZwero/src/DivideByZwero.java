import java.util.Scanner;
public class DivideByZwero {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Give me an integer: ");
    int divisor = scanner.nextInt();
    try { // Prevents the program breaking when attempting dividing by zero
      System.out.println(divideTen(divisor));
      } catch (ArithmeticException e) {
      System.out.println("Can't divide by zero!"); // This line only runs if the input was 0
    }
  }
  public static double divideTen(int divisor){
    double result = 0;
    for (int i = 0; i < divisor; i++) {
      result = 10 / i;
      System.out.println(result);
    }
    return result;
  }
}
