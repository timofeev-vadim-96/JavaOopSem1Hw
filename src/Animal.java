public class Animal {
    private String name;
    private int legs;
    private int eyes;
    private String color;

    public Animal(String name, int legs, int eyes, String color) {
        this.name = name;
        this.legs = legs;
        this.eyes = eyes;
        this.color = color;
    }
    public Animal(String name) {
        this(name, 4, 2, "Black");
    }
    public Animal() {
        this("name", 4, 2, "Black");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void speak(){
        System.out.println(this.getType() + " издает неопределенные звуки ;)");
    }

    public void toGo(){
        System.out.println(this.getName() + " пошел(ла)");
    }

    public void toFly(){
        System.out.println(this.getName() + " полетел(а)");
    }

    public void toSwim(){
        System.out.println(this.getName() + " поплыл(а)");
    }

    public String getType(){
        return super.getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return String.format("name: %s, legs: %s, eyes: %s, color: %s" ,name, legs, eyes, color);
    }
}
