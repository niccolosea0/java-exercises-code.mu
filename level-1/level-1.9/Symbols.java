// Three symbols are given:
// 
// char chr1 = '1';
// char chr2 = '2';
// char chr3 = '3';
// Merge these symbols into a number:
// 
// int 123

public class Symbols {
    public static void main(String[] args) {

        char chr1 = '1';
        char chr2 = '2';
        char chr3 = '3';

        String combined = "" + chr1 + chr2 + chr3;
        int number = Integer.parseInt(combined);
        System.out.println("Number: " + number);
         
    }
}
