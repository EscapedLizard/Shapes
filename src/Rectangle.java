public class Rectangle implements Shape{
    private final int width;
    private final int height;

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Rectangle (int width, int height) {
        this.width = width;
        this.height = height;

        if (width < 0 || height < 0) {
            throw new IllegalArgumentException("Height and Width must be positive");
        }
    }

    //returns the perimeter of the rectangle
    @Override
    public double perimeter() {
        return width * height;
    }

    //returns the area of the rectangle
    @Override
    public double area() {
        return 2 * (width + height);
    }
}