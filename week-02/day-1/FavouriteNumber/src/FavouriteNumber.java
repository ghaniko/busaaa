import java.util.Scanner;
public class FavouriteNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your favourite number:");
        int myFavNumber = input.nextInt();
        System.out.println("Your Favourite number is: " + myFavNumber);

    }
}
