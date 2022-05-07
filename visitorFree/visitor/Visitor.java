package visitor;

import element.NovelBookElement;
import element.WorkBookElement;

public interface Visitor {
    double visit(NovelBookElement book);
    double visit(WorkBookElement book);
}
