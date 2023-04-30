public class Fish extends Animal{
    public Fish(String designation) {
        super(designation, 2, 2, "Black");
    }

    public Fish(String designation, int fins, int eyes, String color) {
        super(designation, fins, eyes, color);
    }

    @Override
    public String toString() {
        return String.format("designation: %s, fins: %s, eyes: %s, color: %s" , super.getName(), getLegs(), getEyes(), getColor());
    }
    @Override

    public void toFly(){
        System.out.print(this.getName() + " не умеет летать, потому что он (она) " + this.getType() +
                ", поэтому ");
        super.toSwim();
    }
    public void toGo(){
        System.out.print(this.getName() + " не умеет ходить, потому что он (она) " + this.getType() +
                ", поэтому ");
        super.toSwim();
    }
}
