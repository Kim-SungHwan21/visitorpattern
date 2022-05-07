package project;

public class KeyWordToken implements Element {
    public String[] keywords = new String[] {
        "public",
        "static",
        "void",
        "abstract",
        "interface"
    };

    public void accept(IKeyWordTokenVisitor visitor) {
        visitor.visit(this);
    }
}
