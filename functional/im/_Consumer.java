package functional.im;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        pr.accept("sumon");
        printAge.accept(new Person("Sumon", 20), false);
        printAge.accept(new Person("Sumon", 20), true);
    }

    // consumer will have side effect
    private static Consumer pr = name -> System.out.println("My name is " + name);
    private static BiConsumer<Person, Boolean> printAge = (Person p, Boolean print) -> {
        if (print) {
            System.out.println("The person name and age is: " + p.name + ", " + p.age);
        } else {
            System.out.println("The person name " + p.name);
        }
    };

}

class Person {
    public int age;
    public String name;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
