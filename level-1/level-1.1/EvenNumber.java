// Task N4: Given a number, check whether it is even or not.
import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a integer: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Number is even!");
        } else {
            System.out.println("Number is odd!");
        }
         
    }
}
