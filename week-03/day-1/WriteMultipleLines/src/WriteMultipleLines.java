import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
public class WriteMultipleLines {
  public static void main(String[] args) {
    String yourPath = "my-txt3.txt";
    String yourWord = "pear";
    int yourNumber = 5;
    multipleLines(yourPath, yourWord, yourNumber);
  }
  public static void multipleLines(String myPath, String myWord, int myNumber){
    List<String> content = new ArrayList();
    for (int i = 0; i < myNumber; i++) {
      content.add(i, myWord);
    }
    try {
      Path filePath = Paths.get(myPath);
      Files.write(filePath, content);
    } catch (Exception e) {
      System.out.println("");
    }
  }
}
