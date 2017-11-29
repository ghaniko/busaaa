import java.util.Arrays;
public class SumAllElelments {
    public static void main(String[] args) {
        int[] array = {3, 4, 5, 6, 7};
        int sum = 0;
        for (int i = 0; i < 5; i++){
            sum = sum + array[i];
        }
        System.out.println(sum);
    }
}
