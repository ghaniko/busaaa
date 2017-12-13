import java.util.ArrayList;
public class Sum {
  ArrayList<Integer> myList = new ArrayList<Integer>();
  int sum = 0;

  public Sum(ArrayList<Integer> myList) {
    this.myList = myList;
  }

  public int sumOfElements(){

    for (int i = 0; i <myList.size() ; i++) {
      sum = sum + myList.get(i);
    }
    return sum;
  }
}
