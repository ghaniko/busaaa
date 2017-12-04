import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class WriteSingleLine {
  public static void main(String[] args) {
    singleLine();
  }
  public static void singleLine(){
    List<String> content = new ArrayList();
    content.add("My name is Bálint");
    try {
      Path filePath = Paths.get("mytext.txt");
      Files.write(filePath, content);
    } catch (Exception e) {
      System.out.println("Unable to write file: mytext.txt");
    }
  }
}
