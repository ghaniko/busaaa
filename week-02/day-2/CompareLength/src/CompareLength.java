import java.util.Arrays;
public class CompareLength {
    public static void main(String[] args) {
        int[] p1 = {1, 2, 3};
        int[] p2 = {4, 5};
        System.out.println(p1.length);
       if (p1.length < p2.length){
            System.out.println("Length of p2 is greater");
        }
        else if (p1.length == p2.length){
            System.out.println("The lengths are equal");
        }
        else{
            System.out.println("Length of p1 is greater");
        }
    }
}
