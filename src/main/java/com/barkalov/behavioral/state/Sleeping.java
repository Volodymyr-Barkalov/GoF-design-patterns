package com.barkalov.behavioral.state;

public class Sleeping implements Activity {
    @Override
    public void doAction() {
        System.out.println("Sleeping...");
    }
}
