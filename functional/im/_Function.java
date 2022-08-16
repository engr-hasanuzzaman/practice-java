package functional.im;

import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        System.out.println(incByOne.apply(1));
        System.out.println(incByOne.apply(2));

        // existing method chaining
        System.out.println(incByOne.andThen(mulBy2).apply(2));

        // called the chained method
        System.out.println(incByOneAndMulBy2.apply(2));
    }

    static Function<Integer, Integer> incByOne = num -> num + 1;
    static Function<Integer, Integer> mulBy2 = num -> num * 2;
    // create a new method using methods chaining
    static Function<Integer, Integer> incByOneAndMulBy2 = incByOne.andThen(mulBy2);
}
