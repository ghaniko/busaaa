import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex8 {
  public static void main(String[] args) {
    String textToBeChecked = "PEnpIneappleApplepen";

    String characterWithUpperCase = textToBeChecked.chars()
            .filter(s -> Character.isUpperCase(s))
            .mapToObj(c -> Character.toString((char) c))
            .collect(Collectors.joining());

    System.out.println(characterWithUpperCase);

  }
}
