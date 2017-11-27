public class VariableMutation {
    public static void main(String[] args) {
        int a = 3;
        // make it bigger by 10
        a += 3;

        System.out.println(a);




        int b = 100;
        // make it smaller by 7
        b -= 7;

        System.out.println(b);




        int c = 44;
        // please double c's value

        c = 2 * c;
        System.out.println(c);




        int d = 125;
        // please divide by 5 d's value
        d = d / 5;

        System.out.println(d);




        int e = 8;
        // please cube of e's value


        System.out.println (Math.pow(e, 3));




        int f1 = 123;
        int f2 = 345;
        // tell if f1 is bigger than f2 (print as a boolean)

        boolean f1Bigger = f1 < f2;

        System.out.println(f1Bigger);

        if (f1 < f2) {
            System.out.println("f1 smaller than f2");
        }
        else{
            System.out.println("f1 greater than f2 or equal");
        }



        int g1 = 350;
        int g2 = 200;
        // tell if the double of g2 is bigger than g1 (print as a boolean)

        if (g1 < 2 * g2) {
            System.out.println("g1 smaller than the double of g2");
        }
        else if (g1 == 2 * g2){
            System.out.println("g1 is equal to the double of g2");
        }
        else {
            System.out.println("g1 greater than the double of g2");
        }


        int h = 135798745;
        // tell if it has 11 as a divisor (print as a boolean)

        boolean divisor = h % 11 == 0;

        System.out.println(divisor);



        int i1 = 10;
        int i2 = 3;
        // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)

        boolean check = i1 > i2 * i2 && i1 < i2 * i2 * i2;
        System.out.println(check);


        int j = 1521;
        // tell if j is dividable by 3 or 5 (print as a boolean)

        boolean jDiv = j % 3 == 0 || j % 5 == 0;
        System.out.println(jDiv);


        String k = "Apple";
        //fill the k variable with its cotnent 4 times

        k = k + k + k + k;
        System.out.println(k);
    }
}
