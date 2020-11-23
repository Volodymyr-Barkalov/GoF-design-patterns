package com.barkalov.behavioral.visitor;

public interface Element {
    void accept(Visitor visitor);
}
