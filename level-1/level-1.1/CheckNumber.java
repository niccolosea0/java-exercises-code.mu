// Task: Given a number. Check if it is negative or not. Output this information to the console.

import java.util.Scanner;

public class CheckNumber {
    
    public static void main(String[] args) {
         
         Scanner scanner = new Scanner(System.in);
         System.out.print("Enter a integer: ");
         int number = scanner.nextInt();

         if (number < 0) {
             System.out.println("Number is negative");
         } else if (number > 0) {
             System.out.println("Number is positive!");
         } else {
             System.out.println("Number is Zero!");
         }
    }
}


