package Zadanie;

import java.util.Scanner;

public class Zadanie {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ile wyrazów chcesz wprowadzić?: ");
        int wordsNumber=input.nextInt();
        input.nextLine();

        String[] words = new String[wordsNumber];
        String element;

        for(int i=0;i<wordsNumber;i++){
            System.out.println("Podaj wyraz "+i);
            words[i]=input.nextLine();
        }
        StringBuilder builder = new StringBuilder();

        for(int i=0;i<wordsNumber;i++){
            builder.append(words[i].charAt(words[i].length()-1));
        }
        builder.toString();
        System.out.println(builder);

    }
}
