package Zadanie;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class TaskManager {
    private final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        Queue<Task> tasks = new PriorityQueue<>();
        int option=-1;

        while(option!=0){
            printOptions();
            option=sc.nextInt();
            sc.nextLine();
            switch(option){
                case 1:
                    tasks.offer(readAndCreateTask());
                    break;
                case 2:
                    if(tasks.isEmpty()){
                        System.out.println("Brak zadań!");
                    }else{
                        Task nextTask = tasks.poll();
                        System.out.println("Zadanie do wykonania: ");
                        System.out.println(nextTask);
                    }
                    break;
                case 0:
                    System.out.println("Zamykam program");
                    break;
                default:
                    System.out.println("błędna opcja!");
            }
        }
    }
    static void printOptions(){
        System.out.println("1 - Dodaj zadanie");
        System.out.println("2 - wyświetl zadanie o najwyższym priorytecie");
        System.out.println("0 - zakończ program");
    }
    static Task readAndCreateTask(){
        System.out.println("Nazwa: ");
        String name=sc.nextLine();
        System.out.println("Opis: ");
        String desc=sc.nextLine();
        System.out.println("Priorytet [LOW, MODERATE, HIGH]: ");
        Task.Priority priority = Task.Priority.valueOf(sc.nextLine().toUpperCase());
        System.out.println("Zadanie zostało dodane");

        return new Task(name, desc, priority);
    }
}
