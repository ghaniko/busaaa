import java.util.Scanner;
public class DefineBasicInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String myName = input.next();
        System.out.println("Please enter your age: ");
        int myAge = input.nextInt();
        System.out.println("Please enter your height in meters (use decimal comma:,): ");
        double myHeight = input.nextDouble();
        System.out.println("Please enter your marrital status: ");
        boolean myMarried = input.nextBoolean();
        System.out.println("Your name is: " + myName);
        System.out.println("Your age is: " + myAge);
        System.out.println("Your height is: " + myHeight);
        System.out.println("Your marrital status is: " + myMarried);
    }
}
