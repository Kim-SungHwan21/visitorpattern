package tmp;

public interface ViewVisitor {
    String visit(Epsilon r);
    String visit(Character r);
    String visit(OrExpr r);
    String visit(AndExpr r);
    String visit(StarExpr r);
}
