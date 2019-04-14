import java.util.Scanner;
public class NumberChecker {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int tmp;
        for(int i=0;i<3;i++){
            System.out.println("POdaj liczbę do sprawdzenia: ");
            tmp=sc.nextInt();

            if(tmp%2==0){
                System.out.println("POdana liczba "+tmp+" jest parzysta");
            }
            else{
                System.out.println("Podana liczba "+tmp+" nie jest parzysta");
            }
        }
        sc.close();
    }
}
