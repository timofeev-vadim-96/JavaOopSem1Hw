public class Duck extends Animal{
    @Override
    public void speak() {
        System.out.println("Кря)");
    }

    public Duck(String name, int eyes, String color) {
        super(name, 2, eyes, color);
    }

    public Duck(String name) {
        super(name, 2, 2, "Gray");
    }

    public Duck() {
        super("name", 2, 2, "Black");
    }
}
