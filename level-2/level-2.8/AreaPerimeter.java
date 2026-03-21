// Given variables containing the sides of a rectangle:
// 
// int a = 10;
// int b = 20;
// Get the area and perimeter of this rectangle.

public class AreaPerimeter {
    public static void main(String[] args) {
         
        int a = 10;
        int b = 20;
        System.out.println("Give sides: " + a + " and " + b);

        System.out.println("Area of rectangle: " + (a * b));
        System.out.println("Perimeter of rectangle: " + 2 * (a + b) );
    }
}
