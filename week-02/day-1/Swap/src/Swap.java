public class Swap {
    public static void main(String[] args) {


        int a = 123;
        int b = 526;
        int c = a;
        int d = b;
        b = c;
        a = d;

        System.out.println(a);
        System.out.println(b);
    }
}
