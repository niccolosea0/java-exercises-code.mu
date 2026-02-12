// Task N1: Given an integer, print the first digit of this number to the console.
import java.util.Scanner;

public class FirstDigit {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        String stringNum = "" + number;
        char firstDigit = stringNum.charAt(0);
        System.out.println("First digit of the number is " + firstDigit);
         
    }
}
