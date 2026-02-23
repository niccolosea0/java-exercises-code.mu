// Given an array of numbers:
// 
// int[] arr = [1, 2, 3, 4, 5];
// Find the sum of the square roots of the elements of this array.

public class SumSquareRoot {
    public static void main(String[] args) {
         
         int[] arr = {1, 2, 3, 4, 5};

         System.out.print("Elements: ");

         double sum = 0;

         for (int elem : arr) {
             System.out.print(elem + " ");
             double sqRoot = Math.sqrt(elem);  
             sum += sqRoot;
         }

         System.out.println();
         System.out.printf("Sum of the square root of the elements: %.2f\n", sum);

    }
}
