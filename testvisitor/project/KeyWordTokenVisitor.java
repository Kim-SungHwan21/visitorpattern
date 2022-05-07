package project;

public class KeyWordTokenVisitor implements IKeyWordTokenVisitor {


    @Override
    public void visit(KeyWordToken keyword) {
        for (String word : keyword.keywords) {
            System.out.println("<font color='blue'>");
            System.out.println(word);
            System.out.println("</font>");
        }
    }
}
