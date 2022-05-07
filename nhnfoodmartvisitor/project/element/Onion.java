package project.element;

import project.visitor.Visitor;

public class Onion implements Element {
    private String name;
    private int amount;
    private int price;

    public Onion(String name, int amount, int price) {
        this.name = name;
        this.amount = amount;
        this.price = price;
    }



    @Override
    public int accept(Visitor visitor) {
        return visitor.visit(this);
    }

    public int getPrice() {
        return this.price;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }
}
