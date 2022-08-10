package functional.im;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println("You can access the following link " + localhost.get());
        System.out.println("All the links " + urls.get());
    }

    private static Supplier<String> localhost = () -> "http://localhost:3000";
    private static Supplier<List<String>> urls = () -> List.of("http://localhost:3000");
}
