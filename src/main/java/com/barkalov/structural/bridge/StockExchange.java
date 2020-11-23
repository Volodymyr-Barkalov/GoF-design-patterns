package com.barkalov.structural.bridge;

public class StockExchange extends Program {

    public StockExchange(Developer developer) {
        super(developer);
    }

    public void developProgram() {
        System.out.println("Stock exchange development in progress...");
        developer.writeCode();
    }
}
