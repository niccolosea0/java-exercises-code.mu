// Given an array of integers:
// 
// int[] arr = {1, 2, 3, 4, 5};
// Find the sum of the squares of the elements of this array.

public class SumSquare {
    public static void main(String[] args) {
         
        int[] arr = {1, 2, 3, 4, 5};
        System.out.print("Array elements: ");
        for (int elem : arr) {
            System.out.print(elem + " ");
        }

        System.out.print("\nSquare of array elements: ");
        for (int elem : arr) {
            System.out.print((elem * elem) + " ");
        }

        System.out.println();

    }
}
