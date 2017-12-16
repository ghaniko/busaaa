public class Student extends Person {
  String previousOrganization;
  int skippedDays;

  public void getGoal(){
    System.out.println("Be a junior software developer");

  }
  public void introduce(){
    System.out.println("Hi, I am " + name + " a " + age + " year old" + gender + "from " + previousOrganization + "who skipped " + skippedDays +
            "days from the course already.");

  }
  public int skipDays(int numberOfDays){

    return skippedDays = skippedDays + numberOfDays;
  }
  public Student(String name, int age, String gender, String previousOrganization) {
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
  }
  public Student (){
    previousOrganization = "School of Life!";
    skippedDays = 0;
  }

}
