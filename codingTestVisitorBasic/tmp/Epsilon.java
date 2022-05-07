package tmp;

public class Epsilon extends RegularExpr {
    public boolean Epsilon(String r) {
        return r == null || r.trim().isEmpty();
    }

    @Override
    public String accept(ViewVisitor visitor) {
        return visitor.visit(this);
    }
}
