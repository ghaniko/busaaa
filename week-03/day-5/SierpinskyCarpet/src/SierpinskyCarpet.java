import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SierpinskyCarpet {
  static Graphics g;
  public static void mainDraw(Graphics graphics){

    int mySize = 250;
    int myX = 3 * mySize / 2;
    int myY = 3 * mySize / 2;

    g.setColor(Color.YELLOW);
    g.fillRect(0,0, 3 * mySize + 20, 3 * mySize + 20);

    g.setColor(Color.BLACK);
    g.fillRect(myX - mySize / 2, myY - mySize / 2, mySize, mySize);
    drawOneSquare(myX, myY, mySize);
    drawSquares(myX, myY, mySize);

  }

  private static void drawOneSquare(int origX, int origY, int size) {
    g.setColor(Color.BLACK);
    g.fillRect(origX - size / 2, origY - size / 2, size, size);
    }

  private static void drawSquares(int origX, int origY, int size) {
    g.setColor(Color.BLACK);
    if (size > 1) {
      drawOneSquare(origX - size, origY, size / 3);
      drawOneSquare(origX + size, origY, size / 3);
      drawOneSquare(origX, origY - size, size / 3);
      drawOneSquare(origX, origY + size, size / 3);
      drawOneSquare(origX + size, origY + size, size / 3);
      drawOneSquare(origX - size, origY + size, size / 3);
      drawOneSquare(origX + size, origY - size, size / 3);
      drawOneSquare(origX - size, origY - size, size / 3);

      drawSquares(origX - size, origY, size / 3);
      drawSquares(origX + size, origY, size / 3);
      drawSquares(origX, origY - size, size / 3);
      drawSquares(origX, origY + size, size / 3);
      drawSquares(origX + size, origY + size, size / 3);
      drawSquares(origX - size, origY + size, size / 3);
      drawSquares(origX + size, origY - size, size / 3);
      drawSquares(origX - size, origY - size, size / 3);
    }
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
