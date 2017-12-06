import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class MyTriangles {
  static Graphics g;
  public static void mainDraw(Graphics graphics){
    // draw the night sky:
    // - The background should be black
    // - The stars can be small squares
    // - The stars should have random positions on the canvas
    // - The stars should have random color (some shade of grey)
    int myX = 120;
    int myY = 20;
    int mySize = 10;
    int triangleLines = 20;
    for (int i = 0; i < triangleLines; i++) {
      for (int j = 0; j < i + 1; j++) {
        drawTriangle(myX + j * mySize, myY, mySize);
      }
      myX = myX - mySize / 2;
      myY = myY + mySize;
    }
  }

  private static void drawTriangle(int x, int y, int size) {
    g.drawLine(x, y, x + size, y);
    g.drawLine(x + size, y, x + size / 2, y - size);
    g.drawLine(x + size / 2, y - size, x, y);
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