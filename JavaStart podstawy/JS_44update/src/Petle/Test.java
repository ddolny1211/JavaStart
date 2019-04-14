package Petle;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
       Hospital hospital = new Hospital();
       Scanner sc = new Scanner(System.in);
       int option = -1;

       while(option!=0){
           System.out.println("1 - dodaj pacjenta");
           System.out.println("2 - wyświetl");
           System.out.println("0 - zakończ program");
           option=sc.nextInt();
           sc.nextLine();
           switch(option){
               case 1:
                   System.out.println("Podaj imie: ");
                   String name = sc.nextLine();
                   System.out.println("Podaj nazwisko: ");
                   String lname = sc.nextLine();
                   System.out.println("Podaj pesel: ");
                   String pesel = sc.nextLine();
                   hospital.add(new Patient(name, lname, pesel));
                   break;
               case 2:
                   hospital.printPatients();
                   break;
               default:
                   System.err.println("Błąd!");
           }
       }
       sc.close();
    }
}
