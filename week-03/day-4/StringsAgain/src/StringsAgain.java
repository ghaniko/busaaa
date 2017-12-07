public class StringsAgain {
  public static void main(String[] args) {
    int k = 0;
    String aString = "Xilophone-x is not an x actually";

    System.out.println(stringConverter(aString));
  }

  private static String stringConverter(String myString) {

    if (myString.length() == 0) {
      return "";
    }
    if (myString.charAt(0) == 'x'){
      return "" + stringConverter(myString.substring(1, myString.length()));
    } else {
      return myString.charAt(0) + stringConverter(myString.substring(1, myString.length()));
    }

  }
}