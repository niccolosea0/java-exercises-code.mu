// Task N3 Given two integers, check that the first number is divisible by the second without remainder.

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int firstNum = scanner.nextInt();

        System.out.print("Enter second integer: ");
        int secondNum = scanner.nextInt();
        if (secondNum == 0) {
            System.out.println("Error! Can not divide by 0");
        }

        if (firstNum % secondNum == 0) {
            System.out.println("First integer is divisible by second");
        } else {
            System.out.println("First integer is NOT divisible by second");
        }
    }
}


