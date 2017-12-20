import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class FileHandling {

  public ArrayList<String> readOutAllTheLines(){
    ArrayList<String> lines = new ArrayList<>();
    try {
      Path filePath = Paths.get("Todo.txt");
      lines = (ArrayList<String>) Files.readAllLines(filePath);
    } catch (Exception e) {
      System.out.println("Could not read the file!");
    }
    return lines;
  }


  public void addNewContentNewLine(ArrayList<String> contentToBeAdded) {
    try {
      Path filePath = Paths.get("Todo.txt");
      Files.write(filePath, contentToBeAdded, StandardOpenOption.APPEND);
    } catch (Exception e) {
      System.out.println("Unable to write file");
    }
  }

  /*public void rewriteContent(ArrayList<String> contentToBeAdded) {
    try {

      Path filePath = Paths.get("Todo.txt");
      Files.write(filePath, contentToBeAdded);

    } catch (Exception e) {
      System.out.println("Unable to write file");
    }
  }

  public void removeOneTodo(String indexNumberOfLineToBeRemoved) {
    try {
      int index = Integer.parseInt(indexNumberOfLineToBeRemoved);
      Path filePath = Paths.get("Todo.txt");
      ArrayList<String> todoListLines = (ArrayList<String>) Files.readAllLines(filePath);
      if (todoListLines.size() > 0) {
        todoListLines.remove(index - 1);
      } else {
        System.out.println("You have no todos, nothing to be deleted");
      }
      rewriteContent((ArrayList<String>) todoListLines);
    } catch (Exception e) {
      System.out.println("Unable to remove: index is out of bound");
    }
  }*/
}

