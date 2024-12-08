public class Main {
    public static void main(String[] args) {
        GameObject p1 = new Player("Adno", 4, 97);
        GameObject e1 = new Enemy("Zamira", 9, "Dhac");

        p1.displayDetails();
        e1.displayDetails();

        double playerValue = p1.computeValue(5);
        double enemyValue = e1.computeValue(3);

        System.out.println("Player Value: " + playerValue);
        System.out.println("Enemy Value: " + enemyValue);


    }
}