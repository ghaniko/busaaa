import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Horizontal {
static Graphics g;
  public static void mainDraw(Graphics graphics){
    // create a line drawing function that takes 2 parameters:
    // the x and y coordinates of the line's starting point
    // and draws a 50 long horizontal line from that point.
    // draw 3 lines with that function.

    int x1 = 10;
    int y1 = 20;
    int l1 = 30;
    int x2 = 100;
    int y2 = 20;
    int l2 = 50;
    int x3 = 250;
    int y3 = 200;
    int l3 = 70;

    drawing(x1, y1, l1);
    drawing(x2, y2, l2);
    drawing(x3, y3, l3);


  }

  private static void drawing(int xS, int yS, int l) {
    g.drawLine(xS, yS, xS + l, yS);
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
