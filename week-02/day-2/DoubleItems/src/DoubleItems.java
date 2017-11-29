import java.util.Arrays;
public class DoubleItems {
    public static void main(String[] args) {
        int[] ag = {3, 4, 5, 6, 7};
        for (int i = 0; i < 5; i++){
            ag[i] = 2 * ag[i];
        }
        System.out.println(Arrays.toString(ag));
    }
}
