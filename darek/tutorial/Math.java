package darek.tutorial;

import java.util.Scanner;

public class Math {
    private static Scanner numScanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter you favorite number");
        if (!numScanner.hasNextInt()) {
            System.out.println("Enter number next time");
            System.exit(1);
        }

        int favNum = numScanner.nextInt();
        System.out.println("Your number is " + favNum);
    }
}
