import java.util.ArrayList;

public class RandomBoard3 {
  public static void main(String[] args) {
    int initialRandomTile;
    int newRandomTile;
    int width = 10;
    int height = 10;
    int minNumberOfTiles = 12;
    ArrayList<Integer> actualTiles = new ArrayList<>();

    initialRandomTile = 1 + (int) (Math.random() * width * height);
    //actualTiles.add(initialRandomTile);
    System.out.println("This is the first random tile: " + initialRandomTile);


    actualTiles.add(33);
    actualTiles.add(43);
    actualTiles.add(53);
    actualTiles.add(63);
    actualTiles.add(64);
    actualTiles.add(65);
    actualTiles.add(66);
    System.out.println(actualTiles);

    do{
      newRandomTile = 1 + (int) (Math.random() * width * height);
    }while(actualTiles.contains(newRandomTile));

    System.out.println("This is the second random tile: " + newRandomTile);

    System.out.println("This is the endpoint: " + findLEndPoint(actualTiles, newRandomTile, width));

    lBuilder(actualTiles, findLEndPoint(actualTiles, newRandomTile, width), newRandomTile, width);

    System.out.println(actualTiles);

    /*while(actualTiles.size() < minNumberOfTiles){

      do{
        newRandomTile = 1 + (int) (Math.random() * width * height);
      }while(actualTiles.contains(newRandomTile));

      if(minXElementAndTheDistance(actualTiles, newRandomTile, width)[1] <=
              minYElementAndTheDistance(actualTiles, newRandomTile, width)[1] &&
              minXElementAndTheDistance(actualTiles, newRandomTile, width)[1] != 10000){
        for (int i = 0; i < minXElementAndTheDistance(actualTiles, newRandomTile, width)[1]; i++) {
          if(minXElementAndTheDistance(actualTiles, newRandomTile, width)[0] < newRandomTile){
            actualTiles.add(newRandomTile - i);
          }else{
            actualTiles.add(newRandomTile + i);
          }
        }
      }else if(minYElementAndTheDistance(actualTiles, newRandomTile, width)[1] <=
              minXElementAndTheDistance(actualTiles, newRandomTile, width)[1] &&
              minYElementAndTheDistance(actualTiles, newRandomTile, width)[1] != 10000){
        for (int i = 0; i < minYElementAndTheDistance(actualTiles, newRandomTile, width)[1]; i++) {
          if(minYElementAndTheDistance(actualTiles, newRandomTile, width)[0] < newRandomTile){
            actualTiles.add(newRandomTile - i * width);
          }else{
            actualTiles.add(newRandomTile + i * width);
          }
        }
      }else{
        lBuilder(actualTiles, findLEndPoint(actualTiles, newRandomTile, width), newRandomTile, width);
      }
      System.out.println(actualTiles);
    }*/
  }

  private static void lBuilder(ArrayList<Integer> actualTiles, int tempTile, int newRandomTile, int width) {
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
    int lDistance = 10000;
    for (int i = 0; i < actualTiles.size() ; i++) {
      if(Math.abs(actualTiles.get(i) % width - newRandomTile % width) +
              Math.abs(actualTiles.get(i) / width - newRandomTile / width) < lDistance){
        lDistance = Math.abs(actualTiles.get(i) % width - newRandomTile % width) +
                Math.abs(actualTiles.get(i) / width - newRandomTile / width);
        tempTile = actualTiles.get(i);
      }
    }
    return tempTile;
  }

  private static int[] minXElementAndTheDistance(ArrayList<Integer> actualTiles, int newRandomTile,int width) {
    int[] elementAndDistanceX = new int[2];
    elementAndDistanceX[1] = 10000;
    for (int i = 0; i < actualTiles.size(); i++) {
      if(actualTiles.get(i) % width == newRandomTile % width &&
              Math.abs(actualTiles.get(i) % width - newRandomTile % width) < elementAndDistanceX[1]){
        elementAndDistanceX[0] = actualTiles.get(i);
        elementAndDistanceX[1] = Math.abs(actualTiles.get(i) % width - newRandomTile % width);
      }
    }return elementAndDistanceX;
  }
  private static int[] minYElementAndTheDistance(ArrayList<Integer> actualTiles, int newRandomTile,int width) {
    int[] elementAndDistanceY = new int[2];
    elementAndDistanceY[1] = 10000;
    for (int i = 0; i < actualTiles.size(); i++) {
      if(actualTiles.get(i) / width == newRandomTile / width &&
              Math.abs(actualTiles.get(i) / width - newRandomTile / width) < elementAndDistanceY[1]){
        elementAndDistanceY[0] = actualTiles.get(i);
        elementAndDistanceY[1] = Math.abs(actualTiles.get(i) / width - newRandomTile / width);
      }
    }return elementAndDistanceY;
  }
}

