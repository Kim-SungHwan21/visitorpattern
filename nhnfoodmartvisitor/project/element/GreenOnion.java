package project.element;

import project.visitor.Visitor;

public class GreenOnion implements Element {
    private String name;
    private int amount;
    private int price;

    public GreenOnion(String name, int amount, int price) {
        this.name = name;
        this.amount = amount;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public int accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
