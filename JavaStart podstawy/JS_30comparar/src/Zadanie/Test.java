package Zadanie;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {

        Integer[] table = {2,4,7,453,555,4356,12,435,67,4325,234,1,12,3,54,54,65,1298,211,56};

        Arrays.toString(table);

        System.out.println("Posortowane:");
        Arrays.sort(table);
        System.out.println(Arrays.toString(table));

        Arrays.sort(table, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -(o1.compareTo(o2));
            }
        });

        System.out.println("posortowane malejaco");
        System.out.println(Arrays.toString(table));

    }
}
