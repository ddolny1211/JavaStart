import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NumberStreams {
    private static final int DIVIDIER=10;
    public static void main(String[] args) {

        //Stream<Integer> numSteram = Stream.iterate(0, x->x+1);
        //lista kwadratów kolejnych 100 liczb całkowitych
        List<Integer> squareNumbers = IntStream.range(0,100).map(NumberStreams::square)
                .limit(100)
                .boxed()
                .collect(Collectors.toList());
        //zbior kwadratów liczb
        Set<Integer> biggerThan5 = squareNumbers.stream().filter(NumberStreams::isDividedBy)
                .map(NumberStreams::divide)
                .collect(Collectors.toCollection(TreeSet<Integer>::new));

        System.out.println("List: ");
        squareNumbers.forEach(x -> System.out.print(x+ " ; "));
        System.out.println("\nSet");
        biggerThan5.forEach(x-> System.out.print( x+ " ; "));
    }

    private static int square(int x){
        return x*x;
    }
    private static boolean isDividedBy(int x){
        return x%DIVIDIER == 0;
    }
    private static int divide(int x){
        return x/DIVIDIER;
    }
}
