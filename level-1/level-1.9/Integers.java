// Task N3 Print to the console all integers from -100 to 0.

public class Integers {
    public static void main(String[] args) {

        for (int i = -100; i <= 0; i++) {
            if (i % 10 == 0) {
                System.out.println();
            }    
            System.out.print(i + " ");
        }
         
    }
}
