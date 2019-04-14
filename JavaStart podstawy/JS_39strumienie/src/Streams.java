import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
//        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//        numbers = numbers.stream()
//                .filter(x -> x%2==0 && x>5)
//                .collect(Collectors.toCollection(ArrayList::new));
//        numbers.forEach(System.out::println);
//
//        Stream<String> strings = Stream.of("a","bb","ccc","dddd","eeeee","ffffff","ggggggg");
//        List<String> stringList = strings.peek(System.out::println)
//        .map(String::toUpperCase).peek(System.out::println).collect(Collectors.toList());

        Stream<Integer> numStream = Stream.iterate(0, x-> x+1);
        //lista 100 pierwszych liczb podzielnych na 2
        List<Integer> nums = numStream.filter(x -> x%2==0).limit(100).collect(Collectors.toList());

        //lista kwadratów  kolejnych 100 liczb całkowitych
        //List<Integer> squareNums = numStream.map(x -> x*x).limit(100).collect(Collectors.toList());

        //lista 100 liczb ujemnych w kolejności malejącej
        //List<Integer> negativeNums = numStream.map(x->-x).limit(100).collect(Collectors.toList());

        nums.forEach(x -> System.out.print(x+" ; "));


    }
}
