package element;

import element.Element;
import visitor.Visitor;

public class WorkBookElement implements Element {
    private final String name;
    private final int price;
    private double pay = 0;
    public final String part = "work";

    public WorkBookElement(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String accept(Visitor visitor) {
        pay = visitor.visit(this);

        StringBuilder sb = new StringBuilder();
        sb.append(this.name)
            .append("책의 가격은")
            .append("원래 ")
            .append(this.price)
            .append("원 이었지만 할인되어서 최종가격이 ")
            .append(this.pay)
            .append("원 입니다.");

        return sb.toString();
    }

    public int getPrice() {
        return price;
    }

    public String getPart() {
        return part;
    }
}
