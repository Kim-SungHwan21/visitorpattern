package project;

public class Main {
    public static void main(String[] args) {
        KeyWordToken keyWord = new KeyWordToken();
        IKeyWordTokenVisitor visitor = new KeyWordTokenVisitor();
        keyWord.accept(visitor);

        LineEndToken lineEnd = new LineEndToken();
        ILineTokenVisitor lineEndVisitor = new LineEndTokenVisitor();
        lineEnd.accept(lineEndVisitor);
    }
}
