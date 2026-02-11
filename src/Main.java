public class Main {
    public static void main (String[] args){

        System.out.printf("Circle(2.5): area =%.3f perimeter = %.3f", new Circle(3.6).area(), new Circle(2.5).perimeter());
        System.out.println();
        System.out.printf("Rectangle(2,5): area =%.3f, perimeter =%.3f", new Rectangle(2,5).area(), new Rectangle(2,5).perimeter());
        System.out.println();
        System.out.printf("Triangle(3,5,7): area =%.3f, perimeter =%.3f", new Triangle(2,3,5).area(), new Triangle(2,3,5).perimeter());

    }
}
