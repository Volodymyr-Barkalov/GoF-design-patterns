package com.barkalov.structural.bridge;

public class BankSystem extends Program {

    public BankSystem(Developer developer) {
        super(developer);
    }

    public void developProgram() {
        System.out.println("Bank system development in progres...");
        developer.writeCode();
    }
}
