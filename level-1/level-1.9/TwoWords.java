// Task N1 Given two words, check that the last letter of the first word matches the first letter of the second word.
import java.util.Scanner;

public class TwoWords {
    public static void main(String[] args) {
         
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first word: ");
        String firstWord = scanner.nextLine();

        System.out.print("Enter second word: ");
        String secondWord = scanner.nextLine();

        char firstFirstLetter = firstWord.charAt(0);
        char secondFirstLetter = secondWord.charAt(0);

        if (firstFirstLetter == secondFirstLetter) {
            System.out.println("First letters of the two words, matches");
        } else {
            System.out.println("Words first letters do not match!");
        }
    }
}
