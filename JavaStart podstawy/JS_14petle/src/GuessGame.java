import java.util.Scanner;
public class GuessGame {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        int number= 500;
        int userInput;
        System.out.println("Zgadnij liczbę!");

        while((userInput=reader.nextInt())!=number){
            if(userInput < number){
                System.out.println("Podana liczba jest za mała, zgaduj dalej!");
            }
            else{
                System.out.println("Podana liczba jest za duża, zgaduj dalej!");
            }
        }
        System.out.println("BRAWO! Zgadłeś liczbę");
        reader.close();
    }
}
