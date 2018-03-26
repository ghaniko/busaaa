import java.util.*;
public class Lists01 {
    public static void main(String[] args) {
        ArrayList<String> planetList = new ArrayList<String>
                (Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Uranus", "Neptune"));

        // Saturn is missing from the planetList
        // Insert it into the correct position
        planetList.add(5, "Saturn");
        System.out.println(planetList);
        System.out.println(isPrime(173));
    }

    private static boolean isPrime(int x) {
        if (x == 2 || x == 3){
            return true;
        } else {
            for (int i = 2; i * i <= x ; i++) {
                if(x % i == 0){
                    return false;
                }
            }
        }
        return true;
    }
}