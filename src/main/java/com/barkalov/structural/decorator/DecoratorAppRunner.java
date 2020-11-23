package com.barkalov.structural.decorator;

public class DecoratorAppRunner {
    public static void main(String[] args) {
        PrinterInterface printer = new RightBracketDecorator(
                new LeftBracketDecorator(
                        new QuotesDecorator(
                                new Printer("Hello")
                        )
                )
        );
        printer.print();

        PrinterInterface printer2 = new QuotesDecorator(
                new RightBracketDecorator(
                        new LeftBracketDecorator(
                                new Printer("Second Printer")
                        )
                )
        );

        System.out.println();
        printer2.print();
    }
}
