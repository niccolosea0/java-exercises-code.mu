// Task N4:
// Given some integer:
// 
// int num = 12345;
// Output all its digits from the end to the console.

public class OutputDigits {
    public static void main(String[] args) {
         
        int num = 12345;
        System.out.println("Number: " + num);

        System.out.print("Digits: ");
        while (num > 0) {
            System.out.print(num % 10 + " ");
            num /= 10;
        }

        System.out.println();
    }
}
