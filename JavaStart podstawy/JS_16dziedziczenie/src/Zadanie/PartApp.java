package Zadanie;

public class PartApp {
    public static void main(String[] args) {
        TireWheel wheel1 = new TireWheel();
        wheel1.setIdentNumber("00001");
        wheel1.setModel("AR15");
        wheel1.setProducent("BRONKIE");
        wheel1.setSeries("Loube");
        wheel1.setSize(255);
        wheel1.setWidth(70);
        wheel1.setRimSize(21);

        ExhaustPart exhaust = new ExhaustPart();
        exhaust.setIdentNumber("00001");
        exhaust.setModel("AR15");
        exhaust.setProducent("BRONKIE");
        exhaust.setSeries("Loube");
        exhaust.setUeStandard("Avaiable");

        wheel1.printInfo();
        exhaust.printInfo();
    }


}
