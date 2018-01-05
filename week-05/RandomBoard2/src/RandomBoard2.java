import java.util.ArrayList;

public class RandomBoard2 {
  public static void main(String[] args) {
    int newRandomTile;
    int width = 10;
    int height = 10;
    int numberOfTiles = 52;
    ArrayList<Integer> forbiddenPositionOfTiles = new ArrayList<>();
    ArrayList<Integer> actualTiles = new ArrayList<>();

    newRandomTile = 1 +(int) (Math.random() * width * height);
    System.out.println(newRandomTile);
    actualTiles.add(newRandomTile);
    forbiddenPositionOfTiles.add(newRandomTile);

    do{
      newRandomTile = 1 + (int) (Math.random() * width * height);
    }while(forbiddenPositionOfTiles.contains(newRandomTile));
    System.out.println(newRandomTile);

    System.out.println(minXDistancePosition(newRandomTile, actualTiles, width));


    forbiddenPositionOfTiles.add(5);
    forbiddenPositionOfTiles.add(25);
    forbiddenPositionOfTiles.add(50);
    forbiddenPositionOfTiles.add(75);
    do{
      newRandomTile = 1 + (int) (Math.random() * 100);
    }while(forbiddenPositionOfTiles.contains(newRandomTile));
    System.out.println(newRandomTile);

  }

  private static int minXDistancePosition(int newRandomTile, ArrayList<Integer> actualTiles, int width) {
    int XDistance = 10000;
    for (int i = 0; i < actualTiles.size(); i++) {
      if(Math.abs(actualTiles.get(i) % width - newRandomTile % width) < XDistance){
        XDistance = Math.abs(actualTiles.get(i) % width - newRandomTile % width);
      }
    }return XDistance;
  }
}
