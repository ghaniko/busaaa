import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import static java.nio.file.StandardCopyOption.COPY_ATTRIBUTES;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class CopyFile {
 /* public static void main(String[] args){
    String myPath1 = "myFile.txt";
    String myPath2 = "myFile2.txt";
    copyFile(myPath1, myPath2);
  }
  private static boolean copyFile(String fileName1, String fileName2) {
    boolean whatIsIt = true;
    try {
      Path filePath1 = Paths.get(fileName1);
      Path filePath2 = Paths.get(fileName2);
      Files.copy(filePath1, filePath2, REPLACE_EXISTING);
    } catch (Exception e) {
        System.out.println("This is a problem");
    }
    return whatIsIt;
  }*/
   public static void main(String[] args) {
     ArrayList<String> contentOfMyFile = new ArrayList();
     ArrayList<String> newContentOfMyFile = new ArrayList();
     contentOfMyFile.add("cica");
     contentOfMyFile.add("kutya");
     newContentOfMyFile.add("");

       for (int i = 0; i < contentOfMyFile.size(); i++) {
         for (int j = 0; j < contentOfMyFile.get(i).length(); j += 2) {
           newContentOfMyFile.add(i, newContentOfMyFile.get(i) + contentOfMyFile.get(i).charAt(j));
         }
         newContentOfMyFile.add(newContentOfMyFile.get(i));
       }
     System.out.println(newContentOfMyFile);
 }
}
