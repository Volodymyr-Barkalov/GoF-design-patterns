package com.barkalov.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Shape {

    private List<Shape> components = new ArrayList<Shape>();

    public void addShape(Shape component) {
        components.add(component);
    }

    public void removeShape(Shape component) {
        components.remove(component);
    }

    public void draw() {
        for(Shape component : components) {
            component.draw();
        }
    }
}
