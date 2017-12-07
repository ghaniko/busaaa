public class BunniesAgain {
  public static void main(String[] args) {
    System.out.println(bunnyEarsOdd(20));
  }

  private static int bunnyEarsOdd(int b) {
    if (b > 0) {
      if (b % 2 == 1) {
        return bunnyEarsOdd(b - 1) + 2;
      } else {
        return bunnyEarsOdd(b - 1) + 3;
      }
    }
    return b;

  }

}
