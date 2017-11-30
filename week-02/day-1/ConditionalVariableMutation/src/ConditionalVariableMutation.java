import java.util.Scanner;
public class ConditionalVariableMutation {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");

        double b = input.nextDouble();

        if (b < 10) {
            System.out.println("More");
        } else if (b < 20) {
            System.out.println("Sweet");
        } else {
            System.out.println("Less!");
        }
        int c = 123;
        int credits = 48;
        boolean isBonus = true;
        // if credits are at least 50,
        // and isBonus is false decrement c by 2
        // if credits are smaller than 50,
        // and isBonus is false decrement c by 1
        // if isBonus is true c should remain the same
        if (credits >= 50 && !isBonus) {
            c = c - 2;
        } else if (credits < 50 && !isBonus) {
            c = c - 1;
        } else if (isBonus) {
            c = c;
        }

        System.out.println(c);

        int d = 7;
        int time = 220;
        String out3 = "";
        // if d is dividable by 4
        // and time is not more than 200
        // set out3 to "check"
        // if time is more than 200
        // set out3 to "Time out"
        // otherwise set out3 to "Run Forest Run!"
        if(d % 4 == 0 && time <= 200){
            out3 = "Check";
        }
        else if (time > 200) {
            out3 = "Time out";
        }
        else {
            out3 = "Run Forest Run!";
        }
        System.out.println(out3);

    }
}
