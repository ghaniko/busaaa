import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CheckerBoard {

  public static void mainDraw(Graphics graphics){
    // fill the canvas with a checkerboard pattern.
    graphics.setColor(new Color(238,130,238));
    int sum = 0;
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {

        graphics.fill3DRect(10 + 10 * 2 * j, 10 + 10 * 2 * i, 10, 10, true);
        graphics.fill3DRect(10 * 2 * j, 10 * 2 * i, 10, 10, true);
        }

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
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}