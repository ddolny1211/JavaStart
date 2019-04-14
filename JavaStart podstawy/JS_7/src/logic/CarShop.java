package logic;

import data.Car;

public class CarShop {
    public static void main(String[] args) {
        Car audiA5 = new Car(2014, "Audi", "A5", "Czarne");
        System.out.println("Rocznik: " + audiA5.getYear());
        //zmieniamy rocznik
        audiA5.setYear(2015);
        System.out.println("Rocznik: " + audiA5.getYear());
        //znowu próbujemy przestawić
        audiA5.setYear(-500);
        System.out.println("Rocznik: " + audiA5.getYear());


    }
}
