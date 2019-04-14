package Zadnaie;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class Stopper {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Naciśnij ENTER aby rozpocząć pomiar");
            sc.nextLine();
            Instant start = Instant.now();

            System.out.println("Naciśnij ENTER aby zatrzymać pomiar");
            sc.nextLine();
            Instant stop = Instant.now();

            Duration time = Duration.between(start,stop);
            System.out.println("Wynik pomiaru: "+time.getSeconds()+" sekundy.");
        }
    }
}
