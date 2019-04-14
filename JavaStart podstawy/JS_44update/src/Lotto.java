import java.util.*;

public class Lotto {
    public static void main(String[] args) {
        Random rand = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < 50; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
        List<Integer> lottoResult = list.subList(0, 6);

        System.out.println("Wynik losowania: ");
        for (int i : lottoResult) {
            System.out.print(i + " ");
        }
    }
}