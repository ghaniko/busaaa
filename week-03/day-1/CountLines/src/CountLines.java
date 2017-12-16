
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;
import java.util.Scanner;

public class CountLines {
  public static void main(String[] args) {

    countLines();
  }

  private static void countLines() {
    try {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Give me a file name: ");
      String myFile = scanner.next();
      Path filePath = Paths.get(myFile);
      List<String> lines = Files.readAllLines(filePath);
      System.out.println(lines.size());
      } catch (Exception e) {
      System.out.println("0");
    }
  }

}
