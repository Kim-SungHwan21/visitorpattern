package visitor;

import element.NovelBookElement;
import element.WorkBookElement;

public class PayMemberVisitor implements Visitor{
    @Override
    public double visit(NovelBookElement book) {
        return book.getPrice() * 0.9;
    }

    @Override
    public double visit(WorkBookElement book) {
        return book.getPrice() * 0.5;
    }
}
