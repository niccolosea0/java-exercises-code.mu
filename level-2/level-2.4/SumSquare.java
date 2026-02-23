// Given an array of integers:
// 
// int[] arr = {1, 2, 3, 4, 5};
// Find the sum of the squares of the elements of this array.

public class SumSquare {
    public static void main(String[] args) {

        int[] arr = new int[] {1, 2, 3, 4, 5};
        int sum = 0;

        System.out.print("Elements: ");


        for (int elem : arr) {
            // Print elements for showcase
            System.out.print(elem + " ");
            int square = elem * elem;
            sum += square;
        }

        System.out.println();

        System.out.println("Sum of the squares of the elements: " + sum);
         
    }
}
