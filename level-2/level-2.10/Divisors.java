//  Two integers are given:
// int num1 = 12;
// int num2 = 16;

// Print to the console all common divisors of these numbers. 

import java.util.List;
import java.util.ArrayList;

class Main {
    
    public static void main(String[] args) {
        
        int num1 = 12;
        int num2 = 16;
        System.out.println("First number: " + num1 + "\nSecond number: " + num2);
        
        List<Integer> commonDivisors = new ArrayList<>();
        
        int length = 0;
        
        if (num1 > num2) {
            length = num1;
        } else {
            length = num2;
        }
        
        for (int i = 1; i < length; i++) {
            if ((num1 % i) == (num2 % i)) {
                commonDivisors.add(i);
            }
        }
        
        System.out.print("Common divisors: ");
        for (int number : commonDivisors) {
            System.out.print(number + " ");
        }
    }
}
