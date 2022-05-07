package com.nhnacademy.sample2;

public class SumVisitor implements Visitor{
    private int sum = 0;

    public int getValue(){
        return sum;
    }

    @Override
    public void visit(Unit unit) {
        if(unit instanceof Item){
            sum+= ((Item) unit).getValue();
        }else{
            unit.accept(this);
        }
    }


}
