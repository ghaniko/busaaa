public class Counter {
  public static void main(String[] args) {
    System.out.println(countDownFunction(5));
  }

  private static int countDownFunction(int input) {

    if(input == 1){
      return 1;
    }
    else{
      System.out.println(input);
      return countDownFunction(input - 1);


    }
  }
}
