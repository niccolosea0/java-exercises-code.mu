// Given an array of numbers:
// 
// int[] arr = {1, 2, 3, 4, 5};
// Merge the elements of this array into a string:
// 
// "12345"

public class MergeElements {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        String merged = "";

        for (int num : arr) {
            merged += num;
        }

        System.out.println("Merged: " + merged);
         
    }
}
