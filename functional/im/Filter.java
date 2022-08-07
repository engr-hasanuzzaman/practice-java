package functional.im;

import java.util.ArrayList;
import java.util.List;

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
            new Person("santo", GENDER.MALE)
        );

        List<Person> females = new ArrayList<>();
        for (Person person : persons) {
            if (person.gender == GENDER.FEMALE) {
                females.add(person);
            }
        }

        System.out.println(females);
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
            // TODO Auto-generated method stub
            return name + "-" + gender;
        }
    }
}
