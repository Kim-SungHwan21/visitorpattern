package com.nhnacademy.midterm.element;


import com.nhnacademy.midterm.visitor.Visitor;

public final class LineEndToken implements TokenElement {
    public String lineEnd = "\n";

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
