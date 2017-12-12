public class FleetOfThings {
  public static void main(String[] args) {
    Fleet fleet = new Fleet();
    Thing milk = new Thing("Get milk");
    Thing obs = new Thing("Remove the obstacles");
    Thing stand = new Thing("Stand up");
    Thing lunch = new Thing("Eat lunch");

    fleet.add(milk);
    fleet.add(obs);
    fleet.add(stand);
    stand.complete();
    fleet.add(lunch);
    lunch.complete();
    // Create a fleet of things to have this output:
    // 1. [ ] Get milk
    // 2. [ ] Remove the obstacles
    // 3. [x] Stand up
    // 4. [x] Eat lunch

    System.out.println(fleet);
  }
}
