public class Numberadder {
  public static void main(String[] args) {
    System.out.println(numberAdder(5));
  }

  private static int numberAdder(int input) {
    if(input == 1){
      return 1;
    }
    else{
      return input + numberAdder(input - 1);
    }
  }
}
