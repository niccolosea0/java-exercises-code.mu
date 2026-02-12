// Task N5: You are given two words. Check that the first letters of these words match.

import java.util.Scanner;

public class TwoWords {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first word: ");
        String firstWord = scanner.nextLine().toLowerCase().trim();

        System.out.print("Enter second word: ");
        String secondWord = scanner.nextLine().toLowerCase().trim();

        if (firstWord.charAt(0) == (secondWord.charAt(0))) {
            System.out.println("Words first letters are the same!");
        } else {
            System.out.println("Words first letters are NOT the same!");
        }

         
    }
}
