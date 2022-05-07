package visitor;

public interface Visitor {
    int visit(BagElement bagElement);
    int visit(ShoesElement shoesElement);
}
