public class Thing implements Comparable<Thing>{
  private String name;
  private boolean completed;

  public Thing(String name) {
    this.name = name;
  }

  public void complete() {
    this.completed = true;
  }

  @Override
  public String toString() {
    return (completed ? "[x] " : "[ ] ") + name;
  }

  @Override
  public int compareTo(Thing oneThing) {
    if(completed == oneThing.completed){
      return name.compareToIgnoreCase(oneThing.name);
    } else if(completed){
      return -1;
    } else return 1;
  }
}