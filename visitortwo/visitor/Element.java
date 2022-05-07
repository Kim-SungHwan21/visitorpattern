package visitor;

public interface Element {
    int accept(Visitor visitor);
}
