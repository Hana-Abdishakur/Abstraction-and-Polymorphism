public class Parent {
    int age;
    String name;

    public Parent(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void showDetails() {
        System.out.println("age: " + age + ", name: " + name);
    }

    public void display() {
        System.out.println("Its a final class and cannot be extended.");
    }
}