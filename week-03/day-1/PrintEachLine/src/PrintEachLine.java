import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class PrintEachLine {
  public static void main(String[] args) {
   readAllText();
  }

  public static void readAllText() {
    try {
      Path filePath = Paths.get("lorem-ipsum.txt");
      List<String> lines = Files.readAllLines(filePath);
      for (int i = 0; i < lines.size(); i++) {
        System.out.println(lines.get(i));
      }
    } catch (Exception e) {
      System.out.println("Uh-oh, could not read the file!");
    }
  }
}
