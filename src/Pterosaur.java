public class Pterosaur extends Animal{
    @Override
    public void speak() {
        System.out.println("Арр..)");
    }

    public Pterosaur(String name, int eyes, String color) {
        super(name, 2, eyes, color);
    }

    public Pterosaur(String name) {
        super(name, 2, 2, "Gray");
    }

    public Pterosaur() {
        super("name", 2, 2, "Black");
    }
    public void toSwim(){
        System.out.print(this.getName() + " не умеет плавать, потому что он (она) " + this.getType() +
                ", поэтому ");
        super.toFly();
    }
}
