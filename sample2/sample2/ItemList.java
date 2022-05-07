package com.nhnacademy.sample2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ItemList implements Unit{
    private List<Unit> list = new ArrayList<>();

    public void add(Unit unit){
        list.add(unit);
    }

    @Override
    public void accept(Visitor visitor) {
        Iterator<Unit> iter = list.iterator();

        while (iter.hasNext()){
            Unit unit = iter.next();
            visitor.visit(unit);
        }
    }
}
