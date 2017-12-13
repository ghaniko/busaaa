import org.junit.Test;

import static org.junit.Assert.*;

public class ApplesTest {
  @Test
  public void printMessage() throws Exception {
    Apples myApple = new Apples("pear");
    assertEquals("pear", myApple.getApples());
  }

}