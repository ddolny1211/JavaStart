import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class PersonGenerator {
    public static void main(String[] args) {

        List<Person> persons = generate(10, Person::new);
        persons.forEach(System.out::println);
    }

    private static <T> List<T> generate(int num, Supplier<T> sup){
        List<T> result = new ArrayList<>();
        for(int i=0;i<num;i++){
            result.add(sup.get());
        }
        return result;
    }
}
