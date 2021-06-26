public class Laptop extends Computer{

    double weight;

    public Laptop(String text, double amount, int speed, double weight) {
        super(text, amount, speed);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "name='" + this.getName() + '\'' +
                ", price=" + this.getPrice() +
                ", Mhz=" + this.getMhz() +
                ", weight=" + weight +
                '}';
    }
}
