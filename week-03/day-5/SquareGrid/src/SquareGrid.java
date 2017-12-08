import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SquareGrid {
  static Graphics g;
  public static void mainDraw(Graphics graphics){

    int mySize = 250;
    int myX = 3 * mySize / 2;
    int myY = 3 * mySize / 2;
    int myBorderWidth = 16;

    g.setColor(Color.YELLOW);
    g.fillRect(0,0, 3 * mySize + 20, 3 * mySize + 20);

    g.setColor(Color.BLACK);
    g.fillRect(myX - mySize / 2, myY - mySize / 2, mySize, mySize);
    g.setColor(Color.YELLOW);
    g.fillRect(myX - mySize / 2 + myBorderWidth, myY - mySize / 2 + myBorderWidth, mySize - 2 * myBorderWidth, mySize - 2 * myBorderWidth);
    drawOneSquare(myX, myY, mySize, myBorderWidth );
    drawSquares(myX, myY, mySize, myBorderWidth);

  }

  private static void drawOneSquare(int origX, int origY, int size, int borderWidth) {
    g.setColor(Color.BLACK);
    g.fillRect(origX - size / 2, origY - size / 2, size, size);
    g.setColor(Color.YELLOW);
    g.fillRect(origX - size / 2 + borderWidth, origY - size / 2 + borderWidth, size - 2 * borderWidth, size - 2 * borderWidth);
  }

  private static void drawSquares(int origX, int origY, int size, int borderWidth) {
    g.setColor(Color.BLACK);
    if (size > 50) {

      drawOneSquare(origX + size / 2, origY + size / 2, size / 2, borderWidth / 2 );
      drawOneSquare(origX - size / 2, origY + size / 2, size / 2, borderWidth / 2);
      drawOneSquare(origX + size / 2, origY - size / 2, size / 2, borderWidth / 2);
      drawOneSquare(origX - size/ 2, origY - size / 2, size / 2, borderWidth / 2);

      drawSquares(origX + size / 2, origY + size / 2, size / 2, borderWidth / 2);
      drawSquares(origX - size / 2, origY + size / 2, size / 2, borderWidth / 2);
      drawSquares(origX + size / 2, origY - size / 2, size / 2, borderWidth / 2);
      drawSquares(origX - size / 2, origY - size / 2, size / 2, borderWidth / 2);
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
