// Task N2 Given a string: String str = "abcde"; Loop through and output to the 
// console one by one all characters from the end of the line.

public class Characters {
    public static void main(String[] args) {
         
         String str = "abcde";
         int size = str.length();
         for (int i = 0; i < size; i++) {
             System.out.print(str.charAt(i) + " ");
         }
         System.out.println();
    }
}
