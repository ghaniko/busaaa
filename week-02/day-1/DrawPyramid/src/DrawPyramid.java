public class DrawPyramid {
    public static void main(String[] args) {
        int num = 8;
        int numHalf = num / 2;
        if (num % 2 == 1) {
            for (int i = 0; i < numHalf + 1; i++) {
                for (int k = 0; k < numHalf - i; k++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < 2 * i + 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int i = 0; i < numHalf; i++) {
                for (int j = 0; j < i + 1; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < 2 * numHalf - 1 - 2 * i; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        else{
            for (int i = 0; i < numHalf; i++) {
                for (int k = 0; k < numHalf - 1 - i; k++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < 2 * i + 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int i = 0; i < numHalf; i++){
                for (int j = 0; j < i; j++ ) {
                    System.out.print(" ");
                }
                for (int k = 0; k < 2 * numHalf - 1 - 2 * i; k++ ){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
