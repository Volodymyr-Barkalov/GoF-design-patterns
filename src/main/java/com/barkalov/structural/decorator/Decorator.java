package com.barkalov.structural.decorator;

public abstract class Decorator implements PrinterInterface{
    PrinterInterface component;

    public Decorator(PrinterInterface component) {
        this.component = component;
    }
}
