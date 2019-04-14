import java.util.Optional;

public class PersonTest {
    public static void main(String[] args) {
        PersonDatabase db = new PersonDatabase();
        db.add(new Person(1, "Jan","Kowalski"));
        db.add(new Person(2, "Karol","Zawadzki"));
        db.add(new Person(3, "Bartosz","Abacki"));
        db.add(new Person(4, "Ania","Walczak"));
        db.add(new Person(5, "Zbigniew","Wodecki"));

        db.findByld(2).ifPresent(PersonTest::printLastName);
        Optional<Person> optPerson = db.findByld(55);

        optPerson.ifPresent(PersonTest::printLastName);
        optPerson.ifPresentOrElse(
                PersonTest::printLastName,
                ()-> System.out.println("Brak obiektu o wskazanym ID")
        );
    }
    private static void printLastName(Person person){
        System.out.println(person.getLastName());
    }
}
