package com.barkalov.behavioral.visitor;

public class VisitorApp {
    public static void main(String[] args) {
        Element body = new BodyElement();
        Element engine = new EngineElement();
        Visitor badVisitor = new BadVisitor();
        Visitor goodVisitor = new MechanicVisitor();

        body.accept(badVisitor);
        engine.accept(goodVisitor);
    }
}
