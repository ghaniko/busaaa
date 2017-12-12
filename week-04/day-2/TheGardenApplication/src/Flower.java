public class Flower {
  String color;
  double currentWater;

  public double waterFlower(double wateringAmount){
    currentWater = currentWater + 0.75 * wateringAmount;
  }
   
}
