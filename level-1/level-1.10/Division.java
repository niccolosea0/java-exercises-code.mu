// Given a number:
// 
// float num = 12345;
// Divide it by two as many times as necessary until the result is less than 10. How many iterations does this require?

public class Division {
    public static void main(String[] args) {

        int num = 12345;
        int count = 0;

        while (num > 10) {

            System.out.print("Divide number " + num + " by 2 = ");
            num /= 2;
            System.out.println(num);

            count++;
        }

        System.out.println("Total iterations: " + count);
         
    }
}
