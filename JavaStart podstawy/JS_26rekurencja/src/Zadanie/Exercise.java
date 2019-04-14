package Zadanie;

public class Exercise {
    public static void main(String[] args) {
        int number = factorial(5);
        System.out.println(number);
    }

    static int factorial(int n){
        return n>1 ? n*factorial(n-1): n;
    }
}
