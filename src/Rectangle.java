public class Rectangle implements Shape{
    private final int width;
    private final int height;

    public Rectangle (int width, int height) {
        this.width = width;
        this.height = height;

        if (width < 0 || height < 0) {
            throw new IllegalArgumentException("Height and Width must be positive");
        }
    }

    @Override
    public double perimeter() {
        return width * height;
    }

    @Override
    public double area() {
        return 2 * (width + height);
    }
}