import java.util.*;
import java.util.stream.Collectors;

public class Ex7 {
  public static void main(String[] args) {
    ArrayList<String> cities = new ArrayList<>(Arrays.asList("ROME", "AMRAVATI", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS"));

    List<String> citiesStartingWithAAndEndingWithI = cities.stream()
            .filter(c -> c.startsWith("A") && c.endsWith("I"))
            .collect(Collectors.toList());

    System.out.println(citiesStartingWithAAndEndingWithI);
  }
}
