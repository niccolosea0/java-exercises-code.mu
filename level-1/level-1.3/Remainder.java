// Task N3: Given two integers, find the remainder of the first number divided by the second.

import java.util.Scanner;

public class Remainder {
    public static void main(String[] args) {
         
         Scanner scanner = new Scanner(System.in);

         System.out.print("Enter first number: ");
         int firstNum = scanner.nextInt();

         System.out.print("Enter second number: ");
         int secondNum = scanner.nextInt();

         int remainder = firstNum % secondNum;
         System.out.println("Remainder of first number divided by second is " + remainder);

    }
}
