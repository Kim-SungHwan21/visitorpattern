package visitor;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class NovelBook implements Element {
    private int price;
    private String name;

    Map<String, Integer> store = new HashMap<>();
    {
        store.put("노인과바다", 10000);
        store.put("데미안", 20000);
    }


    public NovelBook(String bookName) {
        this.price = store.get(bookName);
    }

    @Override
    public int acceptPrice(Visitor visitor) {
        return visitor.visit(this);
    }

    public int getPrice() {
        return price;
    }
}
