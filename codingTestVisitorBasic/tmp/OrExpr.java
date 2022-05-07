package tmp;

public class OrExpr extends RegularExpr {
    private String r1;
    private String r2;

    public OrExpr(String r1, String r2) {
        this.r1 = r1;
        this.r2 = r2;
    }

    @Override
    public String accept(ViewVisitor visitor) {
        return visitor.visit(this);
    }

    public String getR1() {
        return r1;
    }

    public String getR2() {
        return r2;
    }
}
