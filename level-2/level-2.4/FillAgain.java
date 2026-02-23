// Given an array:
// 
// int[10] arr;
// Use a loop to fill this array with integers from 10 to 1.

public class FillAgain {
    public static void main(String[] args) {

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 10 - i;
        }

        System.out.print("Array elements: ");
        for (int elem : arr) {
            System.out.print(elem + " ");
        }

        System.out.println();
         
    }
 }
