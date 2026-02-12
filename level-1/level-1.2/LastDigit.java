// Task N2: Given an integer, print the last digit of this number to the console.
import java.util.Scanner;

public class LastDigit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        int lastDigit = number % 10;
        System.out.println("Last digit of the number is " + lastDigit);
         
    }
}
