public class Bunnies {
  public static void main(String[] args) {
    System.out.println(bunnyEars(2));
  }

  private static int bunnyEars(int bunnies) {
    if (bunnies == 1){
      return 2;
    }
    else{
      return bunnyEars(bunnies - 1) + bunnyEars(1);
    }
  }
}
