package com.nhnacademy.midterm.element;

import com.nhnacademy.midterm.visitor.Visitor;

public class StringToken implements TokenElement {

    @Override
    public void accept(Visitor visior) {
        visior.visit(this);
    }
}
