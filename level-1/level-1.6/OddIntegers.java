// Find the sum of all odd integers between 1 and 100.

public class OddIntegers {
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }

        System.out.println("Sum of all odd integers from 1 to 100 is " + sum);
         
    }
}
