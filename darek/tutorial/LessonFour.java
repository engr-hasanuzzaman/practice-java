package darek.tutorial;

import java.util.Scanner;

public class LessonFour {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        // print 1 to 10 using while loop
        // int start = 1;
        // while (start <= 10) {
        //     System.out.print(start + " ");
        //     start += 1;
        // }

        LessonFour obj = new LessonFour();
        String goOn = "Y";
        
        while (goOn.equalsIgnoreCase("y")) {
            System.out.println("Enter your age: ");
            int age = Integer.parseInt(scan.nextLine());
            obj.defineLifeStage(age);
            System.out.println("To continue press Y/y or any other key to exit");
            goOn = scan.nextLine();
        }
    }

    public void defineLifeStage(int age) {
        if (age < 5) {
            System.out.println("You are baby");
        } else if(age < 10) {
            System.out.println("You are child");
        } else if (age < 18) {
            System.out.println("You are teenage");
        } else if (age < 30) {
            System.out.println("Enjoy your time!");
        } else {
            System.out.println("Wait for your death...........");
        }
    }
}
