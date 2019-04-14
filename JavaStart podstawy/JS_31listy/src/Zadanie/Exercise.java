package Zadanie;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Exercise {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        System.out.println("Podaj liczby do zsumowania, jeśli będziesz chciał zakończyć wpisz 'exit'.");

        inputNumbers(nums);
        printNumbers(nums);
    }

    static void inputNumbers(List<Integer> list){
        Scanner sc = new Scanner(System.in);
        String input=sc.nextLine();
        if(input.equals("exit")){
            return;
        }
        try{
            int num = Integer.parseInt(input);
            list.add(num);
        }catch(NumberFormatException e){
            System.err.println("Podaj liczbę!");
        }
        inputNumbers(list);
    }

    static void printNumbers(List<Integer> list){
        StringBuilder sb = new StringBuilder();
        int sum=0;
        for(Integer i: list){
            sb.append(i);
            sb.append("+");
            sum+=i;
        }
        sb.replace(sb.length()-1, sb.length(), "=");
        sb.append(sum);
        System.out.println(sb.toString());
    }
}
