public class CandyShop {
  double income;
  double sugarAmount;
  int numberOfCandies;
  int numberOfLollipops;

  static final Candy CANDY = new Candy();
  static final Lollipop LOLLIPOP = new Lollipop();


  public CandyShop(double sugarAmount) {
    this.sugarAmount = sugarAmount;
    this.income = income;
    //System.out.println("Invetory: " + numberOfCandies + " candies, " + numberOfLollipops
        //    + " lollipops, Income: " + income + "$, Sugar: " + sugarAmount + "gr.");
  }

  public void createSweets(Sweets aSweet) {
    if(aSweet == CANDY){
      numberOfCandies++;
      sugarAmount -= aSweet.gramNeeded;
    } else{
      numberOfLollipops++;
      sugarAmount -= aSweet.gramNeeded;
    }
  }

  public void sell(Sweets aSweet, int amountToBeSold) {
    if(aSweet == CANDY){
      numberOfCandies--;
      income += amountToBeSold * CANDY.price;
    } else{
      numberOfLollipops--;
      income += amountToBeSold * LOLLIPOP.price;
    }
  }


  public void raise(double amountToBeRaisedWith) {

    LOLLIPOP.price += amountToBeRaisedWith * LOLLIPOP.price / 100;
    CANDY.price += amountToBeRaisedWith * CANDY.price / 100;

  }

  public void buySugar(double amountOfSugarToBeBought) {
   sugarAmount += amountOfSugarToBeBought;
   income -= amountOfSugarToBeBought * 0.1;
  }

  @Override
  public String toString() {
    return "Invetory: " + numberOfCandies + " candies, " + numberOfLollipops
            + " lollipops, Income: " + income + "$, Sugar: " + sugarAmount + "gr.";
  }
}

