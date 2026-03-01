// Given an array of strings containing integers:
// 
// String[] {"123", "456", "789"};
// Transform this array so that the values ​​of the new array become integers:
// 
// int[] {123, 456, 789};

public class Transform {
    public static void main(String[] args) {
         
         String[] strArr = {"123", "456", "789"};

         System.out.print("String array: ");
         for (String elem : strArr) {
             System.out.print(elem + " ");
         }

         int[] intArr = new int[3];

         for (int i = 0; i < intArr.length; i++) {

             intArr[i] = Integer.parseInt(strArr[i]);

         }

         System.out.print("\nInteger array (Parsed): ");
         for (int elem : intArr) {
             System.out.print(elem + " ");
         }
         
         System.out.println();

    }
}
