public class CalcTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(4, 5));
        System.out.println(calc.add(4, 5, 6));
        System.out.println(calc.subtract(10, 5));
        System.out.println(calc.subtract(10, 5, 2));
    }
}
