public class Circle implements Shape {
    private final double radius;

    public double getRadius() {
        return radius;
    }

    public Circle (double radius){
        this.radius = radius;
        if (radius <= 0) {
            throw new IllegalArgumentException("radius must be positive");
        }

    }

    //returns the area of circle
    @Override
    public double area() {
        return Math.PI * Math.pow(radius,2);
    }

    //returns the perimeter of circle
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}