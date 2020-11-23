package com.barkalov.behavioral.state;

public class Working implements Activity {
    @Override
    public void doAction() {
        System.out.println("Working...");
    }
}
