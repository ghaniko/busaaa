public class Tree extends Plant{
  public Tree(String name, String color, float currentWater) {
    super(name, color, currentWater);
    thirstyThreshold = 10;
    absorbingCapacity = 0.4f;
  }
}
