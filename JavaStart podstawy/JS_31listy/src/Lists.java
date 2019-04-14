import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {

        ArrayList<Integer> ints = new ArrayList<>();

        for(int i=0; i<100;i++){
            ints.add(i);
        }

        System.out.println("ints.get(50)= "+ints.get(50));
        System.out.println("Ilość elementów na liście : "+ints.size());
        System.out.println("Czyszczę tablicę");
        ints.clear();
        System.out.println("Ilość elementów na liście: "+ints.size());

//        Integer[] intes = {5, 10, 15};
//        List<Integer> lista = Arrays.asList(intes);
//
//        for(Integer num: lista){
//            System.out.println(num);
//        }

        List<Integer> lista = List.of(5, 10, 15);
        for(Integer num: lista){
            System.out.println(num);
        }

    }
}
