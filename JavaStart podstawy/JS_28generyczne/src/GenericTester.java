public class GenericTester {
    public static void main(String[] args) {
        //definiujemy kontener przechwoujący liczby całkowite
        Container<Integer> integers = new Container<Integer>();
        //przypisujemy nową tablicę typu Integer
        integers.setArray(new Integer[5]);
        //do pierwszego elementu przypisujemy liczbę 5
        integers.getArray()[0]=5;

        //tworzymy kontener przechowujący obiekty typu String
        Container<String> strings = new Container<String>();
        //przypisujemy tablicę typu String
        strings.setArray(new String[10]);
        //przypisujemy 1 i 2 element do tablicy
        strings.getArray()[0]="Ania";
        strings.getArray()[1]="Basia";

        //odczytanie danych bez konieczności rzutowania!
        Integer num = integers.get(0);
        String str = strings.get(0);

        //wyświetlanie zawartości

        System.out.println(num);
        System.out.println(str);
    }
}
