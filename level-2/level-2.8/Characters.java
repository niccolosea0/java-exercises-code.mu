// Given a line:
// 
// String str = "12345";
// Get the first and last character of this string as follows:

// String "15";
//
public class Characters {
    public static void main(String[] args) {

        String str = "12345";
        System.out.println("String is: " + str);
         
        char firstChar = str.charAt(0);
        char lastChar = str.charAt(str.length() - 1);

        System.out.println("First and last characters: " + firstChar + lastChar);
    }
}
