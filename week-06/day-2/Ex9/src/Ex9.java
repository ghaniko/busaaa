import java.util.Arrays;
import java.util.stream.Collectors;

public class Ex9 {
  public static void main(String[] args) {

    char[] myCharArray = {'A', 'f', 'G', 'h', 'i'};

    String characterWithUpperCase = myCharArray.toString().chars()
            .mapToObj(c -> Character.toString((char) c))
            .collect(Collectors.joining());

    System.out.println(characterWithUpperCase);

    String newString = new String(myCharArray);
    System.out.println(newString);

    /*System.out.println(Arrays.stream(myCharArray)
            .map(c -> c.toString())
            .collect(Collectors.joining()));*/
  }
}
