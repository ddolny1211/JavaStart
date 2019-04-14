import java.util.HashSet;
import java.util.Set;

public class PersonSet {
    public static void main(String[] args) {
        HashSet<Person> persons = new HashSet<>();

        persons.add(new Person("Jan","Kowalski"));
        persons.add(new Person("Jan","Kowalski"));
        persons.add(new Person("Ania","Kawalec"));
        persons.add(new Person("Ania","Kawalec"));
        persons.add(new Person("Szymon","Zalewski"));

        System.out.println("Persons.size(): "+persons.size());
        System.out.println("contains Jan Kowalski?: "+persons.contains(new Person("Jan","Kowalski")));
        persons.remove(new Person("Ania","Kawalec"));
        System.out.println("Persons.size(): "+persons.size());

        Set<String> names = Set.of("Marek","Kasia","Karol","Basia");
        for(String name: names){
            System.out.println(name);
        }
    }
}
