public class ArraySum {
    public static void main(String[] args) {

        int[] arr = {-1, 2, -3, 4, 5, 11};

        int sum = 0;

        for (Integer num : arr) {

            if (num > 0 && num < 10) {
                sum += num;
            }

        }

        System.out.println("Sum: " + sum);
    }
}
