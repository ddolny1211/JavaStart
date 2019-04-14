package Zadanie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Witold");
        names.add("Ambroży");
        names.add("Karol");
        names.add("Tomasz");
        names.add("Eustachy");

        Collections.sort(names, String::compareToIgnoreCase);
        names.forEach(System.out::println);


    }
    private static int sort(String s1, String s2){
        return s1.compareTo(s2);
    }
}
