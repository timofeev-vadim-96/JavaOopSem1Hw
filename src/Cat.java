public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    public Cat(String name, int legs, int eyes, String color) {
        super(name, legs, eyes, color);
    }
    private void toWakeUp(){
        System.out.println("Кот проснулся");
    }
    private void findFood(){
        System.out.println("Кот ищет еду");
    }
    public void sleep(){
        System.out.println("Кот спит");
    }
    private void eat(){
        System.out.println("Кот ест");
    }
    public void play(){
        System.out.println("Кот играет");
    }
    public void hunt(){
        toWakeUp();
        findFood();
        eat();
    }

    public Cat() {
        super();
    }

    @Override
    public void speak() {
        System.out.println("Мяууууу)");
    }

    @Override
    public void toFly(){
        System.out.print(this.getName() + " не умеет летать, потому что он (она) " + this.getType() +
                ", поэтому ");
        super.toGo();
    }
    public void toSwim(){
        System.out.print(this.getName() + " не умеет плавать, потому что он (она) " + this.getType() +
                ", поэтому ");
        super.toGo();
    }
}
