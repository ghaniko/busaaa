import java.util.Scanner;
public class Cuboid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter one side of the cuboid in cms (use decimal comma:,): ");
        double cuboidHeight = input.nextDouble();
        System.out.println("Please enter another side of the cuboid in cms (use decimal comma:,): ");
        double cudoidLength = input.nextDouble();
        System.out.println("Please enter the last side of the cuboid in cms (use decimal comma:,): ");
        double cuboidWidth = input.nextDouble();
        double cuboidArea = 2 * (cuboidHeight * cuboidWidth + cuboidHeight * cudoidLength + cuboidWidth * cudoidLength);
        double cuboidVolume = cuboidHeight * cuboidWidth * cudoidLength;
        System.out.println("The surface of the cuboid is: " + cuboidArea + " cm^2");
        System.out.println("The volume of the cuboid is: " + cuboidVolume+ " cm^3");
    }
}
