import java.util.Scanner;

public class multiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę: ");
        int a = sc.nextInt();
        sc.nextLine();
        System.out.println("Podaj drugą liczbę: ");
        int b = sc.nextInt();
        sc.nextLine();
        sc.close();

        int result=0;
        for(int i =0; i<b; i++){
            result+=a;
        }
        System.out.println("Wynik mnożenia: "+result);
    }
}
