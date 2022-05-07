package visitor;

public class ShoesElement implements Element {

    private final String name;
    private final int size;
    private final int price;

    public ShoesElement(int price, String name, int size) {
        this.name = name;
        this.size = size;
        this.price = price;
    }

    @Override
    public int accept(Visitor visitor) {
        return visitor.visit(this);
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public int getPrice() {
        return price;
    }
}
