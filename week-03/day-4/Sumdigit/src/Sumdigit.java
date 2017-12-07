public class Sumdigit {
  public static void main(String[] args) {

    System.out.println(sumDigit(722357));
  }

  private static int sumDigit(int x) {
    if (x == 0){

      return 0;
    }
    else{

      return sumDigit(x / 10 ) + x % 10;
    }
  }
}
