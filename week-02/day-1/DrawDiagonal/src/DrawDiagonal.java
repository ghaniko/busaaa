public class DrawDiagonal {
    public static void main(String[] args) {
        int num = 7;
        int i;
        int j;
        int k;
        for (i = 0; i < num; i++){
            if (i == 0 || i == num - 1){
                for (j = 0; j < num; j++){
                    System.out.print("%");
                }
                System.out.println();
            }
            else {
                System.out.print("%");

                for (k = 1; k < i; k++) {
                    System.out.print(" ");
                }

                System.out.print("%");

                for (k = 0; k < num - i - 2; k++) {
                    System.out.print(" ");
                }

                System.out.print("%");
                System.out.println();
            }
        }
    }
}
