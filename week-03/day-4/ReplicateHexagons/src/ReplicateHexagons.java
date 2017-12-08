import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ReplicateHexagons {
  static Graphics g;
  public static void mainDraw(Graphics graphics){

    int mySize = 200;
    int myX = mySize;
    int myY = mySize;
    g.setColor(Color.YELLOW);
    g.fillRect(0,0, 2 * mySize + 20, 2 * mySize + 20);
    g.setColor(Color.BLACK);

    drawOneHexagon(myX, myY, mySize);
    drawHexagons(myX, myY, mySize);

  }

  private static void drawOneHexagon(int origX, int origY, int size) {
    g.setColor(Color.BLACK);
    g.drawLine(origX - size, origY, origX - size / 2, origY - size);
    g.drawLine(origX - size / 2, origY - size, origX + size / 2, origY - size);
    g.drawLine(origX + size / 2, origY - size, origX + size, origY);
    g.drawLine(origX + size, origY, origX + size / 2, origY + size);
    g.drawLine(origX + size / 2, origY + size, origX - size / 2, origY + size);
    g.drawLine(origX - size / 2, origY + size, origX - size, origY);
  }

  private static void drawHexagons(int origX, int origY, int size) {
    g.setColor(Color.BLACK);
    if (size > 5) {
      drawOneHexagon(origX - size / 4, origY - size / 2, size / 2);
      drawOneHexagon(origX - size / 4, origY + size / 2, size / 2);
      drawOneHexagon(origX + size / 2, origY, size / 2);

      drawHexagons( origX - size / 4, origY - size / 2, size / 2);
      drawHexagons( origX - size / 4, origY + size / 2, size / 2);
      drawHexagons( origX + size / 2, origY, size / 2);
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
