import java.util.Scanner;
public class AnimalsAndLegs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of chickens: ");
        int numChickens = input.nextInt();
        System.out.println("Please enter the number of pigs: ");
        int numPigs = input.nextInt();
        int numLegs = 4 * numPigs + 2 * numChickens;

        System.out.println("The number of legs are:  " + numLegs + "  unless some animals lost couple of theirs...");
    }
}
