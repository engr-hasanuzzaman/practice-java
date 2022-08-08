package functional.im;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    enum GENDER {
        MALE, FEMALE;
    };

    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person("hasan", GENDER.MALE),
                new Person("salma", GENDER.FEMALE),
                new Person("shila", GENDER.FEMALE),
                new Person("sumi", GENDER.FEMALE),
                new Person("eti", GENDER.FEMALE),
                new Person("santo", GENDER.MALE));

        List<Person> females = new ArrayList<>();
        for (Person person : persons) {
            if (person.gender == GENDER.FEMALE) {
                females.add(person);
            }
        }

        // declarative ways to filter
        persons.stream().filter(p -> p.gender == GENDER.FEMALE);
        System.out.println(persons.stream().filter(p -> p.gender == GENDER.FEMALE).collect(Collectors.toList()));

        // with function ref
        persons.stream().filter(p -> p.gender == GENDER.FEMALE).forEach(System.out::print);
    }

    static class Person {
        private String name;
        private GENDER gender;

        public Person(String name, GENDER gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return name + "-" + gender;
        }
    }
}
