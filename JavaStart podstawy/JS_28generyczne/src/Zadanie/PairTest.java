package Zadanie;

public class PairTest {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("Napis",199);
        Pair<Double,Double> pair2 = new Pair<>(44.2,11.3);
        Pair<String, String> pair3 = new Pair<>("Kotlet","Schabowy");

        printPairs(pair1);
        printPairs(pair2);
        printPairs(pair3);
    }

    public static <T,V> void printPairs(Pair<T,V> pair){
        System.out.println("< "+pair.getT()+" ; "+pair.getV()+" >");
    }
}
