// Task N1: Print to the console all numbers multiples of three in the range from 1 to 100.

public class MultipleThree {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}


