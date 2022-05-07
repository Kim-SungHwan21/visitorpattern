package project.element;

import project.visitor.Visitor;

public class Apple implements Element {
    private String name;
    private int amount;
    private int price;

    public Apple(String name, int amount, int price) {
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
