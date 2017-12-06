import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FillWithRectangle {

  public static void mainDraw(Graphics graphics){
    // draw four different size and color rectangles.
    graphics.setColor(Color.BLUE);
    graphics.drawRect(10, 10, 50, 70);
    graphics.setColor(Color.RED);
    graphics.drawRect(100, 80, 10, 60);
    graphics.setColor(Color.GREEN);
    graphics.drawRect(300, 10, 20, 170);
    graphics.setColor(Color.YELLOW);
    graphics.drawRect(15, 300, 70, 170);


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
