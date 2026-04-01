  // Given an array of integers:

// int[] {1, 2, 3, 4, 5};
// Swap the first and last elements of this array:

// int[] {5, 2, 3, 4, 1};

public class SwapArray {
    public static void main(String[] args) {
        
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Before swap:");
        for (int elem : array) {
            System.out.print(elem + " ");
        }
        
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        
        System.out.println("\nAfter swap:");
        for (int elem : array) {
            System.out.print(elem + " ");
        }
    }
}
