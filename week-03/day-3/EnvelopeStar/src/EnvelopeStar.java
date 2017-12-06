import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {

  public static void mainDraw(Graphics graphics){
    // reproduce this:
    // [https://github.com/greenfox-academy/teaching-materials/blob/master/workshop/drawing/envelope-star/r2.png]
    graphics.setColor(Color.BLUE);
    int numberOfLines = 14;
    for (int i = 0; i < numberOfLines; i++) {
      graphics.drawLine(WIDTH / 2, i * HEIGHT / 2 / numberOfLines,
              WIDTH / 2 - i * WIDTH / numberOfLines, HEIGHT / 2);
      graphics.drawLine(WIDTH / 2, i * HEIGHT / 2 / numberOfLines,
              WIDTH / 2 + i * WIDTH / numberOfLines, HEIGHT / 2);
      graphics.drawLine(WIDTH / 2 - i * WIDTH / numberOfLines,HEIGHT / 2,
              WIDTH / 2, HEIGHT - i * HEIGHT / 2 / numberOfLines);
      graphics.drawLine(WIDTH / 2 + i * WIDTH / numberOfLines,HEIGHT / 2,
              WIDTH / 2, HEIGHT - i * HEIGHT / 2 / numberOfLines);
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