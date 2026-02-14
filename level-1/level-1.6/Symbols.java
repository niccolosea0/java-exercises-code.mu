// Three symbols are given:
// 
// char chr1 = '1';
// char chr2 = '2';
// char chr3 = '3';
// Add the values of these symbols as integers.

public class Symbols {
    public static void main(String[] args) {
         
         char chr1 = '1';
         char chr2 = '2';
         char chr3 = '3';

         String str1 = "" + chr1;
         String str2 = "" + chr2;
         String str3 = "" + chr3;

         int int1 = Integer.parseInt(str1);
         int int2 = Integer.parseInt(str2);
         int int3 = Integer.parseInt(str3);

         int sum = int1 + int2 + int3;
         System.out.println("Sum: " + sum);


    }
}
