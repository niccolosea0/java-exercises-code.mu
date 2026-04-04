// A number of 6-digits is given
// 
// int num = 123321;
// Check that the sum of the first three digits equals the sum of the second three digits.

public class CheckSum {
    public static void main(String[] args) {

        int num = 123321;
        System.out.println("Number is " + num);

        String numStr = "" + num;

        int firstThree = 0;  
        int secondThree = 0; 

        for (int i = 0; i < numStr.length(); i++) {
            if (i <= 2) {
                firstThree += Integer.parseInt("" + numStr.charAt(i));
            } else {
                secondThree += Integer.parseInt("" + numStr.charAt(i));
            }
        }

        if (firstThree == secondThree) {
            System.out.println("First three and second three of number are equal!" );
            System.out.printf("First number: %d%nSecond number: %d%n", firstThree, secondThree);
        } else {
            System.out.println("Number first three and second three are NOT equal!");
            System.out.printf("First number: %d%nSecond number: %d%n", firstThree, secondThree);
        }
    }
}
