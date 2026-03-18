// Given an array with a date:
// 
// String[] arr = {"2025", "12", "31"};
// From the elements of this array, collect the date in the following format:
// 
// "31-12-2025"

public class FormatDate {
    public static void main(String[] args) {
         
       String[] arr = {"2025", "12", "31"};
       String date = "";
       for (int i = arr.length - 1; i >= 0; i--) {

           date += arr[i];
           if (i != 0) {
               date += "-";
           }
       }

       System.out.println("Date: " + date);
    }
}
