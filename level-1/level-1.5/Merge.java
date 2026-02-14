// Task N3 Three symbols are given:
//
// char chr1 = 'a';
// char chr2 = 'b';
// char chr3 = 'c';
// Merge these characters into a string:
// 
// String "abc"

public class Merge {
    public static void main(String[] args) {

        char chr1 = 'a';
        char chr2 = 'b';
        char chr3 = 'c';
        
        String word = "";
        word += chr1;
        word += chr2;
        word += chr3;

        System.out.println("Word is: " + word);
    }
}
