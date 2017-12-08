import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
  static Graphics g;
  public static void mainDraw(Graphics graphics){

    int mySize = 200;
    int myX = mySize;
    int myY = 2 * mySize / 3;

    g.setColor(Color.YELLOW);
    g.fillRect(0,0, 2 * mySize + 20, 3 * mySize + 20);

    g.setColor(Color.BLACK);
    g.drawLine(myX + mySize, myY - 2 * mySize / 3, myX - mySize, myY - 2 * mySize / 3);
    g.drawLine(myX - mySize, myY - 2 * mySize / 3, myX, myY + 4 * mySize / 3);
    g.drawLine(myX, myY + 4 * mySize / 3, myX + mySize, myY - 2 * mySize / 3);
    drawOneTriangle(myX, myY, mySize);
    drawTriangles(myX, myY, mySize);

  }

  private static void drawOneTriangle(int origX, int origY, int size) {
    g.setColor(Color.BLACK);
    g.drawLine(origX - size / 2, origY + size / 3, origX, origY - 2 * size / 3);
    g.drawLine(origX, origY - 2 * size / 3, origX + size / 2, origY + size / 3);
    g.drawLine(origX + size / 2, origY + size / 3, origX - size / 2, origY + size / 3);
    }

  private static void drawTriangles(int origX, int origY, int size) {
    g.setColor(Color.BLACK);
    if (size > 1) {
      drawOneTriangle(origX - size / 2, origY - size / 3, size / 2);
      drawOneTriangle(origX + size / 2, origY - size / 3, size / 2);
      drawOneTriangle(origX, origY + 2 * size / 3, size / 2);

      drawTriangles(origX - size / 2, origY - size / 3, size / 2);
      drawTriangles(origX + size / 2, origY - size / 3, size / 2);
      drawTriangles(origX, origY + 2 * size / 3, size / 2);
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

