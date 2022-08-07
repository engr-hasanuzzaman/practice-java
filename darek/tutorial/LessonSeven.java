package darek.tutorial;
// import darek.tutorial.Monster;

public class LessonSeven {
    public static void main(String[] args) {
        Monster monster = new Monster();
        monster.name = "Frank";
        System.out.printf(monster.name + " has attack value " + monster.getAttack());
        System.out.println("output");
    }
}
