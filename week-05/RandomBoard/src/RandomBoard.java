import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RandomBoard {
  public static void main(String[] args) {
    int width =8;
    int height =8;
    int numberOfTiles = 39;
    int initialRandomPosition;
    int randomIndex;
    int randomDirection;
    int neighbourPosition = 0;
    ArrayList<Integer> forbiddenPositionOfTiles = new ArrayList<>();
    ArrayList<Integer> actualPositionOfTiles = new ArrayList<>();
    ArrayList<Integer> forbiddenIndexesOfActualPositionOfTiles = new ArrayList<>();

    //Create "edges" of board
    initialFill(forbiddenPositionOfTiles, width, height);
    //Place one position in the "middle"
    do {
      initialRandomPosition = width + 4 + (int) (Math.random() * (width + 2) * height);
    } while (forbiddenPositionOfTiles.contains(initialRandomPosition));

    forbiddenPositionOfTiles.add(initialRandomPosition);
    actualPositionOfTiles.add(initialRandomPosition);

    //Fill up the "path"
    while (actualPositionOfTiles.size() < numberOfTiles){

      do {
        randomIndex = (int) (Math.random() * actualPositionOfTiles.size());
      } while (forbiddenIndexesOfActualPositionOfTiles.contains(randomIndex));

      if (forbiddenPositionOfTiles.contains(actualPositionOfTiles.get(randomIndex) + 1) &&
              forbiddenPositionOfTiles.contains(actualPositionOfTiles.get(randomIndex) - 1) &&
              forbiddenPositionOfTiles.contains(actualPositionOfTiles.get(randomIndex) - (width + 2)) &&
              forbiddenPositionOfTiles.contains(actualPositionOfTiles.get(randomIndex) + (width + 2))) {
        forbiddenIndexesOfActualPositionOfTiles.add(randomIndex);

      } else {
        randomDirection = (int) (Math.random() * 4);

       /* if (randomDirection == 0) {
          neighbourPosition = -(width + 2);
        } else if (randomDirection == 1) {
          neighbourPosition = 1;
        } else if (randomDirection == 2) {
          neighbourPosition = (width + 2);
        } else if (randomDirection == 3) {
          neighbourPosition = -1;
        }*/
        checkDirection(forbiddenPositionOfTiles, actualPositionOfTiles, randomIndex, neighbourPosition, randomDirection, width);
      }
    }
    //Transform it to an uploadable format
    System.out.println(actualPositionOfTiles);
    Collections.sort(actualPositionOfTiles);
    System.out.println(actualPositionOfTiles);

    System.out.println(Arrays.toString(transformToArray(transformToString(transformToCharArray(actualPositionOfTiles, width, height)), width, height)));
  }

  public static void checkDirection(ArrayList<Integer> forbiddenPositionOfTiles, ArrayList<Integer> actualPositionOfTiles,
                                 int randomIndex, int neighbourPosition, int randomDirection, int width) {
    if (randomDirection == 0) {
      neighbourPosition = -(width + 2);
    } else if (randomDirection == 1) {
      neighbourPosition = 1;
    } else if (randomDirection == 2) {
      neighbourPosition = (width + 2);
    } else if (randomDirection == 3) {
      neighbourPosition = -1;
    }
    if (forbiddenPositionOfTiles.contains(actualPositionOfTiles.get(randomIndex) + neighbourPosition)) {
      randomDirection = (randomDirection + 1) % 4;
      checkDirection(forbiddenPositionOfTiles, actualPositionOfTiles, randomIndex, neighbourPosition, randomDirection, width);
    } else {
      actualPositionOfTiles.add(actualPositionOfTiles.get(randomIndex) + neighbourPosition);
      forbiddenPositionOfTiles.add(actualPositionOfTiles.get(randomIndex) + neighbourPosition);
    }
  }
  public static ArrayList<Integer> initialFill(ArrayList<Integer> inputArrayList, int width, int height){
    for (int i = 1; i <= width + 2; i++) {
      inputArrayList.add(i);
      inputArrayList.add((height + 2) * (width + 2) + 1 - i);
      if(i % (width + 2) == 1 || i % (width + 2) == 0){
        for (int j = 1; j <= height; j++) {
         inputArrayList.add(i + j * (width + 2));
        }
      }
    }
    return inputArrayList;
  }
  public static ArrayList<Integer> decreaseAllElement (ArrayList<Integer> inputArrayList, int width){
    for (int i = 0; i < inputArrayList.size(); i++) {
      inputArrayList.set ( i, inputArrayList.get(i) - (width + 3));
    }
    return inputArrayList;
  }
  public static char[] transformToCharArray(ArrayList<Integer> arrayListToBeTransformed, int width, int height) {
    char[] helpCharArray = new char[(width + 2) * (height + 2)];

    for (int i = 0; i < (width + 2) * (height + 2); i++) {
      if (arrayListToBeTransformed.contains(i + 1)) {
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
    String[] stringToBeReadIn = new String[height + 2];
    for (int i = 0; i < stringToBeReadIn.length ; i++) {
      stringToBeReadIn[i] = stringToBeSplit.substring(i * (width + 2), (i + 1) * (width + 2));
    }
    return stringToBeReadIn;
  }
}
