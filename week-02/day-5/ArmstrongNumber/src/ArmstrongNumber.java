import java.util.ArrayList;

public class ArmstrongNumber {
  public static void main(String[] args) {
    int testNumber = 100;
    isArmstrongNumber(testNumber);
  }

  private static void isArmstrongNumber(int numberToBeTested) {
    ArrayList<Integer> digitsOfNumberToBeTested = new ArrayList<>();
    for (int i = 0; i < Integer.toString(numberToBeTested).length(); i++) {
      int powerOfTen = (int) Math.pow(10.0, (double) i);
      digitsOfNumberToBeTested.add((numberToBeTested / powerOfTen) % 10);
    }
    int sumOfDigitPowers = 0;
    for (int i = 0; i < digitsOfNumberToBeTested.size() ; i++) {
      sumOfDigitPowers += Math.pow((double) digitsOfNumberToBeTested.get(i),
              (double) digitsOfNumberToBeTested.size());
    }
    if(sumOfDigitPowers == numberToBeTested){
      System.out.println("The number is an Armstrong number");
    }else{
      System.out.println("The number is NOT an Armstrong number");
    }
  }
}
