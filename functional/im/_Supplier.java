package functional.im;

import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println("You can access the following link " + localhost.get());
    }

    private static Supplier<String> localhost = () -> "http://localhost:3000";
}
