// Task N1: Print to the console all integers from 1 to 100.
public class PrintIntegers {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
            if (i % 10 == 0) {
                System.out.println();
            }
        }
         
    }
}
