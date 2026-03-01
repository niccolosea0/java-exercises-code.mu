// Given an array of numbers:
// 
// int[] arr = [1, 2, -3, 4, -5];
// Find the sum of the positive elements of this array.

public class FindPositiveSum {
    public static void main(String[] args) {
         
        int[] arr = {1, 2, -3, 4, -5};
        int sum = 0;

        System.out.print("Array elements: ");
        for (int elem : arr) {
            System.out.print(elem + ", ");
            if (elem > 0) {
                sum += elem;
            }
        }

        System.out.println("\nSum of the positive: " + sum);
    }
}
