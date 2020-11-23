package com.barkalov.structural.adapter;

public class AdapterJavaToDatabase extends JavaApp implements Database {
    public void insert() {
        saveObj();
    }

    public void update() {
        updateObj();
    }

    public void select() {
        loadObj();
    }

    public void remove() {
        deleteObj();
    }
}
