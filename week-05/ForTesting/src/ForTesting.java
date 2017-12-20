import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ForTesting {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Give me the width (min: 4, max: 10): ");
    int width = scanner.nextInt();
    System.out.println("Give me the height (min: 4, max: 10): ");
    int height = scanner.nextInt();
    System.out.println("Give me the number of tiles (min: " + (int) (0.3 * width * height) + ", max: " + (int) (0.7 * width * height) + ":");
    int numberOfTiles = scanner.nextInt();
    System.out.println("Something is happening");

    int initialTileWidth = (int) (Math.random() * width);
    int initialTileHeight = (int) (Math.random() * height);
    int[] tempInt = {initialTileHeight, initialTileWidth};
    ArrayList<int[]> tempArrayList = new ArrayList<>();
    tempArrayList.add(tempInt);
    String[][] stringToBeReadIn = new String[height][width];
    for (int i = 0; i < height; i++) {
      for (int j = 0; j < width; j++) {
        stringToBeReadIn[i][j] = "w";
      }
    }
    stringToBeReadIn[initialTileHeight][initialTileWidth] = "t";
    System.out.println(Arrays.deepToString(stringToBeReadIn));
    System.out.println(Arrays.toString(tempInt));
    System.out.println(tempArrayList.size());
    System.out.println(tempArrayList.get(0)[0]);
    System.out.println(tempArrayList.get(0)[1]);

    while (tempArrayList.size() < numberOfTiles) {
      int tempArrayListElement = (int) (Math.random() * tempArrayList.size());
      int tempIntElement = (int) (Math.random() * 2);
      int oneNextToInt = minusOrPlusOne();

      if (tempIntElement == 0 && !tempArrayList.contains(tempInt) &&
              tempArrayList.get(tempArrayListElement)[1] < width && tempArrayList.get(tempArrayListElement)[1] > 0) {
        stringToBeReadIn[tempArrayList.get(tempArrayListElement)[0]][tempArrayList.get(tempArrayListElement)[1] + oneNextToInt] = "t";
        tempInt = new int[]{tempArrayList.get(tempArrayListElement)[0], tempArrayList.get(tempArrayListElement)[1] + oneNextToInt};
        tempArrayList.add(tempInt);
      } else if (tempIntElement == 1 && !tempArrayList.contains(tempInt) &&
              tempArrayList.get(tempArrayListElement)[0] < height && tempArrayList.get(tempArrayListElement)[0] > 0) {
        stringToBeReadIn[tempArrayList.get(tempArrayListElement)[0] + oneNextToInt][tempArrayList.get(tempArrayListElement)[1]] = "t";
        tempInt = new int[]{tempArrayList.get(tempArrayListElement)[0] + oneNextToInt, tempArrayList.get(tempArrayListElement)[1]};
        tempArrayList.add(tempInt);
      }
      //}

      System.out.println(Arrays.deepToString(stringToBeReadIn));
      System.out.println(Arrays.toString(tempInt));
      System.out.println(tempArrayList.size());
      System.out.println(tempArrayList.get(0)[0]);
      System.out.println(tempArrayList.get(0)[1]);
      System.out.println(tempArrayList.get(1)[0]);
      System.out.println(tempArrayList.get(1)[1]);
    }
  }

  public static int minusOrPlusOne(){
    if(Math.random() < 0.5){
      return -1;
    }else {
      return  1;
    }
  }
}
