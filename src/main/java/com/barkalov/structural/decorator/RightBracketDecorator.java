package com.barkalov.structural.decorator;

public class RightBracketDecorator extends Decorator {

    public RightBracketDecorator(PrinterInterface component) {
        super(component);
    }

    public void print() {
        component.print();
        System.out.print("]");
    }
}
