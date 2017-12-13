import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SumTest {


  @Test
  public void sumOfElements() throws Exception {


    ArrayList<Integer> myTestList = new ArrayList<Integer>();
    myTestList.add(1);


    Sum init = new Sum(myTestList);
    assertEquals(1, init.sumOfElements());
  }

}