import java.util.*;
public class Unique {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me as many numbers as you want, if you are finished just put an 'e' + ENTER: ");
        ArrayList<Integer> myArrayList = new ArrayList<>();
        while (scanner.hasNextInt()){
            myArrayList.add(scanner.nextInt());
        }
        Set<Integer> newArrayList = new LinkedHashSet<>(myArrayList);
        System.out.println(newArrayList);


    }
}
