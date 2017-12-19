import java.awt.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Screen {
  String fileNameOfTheStoredBoard = "gameStore.txt";
  List<String> positionOfTiles;
  int tileSize = 72;
  int screenWidth = 720;
  int screenHeight = 720;

  public void drawScreen(Graphics graphics, String fileName) {
    try {
      Path filePath = Paths.get(fileName);
      positionOfTiles = Files.readAllLines(filePath);
      for (int i = 0; i < positionOfTiles.size(); i++) {
        for (int j = 0; j < positionOfTiles.get(i).length(); j++) {
          if (positionOfTiles.get(i).charAt(j) == 't') {
            PositionedImage floor = new PositionedImage("floor.png", j * tileSize, i * tileSize);
            floor.draw(graphics);
          } else if (positionOfTiles.get(i).charAt(j) == 'w') {
            PositionedImage wall = new PositionedImage("wall.png", j * tileSize, i * tileSize);
            wall.draw(graphics);
          }
        }
      }
    } catch (Exception e) {
      System.out.println("Uh-oh, could not read the file!");
    }
  }

  public int numberOfWalls() {
    int numberOfW = 0;
    try {
      Path filePath = Paths.get(fileNameOfTheStoredBoard);
      positionOfTiles = Files.readAllLines(filePath);
      for (int i = 0; i < positionOfTiles.size(); i++) {
        for (int j = 0; j < positionOfTiles.get(i).length(); j++) {
          if (positionOfTiles.get(i).charAt(j) == 'w') {
            numberOfW++;
          }
        }
      }
    } catch (Exception e) {
      System.out.println("Uh-oh, could not read the file!");
    }
    return  numberOfW;
  }

  public ArrayList<int[]> getPositionOfWalls(){
    int k = 0;
    int[][] coordinateOfWalls = new int[numberOfWalls()][2];
    for (int i = 0; i < positionOfTiles.size(); i++) {
      for (int j = 0; j < positionOfTiles.get(i).length(); j++) {
        if (positionOfTiles.get(i).charAt(j) == 'w') {
          coordinateOfWalls[k][0] = j * tileSize;
          coordinateOfWalls[k][1] = i * tileSize;
          k++;
        }
      }
    }
    return new ArrayList<>(Arrays.asList(coordinateOfWalls));
  }
  public ArrayList<int[]> getPositionOfTiles(){
    int m = 0;
    int[][] coordinateOfWalls = new int[screenWidth / tileSize * screenHeight / tileSize - numberOfWalls()][2];
    for (int i = 0; i < positionOfTiles.size(); i++) {
      for (int j = 0; j < positionOfTiles.get(i).length(); j++) {
        if (positionOfTiles.get(i).charAt(j) == 't') {
          coordinateOfWalls[m][0] = j * tileSize;
          coordinateOfWalls[m][1] = i * tileSize;
          m++;
        }
      }
    }
    return new ArrayList<>(Arrays.asList(coordinateOfWalls));
  }
}
