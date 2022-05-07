package visitor;

public class GuestVisitor implements Visitor {

    @Override
    public int visit(NovelBook novelBook) {
        return (int) (novelBook.getPrice() * 0.95);
    }

    @Override
    public int visit(WorkBook workBook) {
        return (int) (workBook.getPrice() * 0.95);
    }
}

