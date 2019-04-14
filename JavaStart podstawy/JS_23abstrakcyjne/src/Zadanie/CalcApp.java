package Zadanie;

import java.util.Scanner;

public class CalcApp {
    public static void main(String[] args) {
        Rectange rectange = new Rectange(10,5);
        Triangle triangle = new Triangle(10,5);
        Circle circle = new Circle(5);

        Scanner sc = new Scanner(System.in);

        int check = -1;

        while(check!=0){
            System.out.println("Liczymy obwód i pole:");
            System.out.println("Koło - 1");
            System.out.println("Trójkąt - 2");
            System.out.println("Prostoką† - 3");
            System.out.println("Koniec programu - 0");
            check = sc.nextInt();
            sc.nextLine();
            switch(check){
                case 1:
                    System.out.println("Obwód koła wynosi "+circle.calculatePerimeter());
                    System.out.println("Pole koła wynosi "+circle.calculateArea());
                    break;
                case 2:
                    System.out.println("Obwód trójkąta wynosi "+triangle.calculatePerimeter());
                    System.out.println("Pole trójkąta wynosi "+triangle.calculateArea());
                    break;
                case 3:
                    System.out.println("Obwód prostokąta wynosi "+rectange.calculatePerimeter());
                    System.out.println("Pole prostokąta wynosi "+rectange.calculateArea());
                    break;
                default:
                    System.out.println("Nie ma takiej opcji, wprowadź ponownie");
            }
        }

    }


}
