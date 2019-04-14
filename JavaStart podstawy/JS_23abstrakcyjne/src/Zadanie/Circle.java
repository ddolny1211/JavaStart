package Zadanie;

public class Circle implements Shape {
    private double ray;

    public Circle(double ray) {
        this.ray = ray;
    }

    public double getRay() {
        return ray;
    }

    public void setRay(double ray) {
        this.ray = ray;
    }

    @Override
    public double calculateArea() {
        return Shape.PI*ray*ray;
    }

    @Override
    public double calculatePerimeter() {
        return Shape.PI*ray*2;
    }
}
