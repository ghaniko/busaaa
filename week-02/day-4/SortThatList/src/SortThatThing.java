import java.util.*;
public class SortThatThing {

    public static void main(String[] args) {
        // Same as below just in 2 lines.
        //ArrayList<Integer> firstArrayList = CreateAnArrayList();
        //System.out.println(AscendingOrder(firstArrayList));

        System.out.println(AscendingOrder(CreateAnArrayList()));

        }

        public static ArrayList AscendingOrder(ArrayList<Integer> myArrayListInteger) {

            Collections.sort(myArrayListInteger);
            System.out.println("The ascending order: ");

            return myArrayListInteger;
        }
         public static ArrayList CreateAnArrayList() {
             Scanner input = new Scanner(System.in);
             System.out.println("Give me as many numbers as you want, if you are finished just put an 'e' + ENTER: ");
             ArrayList<Integer> anArrayList = new ArrayList<>();
             while (input.hasNextInt()){
                 anArrayList.add(input.nextInt());
             }

             return anArrayList;
         }
    }

