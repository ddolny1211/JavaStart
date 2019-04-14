public class CarApp {
    public static void main(String[] args) {
        //Vehicle vehicle = new Vehicle();

        Vehicle vehicle = new Car();

        vehicle.speedUp();
        System.out.println("Samochód jedzie teraz z prędkością "+vehicle.getSpeed());
    }
}
