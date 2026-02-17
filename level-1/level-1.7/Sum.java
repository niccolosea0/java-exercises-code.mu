// Given a number:

// 
// 12345
// Find the sum of the digits of this number.

public class Sum {
    public static void main(String[] args) {
         
         int number = 12345;
         System.out.println("Given number: " + number);

         int sum = 0;

         while (number > 0) {
             sum += number % 10;
             number /= 10;
         }

         System.out.println("Sum of the digits: " + sum);
    }
}
