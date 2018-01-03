import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex10 {
  public static void main(String[] args) {
    ArrayList<Fox> groupOfFox = new ArrayList<>();
    groupOfFox.add(new Fox("roka1", "corsac", "red"));
    groupOfFox.add(new Fox("roka2", "ciroka", "green"));
    groupOfFox.add(new Fox("roka3", "ciroka", "red"));
    groupOfFox.add(new Fox("roka4", "ciroka", "yellow"));
    groupOfFox.add(new Fox("roka5", "corsac", "green"));

    groupOfFox.stream()
            .filter(f -> f.color == "green")
            .forEach(f -> System.out.println(f.name));
    System.out.println();
    groupOfFox.stream()
            .filter(f -> f.color == "green" && f.type == "corsac")
            .forEach(f -> System.out.println(f.name));

  }
}
