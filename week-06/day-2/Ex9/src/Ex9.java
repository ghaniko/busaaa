import java.util.Arrays;
import java.util.stream.Collectors;

public class Ex9 {
  public static void main(String[] args) {

    char[] myCharArray = {'G', 'r', 'E', 'e', 'N'};

    String jointLetters = new String(myCharArray).chars()
            .mapToObj(c -> Character.toString((char) c))
            .collect(Collectors.joining());

    System.out.println(jointLetters);

    //String newString = new String(myCharArray);
    //System.out.println(newString);

    /*System.out.println(Arrays.stream(myCharArray)
            .map(c -> c.toString())
            .collect(Collectors.joining()));*/
  }
}
