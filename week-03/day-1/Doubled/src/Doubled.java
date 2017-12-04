import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Doubled {
  public static void main(String[] args) {
    String theFile = "duplicated-char.txt";
    String theFile2 = "duplicated-char2.txt";
    diminishDuplicate(theFile, theFile2);
  }

  public static void diminishDuplicate(String myFile, String myFile2) {
    Path filePath = Paths.get(myFile);
    Path filePath2 = Paths.get(myFile2);
    ArrayList<String> newContentOfMyFile = new ArrayList();
    try {
      ArrayList<String> contentOfMyFile = new ArrayList(Files.readAllLines(filePath));

      for (int i = 0; i < contentOfMyFile.size(); i++) {
        String helpString = "";
        for (int j = 0; j < contentOfMyFile.get(i).length(); j += 2) {
          helpString = helpString + contentOfMyFile.get(i).charAt(j);
        }
        newContentOfMyFile.add(helpString);
      }

      Files.write(filePath2, newContentOfMyFile);
    } catch (Exception e) {
      System.out.println("Something went wrong");
    }

  }
}