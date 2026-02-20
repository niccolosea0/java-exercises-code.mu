// Given an array of strings:
// 
// String[] arr = {"ab", "cd", "ef"};
// Print the first characters of the elements of this array to the console.

public class Strings {
    public static void main(String[] args) {
         
         String[] arr = {"ab", "cd", "er"};

         for (String elem : arr) {
             System.out.print(elem.charAt(0) + " ");
         }

         System.out.println();
    }
}
