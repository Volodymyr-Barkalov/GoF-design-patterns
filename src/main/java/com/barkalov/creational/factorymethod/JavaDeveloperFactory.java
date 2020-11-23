package com.barkalov.creational.factorymethod;

public class JavaDeveloperFactory implements DeveloperFactory {
    public Developer createDeveloper() {
        return new JavaDev();
    }
}
