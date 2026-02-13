// Given an integer containing the minute number from 0 to 60:
// byte num = 30;
// Determine which quarter of an hour this value falls into.

import java.util.Scanner;

public class HourQuarter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number from 0 to 60: ");
        int num = scanner.nextInt();
        if (num >= 0 && num <= 15) {
            System.out.println("Number falls into first quarter"); 
        } else if (num > 15 && num <= 30) {
            System.out.println("Number falls into second quarter"); 
        } else if (num > 30 && num <= 45) {
            System.out.println("Number falls into third quarter"); 
        } else if (num > 45 && num <= 60) {
            System.out.println("Number falls into fourth quarter"); 
        } else {
            System.out.println("Number is out of range");
        }
    }
}
