import java.util.*;
import java.util.stream.Collectors;

public class Ex4 {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 9, 2, 8, 6, 5));
    List<Integer> numberSquaredMoreThanTwenty = numbers.stream()
            .filter(n -> n * n > 20)
            .collect(Collectors.toList());
    System.out.println(numberSquaredMoreThanTwenty);
  }
}
