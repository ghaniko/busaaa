import com.sun.org.apache.bcel.internal.generic.ARRAYLENGTH;

import java.util.Arrays;
public class PrintElements {
    public static void main(String[] args) {
        int[] af = {4, 5, 6, 7};
        System.out.println(Arrays.toString(af));
        for (int i = 0; i < 4; i++){
            System.out.println(af[i]);
        }
    }
}
