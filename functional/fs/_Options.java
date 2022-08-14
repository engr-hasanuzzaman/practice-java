package functional.fs;

import java.util.Optional;

public class _Options {

    public static void main(String[] args) {
        Person man = new Person("Hasan", "Zaman");
        Person noLname = new Person("Hasan", null);
        man.getlName().ifPresentOrElse(lName -> System.out.println("last name is " + lName), () -> System.out.println("Default lname"));
        noLname.getlName().ifPresentOrElse(lName -> System.out.println("last name is " + lName), () -> System.out.println("Default lname"));
    }
   
}

/**
 * Inner_Options
 */
class Person {
    private String fName;
    private String lName;
    private int age;

    public int getAge() {
        return age;
    }

    public Optional<String> getlName() {
        return Optional.ofNullable(lName);
    }

    public String getfName() {
        return fName;
    }

    public Person(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }
}
