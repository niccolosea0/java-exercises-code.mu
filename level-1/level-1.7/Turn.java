// Given a number:
// 
// 12345
// Turn it over:
// 
// 54321

public class Turn {
    public static void main(String[] args) {
         
         int number = 12345;
         System.out.println("Given number: " + number);

         String str = "" + number;
         String result = "";

         for (int i = str.length() - 1; i >= 0 ; i--) {
             result += str.charAt(i);
         }

         System.out.println("Turned Result: " + result);
    }
}
