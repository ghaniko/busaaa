import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters {

  public static void mainDraw(Graphics graphics){
    // reproduce this:
    // [https://github.com/greenfox-academy/teaching-materials/blob/master/workshop/drawing/line-play/r1.png]

    //First quarter

    graphics.setColor(Color.RED);
    for (int i = 0; i < 14; i++) {
      graphics.drawLine(WIDTH /2 / 14 * i, 0, WIDTH / 2, HEIGHT / 2 / 14 * i);
    }
    graphics.setColor(Color.GREEN);
    for (int i = 0; i < 14; i++) {
      graphics.drawLine(0, HEIGHT / 2 / 14 * i, i * WIDTH / 2 / 14, HEIGHT / 2);
    }

    //Second quarter

    graphics.setColor(Color.RED);
    for (int i = 0; i < 14; i++) {
      graphics.drawLine(WIDTH / 2 + WIDTH / 2 / 14 * i, 0, WIDTH, HEIGHT / 2 / 14 * i);
    }
    graphics.setColor(Color.GREEN);
    for (int i = 0; i < 14; i++) {
      graphics.drawLine(WIDTH / 2, HEIGHT /2 / 14 * i, WIDTH / 2 + i * WIDTH / 2 / 14, HEIGHT / 2);
    }

    // Third quarter

    graphics.setColor(Color.RED);
    for (int i = 0; i < 14; i++) {
      graphics.drawLine(WIDTH / 2 / 14 * i, HEIGHT / 2, WIDTH / 2, HEIGHT / 2 + HEIGHT / 2 / 14 * i);
    }
    graphics.setColor(Color.GREEN);
    for (int i = 0; i < 14; i++) {
      graphics.drawLine(0, HEIGHT / 14 * i, i * WIDTH / 2 / 14, HEIGHT);
    }

    // Fourth quarter

    graphics.setColor(Color.RED);
    for (int i = 0; i < 14; i++) {
      graphics.drawLine(WIDTH / 2 + WIDTH / 2 / 14 * i, HEIGHT / 2, WIDTH, HEIGHT / 2 + HEIGHT / 2 / 14 * i);
    }
    graphics.setColor(Color.GREEN);
    for (int i = 0; i < 14; i++) {
      graphics.drawLine(WIDTH / 2, HEIGHT / 2 + HEIGHT / 2 / 14 * i, WIDTH / 2 + i * WIDTH / 2 / 14, HEIGHT);
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