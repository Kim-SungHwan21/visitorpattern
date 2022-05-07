package tmp;

public class StarExpr extends RegularExpr {
    String r;

    public StarExpr(String r) {
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
