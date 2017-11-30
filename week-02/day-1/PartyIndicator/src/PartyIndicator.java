import java.util.Scanner;
public class PartyIndicator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gimme the number of the Boys: ");
        int numberBoys = scanner.nextInt();
        System.out.println("Gimme the number of the Girls: ");
        int numberGirls = scanner.nextInt();

        if (numberBoys == numberGirls && numberBoys + numberGirls > 20){
            System.out.println("The party is excellent");
        }
        else if (numberGirls ==0 ){
            System.out.println("Sausage party :(");
        }
        else if (numberBoys != numberGirls && numberGirls + numberBoys > 20){
            System.out.println("Quite cool party!");
        }
        else if (numberBoys + numberGirls < 20){
            System.out.println("Avarage party...");
        }
    }
}
