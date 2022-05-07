package com.nhnacademy.midterm.element;

import com.nhnacademy.midterm.visitor.Visitor;

public class AnnotationToken implements TokenElement {
    public String annotation;

    @Override
    public void accept(Visitor visior) {
        visior.visit(this);
    }
}
