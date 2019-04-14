package Zadanie;

import java.util.HashMap;
import java.util.Scanner;

public class CompanyApp {
    private static Scanner sc = new Scanner(System.in);
    private static final int ADD = 1;
    private static final int SEARCH = 2;
    private static final int EXIT = 0;

    private static Company company = new Company();
    public static void main(String[] args) {

        //company.add("1", new Employee("Tomek","Raciborz",2900));

        int option = -1;
        String name, lname;
        double sal;

        printOptions();

        while(option!=EXIT){
            option=sc.nextInt();
            sc.nextLine();
            switch(option){
                case ADD:
                    System.out.println("Podaj imie pracownika: ");
                    name = sc.nextLine();
                    System.out.println("Podaj nazwisko pracownika: ");
                    lname = sc.nextLine();
                    System.out.println("Podaj wyplate: ");
                    sal = sc.nextDouble();
                    company.add(name + lname, new Employee(name, lname, sal));
                    printOptions();
                    break;
                case SEARCH:
                    System.out.println("Podaj imie pracownika: ");
                    name = sc.nextLine();
                    System.out.println("Podaj nazwisko pracownika: ");
                    lname = sc.nextLine();
                    company.search(name, lname);
                    printOptions();
                    break;
                case EXIT:
                    System.out.println("Koniec programu");
                    break;
                default:
                    System.out.println("Błedna opcja!");
            }
        }

    }
    static void printOptions(){
        System.out.println("1 - dodaj pracownika");
        System.out.println("2 - wyszukaj pracownika");
        System.out.println("0 - wyjdz");
    }
}
