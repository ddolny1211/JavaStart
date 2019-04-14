import java.util.Scanner;
import java.util.Locale;

public class TwoNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);//możliwość wpisywania liczb po przecinku za pomocą kropki zmieniająć lokalizację na US

        System.out.println("Podaj A: ");
        double a=input.nextDouble();
        System.out.println("Podaj B: ");
        double b=input.nextDouble();

        input.close();

        System.out.println("Suma liczb A i B wynosi "+(a+b));
    }
}
