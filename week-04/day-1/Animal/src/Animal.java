public class Animal {
  int hunger = 50;
  int thirst = 50;

  public void eat(){

    hunger -= 1;
  }
  public void drink(){
    thirst -= 1;
  }
  public void play(){
    thirst += 1;
    hunger += 1;
  }

}
