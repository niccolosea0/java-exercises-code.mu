// Given an array of numbers:
// 
// int[] {1, 2, 3, 4};
// Double each element of this array:
// 
// int[] {2, 4, 9, 8};

public class DoubleArray {
    public static void main(String[] args) {

         int[] arr = {1, 2, 3, 4, 5};

         System.out.print("Array elements: ");
         for (int elem : arr) {
             System.out.print(elem + " ");
         }

         System.out.println();

         int size = arr.length;

         int[] doubleArr = new int[size];

         for (int i = 0; i < size; i++) {
             doubleArr[i] = arr[i] * 2;
         }

         System.out.print("Double array elements: ");
         for (int elem : doubleArr) {
             System.out.print(elem + " ");
         }

         System.out.println();
         
    }
}
