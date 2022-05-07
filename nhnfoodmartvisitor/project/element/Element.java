package project.element;

import project.visitor.Visitor;

public interface Element {
    int accept(Visitor visitor);
}
