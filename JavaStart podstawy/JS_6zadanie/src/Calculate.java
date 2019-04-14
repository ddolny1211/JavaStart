import java.util.Random;

public class Calculate {
    public static void main(String[] args){
        Random rand = new Random();
        double x = rand.nextInt(100);
        double y = rand.nextInt(100);

        System.out.println("X: " + x);
        System.out.println("Y: " + y);

        Calculator wykonywanie = new Calculator();
        double wynik = wykonywanie.add(x,y);
        System.out.println("Dodawanie: " + wynik);

        wynik = wykonywanie.subtract(x, y);
        System.out.println("Odejmowanie: " + wynik);

        wynik = wykonywanie.multiply(x, y);
        System.out.println("Mnożenie: " + wynik);

        wynik = wykonywanie.divide(x, y);
        System.out.println("Dzielenie: " + wynik);

    }
}
