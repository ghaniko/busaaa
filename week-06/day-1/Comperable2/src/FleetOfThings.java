import java.util.ArrayList;
import java.util.Collections;

public class FleetOfThings {

  public static void main(String[] args) {
    Fleet fleet = new Fleet();
    // Create a fleet of things to have this output:
    fleet.add(new Thing("Eet milk"));
    fleet.add(new Thing("Aemove the obstacles"));
    Thing standUp = new Thing("Ctand Up");
    standUp.complete();
    fleet.add(standUp);
    Thing eatLunch = new Thing("Bat Lunch");
    eatLunch.complete();
    fleet.add(eatLunch);
    Thing alma = new Thing("Alma");
    standUp.complete();
    fleet.add(alma);
    Thing korte = new Thing("Forte");
    fleet.add(korte);
    // 1. [ ] Get milk
    // 2. [ ] Remove the obstacles
    // 3. [x] Stand up
    // 4. [x] Eat lunch

    System.out.println(fleet);
    Collections.sort(fleet.getThings());
    System.out.println(fleet);
  }
}