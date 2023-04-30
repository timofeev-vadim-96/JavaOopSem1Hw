public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    public Dog(String name, int legs, int eyes, String color) {
        super(name, legs, eyes, color);
    }

    public Dog() {
        super();
    }
    public void speak() {
        System.out.println("Гав!)");
    }
    public void toFly(){
        System.out.print(this.getName() + " не умеет летать, потому что он (она) " + this.getType() +
                ", поэтому ");
        super.toGo();
    }
}
