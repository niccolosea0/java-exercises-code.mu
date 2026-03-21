// Given an integer containing a month number from 1 to 12:
// 
// byte num = 1;
// Print the name of the month corresponding to this date.
import java.util.Scanner;

public class PrintMonth {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month number: ");
        int num = scanner.nextInt();

        switch (num) {

            case 1 -> System.out.println("It is January");
            case 2 -> System.out.println("It is February");
            case 3 -> System.out.println("It is March");
            case 4 -> System.out.println("It is April");
            case 5 -> System.out.println("It is May");
            case 6 -> System.out.println("It is June");
            case 7 -> System.out.println("It is July");
            case 8 -> System.out.println("It is August");
            case 9 -> System.out.println("It is September");
            case 10 -> System.out.println("It is Octomber");
            case 11 -> System.out.println("It is November");
            case 12 -> System.out.println("It is December");
            default -> System.out.println("Not valid month number");
        }
    }
}
