package functional.im;

import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        System.out.println(incByOne.apply(1));
        System.out.println(incByOne.apply(2));
    }

    static Function<Integer, Integer> incByOne = num -> num + 1;
}
