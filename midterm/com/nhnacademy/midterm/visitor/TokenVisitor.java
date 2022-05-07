package com.nhnacademy.midterm.visitor;

import com.nhnacademy.midterm.element.AnnotationToken;
import com.nhnacademy.midterm.element.KeywordToken;
import com.nhnacademy.midterm.element.LineEndToken;
import com.nhnacademy.midterm.element.StringToken;

public class TokenVisitor implements Visitor {

    @Override
    public void visit(KeywordToken keyword) {
        //키워드에 포함된문자가 있으면 실행하는 조건문 추가

        for(String word : keyword.keywords) {
            System.out.print("<font color='blue'>");
            System.out.print(word);
            System.out.print("</font>");
        }
    }

    @Override
    public void visit(LineEndToken lineEndToken) {
        String lineEnd = "\n";
        System.out.println("<br>");
    }

    @Override
    public void visit(StringToken stringToken) {
        //키워드에 ',"표가 있으면 초록색을 입히는 비지터 추가
//        System.out.print("<font color='green'>");
//        System.out.print();
//        System.out.print("</font>");
    }

    @Override
    public void visit(AnnotationToken annotationToken) {
//        System.out.print("<font color='gray'>");
//        System.out.print();
//        System.out.print("</font>");
    }
}
