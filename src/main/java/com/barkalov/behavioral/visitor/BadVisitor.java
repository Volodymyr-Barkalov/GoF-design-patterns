package com.barkalov.behavioral.visitor;

public class BadVisitor implements Visitor {
    @Override
    public void visit(EngineElement engine) {
        System.out.println("Turn on engine...");
    }

    @Override
    public void visit(BodyElement body) {
        System.out.println("Knocked on the car body...");
    }
}
