package com.barkalov.behavioral.visitor;

public interface Visitor {
    void visit(EngineElement engine);
    void visit(BodyElement body);
}
