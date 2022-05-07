package element;

import visitor.Visitor;

public interface Element {
    String accept(Visitor visit);
    int getPrice();
    String getPart();
}
