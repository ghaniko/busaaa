import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenteredBoxes {
  static Graphics g;
  public static void mainDraw(Graphics graphics){
    // create a square drawing function that takes 1 parameter:
    // the square size
    // and draws a square of that size to the center of the canvas.
    // draw 3 squares with that function.

    int l1 = 30;

    int l2 = 50;

    int l3 = 90;

    drawing(l1);
    drawing(l2);
    drawing(l3);


  }

  private static void drawing(int s) {
    g.drawRect(WIDTH / 2 - s / 2, HEIGHT / 2 - s / 2, s, s);
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