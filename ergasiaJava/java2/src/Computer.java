public class Computer {
    private String name;
    private double price;
    private int Mhz;

    public Computer(String text,double amount,int speed){
        name = text;
        price = amount;
        Mhz = speed;
    }

    public double getPrice(){
        return price;
    }

    public String getName() {
        return name;
    }

    public int getMhz() {
        return Mhz;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", Mhz=" + Mhz +
                '}';
    }
}
