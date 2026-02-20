// Task N4:
// Given some integer:
// 
// byte num = 12;
// Find the factorial of this number.

public class Factorial {
    public static void main(String[] args) {

        byte num = 12;
        int result = 1;

        for (int i = 1; i <= num; i++) {

            result *= i ;

        }

        System.out.println("Factorial of " + num + " is " + result);
         
    }
}
