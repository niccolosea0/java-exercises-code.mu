// Task N2: Given a string, if there is more than one character in the string, 
// print the second to last character of the string to the console.

import java.util.Scanner;

public class SecondToLast {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String: ");
        String input = scanner.nextLine();

        int size = input.length();
        if (size > 1) {
            for (int i = 1; i < size; i++) {
                System.out.print(input.charAt(i));
            }
            System.out.println();
        } else {
            System.out.println("String has only one character: " + input.charAt(0));
        }
    }
}
