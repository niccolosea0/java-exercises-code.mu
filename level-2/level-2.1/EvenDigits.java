// Given some integer:
// 
// int num = 12345;
// Find the sum of all its even digits.

public class EvenDigits {
    public static void main(String[] args) {
         
         int num = 12345;
         System.out.println("Number: " + num);
         int sum = 0;

         while (num > 0) {
             int digit = num % 10;
             if (digit % 2 == 0) {
                 sum += digit;
             }
             num /= 10;
         }

         System.out.println("Sum: " + sum);
    }
}
