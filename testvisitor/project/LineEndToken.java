package project;

public class LineEndToken implements Element {
    public String lineEnd = "\n";

    public void accept(ILineTokenVisitor visitor) {
        visitor.visit(this);
    }
}