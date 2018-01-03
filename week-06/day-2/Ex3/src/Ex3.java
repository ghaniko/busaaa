import java.util.*;
import java.util.stream.Collectors;

public class Ex3 {
  public static void main(String[] args) {
      ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));
    System.out.println(numbers.stream()
            .filter(n -> n > 0)
            .mapToInt(n -> n * n)
            //.forEach(System.out::println);
            .sum());
    //System.out.println(sumOfSquares);
    }
  }

