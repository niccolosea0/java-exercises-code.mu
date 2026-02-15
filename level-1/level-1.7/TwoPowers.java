// Write code that will print the first N powers of two.
import java.util.Scanner;

public class TwoPowers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = scanner.nextInt();

        for (int i = 0; i <= N; i++) {
            System.out.println((int)Math.pow(2, i) + " ");
        }
    }
}


