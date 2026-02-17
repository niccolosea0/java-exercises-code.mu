// Task N2
// 
// Given a string:
// 
// "abcde"
// Loop through and output to the console one by one all characters from the end of the line.

public class LoopString {
    public static void main(String[] args) {

        String str = "abcde";
        System.out.println("Given String: " + str);

        System.out.print("Reverse: ");

        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }
}
