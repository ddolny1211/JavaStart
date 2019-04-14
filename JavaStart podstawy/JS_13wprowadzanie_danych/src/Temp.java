import java.util.Scanner;
public class Temp {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        input.nextLine();

        String word = input.nextLine();

        input.close();

        System.out.println(number);
        System.out.println(word);
    }
}
