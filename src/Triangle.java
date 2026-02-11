public class Triangle implements Shape{
    private int sideA;
    private int sideB;
    private int hypotenuse;

    public int getHypotenuse() {
        return hypotenuse;
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public Triangle (int sideA, int sideB, int hypotenuse){
        this.sideA = sideA;
        this.sideB = sideB;
        this.hypotenuse = hypotenuse;

        if (sideA < 0 || sideB < 0 || hypotenuse < 0){
            throw new IllegalArgumentException("All sides must be greater than zero");
        }
        if (sideA + sideB < hypotenuse || sideA + hypotenuse < sideB || sideB + hypotenuse < sideA){
            throw new IllegalArgumentException("Invaild input!");
        }


    }

    @Override
    public double perimeter() {
        return sideA + sideB + hypotenuse;
    }

    @Override
    public double area() {
        int semipermeter = 0;
        semipermeter = (sideA + sideB + hypotenuse) / 2;

        return Math.sqrt(semipermeter * (semipermeter - sideA) * (semipermeter - sideB) * (semipermeter - hypotenuse));
    }
}
