// Task N2: Given an integer, output to the console the sum of the first and last digits of this number.

import java.util.Scanner;

public class FirstAndLast {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        int remainder = 0;
        int lastDigit = number % 10;

        while (number > 0) {
            remainder = number % 10;
            number /=  10;
        }

        int firstDigit = remainder;

        int sum = firstDigit + lastDigit;
        System.out.printf("Sum of the first (%d) and last (%d) digit is %d\n", firstDigit, lastDigit, sum);
    }
}
