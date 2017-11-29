public class Greeter {
    public static void main(String[] args) {
        String al = "GreenFox";
        String b = Greeting(al);
        System.out.println(b);
    }
    public static String Greeting(String input){
        return "Greetings Dear " + input;
    }
}
