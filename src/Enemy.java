public class Enemy extends GameObject{
    String type;

    public Enemy(String name, int id, String type) {
        super(name, id);
        this.type = type;
    }

    @Override
    void displayDetails() {
        System.out.println("Enemy Name: " + name + ", ID: " + id + ", Type: " + type);
    }

}
