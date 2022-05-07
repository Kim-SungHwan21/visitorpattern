package visitor;

public interface Visitor {
    int visit(NovelBook novelBook);
    int visit(WorkBook workBook);
}
