package com.barkalov.creational.factorymethod;

public class RubyDeveloperFactory implements DeveloperFactory {
    public Developer createDeveloper() {
        return new RubyDev();
    }
}
