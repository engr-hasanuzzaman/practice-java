package darek.tutorial;

// logical operator
public class LessonThree {
    public static void main(String[] args) {
        int age = 10;

        switch (age) {
            case 1:
            case 2:
            case 30:
                System.out.println("Infant");
            case 4:
            case 5:
            case 6:
                System.out.println("Baby");
            default:
                System.out.println("Baby");
        }
    }
}
