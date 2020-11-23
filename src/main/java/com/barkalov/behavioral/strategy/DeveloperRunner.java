package com.barkalov.behavioral.strategy;

public class DeveloperRunner {
    public static void main(String[] args) {
        Developer dev = new Developer();

        dev.setActivity(new Coding());
        dev.justDoIt();

        dev.setActivity(new Sleeping());
        dev.justDoIt();

        dev.setActivity(new Sleeping());
        dev.justDoIt();
    }
}
