// Given a fractional number containing the number of gigabytes:
// 
// float gb = 35.24;
// Convert this value to megabytes, kilobytes, and bytes.

public class GigaBytes {
    public static void main(String[] args) {
         
         float gb = 35.24f;
         System.out.println("Given GigaBytes: " + gb);

         int mb = (int) (gb * 1000);
         long kb = mb * 1000;
         long bytes = kb * 1000;

         System.out.println("MegaBytes: " + mb);
         System.out.println("KiloBytes: " + kb);
         System.out.println("Bytes: " + bytes);
    }
}
