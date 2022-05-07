package tmp;

public class PostOrderVisitor implements ViewVisitor {
    @Override
    public String visit(Epsilon r) {
        return "";
    }

    @Override
    public String visit(Character r) {
        return r.getR();
    }

    @Override
    public String visit(OrExpr r) {
        return "(" + r.getR1() + r.getR2() + "+)";
    }

    @Override
    public String visit(AndExpr r) {
        return "(" + r.getR1() + r.getR2() + ".)";
    }

    @Override
    public String visit(StarExpr r) {
        return r.getR() + "*";
    }
}
