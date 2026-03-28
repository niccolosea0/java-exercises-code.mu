// Given an array of integers:
// 
// int[] {1, 2, 3, 4, 5};
// Swap the first and second elements of this array:
// 
// int[] {2, 1, 3, 4, 5};

public class ArraySwap {
    public static void main(String[] args) {


       int[] array = {1, 2, 3, 4, 5};

       System.out.print("First Array: ");

       for (int elem : array) {
           System.out.print(elem + " ");
       }

       int temp = array[0];
       array[0] = array[1];
       array[1] = temp;

       System.out.print("\nSecond Array: ");
       for (int elem : array) {
           System.out.print(elem + " ");
       }


        
    }
}
