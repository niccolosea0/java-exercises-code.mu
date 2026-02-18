// Task N1: Find the sum of all even integers between 1 and 100.


public class SumEvenIntegers {
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        System.out.println("Even integers sum: " + sum);
         
    }
}
