import java.util.Scanner;
public class ConditionalVariableMutation {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");

        double b = input.nextDouble();

        if (b < 10) {
        System.out.println("More");
    }
        else if (b < 20) {
        System.out.println("Sweet");
    }
        else {
        System.out.println("Less!");
    }
}
