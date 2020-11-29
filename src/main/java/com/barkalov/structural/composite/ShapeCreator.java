package com.barkalov.structural.composite;

public class ShapeCreator {
    public static void main(String[] args) {
        Composite composite1 = new Composite();
        composite1.addShape(new Square());
        composite1.addShape(new Round());
        composite1.addShape(new Square());
        composite1.addShape(new Triangle());

        Composite composite2 = new Composite();
        composite2.addShape(new Square());
        composite2.addShape(new Round());

        Composite composite3 = new Composite();
        composite3.addShape(new Triangle());
        composite3.addShape(new Triangle());

        Composite mainComposite = new Composite();
        mainComposite.addShape(composite1);
        mainComposite.addShape(composite2);
        mainComposite.addShape(composite3);

        mainComposite.draw();
    }
}
