package visitor;

public class MemberVIsitor implements Visitor {

    @Override
    public int visit(NovelBook novelBook) {
        return (int) (novelBook.getPrice() * 0.90);
    }

    @Override
    public int visit(WorkBook workBook) {
        return (int) (workBook.getPrice() * 0.90);
    }
}
