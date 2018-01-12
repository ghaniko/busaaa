import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RandomBoard2 {
  public static void main(String[] args) {
    int initialRandomTile;
    int newRandomTile;
    int width = 10;
    int height = 10;
    int minNumberOfTiles = 60;
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

    System.out.println(Arrays.toString(transformToArray(transformToString(transformToCharArray(actualTiles, width, height)), width, height)));
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
  public static char[] transformToCharArray(ArrayList<Integer> arrayListToBeTransformed, int width, int height) {
    char[] helpCharArray = new char[(width) * (height)];

    for (int i = 0; i < (width) * (height); i++) {
      if (arrayListToBeTransformed.contains(i)) {
        helpCharArray[i] = 't';
      } else {
        helpCharArray[i] = 'w';
      }
    }
    return helpCharArray;
  }
  public static String transformToString(char[] helpCharArray) {
    StringBuilder myStringBuilder = new StringBuilder();
    for (int i = 0; i < helpCharArray.length; i++) {
      myStringBuilder.append(helpCharArray[i]);
    }
    String stringToBeSplit = myStringBuilder.toString();
    return stringToBeSplit;
  }
  public static String[] transformToArray(String stringToBeSplit, int width, int height){
    String[] stringToBeReadIn = new String[height];
    for (int i = 0; i < stringToBeReadIn.length ; i++) {
      stringToBeReadIn[i] = stringToBeSplit.substring(i * (width), (i + 1) * (width));
    }
    return stringToBeReadIn;
  }
}
