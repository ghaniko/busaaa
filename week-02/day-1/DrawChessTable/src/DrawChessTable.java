import java.util.*;
public class DrawChessTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give how big the chess table should be (give even numbers): ");
        int numberChessTable = scanner.nextInt();
        for (int i = 0; i < numberChessTable / 2; i++) {
            if(i % 2 == 0){
                for (int j = 0; j < numberChessTable / 2; j++) {
                    System.out.print("# ");
                }
                System.out.println();
            }

            else {
                for (int l = 0; l < numberChessTable / 2; l++) {
                    System.out.print(" #");
                }
                System.out.println();
            }
        }
    }
}
