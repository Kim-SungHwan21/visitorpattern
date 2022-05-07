package project;

import project.element.Apple;
import project.element.Egg;
import project.element.Element;
import project.element.GreenOnion;
import project.element.Onion;
import project.visitor.CartVisitor;
import project.visitor.Visitor;

public class Main {
    public static void main(String[] args) {
        Element[] elements = new Element[] {
            new Onion("양파", 2, 1000),
            new Egg("계란", 5, 2000),
            new GreenOnion("파", 3, 500),
            new Apple("사과", 6, 2000),
        };

        Visitor visitor = new CartVisitor();
        int totalPrice = 0;
        for (Element element : elements) {
            totalPrice += element.accept(visitor);
        }

        System.out.println("총 금액: " + totalPrice);
    }
}
