// Given an array of integers:
// 
// int[] arr = {1, 2, 3, 4, 5};
// Find the sum of the squares of the elements of this array.


public class ArraySum {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5};

        int sum = 0;

        for (int elem : arr) {
            sum += elem * elem;
        }

        System.out.println("Sum of squares: " + sum);
         
    }
}
