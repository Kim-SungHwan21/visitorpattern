package visitor;

import element.NovelBookElement;
import element.WorkBookElement;

public class PayGuestVisitor implements Visitor{
    @Override
    public double visit(NovelBookElement book) {
        int price = book.getPrice() - 1000;
        return price;
    }

    @Override
    public double visit(WorkBookElement book) {
        int price = book.getPrice() - 2000;
        return price;
    }
}
