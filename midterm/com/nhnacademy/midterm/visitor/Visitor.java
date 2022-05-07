package com.nhnacademy.midterm.visitor;

import com.nhnacademy.midterm.element.AnnotationToken;
import com.nhnacademy.midterm.element.KeywordToken;
import com.nhnacademy.midterm.element.LineEndToken;
import com.nhnacademy.midterm.element.StringToken;


public interface Visitor {
    //String toString();
    void visit(KeywordToken keywordToken);
    void visit(LineEndToken lineEndToken);
    void visit(StringToken stringToken);
    void visit(AnnotationToken annotationToken);
}
