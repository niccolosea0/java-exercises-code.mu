// Given some integer:
// 
// int num = 12;
// Print all divisors of this number to the console.

import java.util.Scanner;

public class Divisors {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = scanner.nextInt();
        int count = 0;

        System.out.print("Divisors of " + num + " are: ");

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
                count++;
            }
        }

        System.out.println("\nTotal divisors: " + count);
         
    }
}
