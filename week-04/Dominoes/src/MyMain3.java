import java.util.ArrayList;
import java.util.List;

public class MyMain3 {
  public static void main(String[] args) {
    List<Domino> dominos = initializeDominoes();
    // You have the list of Domino
    // Order them into one snake where the adjacent dominos have the same numbers on their adjacent sides
    // eg: [2, 4], [4, 3], [3, 5] ...
    List<Domino> dominos2 = new ArrayList<>();
    dominos2.add(dominos.get(0));
    for (int i = 0; i < dominos.size(); i++) {
      for (int j = 0; j < dominos.size() ; j++) {
        if (dominos2.get(dominos2.size() - 1).getValues()[1] == dominos.get(j).getValues()[0]) {
          dominos2.add(dominos.get(j));
        }
      }
    if( dominos2.size() == dominos.size()){
      break;
      }
    }
    System.out.println(dominos2);
  }

    static List<Domino> initializeDominoes() {
      List<Domino> dominos = new ArrayList<>();
      dominos.add(new Domino(5, 2));
      dominos.add(new Domino(4, 6));
      dominos.add(new Domino(1, 5));
      dominos.add(new Domino(6, 7));
      dominos.add(new Domino(2, 4));
      dominos.add(new Domino(7, 1));
      return dominos;
    }
  }