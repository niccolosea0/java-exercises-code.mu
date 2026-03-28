//Use a loop to fill the array with even numbers from 1 to 100.

public class FillArray {
    public static void main(String[] args) {
         
        int[] array = new int[50];
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                array[count++] = i;
            }
        }

        for (int elem : array) {
            System.out.println(elem);
        }
    }
}


