import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class finalExamClass {
  public static void main(String[] args) {
    List<Integer> firstArrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 3, 4, 5, 6, 7, 8, 9));
    List<Integer> secondArrayList = new ArrayList<>(Arrays.asList(1, 2, 2, 5, 6, 7, 8, 9, 10));
    System.out.println(firstArrayUniqueElement(firstArrayList, secondArrayList));
  }

  private static ArrayList<Integer> firstArrayUniqueElement(List<Integer> firstArrayList, List<Integer> secondArrayList) {
    ArrayList<Integer> resultArray = new ArrayList<>();
    for (int i = 0; i < firstArrayList.size(); i++) {
      if (!secondArrayList.contains(firstArrayList.get(i)) && !resultArray.contains(firstArrayList.get(i))){
        resultArray.add(firstArrayList.get(i));
      }
    }
    if (firstArrayList.isEmpty()) {
      System.out.print("The first list is empty: ");
    } else if (resultArray.isEmpty()){
      System.out.print("All elements of the first list are in the second, your array is: ");
    } else {
      System.out.print("Elements which are only in the first list: ");
    }
    return resultArray;
  }
}
