import java.util.Arrays;
public class Dice {
  //    You have a Dice class which has 6 dice
  //    You can roll all of them with roll()
  //    Check the current rolled numbers with getCurrent()
  //    You can reroll with reroll()
  //    Your task is to get where all dice is a 6
  int[] dices = new int[6];

  public int[] roll() {
    for (int i = 0; i < dices.length; i++) {
      dices[i] = (int) (Math.random() * 6) + 1;
    }
    return dices;
  }

  public int[] getCurrent() {
    return dices;
  }

  public int getCurrent(int i) {
    return dices[i];
  }

  public void reroll() {
    for (int i = 0; i < dices.length; i++) {
      dices[i] = (int) (Math.random() * 6) + 1;
    }
  }

  public void reroll(int k) {
    dices[k] = (int) (Math.random() * 6) + 1;
  }

  @Override
  public String toString() {
    return "[" + dices[0] + "," + dices[1] + "," + dices[2] + "," + dices[3] + "," + dices[4] + "," + dices[5] + "]";
  }

  public static void main(String[] args) {
    Dice myDice = new Dice();
    int i = 0;
    while(!(myDice.getCurrent(0) == 6 && myDice.getCurrent(1) == 6 && myDice.getCurrent(2) == 6 &&
              myDice.getCurrent(3) == 6 && myDice.getCurrent(4) == 6 && myDice.getCurrent(5) == 6)) {
      System.out.println(myDice);
      System.out.println("Roll no.: " + i);
      i++;
      myDice.roll();

      if (myDice.getCurrent(0) == 6 && myDice.getCurrent(1) == 6 && myDice.getCurrent(2) == 6 &&
              myDice.getCurrent(3) == 6 && myDice.getCurrent(4) == 6 && myDice.getCurrent(5) == 6) {
        System.out.println("All are 6");
        break;
      }
    }

  }


    //System.out.println(myDice);
    //System.out.println(myDice.getCurrent(5));
    //myDice.reroll();
    //System.out.println(myDice);
    //myDice.reroll(4);
    //System.out.println(myDice);
  }

