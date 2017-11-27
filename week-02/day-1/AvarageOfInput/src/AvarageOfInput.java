import java.util.Scanner;
public class AvarageOfInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Gimme a number: ");
        int firstNum = input.nextInt();
        System.out.println("Gimme a second number: ");
        int secondNum = input.nextInt();
        System.out.println("Gimme a third number: ");
        int thirdNum = input.nextInt();
        System.out.println("Gimme a fourth number: ");
        int fourthNum = input.nextInt();
        System.out.println("Gimme a fifth number: ");
        int fifthNum = input.nextInt();
        double avarage = (fifthNum + secondNum + thirdNum + fourthNum + fifthNum) / 5;
        double sum = fifthNum + secondNum + thirdNum + fourthNum + fifthNum;
        System.out.println("Although you did not ask for it, but this is the sum: " + sum +
                ", and this is the avarage: " + avarage + " of those five numbers. Hope you are happyy MF...!!!");
    }
}
