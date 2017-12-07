import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ReplicateSquares {
  static Graphics g;
  public static void mainDraw(Graphics graphics){

    int mySize = 600;
    int myX = mySize / 2;
    int myY = mySize / 2;

    g.setColor(Color.YELLOW);
    g.fillRect(0, 0, mySize, mySize);
    g.setColor(Color.BLACK);
    g.drawRect(0, 0, mySize, mySize);
    drawLines(myX, myY, mySize);

  }

   private static void drawLines(int origX, int origY, int size) {
    g.setColor(Color.BLACK);
    if (size > 1) {

      g.drawLine(origX - size / 6, origY - size / 2, origX - size / 6, origY + size / 2);
      g.drawLine(origX + size / 6, origY - size / 2, origX + size / 6, origY + size / 2);
      g.drawLine(origX - size / 2, origY - size / 6, origX + size / 2, origY - size / 6);
      g.drawLine(origX - size / 2, origY + size / 6, origX + size / 2, origY + size / 6);

      drawLines( origX, origY, size / 3);

      drawLines( origX + size / 3, origY + size / 3, size / 3);
      drawLines( origX - size / 3, origY - size / 3, size / 3);
      drawLines( origX - size / 3, origY + size / 3, size / 3);
      drawLines( origX + size / 3, origY - size / 3, size / 3);

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