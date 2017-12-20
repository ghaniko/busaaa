import java.awt.*;
import java.awt.event.KeyEvent;

public class GameCharacter {
  String name;
  int d6 = 1 + (int) (Math.random() * 6);
  int currentXOfCharacter;
  int currentYOfCharacter;
  int maxLevel;
  int currentLevel;
  int maxHealthPoints;
  int currentHealthPoints;
  int defendPoints;
  int strikePoint;

  boolean isDead;
  String fileNameOfCharacter;
  Screen screenElement = new Screen();
  int tileSize = screenElement.tileSize;

  /*public GameCharacter(String name, int currentXOfCharacter, int currentYOfCharacter, int maxLevel, int currentLevel, int maxHealthPoints, int currentHealthPoints, int defendPoints, int strikePoint, boolean isDead, String fileNameOfCharacter) {
    this.name = name;
    this.currentXOfCharacter = currentXOfCharacter;
    this.currentYOfCharacter = currentYOfCharacter;
    this.maxLevel = maxLevel;
    this.currentLevel = currentLevel;
    this.maxHealthPoints = maxHealthPoints;
    this.currentHealthPoints = currentHealthPoints;
    this.defendPoints = defendPoints;
    this.strikePoint = strikePoint;
    this.isDead = isDead;
    this.fileNameOfCharacter = fileNameOfCharacter;
  }*/

  //Ez ide kell ???
  public void battle() {

  }
  public void initializePositionOfCharacter(Graphics graphics){
    int randomNumber = (int) (Math.random() * screenElement.getPositionOfTiles().size());
    currentXOfCharacter = screenElement.getPositionOfTiles().get(randomNumber)[0];
    currentYOfCharacter = screenElement.getPositionOfTiles().get(randomNumber)[1];
    PositionedImage gameCharacter = new PositionedImage(fileNameOfCharacter, currentXOfCharacter, currentYOfCharacter);
    gameCharacter.draw(graphics);
  }
  public void move(KeyEvent e) {
    int[] helpArrayUp = {currentXOfCharacter, currentYOfCharacter - tileSize};
    int[] helpArrayDown = {currentXOfCharacter, currentYOfCharacter + tileSize};
    int[] helpArrayRight = {currentXOfCharacter + tileSize, currentYOfCharacter};
    int[] helpArrayLeft = {currentXOfCharacter - tileSize, currentYOfCharacter};
    if (e.getKeyCode() == KeyEvent.VK_UP && currentYOfCharacter != 0 && !screenElement.getPositionOfWalls().contains(helpArrayUp)){
      this.currentYOfCharacter -= tileSize;
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN && currentYOfCharacter != 9 * tileSize && !screenElement.getPositionOfWalls().contains(helpArrayDown)) {
      this.currentYOfCharacter += tileSize;
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT && currentXOfCharacter != 9 * tileSize && !screenElement.getPositionOfWalls().contains(helpArrayRight)) {
      this.currentXOfCharacter += tileSize;
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT && currentXOfCharacter != 0 && !screenElement.getPositionOfWalls().contains(helpArrayLeft)) {
      this.currentXOfCharacter -= tileSize;
    }
  }
  public void changeLevel(){

  }
  public void changeHealthPoints(){

  }
  public void changeDefendPoints(){

  }
  public void createStrikePoints(){

  }
}
