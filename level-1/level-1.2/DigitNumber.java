// Task N4: Given an integer, output the number of digits in this number.
import java.util.Scanner;

public class DigitNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        int count = 0;

        while (number > 0) {
            number /= 10;
            count++;
        }

        System.out.printf("There are %d digits in the number\n", count);
         
    }
}
