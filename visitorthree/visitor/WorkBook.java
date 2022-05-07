package visitor;

import java.util.HashMap;
import java.util.Map;

public class WorkBook implements Element {

    Map<String, Integer> store = new HashMap<>();
    {
        store.put("수학문제집", 20000);
        store.put("영어문제집", 10000);
    }

    private int price;
    private String bookName;

    public WorkBook(String bookName) {
        this.price = store.get(bookName);
    }

    @Override
    public int acceptPrice(Visitor visitor) {
        return visitor.visit(this);
    }

    public int getPrice() {
        return this.price;
    }
}
