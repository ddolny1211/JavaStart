public class ShapeCalculator {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10,5);
        Circle circle = new Circle(14.2);

        System.out.println("Pole koła: "+circle.calculateArea());
        System.out.println("Obwód prostokąta: "+rectangle.calculatePerimeter());
    }
}
