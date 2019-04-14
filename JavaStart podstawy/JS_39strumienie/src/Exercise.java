import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise {
    public static void main(String[] args) {

        Stream<Integer> nums = Stream.iterate(0, x -> x+1);
        List<Integer> numbers = nums.filter(x -> x>100 && x<1000 && x%5==0)
                .limit(10).collect(Collectors.toList());

        numbers.forEach(x -> System.out.print(x*3+" ; "));
    }
}
