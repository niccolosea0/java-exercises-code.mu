// Task N3
// 
// Given an array of integers:
// 
// int[] arr = {1, 2, 3, 4, 5};
// Find the sum of the elements of this array.


public class SumArray {
    public static void main(String[] args) {
         
         int[] arr = {1, 2, 3, 4, 5};
         System.out.print("Array elements: ");
         for (int elem : arr) {
             System.out.print(elem + " ");
         }

         int sum = 0;

         for (int elem : arr) {
             sum += elem;
         }

         System.out.println("\nSum of array elements: " + sum);
    }
}
         
