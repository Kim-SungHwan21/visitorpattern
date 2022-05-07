package tmp;

public class Character extends RegularExpr {
    private final String r;

    public Character(String r) {
        this.r = r;
    }

    @Override
    public String accept(ViewVisitor visitor) {
        return visitor.visit(this);
    }

    public String getR() {
        return r;
    }
}
