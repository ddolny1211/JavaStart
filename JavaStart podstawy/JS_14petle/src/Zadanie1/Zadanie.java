package Zadanie1;
import java.util.Scanner;

public class Zadanie {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int howMany;
        System.out.println("Ile liczb chcesz wprowadzić?");
        howMany=sc.nextInt();

        int sum=0;

        for(int i=0;i<howMany;i++){
            System.out.println("Podaj liczbę ");
            sum=sum+sc.nextInt();
        }
        System.out.println("Suma podanych przez Ciebie liczb wynosi "+sum);
        sc.close();
    }
}
