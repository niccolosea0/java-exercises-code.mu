// Task N2:
// Given a number:
// 
// int num = 12345;
// Find the sum of the first and last digits of this number.

public class FirstAndLast {
    public static void main(String[] args) {

        int num = 12345;
        System.out.println("Number: " + num);

        int firstDigit = num % 10;

        int lastDigit = 0;

        while (num > 0) {
            lastDigit = num % 10;
            num /=10;
        }

        System.out.println("Sum of first and last: " + (lastDigit + firstDigit));
    }
}
