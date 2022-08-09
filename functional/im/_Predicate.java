package functional.im;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println("Is valid phone 01723781598 " + isValidPhone.test("01723781598"));
        System.out.println("Is valid phone 01923781598 " + isValidPhone.test("01923781598"));
        System.out.println("Is valid phone 01723781598 " + isValidPhone.test("0172378159"));
    }

    private static Predicate<String> isLengthEleven = num -> num.length() == 11;
    private static Predicate<String> isStartWith07 = num -> num.startsWith("017");
    private static Predicate<String> isOnlyNumber = num -> num.matches("[0-9]+");
    private static Predicate<String> isValidPhone = num -> isLengthEleven.and(isStartWith07).and(isOnlyNumber).test(num);


}
