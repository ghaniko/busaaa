public class String05 {
    public static void main(String[] args) {
        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
        reverseString(reversed);

        // Create a function that can reverse a String, which is passed as the parameter
        // Use it on this reversed string to check it!
        // Try to solve this using charAt() first, and optionally anything else after.




    }
        public static void reverseString(String oneString){
            String newString;
            for(int  i = 0; i < oneString.length(); i ++){
               newString = "" + oneString.charAt(oneString.length() - 1 - i);
                System.out.print(newString);
           }
    }
}
