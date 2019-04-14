import java.util.Scanner;

public class InOut {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String firstName;
        String lastName;
        int age;

        System.out.println("Podaj imię:");
        firstName=input.nextLine();
        System.out.println("Podaj nazwisko: ");
        lastName=input.nextLine();
        System.out.println("Podaj swój wiek: ");
        age=input.nextInt();

        input.close();

        System.out.println("Witaj "+firstName+" "+lastName);
        System.out.println("Twój wiek to "+age);
    }
}
