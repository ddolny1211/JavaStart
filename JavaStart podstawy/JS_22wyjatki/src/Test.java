import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wprowadz liczbę: ");
        int[] numbers = new int[2];
        boolean error = true;

        do{
            try{
                System.out.println("Podaj liczbę 1:");
                numbers[0] = sc.nextInt();
                sc.nextLine();
                System.out.println("Podaj liczbę 2:");
                numbers[1] = sc.nextInt();
                sc.nextLine();
                System.out.println("Którą wartość wyświetlić? 1 czy 2?");
                System.out.println("Liczba: "+numbers[sc.nextInt()-1]);
                error = false;
                System.out.println("Wczytano poprawną liczbę");
            }catch(InputMismatchException ex){
                System.err.println("Nie podałeś poprawnej liczby, spróbuj jeszcze raz");
            }catch(ArrayIndexOutOfBoundsException ex){
                System.out.println("Miało być 1 lub 2 ty tępy chuju idioto pierdolony kurwa. Jeszcze raz!");
            }finally{
                sc.nextLine();
            }
        }while(error);
        sc.close();
    }
}
