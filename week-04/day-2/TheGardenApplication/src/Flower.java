public class Flower extends Plant {
  public Flower(String name, String color, float currentWater) {
    super(name, color, currentWater);
    thirstyThreshold = 5;
    absorbingCapacity = 0.75f;
  }
}

