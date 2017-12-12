import java.util.*;

public class Garden {
  List<Tree> trees;
  List<Flower> flowers;

  public void addFlower(Flower flower) {
    flowers.add(flower);
  }
  public void addTree(Tree tree) {
    trees.add(tree);
  }

  public Garden(){
    trees = new ArrayList<>();
    flowers = new ArrayList<>();
  }
}
