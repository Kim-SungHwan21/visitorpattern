package com.nhnacademy.midterm.element;


import com.nhnacademy.midterm.visitor.Visitor;

public class KeywordToken implements TokenElement{
    public String[] keywords = new String[] {
        "public",
        "class",
        "static",
        "abstract",
        "extends",
        "implements",
        "super",
        "instanceof",
        "throw",
        "throws",
        "try",
        "catch",
        "finally",
        "for",
        "do",
        "while",
        "continue",
        "break",
        "if",
        "else",
        "switch",
        "case",
        "default",
        "void",
        "return",
        "final",
        "transient",
        "volatile",
        "native",
        "synchronized",
        "interface",
        "import",
        "package",
        "new",
        "this",
        "private",
        "protected",
        "boolean",
        "char",
        "short",
        "int",
        "long",
        "float",
        "double",
        ";",
        ","
    };

    @Override
    public void accept(Visitor visior) {
        visior.visit(this);
    }
}
