public class Sofa extends Furniture {

    protected Enum type;

    public Sofa(String name, int price, Enum type) {
        super(name, price);
        this.type = type;
    }

    @Override
    public String toString() {
        return name + ", " + price + " usd";
    }
}
