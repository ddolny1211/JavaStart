package Zadanie;

import java.util.*;

public class NamesIterator {
    static class Person{
        private String name;
        private String lastName;
        private int age;

        public Person(String name, String lastName, int age) {
            this.name = name;
            this.lastName = lastName;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
    public static void main(String[] args) {

        Map<String, Person> persons = new TreeMap<>();
        persons.put("Kowalski", new Person("Mariusz","Kowalski",34));
        persons.put("Ziębek", new Person("Anna","Ziębek",24));
        persons.put("Andrzejak", new Person("Tomasz","Andrzejak",50));
        persons.put("Wysocki", new Person("Stanisław","Wysocki",76));
        persons.put("Durka", new Person("Anna","Durka",28));

        Iterator<Person> personsIterator = persons.values().iterator();
        while(personsIterator.hasNext()){
            System.out.println(personsIterator.next());
        }


    }
}
