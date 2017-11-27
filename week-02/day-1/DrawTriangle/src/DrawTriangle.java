public class DrawTriangle {
    public static void main(String[] args) {
        int num = 11;
        int i = 0;
        while (i < num + 1){
            for (int j = 0; j < i; j++ ){
                System.out.print("*");
            }
            System.out.println();
            i++;
        }

    }
}
