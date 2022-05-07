package com.nhnacademy.midterm.element;

import com.nhnacademy.midterm.visitor.Visitor;

public interface TokenElement {
    void accept(Visitor visior);
}
