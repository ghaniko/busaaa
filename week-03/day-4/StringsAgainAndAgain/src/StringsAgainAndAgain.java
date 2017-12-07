public class StringsAgainAndAgain {
  public static void main(String[] args) {
    int k = 0;
    String aString = "Xilophone-x is not an x actually";

    System.out.println(stringConverter(aString));
  }

  private static String stringConverter(String myString) {

    if (myString.length() == 0) {
      return "";
    }
    else {
      return myString.charAt(0) + "*" + stringConverter(myString.substring(1, myString.length()));
    }
  }
}