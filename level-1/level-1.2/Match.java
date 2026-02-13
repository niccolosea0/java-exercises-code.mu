// Task N1: Given an integer, print the first digit of this number to the console.
import java.util.Scanner;

public class Match {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int secondNumber = scanner.nextInt();

        int firstNumberDigit = getFirstDigit(firstNumber); 
        int secondNumberDigit = getFirstDigit(secondNumber);

        System.out.println("First number's first digit is " + firstNumberDigit);
        System.out.println("Second number's first digit is " + secondNumberDigit);

        if (firstNumberDigit == secondNumberDigit) {
            System.out.println("They are equal!");
        } else {
            System.out.println("They are NOT equal!");
        }
         
    }

    public static int getFirstDigit(int number) {
        int remainder = 0;
        while (number > 0) {
            remainder = number % 10;
            number /= 10;
        }

        return remainder;
    }
}
