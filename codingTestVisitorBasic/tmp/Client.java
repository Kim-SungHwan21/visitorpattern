package tmp;

public class Client {
    public static void main(String[] args) {
        ViewVisitor inOrder = new InOrderVisitor();
        ViewVisitor preOrder = new PreOrderVisitor();
        ViewVisitor postOrder = new PostOrderVisitor();

        RegularExpr characterA = new Character("a");
        RegularExpr characterB = new Character("b");

        RegularExpr or = new OrExpr(characterA.accept(inOrder), characterB.accept(inOrder));
        RegularExpr and = new AndExpr(characterA.accept(inOrder), or.accept(inOrder));
        RegularExpr star = new StarExpr(and.accept(inOrder));

        RegularExpr or1 = new OrExpr(characterA.accept(preOrder), characterB.accept(preOrder));
        RegularExpr and1 = new AndExpr(characterA.accept(preOrder), or1.accept(preOrder));
        RegularExpr star1 = new StarExpr(and1.accept(preOrder));

        RegularExpr or2 = new OrExpr(characterA.accept(postOrder), characterB.accept(postOrder));
        RegularExpr and2 = new AndExpr(characterA.accept(postOrder), or2.accept(postOrder));
        RegularExpr star2 = new StarExpr(and2.accept(postOrder));

        System.out.println(star.accept(inOrder));
        System.out.println(star1.accept(preOrder));
        System.out.println(star2.accept(postOrder));
    }
}
