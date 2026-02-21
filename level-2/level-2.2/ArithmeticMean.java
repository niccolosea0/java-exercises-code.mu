// Find the arithmetic mean of all integers from 1 to 100.

public class ArithmeticMean {
    public static void main(String[] args) {

        int sum = 0;
        int count = 100;

        for (int i = 1; i <= 100; i++) {
            sum += i;
        }

        double result = (double) sum / count;

        System.out.println("Arithmetic mean from 1 to 100: " + result);
    }
}
