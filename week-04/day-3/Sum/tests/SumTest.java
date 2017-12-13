import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SumTest {
  ArrayList<Integer> myTestList = new ArrayList<Integer>();
  Sum init = new Sum(myTestList);
  @Test
  public void sumOfElements() throws Exception {
    myTestList.add(5);
    assertEquals(5, init.sumOfElements());
  }
  @Test
  public void sumOfElementsNull() throws Exception {

  assertEquals(myTestList,null);
  }

}