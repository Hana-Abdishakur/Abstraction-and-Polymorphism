public class Player extends GameObject {
    int score;

    public Player(String name, int id, int score) {
        super(name, id);
        this.score = score;
    }
    @Override
    void displayDetails() {
        System.out.println("Player Name: " + name + ", ID: " + id + ", Score: " + score);
    }


}