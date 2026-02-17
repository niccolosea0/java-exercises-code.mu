// Task N3
// 
// Given an integer containing the number of bytes:
// 
// int b = 3535645778;
// Convert this value to gigabytes, megabytes, and kilobytes.

public class Convert {
    public static void main(String[] args) {
         
        long b = 3535645778l;
        System.out.println("Bytes: " + b);

        double kb = b / 1000.;
        System.out.println("Kilobytes: " + kb);

        double mb = kb / 1000;
        System.out.println("Megabytes: " + mb);

        double gb = mb / 1000;
        System.out.println("Gigabytes: " + gb);
    }
}
    
