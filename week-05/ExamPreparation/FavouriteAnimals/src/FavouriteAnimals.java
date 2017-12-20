import java.util.ArrayList;

public class FavouriteAnimals {
  public static void main(String[] args) {
    if (args.length == 0){
      System.out.println("\njava FavouriteAnimals [animal] [animal]");
    }

    else {
      FileHandling textToBeAdded = new FileHandling();
      ArrayList<String> actualContentToBeAdded = new ArrayList<String>();
      for (int i = 0; i < args.length; i++) {
        if(!textToBeAdded.readOutAllTheLines().contains(args[i])){
          actualContentToBeAdded.add(args[i]);
        }
      }
      textToBeAdded.addNewContentNewLine(actualContentToBeAdded);
    }
  }
}
