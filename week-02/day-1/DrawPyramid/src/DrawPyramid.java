public class DrawPyramid {
    public static void main(String[] args) {
        int num = 11;
        int i = 0;
        while (i < num + 1){
            for (int j = 0; j < 2 * i + 1; j++ ){
                System.out.print("*");
            }
            System.out.println();
            i++;
        }
    }
}
