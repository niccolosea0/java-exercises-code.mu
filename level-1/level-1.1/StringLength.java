// Task N2: Given a string, output the length of this string to the console.
import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String userInput = scanner.nextLine();

        System.out.println("Length of the String: '" + userInput + "' is " + userInput.length());
         
    }
}
