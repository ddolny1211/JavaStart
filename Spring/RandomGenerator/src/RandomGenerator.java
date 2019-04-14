import java.util.*;

public class RandomGenerator {
    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();
        Random rand = new Random();

        for (int i = 0; i < 5; i++) {
            list.add(i);
        }

        Collections.shuffle(list);
        Scanner sc = new Scanner(System.in);

        int option = -1;
        sc.nextLine();
        for(Integer num: list){
            System.out.println("Wylosowano zadanie numer "+num);
            sc.nextLine();
        }
    }
}
