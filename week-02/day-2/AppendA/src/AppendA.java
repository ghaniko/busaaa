import java.util.Arrays;
public class AppendA {
    public static void main(String[] args) {
        String[] nimals = {"kuty", "macsk", "cic"};
        for (int i = 0; i < 3; i++){
            nimals[i] = nimals[i] + "a";
        }
        System.out.println(Arrays.toString(nimals));


    }
}