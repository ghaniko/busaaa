public class Plant {
  String name;
  String color;
  float currentWater;
  float thirstyThreshold;
  float absorbingCapacity;

  public Plant(String name, String color, float currentWater) {
    this.name = name;
    this.color = color;
    this.currentWater = currentWater;
  }

  public void introduce() {
    if (currentWater < thirstyThreshold){
      System.out.println("The " + color + " " + name + " needs water.");
    }else{
      System.out.println("The " + color + " " + name + " doesn't need water.");
    }
  }
}
