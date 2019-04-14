package Zadanie;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Exerise {
    public static void main(String[] args) {

        List<Integer> ints = new ArrayList<>();
        Random rand = new Random();
        generate(ints,()->rand.nextInt(1000));
        consume(ints, x-> System.out.println(x));
        System.out.println(">>>");
        filterPredicate(ints, i -> i%2==0);
        consume(ints, x-> System.out.println(x));

    }
    private static <T> void filterPredicate(List<T> list, Predicate<T> pre){
        Iterator<T> it = list.iterator();
        while(it.hasNext()){
            T tmp = it.next();
            if(pre.test(tmp)){
                it.remove();
            }
        }
    }

    private static <T> void generate(List<T> list, Supplier<T> sup){
        for(int i = 0; i<10; i++){
            list.add(sup.get());
        }
    }

    private static <T> void consume(List<T> list, Consumer<T> con){
        for(T t:list){
            con.accept(t);
        }
    }

}
