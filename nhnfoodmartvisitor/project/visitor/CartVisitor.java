package project.visitor;

import project.element.Apple;
import project.element.Egg;
import project.element.GreenOnion;
import project.element.Onion;

public class CartVisitor implements Visitor {


    @Override
    public int visit(Onion onion) {
        System.out.println("상품이름: " + onion.getName() + " 수량: " + onion.getAmount() + " 가격: " + onion.getPrice());
        return onion.getPrice() * onion.getAmount();
    }

    @Override
    public int visit(Egg egg) {
        System.out.println("상품이름: " + egg.getName() + " 수량: " + egg.getAmount() + " 가격: " + egg.getPrice());
        return egg.getPrice() * egg.getAmount();
    }

    @Override
    public int visit(GreenOnion greenOnion) {
        System.out.println("상품이름: " + greenOnion.getName() + " 수량: " + greenOnion.getAmount() + " 가격: " + greenOnion.getPrice());
        return greenOnion.getPrice() * greenOnion.getAmount();
    }

    @Override
    public int visit(Apple apple) {
        System.out.println("상품이름: " + apple.getName() + " 수량: " + apple.getAmount() + " 가격: " + apple.getPrice());
        return apple.getPrice() * apple.getAmount();
    }
}
