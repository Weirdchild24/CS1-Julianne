public class reviewPrograms3 {
    public static void main(String[] args) {
        double radius = 5.0;
        double height = 8.0;

        double volume = Math.PI * radius * radius * height;
        double surfaceArea = 2 * Math.PI * radius * (radius + height);

        System.out.println("Volume of the cylinder: " + volume);
        System.out.println("Surface area of the cylinder: " + surfaceArea);
    }
}
