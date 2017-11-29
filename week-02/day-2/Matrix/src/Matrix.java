import java.util.Arrays;
public class Matrix {
    public static void main(String[] args) {
        int[][] array1 = new int[4][4];
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                if(i == j) {
                    array1[i][j] = 1;
                }
                else{
                    array1[i][j] = 0;
                }
            }
        }
            System.out.println(Arrays.deepToString(array1));
    }
}
