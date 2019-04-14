import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PersonDatabase {
    private List<Person> people = new ArrayList<>();

    public void add(Person person){
        if(person==null){
            throw new NullPointerException("Cannot add null reference");
        }
        if(findByld(person.getId()).isEmpty()){
            throw new IllegalArgumentException("Object with such ID already exists.");
        }
        people.add(person);
    }

    public Optional<Person> findByld(int id){
        for(Person person: people){
            if(person.getId()==id){
                return Optional.of(person);
            }
        }
        return Optional.empty();
    }

    public String findLastNameByld(int id){
        for(Person person: people){
            if(person.getId()==id)
                return person.getLastName();
        }
        return "Anonim";
    }
}
