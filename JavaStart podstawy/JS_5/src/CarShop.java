public class CarShop {
    public static void main(String[] args){
        Car audi = new Car();
        audi.brand = "Audi";
        audi.model = "A4";
        audi.doors = 4;
        audi.carColor = "Czarny";
        audi.wheelColor = "Srebrny";
        audi.tiresColor = "Czarny";

        String audiInfo = audi.brand + " " + audi.model
                + ", Drzwi: " + audi.doors
                + ", Kolor nadwozia: " + audi.carColor
                + ", Kolor felg: " + audi.wheelColor
                + ", Kolor opon: " + audi.tiresColor;
        System.out.println("Wybrałeś następujący samochód: ");

        System.out.println(audiInfo);

        Car audi2 = new Car();
        audi2.brand = "Audi";
        audi2.model = "A5";
        audi2.doors = 3;
        audi2.carColor = "Czerwony";
        audi2.wheelColor = "Czarny";
        audi2.tiresColor = "Czarny";

        String audi2Info = audi2.brand + " " + audi2.model
                + ", Drzwi: " + audi2.doors
                + ", Kolor nadwozia: " + audi2.carColor
                + ", Kolor felg: " + audi2.wheelColor
                + ", Kolor opon: " + audi2.tiresColor;
        System.out.println("Wybrałeś następujący samochód: ");

        System.out.println(audi2Info);

        Car bmw = new Car();
        System.out.println(bmw.brand);
        System.out.println(bmw.doors);

        //Czy audi jest samochodem?
        boolean isCar = audi instanceof Car;
        System.out.println(isCar);

    }
}
