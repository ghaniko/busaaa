public class Test {
  public static void main(String[] args) {
    int initialTX = 5;
    int lightX = 4;
    int initalTY = 11;
    int lightY = 9;

    if (initialTX > lightX) {
      System.out.println("W");
    }
    else if (initialTX < lightX){
        System.out.println("E");
    }
    if (initalTY > lightY){
      System.out.println("N");
    }
    else if (initalTY < lightY){
      System.out.println("S");
    }
  }
}
