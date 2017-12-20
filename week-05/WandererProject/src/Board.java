import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Board extends JComponent implements KeyListener {


  Screen initialScreen = new Screen();
  Hero myHero = new Hero();
  Boss myBoss = new Boss();
  int numberOfMonsters = 4 + (int) (Math.random() * 3);
  ArrayList<Monster> groupOfMonsters = new ArrayList<>();
  int numberOfKeypresses;

  public void createMonsterGroup(ArrayList groupOfMonsters, int numberOfMonsters){
    for (int i = 0; i < numberOfMonsters ; i++) {
      groupOfMonsters.add(new Monster());
    }
  }

  public Board() {
    Screen screen = new Screen();

    // set the size of your draw board
    setPreferredSize(new Dimension(screen.screenWidth, screen.screenHeight));
    setVisible(true);
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);

    //String fileNameOfTheStoredBoard = "gameStore.txt";
    //initialScreen.drawScreen(graphics, fileNameOfTheStoredBoard);

    myHero.initializePositionOfCharacter(graphics);
    myBoss.initializePositionOfCharacter(graphics);
    createMonsterGroup(groupOfMonsters, numberOfMonsters);
    for (int i = 0; i < numberOfMonsters; i++) {
      groupOfMonsters.get(i).initializePositionOfCharacter(graphics);
    }
  }




   public static void main(String[] args) {
    // Here is how you set up a new window and adding our board to it
    JFrame frame = new JFrame("RPG Game");
    Board board = new Board();
    frame.add(board);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.pack();
    // Here is how you can add a key event listener
    // The board object will be notified when hitting any key
    // with the system calling one of the below 3 methods
    frame.addKeyListener(board);
    // Notice (at the top) that we can only do this
    // because this Board class (the type of the board object) is also a KeyListener
    //Screen testScreen = new Screen();

   }

  // To be a KeyListener the class needs to have these 3 methods in it
  @Override
  public void keyTyped(KeyEvent e) {

  }

  @Override
  public void keyPressed(KeyEvent e) {

  }

  // But actually we can use just this one for our goals here
  @Override
  public void keyReleased(KeyEvent e) {
    numberOfKeypresses++;
    myHero.move(e);
    if(numberOfKeypresses % 2 == 0){
      myBoss.move(e);
        for (int i = 0; i < numberOfMonsters; i++) {
          groupOfMonsters.get(i).move(e);
        }
    }
    repaint();
  }

   /* if (e.getKeyCode() == KeyEvent.VK_UP && heroY != 0) {
      heroY -= 70;
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN && heroY != 630) {
      heroY += 70;
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT && heroX != 630) {
      heroX += 70;
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT && heroX != 0) {
      heroX -= 70;
    }*/


    // and redraw to have a new picture with the new coordinates
}