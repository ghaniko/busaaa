public class Power {
  public static void main(String[] args) {
    System.out.println(powerN(3, 3));
  }

  private static int powerN(int n, int p) {
    if (p == 0){
      return 1;
    }
    else{
      return n * powerN(n, p - 1);
    }
  }
}
