public class Summing {

    public static void main(String[] args) {
        int myNumber = 8;
        sumOfNumbers(myNumber);
    }
    public static int sumOfNumbers(int number){

        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum = sum + i;
            }
        System.out.println(sum);
        return sum;
    }
}

