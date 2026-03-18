public class PrintArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 0, 4, 5};

        for (int num : arr) {
            System.out.println(num);
            if (num == 0) {
                break;
            }
        } 
    }
}
