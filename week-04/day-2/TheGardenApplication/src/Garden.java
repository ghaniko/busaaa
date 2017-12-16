import java.util.*;

public class Garden {
  public static void main(String[] args) {
    ArrayList<Plant> plants = new ArrayList<>();

    plants.add(new Tree("Tree1", "yellow", 0));
    plants.add(new Tree("Tree2", "blue", 0));
    plants.add(new Flower("Flower1", "purple", 0));
    plants.add(new Flower ("Flower2", "orange", 0));

    for (Plant plant : plants) {
      plant.introduce();
    }
    System.out.println();

    waterPlant(20, plants, numberOfThirstyPlants(plants));

    for (Plant plant : plants) {
      plant.introduce();
    }
    System.out.println();

    waterPlant(40, plants, numberOfThirstyPlants(plants));

    for (Plant plant : plants) {
      plant.introduce();
    }

  }

  public static void waterPlant(float wateringAmount, ArrayList<Plant> bunchOfPlants, int numberOfThirstyPlants) {
    System.out.println("Watering with " + wateringAmount);
    for (int i = 0; i < bunchOfPlants.size(); i++) {
      if (bunchOfPlants.get(i).currentWater < bunchOfPlants.get(i).thirstyThreshold){
        bunchOfPlants.get(i).currentWater = bunchOfPlants.get(i).currentWater
                + bunchOfPlants.get(i).absorbingCapacity * wateringAmount / numberOfThirstyPlants;
      }
    }
  }
  public static int numberOfThirstyPlants(ArrayList<Plant> bunchOfPlants){
    int thirstyPlants = 0;
    for (Plant onePlant : bunchOfPlants){
      if (onePlant.currentWater < onePlant.thirstyThreshold){
        thirstyPlants++;
      }
    }
    return thirstyPlants;
  }
}
