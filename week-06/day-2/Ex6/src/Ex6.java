import java.util.*;
import java.util.stream.Collectors;

public class Ex6 {
  public static void main(String[] args) {
    String textToBeChecked = "Penpineappleapplepen";

    Map<String, Long> characterFrequency = textToBeChecked.chars()
            .mapToObj(c -> Character.toString((char)c))
            .map(c -> c.toLowerCase())
            .collect(Collectors.groupingBy(n -> n, Collectors.counting()));

    System.out.println(characterFrequency);

    characterFrequency.entrySet().stream()
           .forEach(entry -> System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue()));
  }
}
