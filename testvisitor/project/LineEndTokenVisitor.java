package project;

public class LineEndTokenVisitor implements ILineTokenVisitor {
    @Override
    public void visit(LineEndToken lineEndToken) {
        System.out.println("<br>");
    }
}
