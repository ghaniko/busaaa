import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ReplicateSquares {
  static Graphics g;
  public static void mainDraw(Graphics graphics){
    // reproduce this:
    // [https://github.com/greenfox-academy/teaching-materials/blob/master/workshop/drawing/super-hexagon/r6.gif]
    int myX = 150;
    int myY = 30;
    int mySize = 10;
    int sideSize = 7;

    for (int i = 0; i < sideSize ; i++) {
      for (int j = 0; j < i + 1; j++) {
        drawHexagon(myX + 3 * j * mySize, myY, mySize);
      }
      myX = myX - 3 * mySize / 2;
      myY = myY + mySize;
    }

    myX = myX + 2 * mySize;

    for (int i = 0; i < sideSize - 1; i++) {
      for (int j = 0; j < sideSize - 1; j++) {
        drawHexagon(myX + mySize + 3 * j * mySize, myY, mySize);
      }
      myX = myX - mySize / 2;
      myY = myY + mySize;
      for (int k = 0; k < sideSize; k++) {
        drawHexagon(myX + 3 * k * mySize, myY, mySize);
      }
      myX = myX + mySize / 2;
      myY = myY + mySize;
    }

    myX = myX + mySize;

    for (int i = sideSize - 2; i > - 1; i--) {
      for (int j = 0; j < i + 1; j++) {
        drawHexagon(myX + 3 * j * mySize, myY, mySize);
      }
      myX = myX + 3 * mySize / 2;
      myY = myY + mySize;
    }



  }

  private static void drawSquares(int x, int size , int division) {
    g.fillRect(x - 5, x - 5, size + 10, size + 10);
    g.drawRect(x, x, size, size);


  }

  //    Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 343;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      g = graphics;
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}