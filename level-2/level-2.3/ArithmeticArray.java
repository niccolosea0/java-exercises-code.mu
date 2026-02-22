// Given an array of integers:
// 
// int[] arr = {1, 2, 3, 4, 5};
// Find the arithmetic mean of this array.

public class ArithmeticArray {
    public static void main(String[] args) {
         
         int[] arr = {1, 2, 3, 4, 5};
         System.out.print("Array elemetns: ");
         int sum = 0;

         for (int elem : arr) {
             // Add array elemetns in to the sum
             sum += elem;

             // Print elements for display
             System.out.print(elem + " ");
         }

         int size = arr.length;

         double mean = (double) sum / size;

         System.out.println("\nArithmetic mean of the array: " + mean);
    }
}
