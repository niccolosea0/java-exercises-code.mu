// Given a variable containing the radius of the sphere:
// float r = 10.3;
// Get the volume and surface area of ​​this sphere.

class Main {
    
    public static final double PI = 3.14;
    
    public static void main(String[] args) {
        
        float r = 10.3f;
        
        double surfaceArea = 4 * PI * r;
        double volume = 4/3 * PI * Math.pow(r, 3);
        
        System.out.printf("Surface area of sphere: %.2f%n", surfaceArea);
        System.out.printf("Volume of sphere:  %.2f%n", volume);
    }
}
