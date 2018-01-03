import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex5 {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2));
    Map<Integer, Long> numberFrequency = numbers.stream()
            .collect(Collectors.groupingBy(n -> n, Collectors.counting()));

    System.out.println(numberFrequency);

    numberFrequency.entrySet().stream()
            .filter(entry -> entry.getValue() > 1)
            .forEach(entry -> System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue()));
  }
}
