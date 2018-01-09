import java.util.ArrayList;
import java.util.Collections;

public class RandomBoard2 {
  public static void main(String[] args) {
    int initialRandomTile;
    int newRandomTile;
    int width = 6;
    int height = 6;
    int minNumberOfTiles = 15;
    ArrayList<Integer> actualTiles = new ArrayList<>();

    initialRandomTile = (int) (Math.random() * width * height);
    actualTiles.add(initialRandomTile);

    while(actualTiles.size() < minNumberOfTiles){
      do{
        newRandomTile = (int) (Math.random() * width * height);
      }while(actualTiles.contains(newRandomTile));
      pathBuilder(actualTiles, findLEndPoint(actualTiles, newRandomTile, width), newRandomTile, width);
    }
    System.out.println(actualTiles);
    Collections.sort(actualTiles);
    removeDuplicate(actualTiles);
    System.out.println(actualTiles);
  }

  private static ArrayList removeDuplicate(ArrayList<Integer> actualTiles) {
    for (int i = 0; i < actualTiles.size() - 1; i++) {
      if(actualTiles.get(i) == actualTiles.get(i + 1)){
        actualTiles.remove(i);
      }
    }
    return actualTiles;
  }

  private static void pathBuilder(ArrayList<Integer> actualTiles, int tempTile, int newRandomTile, int width) {
    for (int i = 0; i <= Math.abs(tempTile / width - newRandomTile / width); i++) {
      if (tempTile - newRandomTile < 0) {
        actualTiles.add(newRandomTile - i * width);
      } else {
        actualTiles.add(newRandomTile + i * width);
      }
    }
    for (int j = 1; j < Math.abs(tempTile % width - newRandomTile % width); j++) {
      if(tempTile % width - newRandomTile % width < 0){
        actualTiles.add(tempTile + j);
      }else {
        actualTiles.add(tempTile - j);
      }
    }
  }

  private static int findLEndPoint(ArrayList<Integer> actualTiles, int newRandomTile, int width) {
    int tempTile = 0;
    int distance = 10000;
    for (int i = 0; i < actualTiles.size() ; i++) {
      if(Math.abs(actualTiles.get(i) % width - newRandomTile % width) +
              Math.abs(actualTiles.get(i) / width - newRandomTile / width) < distance){
        distance = Math.abs(actualTiles.get(i) % width - newRandomTile % width) +
                Math.abs(actualTiles.get(i) / width - newRandomTile / width);
        tempTile = actualTiles.get(i);
      }
    }
    return tempTile;
  }
}
