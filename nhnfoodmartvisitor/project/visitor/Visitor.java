package project.visitor;

import project.element.Apple;
import project.element.Egg;
import project.element.GreenOnion;
import project.element.Onion;

public interface Visitor {
    int visit(Onion onion);
    int visit(Egg egg);
    int visit(GreenOnion greenOnion);
    int visit(Apple apple);
}