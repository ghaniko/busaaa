import java.util.Arrays;
public class ReverseList {
    public static void main(String[] args) {
        int[] aj = {3, 4, 5, 6, 7};
        int a = aj[0];
        int b = aj[1];
        aj[0] = aj[4];
        aj[1] = aj[3];
        aj[3] = b;
        aj[4] = a;
        System.out.println(Arrays.toString(aj));

    }
}
