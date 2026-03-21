// Given an array of strings:
// 
// String[] arr = {"ab", "cd", "ef"};
// Get an array of characters from these strings:
// 
// char[] {'a', 'b', 'c', 'd', 'e', 'f'}

import java.util.List;
import java.util.ArrayList;

public class GetCharacters {
    public static void main(String[] args) {

        String[] arr = {"ab", "cd", "ef"};
        List<Character> charList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            String str = arr[i];

            for (int j = 0; j < str.length(); j++) {

                charList.add(str.charAt(j));
            }
        }

        for (Character c : charList) {
            System.out.print(c + " ");
        }
    }
}
