// Given an array of numbers:
// 
// int[] arr = {1, 2, 3, 4, 5};
// Print the elements of this array to the console in reverse order.

public class PrintReverse {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        System.out.print("Array elements: ");
        for (int elem : arr) {
            System.out.print(elem + " ");
        }

        System.out.print("\nReverse order: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}
