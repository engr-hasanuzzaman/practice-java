package functional.im;

import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        pr.accept("sumon");
    }

    // consumer will have side effect
    private static Consumer pr = name -> System.out.println("My name is " + name);
}
