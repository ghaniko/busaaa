import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EverythingGoesToCenter {
  static Graphics g;
  public static void mainDraw(Graphics graphics){
    // create a line drawing function that takes 2 parameters:
    // the x and y coordinates of the line's starting point
    // and draws a line from that point to the center of the canvas.
    // fill the canvas with lines from the edges, every 20 px, to the center.
    int xStart = 0;
    int yStart = 0;
    for (int i = 0; i <WIDTH / 20 ; i++) {
      drawing(xStart, yStart);
      xStart = xStart + 20;
    }
    xStart = 0;
    yStart = HEIGHT;
    for (int i = 0; i <WIDTH / 20 ; i++) {
      drawing(xStart, yStart);
      xStart = xStart + 20;
    }
    xStart = 0;
    yStart = 0;
    for (int i = 0; i <HEIGHT/ 20 ; i++) {
      drawing(xStart, yStart);
      yStart = yStart + 20;
    }
    xStart = WIDTH;
    yStart = 0;
    for (int i = 0; i <HEIGHT / 20 ; i++) {

      drawing(xStart, yStart);
      yStart = yStart + 20;
    }



  }

  private static void drawing(int xS, int yS) {

      g.drawLine(xS, yS, WIDTH / 2, HEIGHT / 2);



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

graphics.setColor(Color.GREEN);
        for (int i = 0; i < 14; i++) {
        graphics.drawLine(0, HEIGHT / 14 * i, HEIGHT, (i + 1) * WIDTH / 14);
        }