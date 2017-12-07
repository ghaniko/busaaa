public class Fibonacci {
  public static void main(String[] args) {
    System.out.println(fibFunction(9));
  }

  private static int fibFunction(int n) {
    if(n == 1){
      return 0;
    }
    else if(n == 2){
      return 1;
    }
    else{
      return fibFunction(n - 1) + fibFunction(n - 2);
    }
  }
}
