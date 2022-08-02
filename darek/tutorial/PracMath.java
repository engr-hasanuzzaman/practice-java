package darek.tutorial;

import java.util.Scanner;

public class PracMath {
    private static Scanner numScanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter you favorite number");
        if (!numScanner.hasNextInt()) {
            System.out.println("Enter number next time");
            System.exit(1);
        }

        int favNum = numScanner.nextInt();
        System.out.println("Your number is " + favNum);
        System.out.println("Double of your number is " + favNum * 2);

        System.out.println(favNum + " + " + 2 + " : " + (favNum + 2));
        System.out.println(favNum + " - " + 2 + " : " + (favNum - 2));
        System.out.println(favNum + " / " + 2 + " : " + (favNum / 2));
        System.out.println(favNum + " * " + 2 + " : " + (favNum * 2));

        System.out.println("Next random nuber " + (int)(Math.random() * 11));
        System.out.println("Floor of 5.5 " + Math.ceil(5.5));
        System.out.println("Ceil of 5.5 " + Math.floor(5.5));
        System.out.println("Next random nuber " + (int)(Math.random() * 11));
        System.out.println("Max int number " + Integer.MAX_VALUE);
        System.out.println("Max float number " + Float.MAX_VALUE);
        System.out.println("Max double number " + Double.MAX_VALUE);
        System.out.println("Max long number " + Long.MAX_VALUE);
    }
}
